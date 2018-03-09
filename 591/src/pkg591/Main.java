/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg591;

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
    public static int n, i, sum, avg, c, f = 1;

    public static void main(String[] args) {
        while (sc.hasNext()) {
            n=sc.nextInt();
            if(n==0)break;
            sum = 0;
            c = 0;
            int[] ara= new int[n];
        for (i = 0; i < n; i++) {
                ara[i]=sc.nextInt();
                sum = sum + ara[i];
            }
        avg = sum / n;
        for (i = 0; i < n; i++) {
            if (ara[i] > avg) {
                c = c + (ara[i] - avg);
            }
        }
        System.out.println("Set #"+f);
        System.out.println("The minimum number of moves is "+c+".");
        System.out.println();
        f++;
        }
    }

}
