/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg294;

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
    public static int t,a,d;
    public static double p;
    public static long l,u,c,i,n,x,h;
    public static void main(String[] args) {
        t=sc.nextInt();
        for (a = 0; a < t; a++) {
            x = 0;
            l=sc.nextLong();
            u=sc.nextLong();
            for (n = l; n <= u; n++) {
                d = (int) Math.sqrt(n);
                p = Math.sqrt(n);
                c = 0;
                for (i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        c++;
                    }
                }
                if (d == p) {
                    c = (c * 2) - 1;
                } else {
                    c = c * 2;
                }
                if (x < c) {
                    x = c;
                    h = n;
                }
            }
            System.out.println("Between "+l+" and "+u+", "+h+" has a maximum of "+x+" divisors.");
        }
    }
    
}
