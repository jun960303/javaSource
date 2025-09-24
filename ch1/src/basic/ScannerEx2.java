package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Println() : 출력 후 엔터 처리
        // Print() : 출력 엔터 처리 불가
        // Printf() : 포맷지정 엔터처리 불가
        System.out.print("두자리 정수 입력해주세요 : ");
        String num = sc.nextLine(); // 35 => "35" 문자열 35로 인식
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1)); // "35" + 1을 붙히면 연산이 아닌 연결 의미.
        // "35" => 35 문자를 숫자로 변환
        int input = Integer.parseInt(num);
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1));
    }
}
