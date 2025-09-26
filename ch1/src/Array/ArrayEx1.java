package Array;

// 배열(Array)
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
// 타입 배열명[] = new 타입[10]; 배열 선언과 생성;
// 타입[] 배열명 = new 타입[10]; 배열 선언과 생성;
public class ArrayEx1 {
    public static void main(String[] args) {
        // 시험점수 저장
        // 10 명
        // int score1 = 0, score2 = 0, score3 = 0;

        // int sum = score1 + score2 + score3;
        // double avg = (double) sum / 10;

        // 타입 : 기본형(int, long, float, double, boolean ,char), 참조형(String...)
        // 정수형 : 0
        int[] arr1 = new int[10];
        System.out.println(arr1[3]);
        // 실수형 : 0.0
        double[] arr2 = new double[5];
        System.out.println(arr2[0]);

        // 논리형 : false
        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[1]);

        // 문자형 : 공백
        char[] arr4 = new char[3];
        System.out.println(arr4[0] + "arr");

        int[] arr5; // 배열 선언
        arr5 = new int[3]; // 배열 생성

        // 초기화
        // arr1[0] = 88, arr1[1] = 90, arr1[2] = 87;

        int score[] = { 88, 90, 87, 86, 77, 78, 79, 75, 72, 66 };
        // int sum = score[0] + score[1] + .... + score[9];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);
    }
}
