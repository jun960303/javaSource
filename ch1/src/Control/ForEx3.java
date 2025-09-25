package Control;

public class ForEx3 {
    public static void main(String[] args) {
        // **********
        // **********
        // **********
        // **********
        // **********
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 10; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.println("*****");

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.err.println();
        // }

        // 구구단 생성
        // 2 * 1 = 2
        // 2 * 2 = 4
        // 3 * 1 = 3
        // 3 * 2 = 6
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.err.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }

    }
}
