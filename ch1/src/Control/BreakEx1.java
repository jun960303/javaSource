package Control;

// break : switch 구문 
//         자신이 포함된 가장 가까운 반복문 벗어나기 
public class BreakEx1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (true) {
            // sum 이 100 초과 시 반복문 중지
            if (sum > 100) // 한줄일때는 { }를 안해도 됨.
                break;
            ++i;
            sum += i;
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
