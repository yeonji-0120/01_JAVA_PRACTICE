package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw2.model.dto.StudentDTO;
import com.ohgiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {

//    private ProductDTO[] pro = null;
//    pro = new ProductDTO[10];
//    Unknown class랑 Unexpected token
    ProductDTO[] pro = new ProductDTO[10];
    {for(int i= 0; i < pro.length; i++){
        ProductDTO proi = new ProductDTO();
        pro[i] = proi;
    }}

    public int count =0;
    int num1 = 0;


    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        do{
            System.out.println("======== 제품 관리 메뉴 =======");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            int num1 = sc.nextInt();

            switch (num1){
                case 1 : productInput(); break;
                case 2 : productPrint(); break;
                case 9 : System.out.println("프로그램을 종료합니다"); return;
            }
        }while(num1 != 9);


        }



    public void productInput(){
        System.out.print("제품 번호를 입력해주세요 :");
        int pld = sc.nextInt();
        System.out.print("제품 명을 입력해주세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("제품 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금을 입력해주세요 : ");
        double tax = sc.nextInt();



        pro[count].setPld(pld);
        pro[count].setpName(name);
        pro[count].setPrice(price);
        pro[count].setTax(tax);

        count++;

    }

    public void productPrint(){
        for(int i = 0; i < count; i++){
            System.out.println(pro[i].information());
        }

    }

}
