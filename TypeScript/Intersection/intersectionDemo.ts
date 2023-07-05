type combinable = number | string;
type numeric = number | boolean;
//working with variables intersection will take only common properties
//so here it will take number only
type universal = combinable & numeric;
let data : universal = 5;
//it will not accept any other type than  number bcz number is common in both  
//let data2 : universal = 'f';

//but while working with objects it will take common properties & remaining properties also

type user = {
    name: string,
    address: string
}

type admin = {
    name:string,
    role:string
}

type superUser = admin & user ;

let user1 : superUser ={
    name: "viki",
    address: "ABC",
    role: 'admin'
}

//similarly we can perform intersection with interface concept also
interface newUser {
    name: string,
    address: string
}

interface newAdmin {
    name:string,
    role:string
}

interface newSuperUser extends newUser,newAdmin{};

let emp: newSuperUser={
    name: "shan",
    address: "NYC",
    role: 'NORMWAL'
}

console.log(emp);
