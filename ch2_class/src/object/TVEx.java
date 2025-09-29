package object;

public class TVEx {
    public static void main(String[] args) {
        // TV 클래스의 인스턴스 생성
        TV tv = new TV();

        System.out.println(tv); // object.TV@24d46ca6
        // TV [size=0, channel=0, power=false, color=null]
        // 정수형 : 0, 실수형 0.0 , 논리형 : false , 문자형 : 빈문자열
        // String = null

        // tv.power = true;
        tv.setPower(true);

        // tv.size = 48;
        tv.setSize(48);
        // tv.channel = 3;
        tv.setChannel(3);
        // tv.color = "block";
        tv.setColor("black");

        System.out.println(tv);
        // tv.size = 48;
        // tv.channel = 3;
        // tv.color = "black";

        TV tv2 = new TV();

        tv2.setPower(true);
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);
        System.out.println(tv2);

        // 채널 +
        tv2.channelUp();
        System.out.println(tv2);
    }
}
