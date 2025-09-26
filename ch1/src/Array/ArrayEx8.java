package Array;

public class ArrayEx8 {
    public static void main(String[] args) {
        // int[][] score = new int[3][4]; // 3행 4열
        // score[0][0] = 78;
        // score[1][1] = 68;

        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // };

        // System.out.println(score.length);
        // System.out.println(score[0].length);
        // for (int i = 0; i < score.length; i++) {
        // for (int j = 0; j < score[i].length; j++) {
        // System.out.print(score[i][j] + "\t");
        // }
        // System.out.println();
        // }
        // 가변 배열
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[3];
        arr2[2] = new int[2];

        int[][] jumsu = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 70 },
        };
        System.out.println("번호         국어           영어         수학         총점           평균");
        System.out.println("=========================================================================");
        int kortot = 0, engtot = 0, mathtot = 0;
        for (int i = 0; i < jumsu.length; i++) {
            // 개인별 총점 , 평균 변수 선언
            int sum = 0;
            float avg = 0.0f;
            kortot += jumsu[i][0];
            engtot += jumsu[i][1];
            mathtot += jumsu[i][2];

            System.out.printf("%3d", i + 1);

            for (int j = 0; j < jumsu[i].length; j++) {
                sum += jumsu[i][j];
                System.out.printf("%5d", jumsu[i][j]);
            }
            avg = sum / (float) jumsu[i].length;
            System.out.printf("%5d  %5.1f", sum, avg);
            System.out.println();
        }
        System.out.println("====================================");
        System.out.printf("총점 : %3d %3d %3d", kortot, engtot, mathtot);
    }
}
