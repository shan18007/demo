interface User{
    name:string;
    phone:number;
    address:string;
    pin:number
}

// mentioned properties in omete we cannot use in objcet
type userPreview = Omit<User, "pin" | "address" >;
const userOb: userPreview ={
    name:"amit",
    phone:434533
};
console.log(userOb);



//exclude