package calculator;

import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();
        boolean bool = true;



        while(bool) {

            System.out.print("어떤 계산을 하시겠습니까? ");
            System.out.println("(사칙연산 계산 : 1, 원의넓이 계산 : 2)");
            int choose = sc.nextInt();

            if (choose ==1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double FN = sc.nextDouble();
                calculate.setFirstNumber(FN);
                System.out.print("사칙연산 기호를 입력하세요: ");
                char opt = sc.next().charAt(0);
                calculate.setOperation(opt);
                System.out.print("두 번째 숫자를 입력하세요: ");
                double SN = sc.nextDouble();
                calculate.setSecondNumber(SN);


                try {
                    calculate.calculator();
                } catch (BadInputException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("더 계산하시겠습니까? (yes or no) / 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) / 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String s1 = sc.next();
                if (s1.equals("no")) {
                    bool = false;
                }
                if (s1.equals("remove")) {
                    System.out.println(calculate.a_remove() + "(이)가 삭제되었습니다.");
                }
                if (s1.equals("inquiry")) {
                    System.out.println(calculate.a_inquiry());
                }
            }
            if (choose ==2) {
                System.out.print("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt();

                System.out.println("결과: " + calculate.calculateCircleArea(radius));

                //remove 입력 시 가장 먼저 저장된 연산 결과를 삭제
                System.out.println("더 계산하시겠습니까? (yes or no) / 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) / 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String s1 = sc.next();
                if (s1.equals("no")) {
                    bool = false;
                }
                if (s1.equals("remove")) {
                    System.out.println(calculate.b_remove() + "(이)가 삭제되었습니다.");
                }

                if (s1.equals("inquiry")) {
                    System.out.println(calculate.b_inquiry());
                }
            }




        }
    }
}
