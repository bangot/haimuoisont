package com.haimuoisont ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;


        while (count < number) {

            int i = 2;
            boolean check = true;
            while (i <n) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.printf("%d ", n);
                count++;
            }
            n++;
        }

    }
}
