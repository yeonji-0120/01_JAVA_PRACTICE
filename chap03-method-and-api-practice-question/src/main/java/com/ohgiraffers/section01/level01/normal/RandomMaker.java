package com.ohgiraffers.section01.level01.normal;

import java.util.Scanner;

public class RandomMaker {

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    public static String rockPaperScissors() {
        int random1 = (int) (Math.random() * 3) + 1;
        String result = "";
        if (random1 == 1) {
            result = "가위";}

        if (random1 == 2) {
            result = "바위";}

        if (random1 == 3) {
            result = "보";}

        return result;

    }

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */
    public static String tossCoin(){
        int random1 = (int) (Math.random() * 2) + 1;
        String result = "";
        if (random1 == 1) {
            result = "앞면";}

        if (random1 == 2) {
            result = "뒷면";}



        return result;

    }

}
