package calculator;

import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculate calculate = new Calculate();
        boolean bool = true;


        while(bool) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            double FN = sc.nextDouble();
            calculate.setFirstNumber(FN);
            System.out.print("두 번째 숫자를 입력하세요: ");
            double SN = sc.nextDouble();
            calculate.setSecondNumber(SN);
            System.out.print("사칙연산 기호를 입력하세요: ");
            char opt = sc.next().charAt(0);
            calculate.setOperation(opt);

            double result = 0;
            try {
                result = calculate.calculator();
            } catch (BadInputException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("더 계산하시겠습니까? (yes or no) / 가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) / 저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String s1 = sc.next();
            if (s1.equals("no")) {
                bool = false;
            }
            if (s1.equals("remove")){
                calculate.Queue_D.poll();
            }
            if (s1.equals("inquiry")){
                for(double i : calculate.Queue_D){
                    System.out.println(i);
                }
            }


        }
    }
}
