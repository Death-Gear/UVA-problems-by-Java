/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12704;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in);
    public static int test, i;
    public static double x, y, r;
    public static double p, q, l, s;

    public static void main(String[] args) {
        // TODO code application logic here
        test = scan.nextInt();
        for (i = 0; i < test; i++) {
            x = scan.nextDouble();
            y = scan.nextDouble();
            r = scan.nextDouble();
            p = Math.sqrt((x * x) + (y * y));
            l = p + r;
            s = r - p;
            System.out.printf("%.2f %.2f", s, l);
            System.out.println();
        }
        scan.close();
    }

}
