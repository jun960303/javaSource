package Control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합 구하기
        // 345를 입력을 했을 시 , 3 + 4 + 5 = 12 가 출력되게
        // 12345 입력 시 : 1 + 2 + 3 + 4 + 5 = 15
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = Integer.parseInt(sc.nextLine());

        // num 이 0 아니면 , 0이 될 때까지
        int sum = 0;
        while (num != 0) {
            // 123
            sum = sum + num % 10; // 0 + 345
            System.out.printf("sum = %3d num = %d\n", sum, num);
            num = num / 10;
        }
        System.out.println("각 자릿 수 합 " + sum);
    }

}
