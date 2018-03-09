/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11417;

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
    public static int gcd(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static int n,g,i,j;
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            n=scn.nextInt();
            if(n==0)break;
            g = 0;
            for (i = 1; i < n; i++) {
                for (j = i + 1; j <= n; j++) {
                    g += gcd(i, j);
                }
            }
            System.out.println(g);
        }
    }
    
}
