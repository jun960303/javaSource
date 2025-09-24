package Control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        int x = 1;
        // x 가 0과 동일하면 X == 0
        if (x == 0) {
            System.out.println("X == 0 입니다.");
        }

        if (x != 0) {
            System.out.println("X != 0 입니다.");
        }

        // 사용자로부터 점수를 입력받아 60 이상이면 합격입니다.
        Scanner sc = new Scanner(System.in);
        int result = Integer.parseInt(sc.nextLine());
        if (result >= 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }

        System.out.println(result >= 60 ? "합격입니다" : "불합격입니다");
    }
}
