/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10327;

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
    public static int i,j,l,f,c,k;
    public static int[] ara= new int[1000];
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            l=scn.nextInt();
            c = 0;
            for (i = 0; i < l; i++) {
                ara[i]=scn.nextInt();
            }
            for (i = 0; i < l; i++) {
                f = ara[i];
                for (j = i + 1; j < l; j++) {
                    if (f > ara[j]) {
                        c++;
                    }
                }
            }
            System.out.printf("Minimum exchange operations : %d", c);
            System.out.println();
        }
    }
    
}
