package Control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산(+,-,*,/) 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        // 화면출력은 15 + 25 + 40 입니다.
        Scanner sc1 = new Scanner(System.in);
        System.out.print("첫번째 수를 입력해주세요 : ");
        int num1 = Integer.parseInt(sc1.nextLine());
        System.out.print("연산자를 입력해주세요 : ");
        String op = sc1.nextLine();
        System.out.print("두번째 수를 입력해주세요 : ");
        int num2 = Integer.parseInt(sc1.nextLine());

        // op == 연산자 유무를 파악하는게 관건 4가지 종류
        op.equals("+");
        op.equals("-");
        op.equals("*");
        op.equals("/");
        int result = 0;
        System.out.println(op);

        // if (op == "+") {
        // result = num1 + num2;
        // System.out.println(result);
        // }
        // num1 값과 num2 값을 plus를

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
            default:
                break;
        }
        System.out.printf("%d %s %d = %d", num1, op, num2, result);

    }
}