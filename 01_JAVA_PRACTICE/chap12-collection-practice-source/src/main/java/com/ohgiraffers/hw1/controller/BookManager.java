package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTItle;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class BookManager {
    List<BookDTO> bookList = new ArrayList<>();

    public void addBook(BookDTO book) {
        bookList.add(new BookDTO(book.getbNo(), book.getCategory(), book.getTitle(), book.getAuthor()));

        System.out.println(bookList);
    }

    public void deleteBook(int key) {
        bookList.remove(key);
        System.out.println(bookList);


    }

    public String searchBook(String title) {
        if (bookList != null) {
            for (BookDTO book : bookList) {
                if (book.getTitle().contains(title)) {
                    System.out.println(book);
                }
            }
        } else {
            System.out.println("없엉");
        }
        return title;
    }



        public void displayAll() {
        if(bookList != null){
        System.out.println(bookList);
    }else{
            System.out.println("출력결과가 없습니다");
        }
    }

    public List<BookDTO> sortedBookList(int type) {
        switch (type) {
            case 1:
            bookList.sort(new AscBookNo()); break;

            case 2:
            bookList.sort(new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                    return o1.getbNo()  >= o2.getbNo()? -1: 1;
                }
            }); break;

            case 3:
                bookList.sort(new Comparator<BookDTO>() {
                    @Override
                    public int compare(BookDTO o1, BookDTO o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                }); break;

            case 4:
                bookList.sort((BookDTO b1, BookDTO b2) -> b2.getTitle().compareTo(b1.getTitle()));
                break;

        }
        return bookList;
    }

    public void printBookList(List<BookDTO> printList) {
        for(BookDTO list : bookList){
            System.out.println(list);
        }
    }
}
