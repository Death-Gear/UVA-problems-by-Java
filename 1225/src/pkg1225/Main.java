/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1225;

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
        int j, i, n, t, k;
        int[] a= new int[10];
        t=sc.nextInt();
        for (k = 0; k < t; k++) {
            n=sc.nextInt();
            for (i = 0; i < 10; i++) {
                a[i] = 0;
            }
            for (i = 1; i <= n; i++) {
                j = i;
                while (j != 0) {
                    a[j % 10]++;
                    j = j / 10;
                }
            }
            for (i = 0; i < 9; i++) {
                System.out.printf("%d ", a[i]);
            }
            System.out.printf("%d", a[9]);
            System.out.println();
        }
    }
    
}
