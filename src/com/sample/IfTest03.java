package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IfTest03 {
    public static void main(String[] args) {
        List<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

        // else if
        boolean hasCard = true;
        if (pocket.contains("money")) { // 돈o
            System.out.println("택시를 타고 가라");
        } else if (hasCard) {    // 돈x 카드o
            System.out.println("택시를 타고 가라");
        } else {    // 돈x 카드x
            System.out.println("걸어가라");
        }
        System.out.println("목적지 도착");

        /*
        사용자로부터 나이를 입력받은 후 나이에 따라 영화를 추천하는 코드 작성
        만약 나이가 음수이면, "양수를 입력해주세요" 출력
        나이 < 8 "애니메이션 영화를 추천합니다"
        나이 < 18 "청소년 영화를 추천합니다"
        나이 < 25 "액션이나 스릴러 영화를 추천합니다"
        나이 < 40 "코미디 영화를 추천합니다"
        나이 < 70 "황혼기의 로맨스 영화를 추천합니다"
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();
        while (age < 0) {
            System.out.println("양수를 입력해주세요");
            age = scanner.nextInt();
        }
        if(age < 8) {
            System.out.println("애니메이션 영화를 추천합니다");
        } else if(age < 18) {
            System.out.println("청소년 영화를 추천합니다");
        } else if(age < 25) {
            System.out.println("액션이나 스릴러 영화를 추천합니다");
        } else if(age < 40) {
            System.out.println("코미디 영화를 추천합니다");
        } else if(age < 70) {
            System.out.println("황혼기의 로맨스 영화를 추천합니다");
        } else {
            System.out.println("추천 영화가 없습니다.");
        }
    }
}
