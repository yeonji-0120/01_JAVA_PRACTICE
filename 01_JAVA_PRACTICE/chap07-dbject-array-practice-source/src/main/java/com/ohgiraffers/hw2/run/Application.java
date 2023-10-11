package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO studentDTO[] = new StudentDTO[10];

        StudentDTO studentDTO1 = new StudentDTO();
        StudentDTO studentDTO2 = new StudentDTO();
        StudentDTO studentDTO3 = new StudentDTO();
        StudentDTO studentDTO4 = new StudentDTO();
        StudentDTO studentDTO5 = new StudentDTO();
        StudentDTO studentDTO6 = new StudentDTO();
        StudentDTO studentDTO7 = new StudentDTO();
        StudentDTO studentDTO8 = new StudentDTO();
        StudentDTO studentDTO9 = new StudentDTO();
        StudentDTO studentDTO10 = new StudentDTO();
        studentDTO[0] = studentDTO1;
        studentDTO[1] = studentDTO2;
        studentDTO[2] = studentDTO3;
        studentDTO[3] = studentDTO4;
        studentDTO[4] = studentDTO5;
        studentDTO[5] = studentDTO6;
        studentDTO[6] = studentDTO7;
        studentDTO[7] = studentDTO8;
        studentDTO[8] = studentDTO9;
        studentDTO[9] = studentDTO10;

        boolean c = true;

        int count = 0;

        while (c) {
            if (count <= 10) {
                System.out.print("학년을 입력하세요 : ");
                int grade = sc.nextInt();
                studentDTO[count].setGrade(grade);

                System.out.print("반을 입력하세요 : ");
                int classroom = sc.nextInt();

                System.out.print("이름을 입력하세요 : ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("국어점수를 입력하세요 : ");
                int kor = sc.nextInt();

                System.out.print("영어점수를 입력하세요 : ");
                int eng = sc.nextInt();

                System.out.print("수학점수를 입력하세요 : ");
                int math = sc.nextInt();

                studentDTO[count].setGrade(grade);
                studentDTO[count].setClassroom(classroom);
                studentDTO[count].setName(name);
                studentDTO[count].setKor(kor);
                studentDTO[count].setEng(eng);
                studentDTO[count].setMath(math);

                sc.nextLine();

                count++;

                System.out.print("계속 추가하시겠습니까? 계속하려면 y를 눌러주세요");
                String a = sc.nextLine();
                if (a.equals("y") || a.equals("Y")) {

                    continue;
                } else {
                    c = false;
                    for (int i = 0; i < count; i++) {
                        double avg = 0;

                        avg = (studentDTO[i].getKor() + studentDTO[i].getEng() + studentDTO[i].getMath())/3;
                        System.out.println(studentDTO[i].information() + ", 평균 : " + (int) avg);
                    }
                }


            }


        }
    }
}

