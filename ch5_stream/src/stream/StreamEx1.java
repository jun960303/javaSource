package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("감");
        list.add("포도");
        list.add("바나나");

        // for (String string : list) {
        // System.out.println(string);
        // }

        // 정렬(원본) 후 출력
        // list.sort(Comparator.naturalOrder());
        // System.out.println(list);

        System.out.println();

        String[] strArr = { "사과", "배", "감" };
        // 배열 => list 변경
        // List<String> list2 = Arrays.asList(strArr);
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(strArr));

        System.out.println();

        System.out.println("stream 처리");
        // 리스트를 Stream 으로 변경
        Stream<String> stream1 = list.stream();
        // 배열을 stream 으로 변경
        Stream<String> stream2 = Arrays.stream(strArr);

        // Consumer<? super String> action
        // Consumer

        // 원본 변경하지 않음
        stream1.sorted().forEach((x) -> System.out.println(x));
        stream2.sorted().forEach((x) -> System.out.println(x));
        System.out.println(list);
        System.out.println(Arrays.toString(strArr));

    }
}
