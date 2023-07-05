

class Calculator{
    constructor(previousOperandText,currentOperandText){
        this.previousOperandText=previousOperandText;
        this.currentOperandText=currentOperandText;
        this.clear();
    }
    clear(){
        this.currentOperand = '';
        this.previousOperand = '';   
        this.operation=undefined;
    }
    delete(){

    }
    appendNumber(number){
        this.currentOperand=number;
        this.updateDisplay();
    }
    chooseOperation(operation){

    }
    compute(){

    }
    updateDisplay(){
        this.currentOperandText.innerText = this.currentOperand;
    }
}

var numberButtons= document.querySelectorAll(".number");
const operatorButton= document.querySelectorAll('[data-operator]');
const equalsButton= document.querySelectorAll('[data-equals]');
const deleteButton= document.querySelectorAll('[data-delete]');
const acButton= document.querySelectorAll('[data-all-clear]');
const previousOperandText= document.querySelectorAll('[data-previous-operand]');
const currentOperandText= document.querySelectorAll('[data-current-operand]');

const calci= new Calculator(previousOperandText,currentOperandText);

console.log(numberButtons);
numberButtons.forEach(button=>{
    console.log(button);
    button.addEventListener("click",()=>{
        alert(button.innerHTML);
        calci.appendNumber(button.innerText)
        calci.updateDisplay();
    })
})