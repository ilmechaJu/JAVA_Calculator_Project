package calculator;
import java.util.*;

public class Calculate {
    private double firstNumber;
    private double secondNumber;
    private char operation;
    //private Queue<Double> Queue_D = new LinkedList<>();
    private static final double PI = 3.14159;  //final은 '상수'로 만드는 것이다. PI값은 실수로 건들지 못하게 '상수'로 고정하는 것. //Static은 메모리에 '고정'하는 것. 우리는 PI 변수를 변경 할 마음이 없기 때문에 static과 final을 사용한다.
    private Queue<Double> a_results;
    private Queue<Double> b_results;

    public Calculate() {
        a_results = new LinkedList<>();
        b_results = new LinkedList<>();
    }

    Scanner sc = new Scanner(System.in);

    //private AbstractOperation operation;
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double calculator() throws BadInputException {
        double answer = 0;
        switch (operation) {
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
                if (secondNumber == 0) {
                    throw new BadInputException("0으로 나눌 수 없습니다.");
                } else {
                    answer = firstNumber / secondNumber;
                }

                break;
            default:
                throw new BadInputException("올바르지 않은 입력형태 입니다.");
        }
        a_results.add(answer);
        System.out.println("결과: " + answer);

        return answer;
    }
    public Queue<Double> aGetter(){
        return this.a_results;
    }
    public void aSetter(Queue<Double> queue) {
        this.a_results = queue;
    }

    public double a_remove() {
        return this.a_results.poll();
    }

    public String a_inquiry() {
        return this.a_results.toString();
    }

    //원의 넓이를 구하는 메서드
    public double calculateCircleArea(int radius) {
        b_results.add(radius * radius * PI);
        return radius * radius * PI;
    }

    public Queue<Double> bGetter() {
        return b_results;
    }

    public void bSetter(Queue<Double> queue) {
        this.b_results = queue;
    }

    public double b_remove() {
        return this.b_results.poll();
    }

    public String b_inquiry() {
        return this.b_results.toString();
    }
}