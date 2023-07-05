let num1: number;
// let person:{
//     age : number;nam:string;
//   }={
//       age:34,
//       nam:"add"
//   }
//if object type us assign then we can not access the property of ojetct
// we can only fetch direct object.
// let person:object={
//     age:34,
//     nam:"ann",
//     hobies:["sport","cricket"]
// }
// let person:{
//     age:number;
//     nam:string;
//     hobbies:string[];
//     role:[number,string];
// }

//enum role{ADMIN=5, READ_ONLY, AUTHER}
//if we assign one value the for rest of the it will increment automatically
//ex now READ_ONLY will be 6 & AUTHER will be 7
//or we can assign our own values for all

//always firsts letter if enum var is in Uppercase
enum Role{ADMIN=44, READ_ONL=55, AUTHER=66}
const person={
    age:34,
    nam:"ann",
    hobbies:["sport","cricket"],
    //role:[2,"auther"],
    role: Role.ADMIN
}
//tuple is same as array but tuple has fix length & fix data type
//in tuple we can push a new item so aware about it..

console.log(person);
console.log(person.role);
if(person.role == Role.ADMIN){
 console.log("is admin");
}
if(person.role === Role.AUTHER){
    console.log("is auther");
   }
//array declaratio to store only string
// let favActivity: string[];
//array declaratio to store only number
// let favActivity: number[];
//array declaratio to store values of any data types
//let favActivity: any[];

for(const hoby of person.hobbies){
    console.log(hoby.toUpperCase);
}