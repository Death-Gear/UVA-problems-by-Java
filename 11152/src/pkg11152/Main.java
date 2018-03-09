/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11152;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Risad
 */
public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static double r1, r2, t_area, area1, area2, p, pi = 4 * Math.atan(1), q, a, b, c;

    public static void main(String[] args) {
        // TODO code application logic here
        while (scan.hasNextDouble()) {
            a=scan.nextDouble();
            b=scan.nextDouble();
            c=scan.nextDouble();
            p = a + b + c;
            q = p / 2;
            t_area = Math.sqrt(q * (q - a) * (q - b) * (q - c));
            r2 = 2 * t_area / p;
            area2 = pi * r2 * r2;
            r1 = (a * b * c) / (4 * t_area);
            area1 = pi * r1 * r1;
            System.out.printf("%.4f %.4f %.4f", area1 - t_area, t_area - area2, area2);
            System.out.println();
        }
    }

}
