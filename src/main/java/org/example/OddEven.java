package org.example;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        int countOdd = 0;
        int countEven = 0;
        Scanner in = new Scanner(System.in); // 数字用空格或换行隔开，每次读入一个，直到输入‘-1’
        do{
            number = in.nextInt();
            if(number != -1)
            {
                if (number % 2 == 0) {
                    countEven += 1;
                } else {
                    countOdd += 1;
                }
            }
        }while(number != -1); // 理解do while和while循环的区别
        System.out.print(countOdd+" ");
        System.out.println(countEven);
    }
}
