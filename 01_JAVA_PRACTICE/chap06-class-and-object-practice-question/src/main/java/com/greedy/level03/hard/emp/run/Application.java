package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("번호 : ");
        int number = sc.nextInt();

        System.out.print("이름 : ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("부서 : ");
        String dept = sc.nextLine();

        System.out.print("직급 : ");
        String job = sc.nextLine();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        System.out.print("급여 : ");
        int salary = sc.nextInt();

        System.out.print("보너스포인트 : ");
        double bonusPoint = sc.nextDouble();

        System.out.print("연락처 : ");
        sc.nextLine();
        String phone = sc.nextLine();

        System.out.print("주소 : ");
        String address = sc.nextLine();



        EmployeeDTO EmployeeDTO = new EmployeeDTO();
        EmployeeDTO.setNumber(number);
        EmployeeDTO.setName(name);
        EmployeeDTO.setDept(dept);
        EmployeeDTO.setJob(job);
        EmployeeDTO.setAge(age);
        EmployeeDTO.setGender(gender);
        EmployeeDTO.setSalary(salary);
        EmployeeDTO.setBonusPoint(bonusPoint);
        EmployeeDTO.setPhone(phone);
        EmployeeDTO.setAddress(address);

        System.out.println(EmployeeDTO.getNumber());
        System.out.println(EmployeeDTO.getName());
        System.out.println(EmployeeDTO.getDept());
        System.out.println(EmployeeDTO.getJob());
        System.out.println(EmployeeDTO.getAge());
        System.out.println(EmployeeDTO.getGender());
        System.out.println(EmployeeDTO.getSalary());
        System.out.println(EmployeeDTO.getBonusPoint());
        System.out.println(EmployeeDTO.getPhone());
        System.out.println(EmployeeDTO.getAddress());


    }
}
