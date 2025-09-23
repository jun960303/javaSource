package basic;

public class Variable3 {
    public static void main(String[] args) {
        // 실수형 : float , double(기본타입)
        // float score1 = 50;
        // float : f,F 를 붙혀주면 Float type이라는걸 인식시켜줌.
        float score1 = 50.15F;
        System.out.println("score1 =" + score1); // 50.15
        double score2 = 45.125;
        // double : d,D 를 붙혀주면 Double type이라는걸 인식시켜줌.
        double score3 = 45.125;
        System.out.println("score2 =" + score2); // 45.0
        System.out.println("score3 =" + score3); // 45.125
        // %10.2f : %전체자릿수.소수점자릿수
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2); // 45.125
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2); // 45.125
    }
}
