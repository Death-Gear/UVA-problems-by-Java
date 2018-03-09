/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12751;

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
    public static long n,k,x,s1,s2,r;
    public static int t,i;
    public static void main(String[] args) {
        t=sc.nextInt();
        for (i = 1; i <= t; i++) {
            n=sc.nextLong();
            k=sc.nextLong();
            x=sc.nextLong();
            s1 = (n * (n + 1)) / 2;
            s2 = ((k * k) + k * (2 * x - 1)) / 2;
            r = s1 - s2;
            System.out.println("Case "+i+": "+r);
        }
    }
    
}
