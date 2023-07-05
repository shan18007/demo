function regexdemo(){
    let str="hi hello how are u";
    let patt=/hi/i;
    //let result=str.exec(patt);
    let result=patt.exec(str);
    document.getElementById("demo").innerHTML=result;
}
regexdemo();

