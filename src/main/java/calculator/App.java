package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        Queue<Double> intQueue = new LinkedList<>();

        while(bool) {
            if (intQueue.size() == 10){
                intQueue.poll();
            }
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double n1 = sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            double n2 = sc.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char opt = sc.next().charAt(0);

            double result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            if (opt == '+') {
                result = n1 + n2;
            } else if (opt == '-') {
                result = n1 - n2;
            } else if (opt == '*') {
                result = n1 * n2;
            } else if (opt == '/') {
                if (n2 == 0) {
                    System.out.print("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = n1 / n2;
            } else if (opt == '%') {
                result = n1 % n2;
            }
            intQueue.add(result);
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (yes or no)");
            String s1 = sc.next();
            if (s1.equals("no")) {
                bool = false;
                System.out.print(intQueue);
            }
        }
    }
}
