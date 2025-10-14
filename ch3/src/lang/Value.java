package lang;

public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // obj = value2
        if (obj instanceof Value) {
            Value v = (Value) obj;
            if (this.value == v.value) {
                return true;
            }

        }
        return false;

    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    // String => int : Integer.parseInt("65");

    // int => String 으로 변환하는 가장 간단한 방법
    // @Override
    // public String toString() {

    // return this.value + " ";
    // }

}
