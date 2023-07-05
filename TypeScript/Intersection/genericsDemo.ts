//generics is used to define the type so which type of value should be accepted
//if Object type is specified the it can accept only object & object can contain any properties
//bcz have not specified the object properties
//and we can not get properties that we pass to function
// const addUID = (obj: Object)=>{
//     const uid= (Math.random()*100);
//     return {...obj,uid};
// }
// const user=addUID({name:"shan",age:24,role:'admin'});
// console.log(user.name); // not accessible
// console.log(user.age);  // not accessible
// console.log(user.uid);


//but if we apply generics type then now it will accept any type of data
// const addUID = <T>(obj:T)=>{
//     const uid= (Math.random()*100);
//     return {...obj,uid};
// }

// const user=addUID({name:"shan",age:24});
// console.log(user.name);
// console.log(user.age);
// console.log(user.uid);



//if we want accpet only objects then we extends Object class
//if we extends Object class to generic type then now it will accept only objetcs
// const addUID = <T extends Object>(obj:T)=>{
//     const uid= (Math.random()*100);
//     return {...obj,uid};
// }
// const user=addUID({name:"shan",age:24});
// console.log(user.name);
// console.log(user.age);
// console.log(user.uid);

//specifying the generics & specify the object properties 
// const addUID = <T extends {role:string}>(obj:T)=>{
//     const uid= (Math.random()*100);
//     return {...obj,uid};
// }
// const user=addUID({name:"shan",age:24,role:'admin'});
// console.log(user.name);
// console.log(user.age);
// console.log(user.uid);
// console.log(user.role);


//we can define object interface and use for extending those properties  
interface boss{
    name:string,
    id:number,
    role:string
}
const addUID = <T extends boss>(obj:T)=>{
    const uid= (Math.random()*100);
    return {...obj,uid};
}
const user=addUID({name:"shan",age:24,id:45,role:'admin'});
console.log(user.name);
console.log(user.age);
console.log(user.uid);
console.log(user.role);

