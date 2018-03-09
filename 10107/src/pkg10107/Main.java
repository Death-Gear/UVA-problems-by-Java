/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10107;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {

    public static Scanner scn = new Scanner(System.in);
    public static int c=0,i;
    public static long[] a = new long[10000];
    public static void main(String[] args) {
        while (scn.hasNextLong()) {
            a[c]=scn.nextLong();
            c++;
            for (i = 0; i < c - 1; i++) {
                if (a[i] > a[c - 1]) {
                    a[i] = a[i] ^ a[c - 1];
                    a[c - 1] = a[i] ^ a[c - 1];
                    a[i] = a[i] ^ a[c - 1];
                }
            }
            if (c % 2 == 1) {
                System.out.println(a[(c - 1) / 2]);
            } 
            else {
                System.out.println((a[c / 2] + a[(c / 2) - 1]) / 2);
            }
        }
    }
    
}
