package com.sample;

public class IfTest01 {
    public static void main(String[] args) {
            // type casting
        int a = 5 - (int)(Math.random()*10); // Math.random(): 0이상 1미만의 실수 반환
        System.out.println(a); // a의 범위는 0~9

        // 짝수이면 "짝수입니다" 출력, 홀수이면 "홀수입니다" 출력
        if(a % 2 == 0) {
            System.out.println("even"); // 짝
        } else {
            System.out.println("odd");  // 홀
        }

        // 양수이면 "양수입니다" 출력, 음수이면 "음수입니다" 출력
        if(a > 0) {
            System.out.println("양수입니다");
        } else if(a == 0) {
            System.out.println("0 입니다.");
        } else {
            System.out.println("음수입니다");
        }

        // a의 절대값 구하기
        int abs = a>=0 ? a : -a; // 3항연산 ( 조건 ? 참 : 거짓 )
        System.out.println("a의 절대값: " + abs);
    }
}
