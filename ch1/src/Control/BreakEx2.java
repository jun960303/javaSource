package Control;

import java.util.Scanner;

public class BreakEx2 {
    public static void main(String[] args) {
        // 메뉴를 보여준 후 메뉴 선택
        // 메뉴 번호가 1~3사이인데 다른 번호를 입력하면 다시 메뉴를 보여주기
        // 메뉴 번호가 0 번인 경우 프로그램 종료 하고 싶다.
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("(1) 햄버거 ");
            System.out.print("(2) 피자 ");
            System.out.print("(3) 샌드위치");
            System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료 : 0)");
            int menu = Integer.parseInt(sc.nextLine());
            if (menu == 0) {
                System.out.println("프로그램 종료합니다.");
                break;
            } // else if (menu != 1 && menu != 2 && menu != 3) {
            else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
                continue;
            }
            System.out.println("선택한 메뉴는 " + menu + " 입니다.");
        }
    }
}
