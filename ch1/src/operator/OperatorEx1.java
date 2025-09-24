package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        // 단향연산자 : ++ --
        // ++ : +1 / -- : -1
        int i = 5;
        i++;
        System.out.println(i);
        i--; // i = i - 1;
        System.out.println(i);

        int j = 10;
        ++j;
        System.out.println(j);

        int k = 5, l = 0;
        l = k++; // 1=k ; k++;
        System.out.println("l = k++ 실행 후 , k=" + k + ", l=" + l); // k=6, l=5

        k = 5;
        l = 0;
        l = ++k; // ++k; 1=k;
        System.out.println("l = ++k 실행 후 , k=" + k + ", l=" + l); // k=6, l=6
    }
}
