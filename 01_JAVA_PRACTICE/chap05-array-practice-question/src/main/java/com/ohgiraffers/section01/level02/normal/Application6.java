package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */
        String[] name = {"페리카나", "교촌", "비비큐", "BBQ", "bbq", "멕시카나", "처갓집", "양념", "간장", "후라이드"};

        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        String a = sc.next();


        while (true){
            for(int i = 0; i < name.length; i++){       //배열과 일치하는 문자열이 있는지 확인하는 식
                if(name[i].equals(a)){                  //String은 클래스임 ==는 객체의 주소를 비교하기때문에 비교에 사용 불가. 따라서 equals()메소드 사용
                    System.out.println(name[i] + " 배달 가능");
                    return;                             //일치하는 문자열 찾으면 메소드 완전히 종료하기위해 사용
                }
            }
            for(int j = 0; j < name.length; j++){
                if(!name[j].equals(a)){                 //앞에 !를 붙이면 name[j]의 문자열과 a의 문자열이 다르면 이라는 명제가 된다.
                    System.out.println(name[j] + "은 없는 메뉴입니다.");
                    return;
                }
            }
        }
    }
}






