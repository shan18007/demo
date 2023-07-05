var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
//creating a function to create an array
var makeArr = function (val) {
    console.log(val);
    return [val];
};
//bcz we use generics now it will accept 
//number string or any types of data to make an array
var v1 = makeArr(4);
var v2 = makeArr('A');
var makeObject = function (obj) {
    return __assign(__assign({}, obj), { fullName: obj.firstName + " " + obj.lastName });
};
var makeName = { firstName: "Arijit", lastName: "Sing" };
console.log(makeObject(makeName));
