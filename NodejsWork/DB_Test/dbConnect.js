const oracledb = require("oracledb");
const dbConfig = require("./dbconfig.js");

oracledb.autoCommit = true;

function init() {
    oracledb.initOracleClient({libDir:"C:\\Users\\acorn\\Downloads\\instantclient_21_12"});
}

init();
oracledb.getConnection({
    user:dbConfig.user,
    password:dbConfig.password,
    connectString: dbConfig.connectString
}, (err, conn)=>{
    if (err) {
        console.error("Oracle DB 연결에 실패했습니다. 에러: ", err);
    } else {
        console.log("Oracle DB 연결 성공: ", conn);
    }
});