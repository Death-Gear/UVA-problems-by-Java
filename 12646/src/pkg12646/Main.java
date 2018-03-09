/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12646;

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
    public static int a,b,c;
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if (a != b && a != c) {
                System.out.println("A");
            }
            else if (b != a && b != c) {
                System.out.println("B");
            } 
            else if (c != a && c != b) {
                System.out.println("C");
            } 
            else {
                System.out.println("*");
            }
        }
    }
    
}
