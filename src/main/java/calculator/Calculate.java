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
    public double calculator() throws BadInputException{
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
                if (secondNumber == 0){
                    throw new BadInputException("0으로 나눌 수 없습니다.");
                }
                else{
                    answer = firstNumber / secondNumber;
                }

                break;
            default:
                throw new BadInputException("올바르지 않은 입력형태 입니다.");
        }

        return answer;

    }
}
