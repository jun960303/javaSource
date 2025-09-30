package object;

// 1. 인스턴스(속성, 멤버, 필드) 변수 : 클래스 영역 => 인스턴스 생성 후
// 2. 클래스 변수 : 클래스 영역(static) => 클래스가 메모리에 올라갈때
// 3. 지역변수 : 메서드 영역, 생성자 매개변수, 생성자 내부
public class Card {

    // private String kind;
    // static String cv;

    // void print(int i) {
    // int i = 0;
    // }

    String kind;
    int number;
    static int width = 100;
    static int height = 150;

}
