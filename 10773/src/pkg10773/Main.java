/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10773;

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
    public static double d,v,u,f;
    public static int i,t;
    public static void main(String[] args) {
        t=sc.nextInt();
        for (i = 1; i <= t; i++) {
            d=sc.nextDouble();
            v=sc.nextDouble();
            u=sc.nextDouble();
            f = Math.sqrt((u * u) - (v * v));
            if (u <= 0 || v >= u || f > u || v <= 0) {
                System.out.printf("Case %d: can't determine", i);
                System.out.println();
            } else {
                System.out.printf("Case %d: %.3f", i, ((1 / f) - (1 / u)) * d);
                System.out.println();
            }
        }
    }
    
}
