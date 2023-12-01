const oracledb = require("oracledb");
const dbConfig = require("./dbconfig.js");

oracledb.autoCommit = true;

function init() {
    oracledb.initOracleClient({libDir:"C:/instantclient_21_12"});
}

init();
oracledb.getConnection({
    user:dbConfig.user,
    password:dbConfig.password,
    connectString: dbConfig.connectString
}, (err, conn)=>{
    if (err) {
        console.error(err.message);
        return;
    }
    console.log("연결 여부: " + conn);
    let sql;

    /*
    // select
    sql = "select empno, ename, job, hiredate from emp";
    conn.execute(sql, [], (err, result)=>{
        if(err) {
            throw err;
        }
        console.log(result.rows);
        doRelease(conn);
    });
    */

    // CREATE
    sql = `create table nodeUser(
        id varchar2(10),
        password varchar2(10),
        name varchar2(10),
        age number
    )`;
    conn.execute(sql);
    console.log("테이블 생성 완료");

    // INSERT
    sql = "insert into nodeUser values(:id, :pw, :name, :age)";

    // 값을 1개만 넣을 때
    let binds = [["a1", "1111", "홍길동", 20]]
    conn.executeMany(sql, binds, {});
    
    // UPDATE
    sql = `updqte nodeUser
        set password=:pw, name:name, age=:age
        where id=:id`;
    conn.executeMany(sql, [["2222", "marry", 30, "a1"]])

    // DELETE
    sql = "delete nodeUser where id=:id"
    conn.execute(sql, ["b1"]);
    
    sql = "select * from nodeUser";
    conn.execute(sql, [], (err, result)=>{
        console.log(result.rows);
        doRelease(conn);
    })

});

const doRelease = (conn) => {
    conn.release((err)=>{
        if(err) throw err;
    });
}