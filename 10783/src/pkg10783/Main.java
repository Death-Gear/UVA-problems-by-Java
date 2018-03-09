/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10783;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T, a, b, i, sum, n;
        T=sc.nextInt();
        int[] ara = new int[T];
    if (T >= 1 && T <= 100) {
            for (i = 0; i < T; i++) {
                sum = 0;
                a=sc.nextInt();
                b=sc.nextInt();
                if (a >= 0 && a <= b && b <= 100) {
                    if (a % 2 == 0) {
                        a++;
                    }
                    for (n = a; n <= b; n = n + 2) {
                        sum = sum + n;
                    }
                }
                ara[i] = sum;
            }
            for (i = 0; i < T; i++) {
                System.out.printf("Case %d: %d", i + 1, ara[i]);
                System.out.println();
            }
        }
    }
    
}
