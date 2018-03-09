/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11332;

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
    public static long a, i, d, x, sum;

    public static void main(String[] args) {
        while (sc.hasNextLong()) {
            a=sc.nextLong();
            if(a==0)break;
            while (a > 9) {
                d = 1;
                sum = 0;
                for (i = 10; i <= a * 10; i = i * 10) {
                    x = (a % i) / d;
                    d = d * 10;
                    sum = sum + x;
                }
                a = sum;
            }
            System.out.println(a);
        }
    }

}
