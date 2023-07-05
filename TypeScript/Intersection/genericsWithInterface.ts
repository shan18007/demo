interface Resource<T>{
    name:string,
    resource:number,
    resList: T
}

const ob:Resource<object>={
    name:"abc",
    resource:8,
    //not accept
    //resList:"val"
    resList: {id:34, ss:true} //accept
}
ob.name="abhi";
ob.resource=98;
console.log(ob);