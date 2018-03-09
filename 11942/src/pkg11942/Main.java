/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11942;

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
    public static int n,i,j,l;
    public static int[] a = new int[10]; 
    public static void main(String[] args) {
        n=sc.nextInt();
        System.out.println("Lumberjacks:");
        for (i = 0; i < n; i++) {
            l = 0;
            for (j = 0; j < 10; j++) {
                a[j]=sc.nextInt();
                if (j == 0) {
                    continue;
                }
                if (a[j] > a[j - 1]) {
                    l++;
                } else if (a[j] < a[j - 1]) {
                    l--;
                }
            }
            if (l < 9 && l > -9) {
                System.out.println("Unordered");
            } else {
                System.out.println("Ordered");
            }
        }
    }
    
}
