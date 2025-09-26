package Control;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고
        // 눈의 합이 5이면 주사위 실행을 멈춘다.
        int count = 0;
        while (true) {
            // 1~6사이 랜덤하게
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            // System.out.println(dice1);
            // System.out.println(dice2);
            int result = dice1 + dice2;
            // System.out.println(result);
            // (1,3)
            count = count + 1;
            if (result == 5) {
                System.out.println("실행이 멈춥니다.");
                break;
            } else {
                System.out.println(count + " 회차 " + "주사위 결과 : (" + dice1 + ")  (" + dice2 + ")");
            }

        }
    }
}
