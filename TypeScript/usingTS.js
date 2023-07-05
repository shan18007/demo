var btn = document.getElementById("btn");
var n1 = document.getElementById("num1");
var n2 = document.getElementById("num2");
function add(a, b) {
    return a + b;
}
btn.addEventListener("click", function () {
    console.log(add(+n1.value, +n2.value));
});
