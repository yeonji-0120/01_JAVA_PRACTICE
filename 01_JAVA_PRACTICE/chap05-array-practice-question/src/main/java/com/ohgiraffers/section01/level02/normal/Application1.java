package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String a = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.nextLine().charAt(0);


        int length = a.length();

        char arr[] = new char[length];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = a.charAt(i);
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                count++;
            }
        }
        System.out.print("입력하신 문자열 " + a + "에서 찾으시는 문자 " + ch + "은 " + count + "개 입니다.");
    }
}
