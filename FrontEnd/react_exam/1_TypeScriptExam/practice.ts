// number, string, boolean
const num: number = 3.14;
const str: string = "10";
const bool: boolean = true;

//  array, object, enum
const arr = [1, 2, "홍길동", 3.14];
const numArr:number[] = [1, 2, 3.14];
const boolArr: boolean[] = [true, true, false];

const man: {
    name:string,
    age:number, 
    married:boolean} = {
        name:"홍길동",
        age:20,
        married:true
    }

enum GRADE {A, B, C, D, E, F}
// const myGrade:GRADE = 10; //오류
const myGrade:GRADE = GRADE.A;

// -------------------------------------
// any, unkwonn

// any : 어떤 형식이든 와도 됨
let anyValue: any = 1;
anyValue = "1";
anyValue = true;

// unknown 어떤 값이 와도 상관없음
let unkwonnValue: unknown = 1;
unkwonnValue = "1";
unkwonnValue = false;

// any보단 unknown 추천
// any보다 까다로운 unknown이 안전함
anyValue.hell();
// unkwonnValue.hell();

// -------------------------------------
// void, never
function helloVoid(): void{
    console.log("Hello");
    // return "hello";
}

function helloString(): string {
    console.log("Hello");
    return "hello";
}

// 다시는 못 돌아가게
function helloNever(): never {
    console.log("Hello");
    // while(true) {}
    throw 'Error';
}

// -------------------------------------
// null, undefined
// const nullValue: null = 'abc';
// const nullValue: null = undefined;
const nullValue2: null = null;

const undefinedValue: undefined = undefined;
// const undefinedValue2: undefined = null;