package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator {
    private double firstNumber;
    private double secondNumber;
    private char operation;
    private Queue<Double> results;

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
        Operator operator = null;

        switch (operation) {
            case '+':
                operator = new AddOperator();
                break;
            case '-':
                operator = new SubtractOperator();
                break;
            case '*':
                operator = new MultiplyOperator();
                break;
            case '%':
                operator = new ModOperator();
                break;
            case '/':
                operator = new DivideOperator();
                break;
            default:
                throw new BadInputException("올바르지 않은 입력형태 입니다.");
        }
        double result = operator.apply(firstNumber,secondNumber);
        results.add(result);
        System.out.println("결과: " + result);
        return result;
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
