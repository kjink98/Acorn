// Function
// 1. Function Statement
function add(a, b) {
    return a + b;
}
var result = add(1, 2);
// 2. Function Expression(arrow function)
var addExp = function (a, b) { return a + b; };
var addExp2 = function (a, b) { return a + b; };
var addExp3 = function (a, b) { return a + b; };
// Union & Intersection
// union
function printValue(value) {
    console.log(value);
}
printValue(1);
printValue("10");
printValue(["1", "10"]);
// intersection
var inter = {
    age: 20,
    height: 170,
    weight: 70,
    name: "john"
};
var num1 = 1;
var num2 = 2;
num1 = num2;
function printValue2(value) {
    console.log(value);
}
var mankind = {
    age: 20,
    height: 170,
    weight: 70,
    name: "john"
};
var mankind_data = {
    name: "홍길동",
    weight: 80,
    height: 180,
    age: 30
};
