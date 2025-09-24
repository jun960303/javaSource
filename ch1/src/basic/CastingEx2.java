package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 91234567;
        // 자동 형변환 : float f = (float)i; => 작은타입 => 큰 타입에 대입 시 가능
        float f = i;
        int i2 = (int) f;

        double d = i;
        int i3 = (int) d;

        // 형변환 가능 기본타입
        // byte,short,int,long,float,double
        // char
    }
}
