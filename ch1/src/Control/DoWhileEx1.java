package Control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // // while 변형구조
        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의의 수 :
        // 컴퓨터가 생각한 수를 맞추는 수 맞추기
        // int answer = (int) (Math.random() * 100) + 1;

        // Scanner sc = new Scanner(System.in);
        // boolean re = false;
        // int result = 0;
        // // 그냥 do 밖에다가 int num = 0;을 주고 do안에서 num만 자식으로 불러들여라.
        // do {
        // // 사용자 입력
        // System.out.print("1 ~ 100 사이의 정수를 입력 : ");
        // int num = Integer.parseInt(sc.nextLine());
        // result = num;
        // // 더 작은 수로 시도해보세요 or 더 큰 수로 시도해보세요
        // } while (re);
        // // 사용자 입력과 컴퓨터가 생성한 임의의 수 비교
        // if (result > answer) {
        // System.out.println("더 작은 수로 시도해보세요");
        // }else if(result < answer){
        // System.out.println("더 큰수로 시도해보세요");
        // }else{
        // System.out.println("정답입니다.");
        // re = true;
        // }
        int answer = (int) (Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);
        boolean re = false;
        int result = 0;

        do {
            // 사용자 입력
            System.out.println("1 ~ 100 사이의 수를 입력 해주세요 : ");
            int num = Integer.parseInt(sc.nextLine());
            result = num;
            // 사용자 입력과 컴퓨터가 생성한 임의 수 비교
            // 더 작은 수로 시도해보세요 or 더 큰 수로 시도해보세요
            if (result > answer) {
                System.out.println("더 작은수로 시도해주세요");
            } else if (result < answer) {
                System.out.println("더 큰수로 시도해 보세요");
            }
        } while (result != answer);
        System.out.println("정답입니다.");
    }
}
