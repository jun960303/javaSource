package basic;

import java.util.Scanner;

// System.in : 키보드 
// System.out : 화면

public class ScannerEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력받기 코드
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int input = sc.nextInt();
        System.out.printf("입력 값은 %d", input);
        sc.close();
    }
}
