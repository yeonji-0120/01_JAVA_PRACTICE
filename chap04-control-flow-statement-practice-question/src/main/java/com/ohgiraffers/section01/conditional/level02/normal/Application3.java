package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Application3 a = new Application3();
        a.season();

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */

    }

    public void season (){


        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");

        int num1 = sc.nextInt();

        if(num1 == 0 || num1 >= 13){
            System.out.println("잘못입력하셨습니다.");
        }else if(num1 >= 3 && num1 <= 5) {
            System.out.println("봄");
        }else if(num1 >= 6 && num1 <= 8 ){
            System.out.println("여름");
        }else if(num1 >= 9 && num1 <= 11){
            System.out.println("가을");
        }else{
            System.out.println("겨울");
        }
    }

}
