package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 참 , 거짓 표현하고 싶을 때
        boolean flag = true;
        boolean face = false;
        System.out.println(flag ? "참" : "거짓");
        System.err.println(face ? "참" : "거짓");
        // 문자형
        char ch = 'a', ch2 = '가';
        // char ch3 = 'ab';
        // 문자열 : ""
        System.out.println("ch = " + ch + " ch2 =" + ch2);
        System.out.printf("ch = %c , ch2 =%5c\n", ch, ch2);
        System.out.printf("ch = %10c , ch2 =%5c\n", ch, ch2);
        System.out.println("ch = " + (ch + 1)); // 98
        System.out.println("ch2 = " + (ch2 + 1)); // 44033
        System.out.printf("ch2 = %c\n", (ch2 + 1)); // 각
        System.out.printf("ch2 = %d\n", (ch2 + 1)); // 44033
        // String ch3 = "a";
    }
}
