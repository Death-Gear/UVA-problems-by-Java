/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg543;

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
    public static int is_prime(int a) {
        int i;
        if (a == 1) {
            return 0;
        } 
        else if (a == 2) {
            return 1;
        }
        else if (a % 2 == 0) {
            return 0;
        }
        else if (a == 3) {
            return 1;
        }
        else if (a == 5) {
            return 1;
        }
        else if (a == 7) {
            return 1;
        }
        else {
            for (i = 3; i <= Math.sqrt(a); i += 2) {
                if (a % i == 0) {
                    break;
                }
            }
            if (a % i == 0) {
                return 0;
            }
            else {
                return 1;
            }
        }
    }
    public static int n,i;
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            n=scn.nextInt();
            if(n==0)break;
            for (i = 3; i <= n / 2; i += 2) {
                if (is_prime(i) == 1 && is_prime(n - i) == 1) {
                    System.out.printf("%d = %d + %d", n, i, n - i);
                    System.out.println();
                    break;
                }
            }
            if (is_prime(i) != 1 || is_prime(n - i) != 1) {
                System.out.printf("Goldbach's conjecture is wrong.");
                System.out.println();
            }
        }
    }
    
}
