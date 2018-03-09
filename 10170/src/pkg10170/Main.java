/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10170;

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
    public static int i,j,s;
    public static long d,c;
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            s=sc.nextInt();
            d=sc.nextLong();
            c = 0;
            for (i = s; c < d; i++) {
                c = c + i;
                if (c >= d) {
                    break;
                }
            }
            System.out.println(i);
        }

    }
    
}
