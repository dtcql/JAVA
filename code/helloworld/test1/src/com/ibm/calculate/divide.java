package com.ibm.calculate;

import java.util.Random;
import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        System.out.println("请输入一个10以内数字：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("输入的数字是" + number);

        Random randomNum = new Random(10);
        int rNum = randomNum.nextInt(10);
        System.out.println("随机的数字是" + rNum);
        if (number > rNum) {
            System.out.println("输入的数字大");
        } else {
            System.out.println("输出的数字大");
        }

    }

    public static int randomInt(int bound) {
        Random randomNum = new Random(bound);
        return randomNum.nextInt();
    }
}
