/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11764;

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
        int first_number, t, n, x = 0, a, i, j, h, l;
        t=scn.nextInt();
        for (i = 1; i <= t; i++) {
            first_number = 0;
            h = 0;
            l = 0;
            n=scn.nextInt();
            for (j = 0; j < n; j++) {
                a=scn.nextInt();
                if (first_number == 0) {
                    first_number++;
                    x = a;
                } 
                else {
                    if (x < a) {
                        h++;
                    }
                    else if (x > a) {
                        l++;
                    }
                    x = a;
                }
            }
            System.out.printf("Case %d: %d %d", i, h, l);
            System.out.println();
        }

    }
    
}
