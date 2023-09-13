/*
import number, {hello, str as name, arr, func} from './module.js'; // 변수 number은 default 값으로 사용

const parent = document.querySelector(".parent");
console.log(parent.innerHTML);
console.log(hello);
console.log(number);
// console.log(str);
console.log(name);
console.log(arr);
console.log(func);
*/
/*
import * as mod from './module.js';

console.log(mod.default);
console.log(mod.hello);
console.log(mod.str);
console.log(mod.arr);
console.log(mod.func);
*/

// import {a} from './a.js';
// import {b} from './b.js';
import {a, b} from './util.js';
console.log(a());
console.log(b());
