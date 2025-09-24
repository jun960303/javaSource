package basic;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 95.4; // "95.4" 를 d 값에 넣어준다.
        int score = (int) d;
        System.out.printf("d = %f, score = %d\n", d, score);
    }
}
