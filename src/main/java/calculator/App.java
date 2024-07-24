package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double n1 = sc.nextDouble();
        System.out.print("두 번째 숫자를 입력하세요: ");
        double n2 = sc.nextDouble();
        System.out.print("사칙연산 기호를 입력하세요: ");
        char opt = sc.next().charAt(0);

        double result = 0;
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        if (opt == '+'){
            result = n1+n2;
        }
        else if (opt == '-') {
            result = n1 - n2;
        }
        else if (opt == '*') {
            result = n1 * n2;
        }
        else if (opt == '/'){
            result = n1/n2;
        }
        else if (opt == '%') {
            result = n1 % n2;
        }
        System.out.println("결과: " + result);
    }
}
