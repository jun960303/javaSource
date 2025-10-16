package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = { 37, 21, 56, 99, 88, 57, 62, 15, 39, 78 };
        // Integer[] arr = { 37, 21, 56, 99, 88, 57, 62, 15, 39, 78 };

        // 검색
        // 1. 순차 검색
        // 2. 이진 검색
        Arrays.sort(arr);
        int pos = Arrays.binarySearch(arr, 62);
        System.out.println("62 는 : " + (pos + 1) + "번째 위치함");
    }
}
