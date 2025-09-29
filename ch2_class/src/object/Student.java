package object;

public class Student {

    // 맴버변수 , 맴버메소드, 생성자

    // 맴버 변수
    // 이름(홍길동) , 전화번호(010-1234-5678), 주소(서울시 종로구 25),
    String name;
    String phon;
    String address;

    // 생성자(constructor)
    public Student() {

    }

    // 메소드
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhon() {
        return phon;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }

    // 이름 변경 메소드 생성
    // 리턴타입 메소드명(매개변수1, 매개변수2, .... 여러개가능.){}
    // void + 기본타입 -int,-float.....,참조타입 - String,[]
    String changeName(String name) {
        this.name = name;
        return "";
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", phon=" + phon + ", address=" + address + "]";
    }

}