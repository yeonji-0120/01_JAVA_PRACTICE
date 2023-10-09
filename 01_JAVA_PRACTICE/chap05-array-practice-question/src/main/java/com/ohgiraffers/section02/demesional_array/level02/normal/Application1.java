package com.ohgiraffers.section02.demesional_array.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("가로 행의 수를 입력하세요 : ");
            int row = sc.nextInt();
            System.out.print("세로 열의 수를 입력하세요 : ");
            int column = sc.nextInt();
            if (row > 10 || row < 1 || column > 10 || column < 1) {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
                continue;
            }else {
                char arr[][] = new char[row][column];      //char 형식인 row행 column열 배열 할당 및 선언
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {                 //아스키 코드에서 65~90이 영어 대문자임!
                        arr[i][j] = (char) ((int) (Math.random() * 26) + 65);     //26 랜덤 정수값 구한후 65 더한 값을 char로 강제 형변환
                    }
                }

                for (int i = 0; i < arr.length; i++) {                      //출력문
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                return;


            }

        }
    }
}
