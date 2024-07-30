package calculator;

public class AddOperator implements Operator {
    @Override
    public double apply(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}