package calculator;

public class BadInputException extends Exception{
    public BadInputException(String type) {
        super("잘못된 입력입니다-!");
    }
}
