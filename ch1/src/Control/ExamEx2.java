package Control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 세 개의 정수를 입력 받아 가장 작은 값 구하기
        System.out.print("첫번 째 정수를 입력해주세요 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두번 째 정수를 입력해주세요 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("세번 째 정수를 입력해주세요 : ");
        int num3 = Integer.parseInt(sc.nextLine());

        if (num1 < num2 && num1 < num3) {
            System.out.println("첫번째 정수가 제일 작은 값 입니다.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("두번째 정수가 제일 작은 값 입니다.");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("세번 째 정수가 제일 작은 값 입니다.");
        }

        // int min = num1;
        // if(min > num2){
        // min = num2;
        // }else if(min > num3){
        // min = num3;
        // }
        // System.out.println("가장 작은 수" + min);

        // 큰 수 구하기
        int x = num1;

        if (x < num2) {
            x = num2;
        }

        if (x < num3) {
            x = num3;
        }
        System.out.println("가장 큰 수는 " + x + "입니다.");

    }
}