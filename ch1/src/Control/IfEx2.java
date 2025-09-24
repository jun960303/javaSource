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
    }
}
