/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11715;

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
    public static double a,b,c,d,e;
    public static int n,i=0;
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            n=sc.nextInt();
            if(n==0)break;
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();
            i++;
            if (n == 1) {
                e = (b - a) / c;
                d = (a * c) + (0.5 * e * c * c);
            } 
            else if (n == 2) {
                e = (b - a) / c;
                d = (a * e) + (0.5 * c * e * e);
            } 
            else if (n == 3) {
                d = Math.sqrt((a * a) + (2 * b * c));
                e = (d - a) / b;
            } 
            else if (n == 4) {
                d = Math.sqrt((a * a) - (2 * b * c));
                e = (a - d) / b;
            }
            System.out.printf("Case %d: %.3f %.3f", i, d, e);
            System.out.println();
        }

    }
    
}
