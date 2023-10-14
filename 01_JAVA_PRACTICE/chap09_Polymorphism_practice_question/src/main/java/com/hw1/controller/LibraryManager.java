package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;
import com.hw1.view.LibraryMenu;

import java.util.Scanner;

public class LibraryManager {
    Scanner sc = new Scanner(System.in);
    private Member mem = null;
    private Book[] bList = new Book[5];


    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void inserMember(Member mem) {
        this.mem = mem;
    }

    public Member myinfor() {
        System.out.println("이름 : " + mem.getName());
        System.out.println("나이 : " + mem.getAge());
        System.out.println("성별 : " + mem.getGender());
        System.out.println("요리학원쿠폰개수 : " + mem.getCouponCount());
        return mem;
    }


    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        int count = 0;
        Book searchbook[] = new Book[5];
        for (int i = 0; i < bList.length; i++) {
            if (bList[i].getTitle().contains(keyword)) {
            searchbook[count] = bList[i];
            count++;
            }
        }
        return searchbook;
    }

    public int rentBook(int index) {
        int result = 0;

        if (bList[index] instanceof AniBook) {

            if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
                result = 1;
            }
        } else if (bList[index] instanceof CookBook) {

            if (((CookBook) bList[index]).isCoupon() == true) {
                result = 2;
                mem.setCouponCount(mem.getCouponCount()+1);
            }

        }
        return result;
    }
}




