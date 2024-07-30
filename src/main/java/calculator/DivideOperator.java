package calculator;

public class DivideOperator implements Operator {
    @Override
    public double apply(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return firstNumber / secondNumber;
    }
}