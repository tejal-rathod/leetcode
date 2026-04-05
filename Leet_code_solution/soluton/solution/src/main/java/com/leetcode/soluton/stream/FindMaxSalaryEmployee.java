package com.leetcode.soluton.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxSalaryEmployee {

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(new Employee("sam",10,"IT"),
                new Employee("Bob",13,"IT"),
                new Employee("Anna",1233,"IT"));

        Employee maxEmp=employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(maxEmp);
    }

}
