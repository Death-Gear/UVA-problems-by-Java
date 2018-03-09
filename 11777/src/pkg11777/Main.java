/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11777;

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
        int t, a, b, c, d, x, y, z, e, m, sum;
        byte ch = 0;
        t = scn.nextInt();
        for (int i = 1; i <= t; i++) {
            a = scn.nextInt();
            b = scn.nextInt();
            c = scn.nextInt();
            d = scn.nextInt();
            x = scn.nextInt();
            y = scn.nextInt();
            z = scn.nextInt();
            m = x;
            if (y < m) {
                m = y;
            }
            if (z < m) {
                m = z;
            }
            if (m == x) {
                e = (y + z) / 2;
            } else if (m == y) {
                e = (z + x) / 2;
            } else {
                e = (x + y) / 2;
            }
            sum = a + b + c + d + e;
            if (sum >= 90) {
                ch = 'A';
            } else if (sum >= 80) {
                ch = 'B';
            } else if (sum >= 70) {
                ch = 'C';
            } else if (sum >= 60) {
                ch = 'D';
            } else if (sum < 60) {
                ch = 'F';
            }
            System.out.println("Case " + i + ": " + ((char) Byte.toUnsignedInt(ch)));
        }
    }
    
}
