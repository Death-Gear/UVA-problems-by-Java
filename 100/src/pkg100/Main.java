/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static long i, j, t, n, c, x;

    public static void main(String[] args) {
        while (scan.hasNextLong()) {
            i = scan.nextLong();
            j = scan.nextLong();
            x = 0;
            System.out.print(i+" "+j+" ");
            if (i > j) {
                t = i;
                i = j;
                j = t;
            }
            for (n = i; n <= j;) {
                for (c = 1; n != 1; c++) {
                    if (n % 2 != 0) {
                        n = (3 * n) + 1;
                    } else {
                        n = n / 2;
                    }
                }
                if (x < c) {
                    x = c;
                }
                i++;
                n = n * i;
            }
            System.out.println(x);
        }
    }

}
