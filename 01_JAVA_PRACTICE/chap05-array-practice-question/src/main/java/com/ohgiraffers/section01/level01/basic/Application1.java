package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */

        int num1[] = new int[10];
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;
        num1[5] = 6;
        num1[6] = 7;
        num1[7] = 8;
        num1[8] = 9;
        num1[9] = 10;

        for(int i = 0; i < num1.length; i++){
            System.out.print(num1[i] + " ");
        }

    }
}
