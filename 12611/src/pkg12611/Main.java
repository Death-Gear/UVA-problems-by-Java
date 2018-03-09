/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12611;

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
    public static int i,t,r,l,w,r1,r2;
    public static void main(String[] args) {
        t=sc.nextInt();
        for (i = 0; i < t; i++) {
            r=sc.nextInt();
            l = r * 5;
            w = (l * 6) / 10;
            w = w / 2;
            r1 = (l * 45) / 100;
            r2 = l - r1;
            System.out.printf("Case %d:", i + 1);
            System.out.println();
            System.out.println((0 - r1)+" "+w);
            System.out.println(r2+" "+w);
            System.out.println(r2+" "+(0 - w));
            System.out.println((0 - r1)+" "+(0 - w));
        }
    }
    
}
