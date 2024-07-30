package calculator;

public class MultiplyOperator implements Operator {
    @Override
    public double apply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}