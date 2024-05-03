package com.sample;

public class WhileTest01 {
    public static void main(String[] args) {
        int i = 1;
        int j = 5;
        while (i <= j) {
            System.out.println(i);
            i++;    // 반복탈출
        }
        // do while
        int x = 1;
        int y = 5;
        do {// 1회 실행
            System.out.println(x);
            x++;
        } while (x <= y);

        // break
        int a = 1;
        while(true){ // 무한루프 발생

            System.out.println(a);
            a++;
            if(a == 5) {
                break; // 반복문을 벗어남
            }
            if(a % 2 == 0) {
                continue;   // 반복문의 시작 위치로 이동
            }
            System.out.println(a);
        }

    }
}
