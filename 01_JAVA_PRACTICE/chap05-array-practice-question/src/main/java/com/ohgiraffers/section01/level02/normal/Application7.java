package com.ohgiraffers.section01.level02.normal;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */

        int[] num1 = new int[10];

        for (int i = 0; i < num1.length; i++) {       //iarr 배열에 Math.random() 메소드 이용, 1~45번 난수 값 대입
            num1[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 1; i < num1.length; i++) {     // 순차정렬을 이용해 오름차순으로 정렬
            for (int j = 0; j < i; j++) {
                if (num1[i] < num1[j]) {
                    int temp;
                    temp = num1[i];
                    num1[i] = num1[j];
                    num1[j] = temp;
                }
            }
        }

        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.println("최대값 : " + num1[9]);
        System.out.println("최소값 : " + num1[0]);
    }
}
