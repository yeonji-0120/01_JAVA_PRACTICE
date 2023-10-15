package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void maninMenu() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별 : ");
        char gender = sc.nextLine().charAt(0);
        Member mem = new Member(name, age, gender);
        lm.inserMember(mem);

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            int num1 = sc.nextInt();
            switch (num1) {
                case 1: lm.myinfor();

                    break;
                case 2: selectAll();break;
                case 3: searchBook();break;
                case 4: rentBook();break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
            }
        }

    }


    public void selectAll(){
        Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i].toString());

        }
    }



    public void searchBook(){
        System.out.println("검색할 제목 키워드 : ");
        sc.nextLine();

        String keyword = sc.nextLine();

        Book[] searchList = lm.searchBook(keyword);

        for(Book book : searchList) {
            if (book != null) {
                System.out.println(book.getTitle() + " / " + book.getAuthor() + " / " + book.getPublisher());
            }
        }


    }

    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택: ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);

        if(result == 0){
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");

        }else if(result == 2){
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요");
        }

    }

}