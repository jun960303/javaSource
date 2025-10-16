package lang;
// 다중 catch

public class ExceptionEx5 {
    public static void main(String[] args) {

        try {
            // exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); // 예외사항을 추적
            System.out.println("입력값 확인 하거나 , 인자값을 확인해");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
