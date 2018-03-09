/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11875;

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
    public static int n, i, r, t, j;
    public static int[] ara = new int[100];

    public static void main(String[] args) {
        t=sc.nextInt();
        for (j = 1; j <= t; j++) {
            n=sc.nextInt();
            r = (n / 2) + 1;
            for (i = 0; i < n; i++) {
                ara[i]=sc.nextInt();
            }
            System.out.printf("Case %d: %d", j, ara[r - 1]);
            System.out.println();
        }

    }

}
