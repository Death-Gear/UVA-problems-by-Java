/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10242;

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
    public static double x1,y1,x2,y2,x3,y3,x4,y4,x,y;
    public static void main(String[] args) {
        while (scn.hasNextDouble()) {
            x1=scn.nextDouble();
            y1=scn.nextDouble();
            x2=scn.nextDouble();
            y2=scn.nextDouble();
            x3=scn.nextDouble();
            y3=scn.nextDouble();
            x4=scn.nextDouble();
            y4=scn.nextDouble();
            if (x1 == x3 && y1 == y3) {
                x = x2 + x4 - x1;
                y = y2 + y4 - y1;
            } 
            else if (x1 == x4 && y1 == y4) {
                x = x2 + x3 - x1;
                y = y2 + y3 - y1;
            } 
            else if (x2 == x3 && y2 == y3) {
                x = x1 + x4 - x2;
                y = y1 + y4 - y2;
            }
            else if (x2 == x4 && y2 == y4) {
                x = x1 + x3 - x2;
                y = y1 + y3 - y2;
            }
            System.out.printf("%.3f %.3f", x, y);
            System.out.println();
        }
    }
    
}
