package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc1 = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = Integer.parseInt(sc1.nextLine());

        // 입력받은 숫자가 짝수 인지 홀수인지
        // String result = num % 2 == 0 ? "짝수" : "홀수";
        // System.out.println(result);

        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
    }
}
