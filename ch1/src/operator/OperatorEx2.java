package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        // + - * / %
        // %d , %c
        // %% : %

        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b); // 2
        System.out.printf("%d %% %d = %d\n", a, b, a % b); // 나머지
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b); //

        // 서로 다른 타입의 연산결과는 큰 타입 따라감
        // int/int => int
        // int/float => float
        // int/double => double

        char c1 = 'a', c2 = c1, c3 = ' ';
        // 1 사용시 타입이 int 로 인식
        // char + int => int
        c3 = (char) (c1 + 1); // c3 = 'a' + 1; 이기때문에 +1 을 하려면 int값으로 변환해야함.
        int i = c1 + 1;

        c2++; // 'a' + 1;
        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
    }
}
