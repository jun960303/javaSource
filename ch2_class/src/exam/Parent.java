package exam;

public class Parent {
    // 멤버변수(속성) 은 외부 접근 차단
    private int num1;
    String name;
    protected String grade;

    private int print() {
        return 0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

}