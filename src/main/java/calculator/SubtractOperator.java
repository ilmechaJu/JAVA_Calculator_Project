package calculator;

public class SubtractOperator implements Operator {
    @Override
    public double apply(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}