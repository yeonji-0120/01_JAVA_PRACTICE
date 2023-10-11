package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO studentDTO[] = new StudentDTO[10];

        for(int i= 0; i < studentDTO.length; i++){
            StudentDTO studentDTOi = new StudentDTO();
            studentDTO[i] = studentDTOi;
        }


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

