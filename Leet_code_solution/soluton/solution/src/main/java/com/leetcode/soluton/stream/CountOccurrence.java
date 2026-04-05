package com.leetcode.soluton.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrence {

    public static void main(String[] args) {
        String str="apple";




        Map<Character, Long> freq = str.chars().mapToObj(c-> (char)c).collect(Collectors
                .groupingBy(c-> c,Collectors.counting()));


      /*  freq.forEach((c,v)->
                System.out.println("char: "+c +" count: "+v));*/

        //String → IntStream → Stream<Character> → grouping → counting
       Map<Character,Long> freuqncy=str.chars().mapToObj(c-> (char) c ).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        freuqncy.forEach( (c,v)-> System.out.println(c+ "" +v));
    }
}
