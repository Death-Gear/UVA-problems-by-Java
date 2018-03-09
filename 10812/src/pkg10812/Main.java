/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10812;

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
    public static void main(String[] args) {
        int i, t, s, d;
        t=sc.nextInt();
        for (i = 0; i < t; i++) {
            s=sc.nextInt();
            d=sc.nextInt();
            if (s < d || (s + d) % 2 != 0 || (s - d) % 2 != 0) {
                System.out.println("impossible");
            } else {
                System.out.printf("%d %d", (s + d) / 2, (s - d) / 2);
                System.out.println();
            }
        }
    }
    
}
