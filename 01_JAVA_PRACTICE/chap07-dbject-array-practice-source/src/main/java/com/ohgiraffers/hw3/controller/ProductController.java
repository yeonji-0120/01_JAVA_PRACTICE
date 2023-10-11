package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw2.model.dto.StudentDTO;
import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {
    ProductController product = new ProductController();

    int count =0;
    int num1 = 0;
    ProductDTO pro[] = new ProductDTO[10];
    
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        label :
        do{
            System.out.println("======== 제품 관리 메뉴 =======");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            int num1 = sc.nextInt();
            if(num1 == 1 ){
                product.productInput();
            }if(num1 == 2){
                product.productPrint();
            }
        }while(num1 == 9);


        }



    public void productInput(){
        System.out.print("제품 번호를 입력해주세요 :");
        int pld = sc.nextInt();
        System.out.println("제품 명을 입력해주세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("제품 가격을 입력해주세요 : ");
        sc.nextLine();
        int price = sc.nextInt();
        System.out.println("제품 세금을 입력해주세요 : ");
        double tax = sc.nextInt();

        count++;


    }

    public void productPrint(){
        for(ProductDTO a : pro){
            System.out.println(a.toString());
        }

    }

}
