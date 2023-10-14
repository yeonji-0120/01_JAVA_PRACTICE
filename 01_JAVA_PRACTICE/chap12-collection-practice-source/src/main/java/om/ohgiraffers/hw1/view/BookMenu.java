package om.ohgiraffers.hw1.view;

import om.ohgiraffers.hw1.controller.BookManager;
import om.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    private BookManager bm;

    public void mainMenu(){
        while(true) {

            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            int num1 = sc.nextInt();
            switch (num1){
                case 1: bm.addBook(inputBook()); break;
                case 2:  break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
    int x = 0;

    public BookDTO inputBook(){
        int No = 0;
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        sc.nextLine();

        System.out.println("도서 장르");
        System.out.println("1 : 인문 / 2 : 자연 과학 / 3 : 의료 / 4 : 기타");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO(No, title, category, author);
        No++;

        return book;
    }

    public int inputBookNO(){
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        return bNo;
    }

    public String inputBookTitle(){
        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        return title;
    }

//    public List<BookDTO> selectSortedBook{
//        System.out.println("도서 정렬방식을 선택해주세요");
//        System.out.println("1. 도서번호(ISBN)으로 오름차순 정렬");
//        System.out.println("2. 도서번호(ISBN)으로 내림차순 정렬");
//        System.out.println("3. 책 제목으로 오름차순 정렬");
//        System.out.println("4. 책 제목으로 내림차순 정렬");
//        int num3 = sc.nextInt();
//        return ;
//    }





}
