var fruits = ["apple", "banana", "anar"];
function fruitsIterator(values) {
    var index = 0;
    return {
        next: function () {
            if (index < values.length) {
                return {
                    fruit: values[index++],
                    done: false
                };
            }
            else {
                return {
                    done: true
                };
            }
        }
    };
}
var f = fruitsIterator(fruits);
//return the object 
// console.log(f.next());
// console.log(f.next());
// console.log(f.next());
// console.log(f.next());
//return the value
console.log(f.next().fruit);
console.log(f.next().fruit);
console.log(f.next().fruit);
console.log(f.next().fruit);
