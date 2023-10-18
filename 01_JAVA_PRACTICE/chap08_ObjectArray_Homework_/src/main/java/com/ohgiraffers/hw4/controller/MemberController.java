package com.ohgiraffers.hw4.controller;

import com.ohgiraffers.hw4.model.vo.Member;

public class MemberController {
    public int SIZE = 10;
    private int memberCount;
    private Member[] mem = new Member[SIZE];

    {
        mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    public void getMemberCount(){

    }

    public Member[] getMem(){
        return mem;
    }

    public Member checkId(String userId){
        Member m = null;
        for(int i = 0; i < mem.length; i++){
            if(mem[i].getUserId().equals(userId)){
                m = mem[i];
            }
        }
        return m;
    }

    public void insertMember(Member m){
        mem[memberCount].setUserId(m.getName());
        mem[memberCount].setUserPwd(m.getUserPwd());
        mem[memberCount].setName(m.getName());
        mem[memberCount].setAge(m.getAge());
        mem[memberCount].setGender(m.getGender());
        mem[memberCount].setEmail(m.getEmail());
        memberCount++;
    }

    public Member searchMember(int menu, String search){
        Member searchMember = null;
        for(int i = 0; i < mem.length; i++){
            if(menu == 1) {
                if(mem[i].getUserId().equals(search)){
                    searchMember = mem[i];
                }
            } else if (menu == 2) {
                if(mem[i].getName().equals(search)){
                    searchMember = mem[i];
                }
            }else if(menu == 3){
                if(mem[i].getEmail().equals(search)){
                    searchMember = mem[i];
                }
            }
        }return searchMember;

    }

    public void updateMember(Member m, int menu, String update){
        for(int i = 0; i < mem.length; i++){
            if(menu == 1){
                mem[i].setUserPwd(update);
            }else if (menu == 2){
                    mem[i].setName(update);
                } else if (menu == 3){
                mem[i].setEmail(update);
            }
        }
    }

    public void deleteMember(String userId){
        for(int i = 0; i < mem.length; i++){
            if(mem[i].getUserId().equals(userId)){
                mem[i].
            }
        }

    }




}
