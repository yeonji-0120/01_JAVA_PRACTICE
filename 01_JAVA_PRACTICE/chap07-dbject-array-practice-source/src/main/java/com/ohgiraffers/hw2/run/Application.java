package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDTO studentDTO[] = new StudentDTO[10];

        int count = 0;



        while(true){
            System.out.println("학생 정보를 기록합니다 ");

            System.out.println("학년을 입력하세요 : ");
            int grade = sc.nextInt();
            System.out.println("반을 입력하세요 : ");
            int classroom = sc.nextInt();
            System.out.println("이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.println("국어점수를 입력하세요 : ");
            int kor = sc.nextInt();
            System.out.println("영어점수를 입력하세요 : ");
            int eng = sc.nextInt();
            System.out.println("수학점수를 입력하세요 : ");
            int math = sc.nextInt();

            count++;



        }
    }
}
