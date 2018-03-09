/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10235;

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
    public static int is_prime(int n) {
        int i, x;
        if (n == 1) {
            x = 0;
        } 
        else if (n == 2) {
            x = 1;
        } 
        else if (n % 2 == 0) {
            x = 0;
        }
        else {
            for (i = 3; i <= n; i += 2) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i == n) {
                x = 1;
            } 
            else {
                x = 0;
            }
        }
        return x;
    }
    public static int n,a,i,x;
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            n=sc.nextInt();
            if (is_prime(n) == 0) {
                System.out.printf("%d is not prime.", n);
                System.out.println();
            } 
            else if (is_prime(n) == 1) {
                a = n;
                x = 0;
                for (; a != 0;) {
                    x = x + a % 10;
                    a /= 10;
                    if (a == 0) {
                        break;
                    }
                    x *= 10;
                }
                if (is_prime(x) == 0 || x == n) {
                    System.out.printf("%d is prime.", n);
                    System.out.println();
                } 
                else if (is_prime(x) == 1) {
                    System.out.printf("%d is emirp.", n);
                    System.out.println();
                }
            }
        }
    }
    
}
