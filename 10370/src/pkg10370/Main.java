/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10370;

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
    public static double sum, avg, c;
    public static int n, i, t, f;
    public static int[] ara = new int[1000];

    public static void main(String[] args) {
        t=scn.nextInt();
        for (f = 0; f < t; f++) {
            sum = 0;
            c = 0;
            n=scn.nextInt();
            for (i = 0; i < n; i++) {
                ara[i]=scn.nextInt();
                sum = sum + ara[i];
            }
            avg = sum / n;
            for (i = 0; i < n; i++) {
                if (avg < ara[i]) {
                    c++;
                }
            }
            System.out.printf("%.3f", (c / n) * 100);
            System.out.println("%");
        }
    }

}
