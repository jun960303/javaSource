package object;

public class StudentEx1 {
    public static void main(String[] args) {
        // 객체 생성 == 인스턴스 생성
        Student obj = new Student();

        // 인스턴스 초기화
        obj.name = "홍길동";
        obj.phon = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        // obj.changeName();
        System.out.println(obj);

        // 메소드를 호출했다.
        // 1) 결과반환 o : 변수에 담거나 혹은 print 구문
        // 2) 결과반환 x : 호출만 하기(void)
        // System.out.println(obj.getAddress());

        // 맴버변수 값 변경
        Student student = new Student();
        student.setName("성춘향");
        student.setPhon("010-5678-8596");
        student.setAddress("경기도 수원시");
        // System.out.println(student);
        // 맴버변수 값 가져오기
        System.out.println(student.getName());

        student.changeName("성천사");
        System.out.println(student);
    }
}
