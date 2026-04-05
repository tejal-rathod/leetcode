package com.leetcode.soluton.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListtoMap {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee( "Alice",10,"IT"),
                new Employee("Bob",13,"IT"),
                new Employee("Charlie",12,"IT")
        );

        Map<Integer,String> empMap=list.stream().collect(Collectors.toMap(Employee::getSalary,Employee::getName));
        System.out.println(empMap);
    }
}
