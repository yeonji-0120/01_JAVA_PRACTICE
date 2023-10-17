package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.AscBookTitle;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTItle;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.ArrayList;
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
        if(bookList.contains(title) == true){
            System.out.println("dlt엉");
        }else{
            System.out.println("없엉");

        }
        return title;
    }


    public void displayAll() {
        System.out.println(bookList);
    }

    public List<BookDTO> sortedBookList(int type) {
        switch (type) {
            case 1:
                bookList.sort(new AscBookNo());

            case 2:
                bookList.sort(new DescBookNo());
                for (BookDTO book : bookList) {
                    System.out.println(book);
                }
            case 3:
                bookList.sort(new AscBookTitle());
                for (BookDTO book : bookList) {
                    System.out.println(book);
                }
            case 4:
                bookList.sort(new DescBookTItle());
                for (BookDTO book : bookList) {
                    System.out.println(book);
                }
        }
        return bookList;
    }

    public void printBookList(List<BookDTO> printList) {

    }
}
