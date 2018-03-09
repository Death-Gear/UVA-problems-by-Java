/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12798;

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
    public static int n,m,c,i,j,t;
    public static int[][] ara = new int[100][100];
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            n=scn.nextInt();
            m=scn.nextInt();
            c = 0;
            for (i = 0; i < n; i++) {
                t = 1;
                for (j = 0; j < m; j++) {
                    ara[i][j]=scn.nextInt();
                    if (ara[i][j] == 0) {
                        t = 0;
                    }
                }
                if (t != 0) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
    
}
