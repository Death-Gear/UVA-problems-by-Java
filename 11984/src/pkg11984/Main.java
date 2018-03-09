/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11984;

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
    public static int n,i;
    public static void main(String[] args) {
        n=sc.nextInt();
        double[] arac = new double[n];
        double[] arad = new double[n];
        for (i = 0; i < n; i++) {
            arac[i]=sc.nextDouble();
            arad[i]=sc.nextDouble();
            arac[i] = (1.8 * arac[i]) + 32;
            arac[i] = arac[i] + arad[i];
            arac[i] = (arac[i] - 32) * 5 / 9;
        }
        for (i = 0; i < n; i++) {
            System.out.printf("Case %d: %.2f", i + 1, arac[i]);
            System.out.println();
        }

    }
    
}
