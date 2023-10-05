package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int a = (int)(Math.random()*45)+1;
        int b = (int)(Math.random()*45)+1;
        int c = (int)(Math.random()*45)+1;
        int d = (int)(Math.random()*45)+1;
        int e = (int)(Math.random()*45)+1;
        int f = (int)(Math.random()*45)+1;



        System.out.println(a + " ");
        System.out.println(b + " ");
        System.out.println(c + " ");
        System.out.println(d + " ");
        System.out.println(e + " ");
        System.out.println(f + " ");

    }
}
