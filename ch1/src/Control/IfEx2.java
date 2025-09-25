package Control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        // 점수를 입력받아 A,B,C,D 등급 출력
        // >= 90 A , >= 80 B , >= 70 C , D
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해주세요 : ");
        int result = Integer.parseInt(sc.nextLine());

        // if (result >= 90) {
        // System.out.println("A등급입니다.");
        // } else if (result >= 80) {
        // System.out.println("B등급입니다.");
        // } else if (result >= 70) {
        // System.out.println("C등급입니다.");
        // } else {
        // System.out.println("D등급입니다.");
        // }

        // 변수 유효범위
        // 선언 위치에 따라 사용할 수 있는 범위가 달라짐.

        char re = ' ';

        if (result >= 90) {
            re = 'A';
        } else if (result >= 80) {
            re = 'B';
        } else if (result >= 70) {
            re = 'C';
        } else {
            re = 'D';
        }
        System.out.println("등급 : " + re);

        // switch (re) {
        // case 100:
        // case 99:
        // case 98:
        // case 97:
        // case 96:
        // case 95:
        // case 94:
        // case 93:
        // case 92:
        // case 91:
        // case 90:
        // re = 'A';
        // break;

        // default:
        // break;
        // }

        switch (re / 10) {
            case 10:
            case 9:
                re = 'A';
                break;
            case 8:
                re = 'B';
                break;
            case 7:
                re = 'C';
                break;
            default:
                re = 'D';
                break;
        }
    }
}
