package com.company;

import java.io.*;
import java.util.*;

public class Main {

    private static long quick(long a, long b)
    {
        if(b==0) return 1;
        else if(b%2 == 1) return a * quick(a, (b-1)/2) * quick(a, (b-1)/2);
        return quick(a, b/2) * quick(a, b/2);
    }

    public static void main(String[] args) throws IOException {
        long a, b, res;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        a = scanner.nextLong();
        System.out.print("Raise to the power of: ");
        b = scanner.nextLong();

        res = quick(a, b);
        System.out.println("Result: " + res);
    }
}
