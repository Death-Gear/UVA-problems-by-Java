/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10633;

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
    public static long x;
    public static void main(String[] args) {
        while (scn.hasNextLong()) {
            x=scn.nextLong();
            if(x==0)break;
            if (x % 9 == 0) {
                System.out.println(((x * 10) - 9) / 9+" "+(x * 10) / 9);
            } 
            else {
                System.out.println((x * 10) / 9);
            }
        }
    }
    
}
