/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11498;

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
    public static void main(String[] args) {
        int i, k, n, m, x, y;
        while (scn.hasNextInt()) {
            k=scn.nextInt();
            if(k==0)break;
            n=scn.nextInt();
            m=scn.nextInt();
            for (i = 0; i < k; i++) {
                x=scn.nextInt();
                y=scn.nextInt();
                if (x == n || y == m) {
                    System.out.println("divisa");
                } 
                else if (x > n && y > m) {
                    System.out.println("NE");
                } 
                else if (x < n && y > m) {
                    System.out.println("NO");
                } 
                else if (x > n && y < m) {
                    System.out.println("SE");
                } 
                else if (x < n && y < m) {
                    System.out.println("SO");
                }
            }
        }
    }
    
}
