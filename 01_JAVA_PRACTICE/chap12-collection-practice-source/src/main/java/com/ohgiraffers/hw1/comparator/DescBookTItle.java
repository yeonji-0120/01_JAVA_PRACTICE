package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescBookTItle  implements Comparator<BookDTO> {

        @Override
        public int compare(BookDTO o1, BookDTO o2) {
            int result = 0;

            if (o1.getTitle().compareTo(o2.getTitle()) < 1) {
                return 1;
            } else if (o1.getTitle().compareTo(o2.getTitle()) > 1) {

                result = -1;
            } else {
                result = 0;
            }

            return result;
        }
    }

