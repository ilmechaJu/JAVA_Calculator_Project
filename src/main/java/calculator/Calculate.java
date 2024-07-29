package calculator;


public class Calculate {
    private int firstNumber;
    private int secondNumber;
    private int operation;
    //private AbstractOperation operation;
    public void setFirstNumber (int firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber (int secondNumber){
        this.secondNumber = secondNumber;
    }
    public void setOperation (char operation) {
        this.operation = operation;
    }

    public double calculator(){
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;

    }
}
