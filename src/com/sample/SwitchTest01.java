package com.sample;

import java.util.Scanner;

public class SwitchTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어성적 입력: ");
        int korScore = sc.nextInt();
        if (korScore >= 0 && korScore <= 100) {
            int grade = korScore / 10;

            switch (grade) {
                case 10:
                case 9:
                    System.out.println("평점: A");
                    break;
                case 8:
                    System.out.println("평점: B");
                    break;
                case 7:
                    System.out.println("평점: C");
                    break;
                case 6:
                    System.out.println("평점: D");
                    break;
                default:
                    System.out.println("평점: F");
                    break;
            }
        } else {
            System.out.println("점수의 범위는 0 ~ 100점 사이 정수 입력");
        }
        sc.close();
    }
}
