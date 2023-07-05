class Invoice{
    //readonly properties cannot modified using object we can read only
    // readonly client : string;
     client : string;
     details: string;
     //private amount:number;
     amount:number;
  
     constructor(c:string,d:string,a:number){
         this.client=c;
         this.details=d;
         this.amount=a;

         function getDetils(){
             return '${this.client} owns ${details}';
         }
     }
}
const ob1=new Invoice("shan","Amiti",466);
const ob2=new Invoice("akshay","caoG",756);

let invoices: Invoice[] = [];
invoices.push(ob1);
invoices.push(ob2);
console.log(invoices[0]);

ob1.client="Ann";
ob2.amount=3400;
console.log(ob1 , ob2);