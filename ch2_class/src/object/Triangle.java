package object;

public class Triangle {
    // 속성 : 밑변(baseLine) ,높이
    double baseLine;
    double height;

    // 기능 : 삼각형 너비
    double getArea() {
        return baseLine * height / 2;
    }

    public Triangle() {
    }

    public Triangle(double baseLine, double height) {
        this.baseLine = baseLine;
        this.height = height;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
