package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator {
    private double firstNumber;
    private double secondNumber;
    private char operation;
    private Queue<Double> results;
    AddOperator addOperator = new AddOperator();
    SubtractOperator subtractOperator = new SubtractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();

    public ArithmeticCalculator() {
        results = new LinkedList<>();
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double calculate() throws BadInputException {
        double answer = 0;
        switch (operation) {
            case '+':
                answer = addOperator.operate(firstNumber, secondNumber);
                //answer = firstNumber + secondNumber;
                break;
            case '-':
                answer = subtractOperator.operate(firstNumber, secondNumber);
                break;
            case '*':
                answer = multiplyOperator.operate(firstNumber, secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    throw new BadInputException("0으로 나눌 수 없습니다.");
                } else {
                    answer = divideOperator.operate(firstNumber, secondNumber);
                }
                break;
            default:
                throw new BadInputException("올바르지 않은 입력형태 입니다.");
        }
        results.add(answer);
        System.out.println("결과: " + answer);
        return answer;
    }

    public Queue<Double> getResults() {
        return results;
    }

    public void setResults(Queue<Double> queue) {
        this.results = queue;
    }

    public double removeResult() {
        return this.results.poll();
    }

    public String inquiryResults() {
        return this.results.toString();
    }
}
