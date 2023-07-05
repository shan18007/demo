let fruits=["apple","banana","anar"];

function fruitsIterator(values){
   let index=0;
    return{
       next:function(){
            if(index<values.length){
                return{
                    value: values[index++],
                    done: false
                }
            }else{
                return{
                    done: true
                }
            }
       } 
    }
}
const f=fruitsIterator(fruits);
//return the object 
// console.log(f.next());
// console.log(f.next());
// console.log(f.next());
// console.log(f.next());

//return the value
console.log(f.next().value);
console.log(f.next().value);
console.log(f.next().value);
console.log(f.next().value);

