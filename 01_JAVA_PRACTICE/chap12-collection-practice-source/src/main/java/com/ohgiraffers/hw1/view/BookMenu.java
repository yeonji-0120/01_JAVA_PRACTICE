package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();
    public void mainMenu(){
        System.out.println("*** 도서 관리 프로그램 ***");
        System.out.println("1. 새 도서 추가");
        System.out.println("2. 도서정보 정렬 후 출력");
        System.out.println("3. 도서 찾기");
        System.out.println("4. 도서 검색출력");
        System.out.println("5. 전체 출력");
        System.out.println("6. 끝내기");
        int a = sc.nextInt();

        switch (a){
            case 1 : bm.addBook(inputBook()); break;
            case 2 : bm.printBookList(selectSortedBook()); break;
            case 3 : bm.deleteBook(inputBookNo()); break;
            case 4 : bm.searchBook(inputBookTitle()); break;
            case 5 : bm.displayAll(); break;
            case 6 : return;
        }
    }

    public BookDTO inputBook(){
        BookDTO bookDTO = new BookDTO();
        int bNo = 0;
        System.out.print("도서 제목 : ");
        String title = sc.next();
        sc.nextLine();
        System.out.print("도서 장르 : ");
        System.out.print("(1 : 인문 / 2 : 자연과학 / 3 : 의료 / 4 : 기타)");
        int category = sc.nextInt();
        System.out.print("도서 저자 : ");
        String author = sc.next();
        bNo++;
        BookDTO book = new BookDTO(bNo, category, title, author);

        return book;
    }

    public int inputBookNo(){
        System.out.println("삭제할 도서 번호");
        System.out.print("(1 : 인문 / 2 : 자연과학 / 3 : 의료 / 4 : 기타)");
        int index = sc.nextInt();
        return index;
    }

    public String inputBookTitle(){
        System.out.print("검색할 도서 제목 : ");
        String search = sc.nextLine();
        return search;
    }

    public List<BookDTO> selectSortedBook(){
        System.out.println("1. 도서번호(ISBN)으로 오름차순정렬");
        System.out.println("2. 도서번호(ISBN)으로 내림차순정렬");
        System.out.println("3. 책 제목으로 오름차순 정렬");
        System.out.println("4. 책 제목으로 내림차순 정");
        int type = sc.nextInt();
        return bm.sortedBookList(type);
    }

}
