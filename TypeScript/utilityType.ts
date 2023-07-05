interface toDo{
    title:string;
    description:String;
}

//1) Partial<> can take partial objects
function updateTodo(note:toDo, fieldUpdate:Partial<toDo>){
    console.log(fieldUpdate);
}

const toDo1={
   title:"organize Desk",
   description:"peek the pen put on left side" 
} 
const toDo2={
    description:"peek the pen put on left side" 
 } 

 //updateTodo(toDo1,toDo2);
 //or
 updateTodo(toDo1,{description:"hi hello how are u"});

 //2) Required<> is opposite of Partial 
 // this will required all properties of an object

 interface props{
     a?:number;
     b?:string;
 }
 const obj :props = {a:5};
 const obj2 : Required<props> = {a:5,b:"shan"};

 // 3) Readonly<> properties of the constructed type cannot be reassigned.
 interface person{
     name: string
 }  

const personOb: Readonly<person> = {name: "Navjyot" }
//cannot modify becauze of Readonly
//personOb.name="Akki";

//4) Record<keys, Type>

interface Cats{
    age:number;
    breed:string;
}

type CatName = "Miffy" | "Borris" | "Moderd" ;

const myCat: Record<CatName, Cats>= {
    Miffy: {age:22,breed:"Ab"},
    Borris:{age:23,breed:"Lart"},
    Moderd:{age:15,breed:"Oilp"} 
}

console.log(myCat.Borris);




