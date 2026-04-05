package com.leetcode.soluton.stream;

import java.io.InputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {
        String str = "tejal";


        String reverse = IntStream.range(0, str.length()).mapToObj(i -> str.charAt(str.length() - i - 1)).map(String::valueOf).collect(Collectors.joining());

        System.out.println(reverse);
    }
}
