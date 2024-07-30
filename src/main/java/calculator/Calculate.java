package calculator;
import java.util.*;

public class Calculate {
    private double firstNumber;
    private double secondNumber;
    private char operation;
    private Queue<Double> Queue_D = new LinkedList<>();
    public Calculate(Queue<Integer> results) {
        this.Queue_D = Queue_D;
    }

    Scanner sc = new Scanner(System.in);

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
        Queue_D.add(answer);
        System.out.println("결과: " + answer);

        return answer;
    }
    public Queue<Double> getter(){
        return this.Queue_D;
    }

}
