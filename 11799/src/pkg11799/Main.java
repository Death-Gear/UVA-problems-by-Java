/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11799;

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
    public static int t,n,i,j,m;
    public static int[] ara = new int[100];
    public static void main(String[] args) {
        t=scn.nextInt();
        for (i = 0; i < t; i++) {
            m = 0;
            n=scn.nextInt();
            for (j = 0; j < n; j++) {
                ara[j]=scn.nextInt();
                if (m < ara[j]) {
                    m = ara[j];
                }
            }
            System.out.printf("Case %d: %d", i + 1, m);
            System.out.println();
        }
    }
    
}
