package object;

public class CarEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        Car car = new Car();

        // 현대자동차 아반떼, 흰색 , 200
        // 1. 직접접근
        car.companyName = "현대";
        car.model = "아반떼";
        car.collor = "white";
        car.maxSpeed = 200;
        System.out.println(car);

        // 2. setter 메소드
        // 3. 생성자

        Car car2 = new Car("기아");
        System.out.println(car2);

        Car car3 = new Car("현대", "쏘나타");
        Car car4 = new Car("현대", "아이오닉5", "gray");
        Car car5 = new Car("현대", "포터", "white", 150);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        car3.setCollor("green");
        System.out.println("색상 지정 후 car3 = " + car3);
    }
}
