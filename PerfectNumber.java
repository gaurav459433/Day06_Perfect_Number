package com.bridgelabz.rfp212.assignmentsday06;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = scanner.nextInt();
        int ans = 0;
        if (num > 0) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    ans = ans + i;
                }
            }
            System.out.println("sum is : " + ans);
        }
        if (ans == num) {
            System.out.println("Number Is Perfect");
        } else {
            System.out.println("Number Is Not Perfect");
        }
    }
}
