/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10347;

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
    public static double m1,m2,m3,s,area,x;
    public static int a;
    public static void main(String[] args) {
        for (a = 0; a < 1000; a++) {
            m1=scn.nextDouble();
            m2=scn.nextDouble();
            m3=scn.nextDouble();
            s = (m1 + m2 + m3) / 2;
            x = s * (s - m1) * (s - m2) * (s - m3);
            area = (4 * Math.sqrt(x)) / 3;
            if (area > 0) {
                System.out.printf("%.3f", area);
                System.out.println();
            } 
            else {
                area = -1;
                System.out.printf("%.3f", area);
                System.out.println();
            }
        }
    }
    
}
