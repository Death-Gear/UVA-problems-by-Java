/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10302;

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
    public static int i,x,j;
    public static long sum,m;
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            x=scn.nextInt();
            sum = 0;
            for (i = x; i >= 1; i--) {
                m = 1;
                for (j = 0; j < 3; j++) {
                    m = m * i;
                }
                sum = sum + m;
            }
            System.out.println(sum);
        }
    }
    
}
