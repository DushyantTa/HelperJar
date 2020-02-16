package com.read;

import java.util.Scanner;

public class InputHelper {
    public static String readLine(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextLine();
    }

    public static int readInt(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        return sc.nextInt();
    }
}
