/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11068;

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
        double x, y, a1, b1, c1, a2, b2, c2, d;
        while (sc.hasNextDouble()) {
            a1=sc.nextDouble();
            b1=sc.nextDouble();
            c1=sc.nextDouble();
            a2=sc.nextDouble();
            b2=sc.nextDouble();
            c2=sc.nextDouble();
            if (a1 == 0 && b1 == 0 && c1 == 0 && a2 == 0 && b2 == 0 && c2 == 0) {
                break;
            }
            if ((a1 == 0 && b1 == 0 && c1 == 0) || (a2 == 0 && b2 == 0 && c2 == 0)) {
                System.out.println("The fixed point is at -nan -nan.");
            } 
            else if (a1 == 0 && b1 == 0) {
                System.out.println("The fixed point is at -inf inf.");
            } 
            else if (a2 == 0 && b2 == 0) {
                System.out.println("The fixed point is at inf -inf.");
            } 
            else {
                d = (a1 * b2) - (b1 * a2);
                if (d == 0) {
                    System.out.println("No fixed point exists.");
                    continue;
                }
                x = (c1 * b2) - (b1 * c2);
                if (x != 0) {
                    x = x / d;
                }
                y = (a1 * c2) - (c1 * a2);
                if (y != 0) {
                    y = y / d;
                }
                System.out.printf("The fixed point is at %.2f %.2f.", x, y);
                System.out.println();
            }
        }
    }
    
}
