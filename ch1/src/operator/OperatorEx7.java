package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc1 = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = Integer.parseInt(sc1.nextLine());

        // 입력받은 숫자가 양수, 음수인지 출력하기
        System.out.println(num > 0 ? "양수" : "음수");
    }
}
