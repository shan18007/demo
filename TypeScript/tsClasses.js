var Invoice = /** @class */ (function () {
    function Invoice(c, d, a) {
        this.client = c;
        this.details = d;
        this.amount = a;
        function getDetils() {
            return '${this.client} owns ${details}';
        }
    }
    return Invoice;
}());
var ob1 = new Invoice("shan", "Amiti", 466);
var ob2 = new Invoice("akshay", "caoG", 756);
var invoices = [];
invoices.push(ob1);
invoices.push(ob2);
console.log(invoices[0]);
ob1.client = "Ann";
ob2.amount = 3400;
console.log(ob1, ob2);
