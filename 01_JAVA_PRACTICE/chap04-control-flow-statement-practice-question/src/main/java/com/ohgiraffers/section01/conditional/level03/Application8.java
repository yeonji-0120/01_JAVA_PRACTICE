package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
            1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

            ex.
            정수를 하나 입력하세요 : 8
            1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
        */
        Application8 a = new Application8();
        a.app8();

    }

    public void app8() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");

        int sum2 = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (true){

            sum += i;
            if(i == sum2){
                break;
            }
            i++;
        }
        System.out.println(sum);
    }
}
