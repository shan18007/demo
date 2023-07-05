//definging an object type
//const obj:{firstName: string, lastName:string};
//type obType = {firstName: string, lastName:string};

const makeObj = <T extends {firstName: string, lastName:string}>(o: T)=>{   
    return o.firstName+ " " + o.lastName;
}

const arrayMaker= <X , Y> (x : X , y : Y) : [X, Y] =>{
    return [x, y];
}

