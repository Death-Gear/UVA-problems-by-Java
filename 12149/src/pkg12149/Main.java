/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12149;

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
    public static int i,n;
    public static long sum;
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            n=scn.nextInt();
            if(n==0)break;
            sum = 0;
            for (; n >= 1; n--) {
                sum = sum + (n * n);
            }
            System.out.println(sum);
        }
    }
    
}
