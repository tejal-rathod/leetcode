package com.leetcode.soluton.stream;

class Employee {
    private String name;
    private Integer salary;
    private String department;

    public Employee(String name, Integer salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() { return name; }
    public Integer getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}