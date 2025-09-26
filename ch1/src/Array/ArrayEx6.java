package Array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 45개의 정수값을 저장하기 위한 배열생성
        int[] num = new int[45];
        // 각 요소에 1~45 값 저장
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        // 배열의 0번째에서 5번째 요소까지
        // 모두 6개만 교환
        int n = 0;
        int[] random = new int[45];
        for (int i = 0; i < 6; i++) {
            // 교환위치 : 0 ~ 44 무작위 수 추출
            n = (int) (Math.random() * 45);
            // i, 교환위치랑
            int xtr = num[i];
            num[i] = num[n];
            num[n] = xtr;
        }
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < 6; i++) {
            System.out.printf("arr =[%d] = %d\n", i, num[i]);
        }
    }
}
