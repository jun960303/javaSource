package object;

public class MyMathEx {
    public static void main(String[] args) {
        // MyMath 인스턴스 생성
        MyMath myMath = new MyMath();

        // 메소드 호출
        // 1) 변수에 받기
        // 2) 출력문에 쓰기

        long result = myMath.add(12, 63);
        System.out.println("덧셈 결과 : " + result);

        result = myMath.subtract(85, 35);
        System.out.println("뺏셈 결과 : " + result);

        result = myMath.multiply(65, 35);
        System.out.println("곱셈 결과 : " + result);

        double result2 = myMath.divide(8, 3);
        System.out.println("나눗셈 결과 : " + result2);
    }
}
