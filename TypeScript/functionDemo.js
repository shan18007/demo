//use void when function does not rerurn any value
// function combineVal(number1:number , number2: number, number3?:number|string):void{
//  console.log(number1+number2);
// }
// undefine is used when we not returning any value bu use return statement
// function combineVal(number1:number , number2: number, number3?:number|string):undefined{
//  console.log(number1+number2);
// return;
// }
function combine(number1, number2, number3) {
    return number1 + number2;
}
function add(number1, number2) {
    return number1 + number2;
}
console.log(combine(34, 6));
var combinedValues;
combinedValues = add;
console.log(combinedValues(9, 7));
