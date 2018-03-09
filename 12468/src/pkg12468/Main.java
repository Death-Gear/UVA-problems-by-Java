/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12468;

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
        int a, b, x, y;
        while (sc.hasNextInt()) {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a == -1 && b==-1)break;
            if (b > a) {
                x = a + (100 - b);
                y = b - a;
            } else if (a > b) {
                x = b + (100 - a);
                y = a - b;
            } else {
                x = 100;
                y = 0;
            }
            if (x < y) {
                System.out.println(x);
            } 
            else {
                System.out.println(y);
            }
        }
    }
    
}
