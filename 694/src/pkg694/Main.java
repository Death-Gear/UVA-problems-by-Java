/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg694;

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
    public static long a,l,A;
    public static int i,c;
    public static void main(String[] args) {
        for (i = 1; scn.hasNextLong(); i++) {
            a=scn.nextLong();
            l=scn.nextLong();
            if(a<=0 && l<=0)break;
            A = a;
            c = 1;
            while (a != 1 && a <= l) {
                if (a % 2 == 0) {
                    a = a / 2;
                    c++;
                } 
                else if (a % 2 == 1) {
                    a = (3 * a) + 1;
                    if (a == 1 || a > l) {
                        break;
                    }
                    c++;
                }
            }
            System.out.println("Case "+i+": A = "+A+", limit = "+l+", number of terms = "+c);
        }

    }
    
}
