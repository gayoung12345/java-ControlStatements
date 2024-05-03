package com.sample;

public class ForTest02 {
    public static void main(String[] args) {
        // 8행 * 9열
        for(int x = 2; x < 10; x++) {
            System.out.println(x + "단");
            for(int y = 1; y < 10; y++) {
                System.out.println(x + " * " + y + " = "+ (x * y));
            }
            System.out.println();
        }
        // 1행은 1열, 2행은 2열, .. , 5행은 5열
        for(int row = 1; row <= 5; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 오른쪽 정렬
        for(int row = 1; row < 6; row++) {
            for(int col = 1; col < 6-row; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 피라미드
        for(int row = 1; row < 6; row++) {
            for(int col = 1; col < 6-row; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 마름모
        for(int row = 1; row < 6; row++) {
            for(int col = 1; col < 6-row; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1; row < 6; row++) {
            for(int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for(int col = 11; col > 2*row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
