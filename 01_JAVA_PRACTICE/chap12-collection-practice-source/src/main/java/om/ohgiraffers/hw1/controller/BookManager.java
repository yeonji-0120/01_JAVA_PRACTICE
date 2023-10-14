package om.ohgiraffers.hw1.controller;

import om.ohgiraffers.hw1.model.dto.BookDTO;
import om.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    BookDTO book = null;

    BookDTO bookDTO = new BookDTO();
    BookMenu bm = new BookMenu();


    public void addBook(BookDTO book) {
        this.bookDTO = book;
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(book.getbNo(), book.getTitle(), book.getCategory(), book.getAuthor()));
    }


}
