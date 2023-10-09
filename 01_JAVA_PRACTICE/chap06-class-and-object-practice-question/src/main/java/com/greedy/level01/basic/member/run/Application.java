package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        MemberDTO user1 =new MemberDTO();
        System.out.println("id : " + user1.getId());
        System.out.println("pwe : " + user1.getPwd());
        System.out.println("Name : " + user1.getName());
        System.out.println("Age : " + user1.getAge());
        System.out.println("Gender : " + user1.getGender());
        System.out.println("Phone : " + user1.getPhone());
        System.out.println("Email : " + user1.getEmail());


        user1.setId("user01");
        user1.setPwd("pass01");
        user1.setName("홍길동");
        user1.setAge(20);
        user1.setGender('M');
        user1.setPhone("010-1234-5678");
        user1.setEmail("hon123@greedy.com");

        System.out.println("변경 후 id : " + user1.getId());
        System.out.println("변경 후 pwe : " + user1.getPwd());
        System.out.println("변경 후 Name : " + user1.getName());
        System.out.println("변경 후 Age : " + user1.getAge());
        System.out.println("변경 후 Gender : " + user1.getGender());
        System.out.println("변경 후 Phone : " + user1.getPhone());
        System.out.println("변경 후 Email : " + user1.getEmail());

    }

}
