package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */
        // 3을 입력 받으면 1 2 1        -> 2
        // 5을 입력 받으면 1 2 3 2 1     -> 3
        // 7을 입력 받으면 1 2 3 4 3 2 1   -> 4
        // 9을 입력 받으면 1 2 3 4 5 4 3 2 1  -> 5

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num1 = sc.nextInt();    //정수 입력받기
        int arr[] = new int[num1];  //입력 받은 정수가 길이인 배열 생성
        int max = (num1 / 2) + 1;   //출력할 정수의 가장 큰 값이자 배열의 위치 구하는 식
        int x = max - 1;

        if(num1 % 2 == 0 || num1 < 0 ){ //입력 받은 정수가 양수이거나 홀수인지 확인하는 명제
            System.out.println("양수 혹은 홀수만 입력해야합니다.");
        }else {
            for (int i = 0; i < max; i++) { //arr[0]부터 arr[max] 배열까지 값 입력하기위한 증감식
                arr[i] += i + 1;
                System.out.print(arr[i]);

            }
            for (int j = max; j < num1; j++) {  // arr[max] 배열부터 arr[num1] 배열까지의 값을 넣기위한 증감식
                arr[j] = x;                     //arr[max] 배열에 출력할 정수의 가장 큰 값 -1인 x 값 입력
                --x;                            //x - 1
                System.out.print(arr[j]);

            }
        }





        }

    }



