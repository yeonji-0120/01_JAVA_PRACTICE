package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

        /*
        로또 번호 자동 생성기 프로그램을 작성하세요.
        단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

        Random 클래스 사용 혹은 Math.random() 메소드를 사용
        */

//        int a = (int)(Math.random()*45)+1;

        int iarr[] = new int[6];        //길이가 6인 iarr 배열 선언 및 할당

        for (int i = 0; i < iarr.length; i++) {       //iarr 배열에 Math.random() 메소드 이용, 1~45번 난수 값 대입
            iarr[i] = (int) (Math.random() * 45) + 1;
        }


        for (int i = 0; i < iarr.length; i++) {
            for (int j = 1; j < i; j++) {
                if (iarr[i] == iarr[j]) {
                    iarr[j] = (int) (Math.random() * 45) + 1;
                    i--;
                }
            }
        }
        for (int i = 1; i < iarr.length; i++) {     // 순차정렬을 이용해 오름차순으로 정렬
            for (int j = 0; j < i; j++) {
                if (iarr[i] < iarr[j]) {
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
            }

    }
}