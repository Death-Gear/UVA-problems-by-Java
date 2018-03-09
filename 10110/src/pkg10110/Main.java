/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10110;

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
    public static long n,i;
    public static double x;
    public static void main(String[] args) {
        while (sc.hasNextLong()) {
            n=sc.nextLong();
            if(n==0)break;
            x = Math.sqrt(n);
            i = (long) Math.sqrt(n);
            if (i == x) {
                System.out.println("yes");
            } 
            else {
                System.out.println("no");
            }
        }
    }
    
}
