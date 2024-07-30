package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.print("어떤 계산을 하시겠습니까? ");
            System.out.println("(사칙연산 계산 : 1, 원의넓이 계산 : 2)");
            int choice = sc.nextInt();

            if (choice == 1) {
                // 사칙연산 계산기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double firstNumber = sc.nextDouble();
                arithmeticCalculator.setFirstNumber(firstNumber);

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                arithmeticCalculator.setOperation(operator);

                System.out.print("두 번째 숫자를 입력하세요: ");
                double secondNumber = sc.nextDouble();
                arithmeticCalculator.setSecondNumber(secondNumber);

                try {
                    arithmeticCalculator.calculate();
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("더 계산하시겠습니까? (yes or no) / 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) / 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String response = sc.next();

                if (response.equalsIgnoreCase("no")) {
                    continueCalculations = false;
                } else if (response.equalsIgnoreCase("remove")) {
                    System.out.println(arithmeticCalculator.removeResult() + "(이)가 삭제되었습니다.");
                } else if (response.equalsIgnoreCase("inquiry")) {
                    System.out.println(arithmeticCalculator.inquiryResults());
                }
            } else if (choice == 2) {
                // 원의 넓이 계산기
                System.out.print("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();

                double area = circleCalculator.calculateCircleArea(radius);
                System.out.println("결과: " + area);

                System.out.println("더 계산하시겠습니까? (yes or no) / 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) / 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String response = sc.next();

                if (response.equalsIgnoreCase("no")) {
                    continueCalculations = false;
                } else if (response.equalsIgnoreCase("remove")) {
                    System.out.println(circleCalculator.removeResult() + "(이)가 삭제되었습니다.");
                } else if (response.equalsIgnoreCase("inquiry")) {
                    System.out.println(circleCalculator.inquiryResults());
                }
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        sc.close(); // Scanner 객체 닫기
    }
}
