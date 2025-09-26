package Array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0 ~ 9의 숫자로 초기화

        // int x = 10, y = 5;
        // // x => y , y => x 값 교환
        // int temp = x;
        // x = y;
        // y = temp;

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        // System.out.println(Arrays.toString(num));
        int n = 0;
        for (int i = 0; i < 100; i++) {
            // 0 ~ 9 사이의 임의의 수 추출
            n = (int) (Math.random() * 10);
            // num[i] = random;
            int xtr = num[0];
            num[0] = num[n];
            num[n] = xtr;
        }
        System.out.println(Arrays.toString(num));
    }
}
