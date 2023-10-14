package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Student student = new Student();
        Student student0[] = new Student[3];

        student0[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        student0[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        student0[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (Student a : student0) {
            System.out.println(a.information());

        }

        Employee emp = new Employee();
        Employee emp0[] = new Employee[10];

        for(int j= 0; j < emp0.length; j++){
            Employee empj = new Employee();
            emp0[i] = empj;
        }




        int count = 0;
        boolean c = true;

        while (c) {
            System.out.print("이름을 입력해주세요 : ");
            String name = sc.nextLine();

            System.out.print("나이를 입력해주세요 : ");
            int age = sc.nextInt();

            System.out.print("신장을 입력해주세요 : ");
            double height = sc.nextDouble();

            System.out.print("키를 입력해주세요 : ");
            double weight = sc.nextDouble();


            System.out.print("급여를 입력해주세요 : ");
            int salayr = sc.nextInt();
            sc.nextLine();


            System.out.print("부서를 입력해주세요 : ");
            String dept = sc.next();

            emp0[count].setName(name);
            emp0[count].setAge(age);
            emp0[count].setHeight(height);
            emp0[count].setWeight(weight);
            emp0[count].setSalary(salayr);
            emp0[count].setDept(dept);

            sc.nextLine();
            count++;

            System.out.print("계속 추가하시겠습니까? 계속하려면 y를 눌러주세요");
            String a = sc.nextLine();
            if (a.equals("y") || a.equals("Y")) {
                continue;
            } else {
                c = false;
                for (int j = 0; j < count; j++) {
                    System.out.println(emp0[i].information());
                }
            }


        }
    }
}
