package com.leetcode.soluton.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Employees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Reena", 50000, "IT"),
                new Employee("carl", 60000, "Fin"),
                new Employee("beena", 50000, "SALES"),
                new Employee("David", 70000, "IT"),
                new Employee("Carol", 90000, "IT"),
                new Employee("ana", 25000, "FANANC")
        );


        List<Employee> sortedEmploye = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());

        List<Employee> sortedEmployee = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName

        )).collect(Collectors.toList());

        sortedEmployee.forEach(System.out::println);

        //find second highest salary

        Optional<Integer> secondHighest =
                employees.stream().map(Employee::getSalary).distinct().
                        sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("secondHighest: " + secondHighest.get());


        //Group Employees by Department
        Map<String, List<Employee>> groupBYEmployee = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));

        // Print result
        groupBYEmployee.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(System.out::println);
            System.out.println();
        });


        //
    }
}
