/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10487;

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
    public static int n,m,i,j=1,k,min,b,l,x,y;
    public static int[] a = new int[1000];
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            n=scn.nextInt();
            if(n==0)break;
            for (i = 0; i < n; i++) {
                a[i]=scn.nextInt();
            }
            m=scn.nextInt();
            System.out.printf("Case %d:", j);
            System.out.println();
            j++;
            for (i = 0; i < m; i++) {
                b=scn.nextInt();
                for (l = 0; l < n; l++) {
                    for (k = 0; k < n; k++) {
                        if (k == l) {
                            continue;
                        }
                        x = Math.abs(a[l] + a[k] - b);
                        if (l == 0) {
                            min = x;
                            y = a[l] + a[k];
                        } else if (min > x) {
                            min = x;
                            y = a[l] + a[k];
                        }
                    }
                }
                System.out.printf("Closest sum to %d is %d.", b, y);
                System.out.println();
            }

        }
    }
    
}
