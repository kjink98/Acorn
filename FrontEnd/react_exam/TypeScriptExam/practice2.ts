// Function

// 1. Function Statement
function add(a:number, b:number):number {
    return a + b;
}

const result:number = add(1, 2)

// 2. Function Expression(arrow function)
const addExp = (a:number, b:number):number => a + b;

const addExp2 : (a:number, b:number) => number = (a, b) => a + b;

const addExp3 : (a:number, b:number) => number =
    function(a:number, b:number):number {return a+b};

// Union & Intersection
// union
function printValue(value): void{
    console.log(value)
}

printValue(1)
printValue("10")
printValue(["1", "10"])

// intersection
const inter : {name:string, age:number} &
    {height:number, weight:number} = {
        age:20,
        height:170,
        weight:70,
        name:"john"
    }

// ---------------------------------------------

// Type Alias & Interface
type NUM = number

let num1:number = 1;
let num2:NUM = 2;
num1 = num2;

type unionType = number | string | string[];
function printValue2(value:unionType): void{
    console.log(value)
}

// type MANKIND = {
//     name: string;
//     age: number;
//     height: number;
//     weight: number;
// }

type MANKIND = 
    {name: string;
    age: number} &
    {height: number;
    weight: number}

const mankind : MANKIND = {
    age:20,
    height:170,
    weight:70,
    name:"john"
}