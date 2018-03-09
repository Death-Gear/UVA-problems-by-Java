/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg382;

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
    public static int n,sum,i,x,c,j,l;
    public static double d;
    public static void main(String[] args) {
        for (j = 0; sc.hasNextInt();) {
            n=sc.nextInt();
            x = n;
            sum = 1;
            c = 0;
            if (j == 0) {
                System.out.println("PERFECTION OUTPUT");
                j++;
            }
            if (n == 0) {
                System.out.println("END OF OUTPUT");
                break;
            }
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sum = sum + i + (n / i);
                }
            }
            d = Math.sqrt(n);
            l = (int) Math.sqrt(n);
            if (d == l) {
                sum = sum - l;
            }
            while (x != 0) {
                x = x / 10;
                c++;
            }
            for (i = 0; i < (5 - c); i++) {
                System.out.print(" ");
            }
            System.out.printf("%d  ", n);
            if (sum < n || n == 1) {
                System.out.println("DEFICIENT");
            } 
            else if (sum > n) {
                System.out.println("ABUNDANT");
            } 
            else {
                System.out.println("PERFECT");
            }
        }

    }
    
}
