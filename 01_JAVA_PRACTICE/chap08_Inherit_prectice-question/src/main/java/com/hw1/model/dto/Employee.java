package com.hw1.model.dto;

public class Employee extends Person {
    private int salary;
    private String dept;

    public Employee() {
    }

    public Employee(String name, int age, double height, double weight) {
        super(age, height, weight);
        super.name = name;

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String information() {
        return super.information();
    }
}
