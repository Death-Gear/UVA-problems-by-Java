/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10931;

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
    public static int i,c;
    public static long[] ara = new long[1000];
    public static long n;
    public static void main(String[] args) {
        while (sc.hasNextLong()) {
            n=sc.nextLong();
            if(n==0)break;
            c = 0;
            for (i = 0; n != 0; i++) {
                ara[i] = n % 2;
                if (ara[i] == 1) {
                    c++;
                }
                n = n / 2;
            }
            System.out.printf("The parity of ");
            for (i = i - 1; i >= 0; i--) {
                System.out.print(ara[i]);
            }
            System.out.printf(" is %d (mod 2).", c);
            System.out.println();
        }
    }
    
}
