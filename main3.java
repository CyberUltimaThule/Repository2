package com.company;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double z = Math.pow((Math.cos(a) - Math.cos(b)), 2) - Math.pow((Math.sin(a) - Math.sin(b)), 2);
        System.out.print(z);
        in.close();
    }
}
