//creating a function to create an array
let makeArr = <T>(val: T)=>{
    console.log(val);
return [val];

}

//bcz we use generics now it will accept 
//number string or any types of data to make an array
const v1= makeArr(4);
const v2= makeArr('A');

const makeObject = (obj:{firstName:string,lastName:string})=>{
    return {...obj, fullName:obj.firstName + " "+ obj.lastName};
}

const makeName= {firstName:"Arijit",lastName: "Sing" };
console.log(makeObject(makeName));


