package Control;

public class ForEx1 {
    public static void main(String[] args) {

        // int i = 0; 초기화라는 뜻
        // i < args:length; 조건식이라고 부른다.
        // i ++ 증감식이라고 부른다.

        for (int i = 0; i < args.length; i++) {
            // 조건식이 참인 동안 반복적으로 수행할 문장

        }
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i + "안녕하세요");
        // }

        // i += 2=> i = i + 2
        // for (int i = 0; i < 10; i += 2) {
        // System.out.println(i + "안녕하세요");
        // }

        // for (int i = 10; i > 0; i--) {
        // System.out.println(i + "안녕하세요");
        // // }
        // for (int i = 10, j = 1; i > 0; i--, j++) {
        // System.out.println(i + "안녕하세요");
        // }

        // 1 ~ 10 까지 출력 하고싶다.
        // for (int i = 1; i < 11; i++) {
        // System.out.print(i + " ");
        // }

        // 1 ~ 10 까지 합계 구하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("1 ~ 10 까지 합" + sum);
    }
}
