/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10474;

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
    public static int n,q,i,j,c,d,k=1;
    public static int[] an = new int[10000];
    public static int[] aq = new int[10000];
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            n=sc.nextInt();
            q=sc.nextInt();
            if (n == 0 && q == 0) {
                break;
            }
            for (i = 0; i < n; i++) {
                an[i]=sc.nextInt();
            }
            System.out.println("CASE# "+k+":");
            k++;
            for (i = 0; i < q; i++) {
                d = 0;
                c = 1;
                aq[i]=sc.nextInt();
                for (j = 0; j < n; j++) {
                    if (aq[i] == an[j]) {
                        d++;
                    } 
                    else if (aq[i] > an[j]) {
                        c++;
                    }
                }
                if (d != 0) {
                    System.out.println(aq[i]+" found at "+c);
                } 
                else {
                    System.out.println(aq[i]+" not found");
                }
            }
        }
    }
    
}
