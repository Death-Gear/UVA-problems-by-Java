/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10035;

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
    public static long a,b,x,y;
    public static int carry,count,sum;
    public static void main(String[] args) {
        while (scn.hasNextLong()) {
            a=scn.nextLong();
            b=scn.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            x = a;
            y = b;
            carry = 0;
            count = 0;
            while (x != 0 || y != 0) {
                sum = carry + (int)(x % 10) + (int)(y % 10);
                x = x / 10;
                y = y / 10;
                if (sum >= 10) {
                    carry = 1;
                    count++;
                } else {
                    carry = 0;
                }
            }
            if (count == 0) {
                System.out.println("No carry operation.");
            } 
            else if (count == 1) {
                System.out.println("1 carry operation.");
            } 
            else {
                System.out.println(count+" carry operations.");
            }
        }

    }
    
}
