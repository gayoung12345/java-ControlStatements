package com.sample;

public class LottoGenerator {
    public static void main(String[] args) {
        // 1~45 정수 난수 발생하여 lotto 배열에 저장한 후 로또번호 출력
        // int lottoNumber = (int)(Math.random()*45) + 1; // 1~45 정수 난수 발생
        int [] lotto = new int[6];
        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)(Math.random()*45) + 1;
            System.out.print(lotto[i] + " ");
        }
        /*
        for (int i : lotto) { System.out.println(i); }
        */
    }
}
