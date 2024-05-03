package com.sample;

public class IfTest02 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        boolean condition1 = x > 0 && y < 20;       // true
        boolean condition2 = x > 0 || y > 20;       // true
        boolean condition3 = !(x < 0) && (y != 20); // true
        boolean condition4 = (x > 0 && y < 20) || (!(x < 0) && (y != 20));  // true
        // ||(or) 연산자는 앞에 조건이 참이면 뒤에 조건은 실행하지 않는다
    }
}
