package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForTest03 {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for (String number : numbers) {
            System.out.println(number);
        }
        List<String> list = new ArrayList<String>(Arrays.asList(numbers));
        for (String number : list) {
            System.out.println(number);
        }
    }
}
