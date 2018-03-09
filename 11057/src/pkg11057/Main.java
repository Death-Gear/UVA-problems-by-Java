/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11057;

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
    public static long n,m,t,a,b;
    public static int i,j;
    public static long[] ara= new long[100000];
    public static void main(String[] args) {
        while (sc.hasNextLong()) {
            n=sc.nextLong();
            for (i = 0; i < n; i++) {
                ara[i]=sc.nextLong();
            }
            m=sc.nextLong();
            t = 2000000;
            for (i = 0; i < n - 1; i++) {
                for (j = i + 1; j < n; j++) {
                    if (ara[i] + ara[j] == m) {
                        if(ara[i]+ara[j]==m)
                {
                    if(t>=Math.abs(ara[i]-ara[j]))
                    {
                        t=Math.abs(ara[i]-ara[j]);
                        a=ara[i];
                        b=ara[j];
                    }
                }
                    }
                }
            }
            if(a<b)System.out.println("Peter should buy books whose prices are "+a+" and "+b+".");
            else System.out.println("Peter should buy books whose prices are "+b+" and "+a+".");
            System.out.println();
        }
    }
    
}
