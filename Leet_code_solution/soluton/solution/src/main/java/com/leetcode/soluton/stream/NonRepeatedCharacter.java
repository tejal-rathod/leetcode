package com.leetcode.soluton.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        String str = "hello";
        Character result =
                str.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet().stream()
                        .filter(e -> e.getValue() == 1L)   // ✅ FIX: use 1L
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        String val = "java";
        /*
            String
         → IntStream
         → Stream<Character>
         → Map<Character, Count>
         → Filter unique chars
         → Get first*/

        val.chars().
                mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c, LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey).findFirst()
                        .orElse(null);

    }
}
