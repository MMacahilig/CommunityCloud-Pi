package com.company;

import java.util.Scanner;

/**
 * Created by michaelmacahilig on 9/10/15.
 */
public class ln {
    private static Scanner in = new Scanner(System.in);

    public static String nextLine(){
        return in.nextLine();
    }

    public static char nextChar(){
        return in.nextLine().charAt(0);
    }

    public static int nextInt(){
        int i = in.nextInt();
        in.nextLine();
        return i;
    }

    public static double nextDouble(){
        double d = in.nextDouble();
        in.nextLine();
        return d;
    }
}