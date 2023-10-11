package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] employeeDTO = new EmployeeDTO[3];

        employeeDTO[0] = new EmployeeDTO();
        employeeDTO[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333","서울 잠실" );
        employeeDTO[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < employeeDTO.length; i++){
            System.out.println("emp[" + i + "] : "+ employeeDTO[i].information());
        }
        System.out.println("===========================================================");

        employeeDTO[0].setEmpNo(0);
        employeeDTO[0].setEmpName("김말똥");
        employeeDTO[0].setDept("영업부");
        employeeDTO[0].setJob("팀장");
        employeeDTO[0].setAge(30);
        employeeDTO[0].setGender('M');
        employeeDTO[0].setSalary(3000000);
        employeeDTO[0].setBonusPoint(0.2);
        employeeDTO[0].setPhone("01055559999");
        employeeDTO[0].setAddress("전라도 광주");


        employeeDTO[1].setDept("기획부");
        employeeDTO[1].setJob("부장");
        employeeDTO[1].setSalary(4000000);
        employeeDTO[1].setBonusPoint(0.3);
        employeeDTO[1].setPhone("01022223333");
        employeeDTO[1].setAddress("서울 잠실");



        for(int i = 0; i < 2; i++){
            System.out.println("emp[" + i + "] : "+ employeeDTO[i].information());
        }

        System.out.println("===========================================================");

        double Salay[] = new double[3];
        double bonuspoint[] = new double[3];
        double totalSalay[] = new double[3];
        for(int i = 0; i < employeeDTO.length; i++){
            Salay[i] = employeeDTO[i].getSalary();
            bonuspoint[i] = employeeDTO[i].getBonusPoint();
            totalSalay[i] = (Salay[i]+(Salay[i]*bonuspoint[i]))*12;
        }

        for(int i = 0; i < employeeDTO.length; i++){
            System.out.println(employeeDTO[i].getEmpName() + "의 연봉 : " + (int)totalSalay[i] + "원");

        }

        System.out.println("=================================");
        System.out.println("직원들의 연봉의 평균 : " + ((int)(totalSalay[0]+totalSalay[1]+totalSalay[2]))/3+"원");


    }
}
