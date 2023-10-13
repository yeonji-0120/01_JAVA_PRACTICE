package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void maninMenu(){
        int count = 0;
        System.out.print("회원명을 입력해주세요 : ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("회원 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.print("회원의 성별을 입력해주세요 : ");
        char gender = sc.nextLine().charAt(0);



        while(true){
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            int num1 = sc.nextInt();
            switch(num1){
                case 1 : lm.myInfo(); break;
                case 2 : selectAll(); break;
                case 3 : searchBook();break;
                case 4 : rentBook(); break;
                case 0 :
                    System.out.println("프로그램을 종료합니다"); return;

            }while (num1 != 0);
        }


    }

    public void selectAll(){

    Book[] bList = lm.selectAll();


    }

    public void  searchBook(){

        // “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
// LibraryManager의 searchBook() 에 전달
// 그 결과 값을 Book[] 자료형에 담기
 Book[] searchList = lm.searchBook(keyword);
// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
//    }

    }

    public void rentBook(){
        // 도서대여를 위해 도서번호를 알아야된다.  selectAll() 메소드 호출
// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
// LibraryManager의 rentBook() 에 전달
// 그 결과 값을 result로 받고 그 result가
// 0일 경우  “성공적으로 대여되었습니다.” 출력
// 1일 경우  “나이 제한으로 대여 불가능입니다.” 출력
// 2일 경우  “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
//        마이페이지를 통해 확인하세요” 출

    }
}
