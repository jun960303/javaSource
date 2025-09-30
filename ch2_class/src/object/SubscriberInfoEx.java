package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        // SubscriberInfo sbi = new SubscriberInfo("김형준", "qmslzp216095", "asd3232432",
        // "010-1234-1111");

        // // // 기본조회
        // // System.out.println(sbi.name);
        // // System.out.println(sbi.id);
        // // System.out.println(sbi.password);
        // // System.out.println(sbi.phone);

        // // // 변경할 비밀번호
        // // sbi.changePassword("ddd84848");
        // // System.out.println(sbi.password);
        // // // 변경할 전화번호
        // // sbi.changPhone("010-7777-7777");
        // // System.out.println(sbi.phone);

        SubscriberInfo info = new SubscriberInfo(null, null, null, null);
        // 선생님 설명
        // 1. 직접접근 : private 사용하면 불가
        // sbi.name 불가;
        // 2. 생성자
        // 3. 메소드 : set ~~
        info.setId("abcderter");
        info.setName("김형준");
        info.changePassword("adsafksj39839593");
        info.changPhone("010-1121-42142");

        // 가입자 정보 조회
        // 1. 간단조회 : toString() => 개발자 확인용
        System.out.println(info.toString());
        // 2. 개별조회 : get~~~~() =>
        System.out.println("아이디 : " + info.getId());
        System.out.println("이름 : " + info.getName());
        System.out.println("비밀번호 : " + info.getPassword());
        System.out.println("전화번호 : " + info.getPhone());
    }

}
