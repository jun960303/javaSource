package Control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        // --------------------------------
        // 1. 예금 2. 출금 3.잔고 4.종료
        // --------------------------------
        // 번호선택 : 1
        // 입금액 : 30,000
        // 번호선택 : 2
        // 출금액 : 20,000
        // 번호선택 : 3
        // 잔액 : 10,000
        // 번호선택 : 4
        // 프로그램 종료
        // Scanner sc = new Scanner(System.in);
        // System.out.println("--------------------------------");
        // System.out.print(" 1.예금 ");
        // System.out.print("2.출금 ");
        // System.out.print("3.잔액 ");
        // System.out.println("4.종료 ");
        // System.out.println("--------------------------------");
        // System.out.print("번호를 눌러주세요 : ");
        // int num = Integer.parseInt(sc.nextLine());
        // int result = 0;
        int result = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("--------------------------------");
            System.out.print("  1.예금 ");
            System.out.print("2.출금 ");
            System.out.print("3.잔액 ");
            System.out.println("4.종료 ");
            System.out.println("--------------------------------");
            System.out.print("번호를 눌러주세요 : ");
            int num = Integer.parseInt(sc.nextLine());

            if (num == 1) {
                System.out.print("입금할 금액을 입력해주세요 : ");
                int price = Integer.parseInt(sc.nextLine());
                result = result + price;
                System.out.println("입금되었습니다.");
            } else if (num == 2) {
                System.out.print("출금할 금액을 입력해주세요 : ");
                int price2 = Integer.parseInt(sc.nextLine());
                result = result - price2;
            } else if (num == 3) {
                System.out.println("----------------------------------");
                System.out.println("현재 잔액은 : " + result + " 원 입니다.");
                System.out.println("----------------------------------");
            } else if (num == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("----------------------------------");
                System.out.println("잘못된 번호입니다. 다시입력해주세요!");
                System.out.println("----------------------------------");
            }
        }
    }
}
