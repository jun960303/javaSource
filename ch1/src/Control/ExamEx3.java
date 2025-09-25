package Control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간 까지는 시급 10,030원
        // 8시간 이후는 원래받던 금액의 1.5배를 받는다.
        // 오늘 근무시간 입력받아 하루 일당을 산출 해라
        // 일당은 정수형
        System.out.println("오늘 근무시간을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int hours = Integer.parseInt(sc.nextLine());

        // hous 10 : 8 * 10030 + (2 * 10030 * 1.5)
        // hous 8 : 8 * 10030
        int rate = 10030, pay = 0;
        if (hours > 8) {
            pay = rate * 8 + (int) ((hours - 8) * rate * 1.5);
        } else {
            pay = rate * hours;
        }
        System.out.printf("근무시간 %d, 임금 : %d", hours, pay);
    }
}