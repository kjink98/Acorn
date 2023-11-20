// number, string, boolean
var num = 3.14;
var str = "10";
var bool = true;
//  array, object, enum
var arr = [1, 2, "홍길동", 3.14];
var numArr = [1, 2, 3.14];
var boolArr = [true, true, false];
var man = {
    name: "홍길동",
    age: 20,
    married: true
};
var GRADE;
(function (GRADE) {
    GRADE[GRADE["A"] = 0] = "A";
    GRADE[GRADE["B"] = 1] = "B";
    GRADE[GRADE["C"] = 2] = "C";
    GRADE[GRADE["D"] = 3] = "D";
    GRADE[GRADE["E"] = 4] = "E";
    GRADE[GRADE["F"] = 5] = "F";
})(GRADE || (GRADE = {}));
// const myGrade:GRADE = 10; //오류
var myGrade = GRADE.A;
// -------------------------------------
// any, unkwonn
// any : 어떤 형식이든 와도 됨
var anyValue = 1;
anyValue = "1";
anyValue = true;
// unknown 어떤 값이 와도 상관없음
var unkwonnValue = 1;
unkwonnValue = "1";
unkwonnValue = false;
// any보단 unknown 추천
// any보다 까다로운 unknown이 안전함
anyValue.hell();
// unkwonnValue.hell();
// -------------------------------------
// void, never
function helloVoid() {
    console.log("Hello");
    // return "hello";
}
function helloString() {
    console.log("Hello");
    return "hello";
}
// 다시는 못 돌아가게
function helloNever() {
    console.log("Hello");
    // while(true) {}
    throw 'Error';
}
// -------------------------------------
// null, undefined
// const nullValue: null = 'abc';
// const nullValue: null = undefined;
var nullValue2 = null;
var undefinedValue = undefined;
// const undefinedValue2: undefined = null;
