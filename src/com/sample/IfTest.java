package com.sample;

public class IfTest {
    public static void main(String[] args) {    // main method
        // money >= 5천원 이상 있으면 택시를 타고, 아니면 버스를 탄다.

        int money = 2000;
        boolean hasCard = true;

        if(money >= 5000 || hasCard){  // 5천원 이상 있는 경우
            System.out.println("TAXI 탑승");
            money -= 5000;
        } else {    // 5천원 이상 없는 경우
            System.out.println("BUS 탑승");
        }
        System.out.println("목적지에 도착했습니다.");
        System.out.println("잔액: " + money);
    }
}
