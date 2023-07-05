type stringOrNum= string |number;


//let  helloFun:(name:{unm:string,id:number} ,address:stringOrNum) => void;

function hello(name:{unm:string,id:number} ,address:stringOrNum){
    console.log(name.id);
    console.log(name.unm);
    console.log(address);
}

let person={
    unm:"avi",id:2344
}
hello(person,"pune");