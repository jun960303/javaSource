package ext;

import exam.Parent;

// public class Second{
//     Parent parent = new Parent();

//     public void print() {
//         // default 로 선언된 경우 다른 패키지에서 접근 불가 
//         parent.name = "성춘향";
//         // protected : 상속관계가 있으면 다른 패키지라도 허용
//         parent.grade = "A";
//     }
// }

public class Second extends Parent {

    public void info() {
        // default 로 선언된 경우 다른 패키지에서 접근 불가
        // super.name = "성춘향";
        // 만약 다른 패키지에서도 받고싶다면 protected 를 사용할것
        super.grade = "b";
        super.getNum1();

    }

    @Override
    public int getNum1() {
        return super.getNum1();
    }
}
