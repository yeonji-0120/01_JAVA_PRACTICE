package com.ohgiraffers.hw4.view;

import com.ohgiraffers.hw4.controller.MemberController;
import com.ohgiraffers.hw4.model.vo.Member;

import java.util.Scanner;

public class MemberMenu {
    private MemberController mc;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        while(true) {
            System.out.println("====== 회원 관리 메뉴 ======");
            System.out.println("1. 신규 회원 등록 ");
            System.out.println("2. 회원 정보 검색 ");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("5. 회원 정보 출력 ");
            System.out.println("6. 회원 정보 정렬 ");
            System.out.println("9. 프로그램 종료");
            int num1 = sc.nextInt();
            sc.nextLine();
            switch (num1){
                case 1: insertMember(); break;
                case 2: searchMember(); break;
                case 3: updateMember(); break;
                case 4: deleteMember(); break;
                case 5: printAllMember(); break;
                case 6: sortMember(); break;
                case 9: return;
            }


        }
    }

    public void insertMember(){
        System.out.println("아이디를 입력해주세요");
        String userId = sc.nextLine();
        if(mc.checkId(userId) == null){
            System.out.println("중복있음 ");
            return;
        }else {
            System.out.println("비밀번호를 입력해주세요");
            String userPwd = sc.nextLine();
            System.out.println("이름을 입력해주세요");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("나이를 입력해주세요");
            int age = sc.nextInt();
            System.out.println("성별을 입력해주세요");
            char gender = sc.next().charAt(0);
            System.out.println("이메일을 입력해주세요");
            String email = sc.nextLine();
            Member mem = new Member(userId, userPwd, name, age, gender, email);
            mc.insertMember(mem);
        }



    }

    public void searchMember(){
        while (true){
            System.out.println("====== 회원 정보 검색 ======");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("9. 이전 메뉴로");
            System.out.println("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            String search = sc.nextLine();
            mc.searchMember(menu, search);
        }

    }

    public void updateMember(){
        while (true){
            System.out.println("====== 회원 정보 수정 ======");
            System.out.println("1. 비밀번호 수정");
            System.out.println("2. 이름 수정");
            System.out.println("3. 이메일 수정");
            System.out.println("9. 이전 메뉴로");
            System.out.println("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            String userId = sc.nextLine();
            Member m = mc.checkId(userId);
            mc.updateMember(m, menu, userId);

            }
        }

    }

public void deleteMember(){
    System.out.println("삭제할 회원 아이디 : ");
    String userId = sc.nextLine();
    sc.nextLine();
    mc.deleteMember(userId);


}
public void printAllMember(){

}
public void sortMember(){
    while (true){
        System.out.println("====== 회원 정보 정렬 ======");
        System.out.println("1. 아이디 오름차순 정렬");
        System.out.println("2. 아이디 내림차순 정렬");
        System.out.println("3. 나이 오름차순 정렬");
        System.out.println("4. 나이 내림차순 정렬");
        System.out.println("5. 성별 내림차순 정렬(남여순)");
        System.out.println("9. 이전 메뉴로");
        System.out.println("메뉴 선택 : ");
        int menu = sc.nextInt();
        sc.nextLine();
        String userId = sc.nextLine();
        switch (menu){
            case 1 : break;
            case 2 : break;
            case 3 : break;
            case 4 : break;
            case 5 : break;
            case 9 : return;

        }
    }

}
}
