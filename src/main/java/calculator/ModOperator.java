package calculator;

public class ModOperator implements Operator {
    @Override
    public double apply(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }
}