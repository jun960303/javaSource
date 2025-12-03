package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx3 {
  public static void main(String[] args) {
    // 배열 => 스트림
    String[] strArr = { "사과", "바나나", "딸기", "포도", "메론" };

    // java.util.Arrays : 배열과 관련된 기능 제공
    // Arrays.toString(strArr) : 배열 값으로 출력
    // Arrays.asList(null) : 배열 = > 리스트
    // Arrays.sort(strArr) : 정렬

    // 배열 => 스트림
    Stream<String> stream = Arrays.stream(strArr);
    // System.out.println(stream);
    stream.forEach(s -> System.out.println(s));
    // stream has already been operated upon or closed
    // stream.forEach(System.out::println);

    // 리스트 => 스트림
    List<String> list = Arrays.asList("사과", "바나나", "딸기", "포도", "메론");
    // java.lang.UnsupportedOperationException
    // list.add("수박");
    Stream<String> stream2 = list.stream();
    stream2.forEach(System.out::println);

    // List.of(E...elements) : 인수의 개수는 자유롭게
    List<String> list2 = List.of("사과", "바나나", "딸기", "포도", "메론");
    // UnsupportedOperationException
    // list2.add("수박");

    Stream<String> stream3 = Stream.of("사과", "바나나", "딸기", "포도", "메론");

    // 숫자 범위로 스트림 생성
    IntStream.range(1, 10).forEach(System.out::println);
    IntStream.rangeClosed(1, 10).forEach(System.out::println);

    LongStream.range(1, 10);
    LongStream.rangeClosed(1, 10);
  }
}
