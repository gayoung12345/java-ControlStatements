package com.sample;

import java.util.Scanner;

public class SwitchTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // '+' 3+4, '-' 3-4, '*' 3*4, '/' 3/4 결과 출력
        System.out.println("사칙연산 부호 '+' '-' '*' '/' 중에 하나 입력: ");
        String str = sc.nextLine();
        System.out.println(str);

        while(!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))) {
            System.out.println("잘못 입력하셨습니다");
            System.out.println("사칙연산 부호 '+' '-' '*' '/' 중에 하나 입력: ");
            str = sc.nextLine();
        }

        switch (str) {
            case "+":
                System.out.println("3 + 4 = " + (3 + 4));
                break;
            case "-":
                System.out.println("3 - 4 = " + (3 - 4));
                break;
            case "*":
                System.out.println("3 * 4 = " + (3 * 4));
                break;
            case "/":
                System.out.println("3 / 4 = " + (3 / 4.));  // 실수 = 정수/실수
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
        }
        sc.close();
    }
}
