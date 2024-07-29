package calculator;


public class Calculate {
    private double firstNumber;
    private double secondNumber;
    private char operation;
    //private AbstractOperation operation;
    public void setFirstNumber (double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber (double secondNumber){
        this.secondNumber = secondNumber;
    }
    public void setOperation (char operation) {
        this.operation = operation;
    }

    public double calculator(){
        double answer = 0;
        switch(operation){
            case '+':
                answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = firstNumber - secondNumber;
                break;
            case '*':
                answer = firstNumber * secondNumber;
                break;
            case '/':
                answer = firstNumber / secondNumber; //예외처리 만들기 (  )
                break;
            default:
                System.out.println("올바르지 않은 입력 형태입니다."); //Throw 사용해서 만들기 (  )
        }

        return answer;

    }
}
