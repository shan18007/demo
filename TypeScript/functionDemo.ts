//use void when function does not rerurn any value
// function combineVal(number1:number , number2: number, number3?:number|string):void{
//  console.log(number1+number2);
// }

// undefine is used when we not returning any value bu use return statement
// function combineVal(number1:number , number2: number, number3?:number|string):undefined{
//  console.log(number1+number2);
// return;
// }

//optional parameter always put at the end
//? after variable in declarations means it is a optional parameter
//we can set default value to paramater after mentioning data type
//ex. function combine(number1:number , number2: number, number3:number|string='ADMIN')
//it is consider as then optional paramter & no need of ?

function combine(number1:number , number2: number, number3:number|string='AA'){
    return number1+number2;
}

function add(number1:number , number2: number){
    return number1+number2;
}
console.log(combine(34,6));

let combinedValues: (a: number,b: number)=> number;

combinedValues = add;
console.log(combinedValues(9,7));

function addAndHandle(n1:number,n2:number,cb:(num:number)=>void){
    const result= n1+n2;
    cb(result);
}