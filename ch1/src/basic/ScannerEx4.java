package basic;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        // 키보드에서 입력받기 코드
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력 : ");

        // 입력받기 : sc.nextLine() ==> " "문자열 형태로 들어옴.
        // " " 를 없애고 싶다면 , Integer.pareInt / Float.parsFloat / Double.parseDouble

        // 밑에 코드를 한줄로 짜면 int input1 = Integer.parseInt(sc.nextLine());
        String num1 = sc.nextLine(); // 35엔터
        int input1 = Integer.parseInt(num1);
        // float input4 = Float.parseFloat(sc.nextLine());
        // double input5 = Double.parseDouble(sc.nextLine());

        System.out.print("연산자 입력 : "); // +,-,*,/
        String op = sc.nextLine();

        System.out.println("두번째 숫자 입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());

        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();
    }
}
