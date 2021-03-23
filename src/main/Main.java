package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int result=findGcd(a, b);
        System.out.println(result);

    }

    public static int findGcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return findGcd(a - b, a);
        }
        return findGcd(a, b - a);
    }
}
