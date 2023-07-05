var StringHelper;
(function (StringHelper) {
    function upper(str) {
        return str.toUpperCase();
    }
    StringHelper.upper = upper;
    function lower(str) {
        return str.toLowerCase();
    }
})(StringHelper || (StringHelper = {}));
/// <reference path="namespacesFile.ts" />
console.log(StringHelper.upper("ShAntanU"));
