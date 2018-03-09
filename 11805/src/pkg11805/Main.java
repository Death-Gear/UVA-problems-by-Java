/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11805;

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
    public static int i,t,n,k,p,r;
    public static void main(String[] args) {
        t=scn.nextInt();
        for (i = 1; i <= t; i++) {
            n=scn.nextInt();
            k=scn.nextInt();
            p=scn.nextInt();
            if (k + p > n) {
                r = (k + p) - n;
            } 
            else {
                r = (k + p);
            }
            while (r > n) {
                r = r - n;
            }
            System.out.printf("Case %d: %d", i, r);
            System.out.println();
        }
    }
    
}
