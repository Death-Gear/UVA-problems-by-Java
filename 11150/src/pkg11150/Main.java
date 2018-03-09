/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11150;

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
    public static int n,sum;
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            n=sc.nextInt();
            sum = n;
            while (n != 0) {
                if (n == 1) {
                    break;
                } 
                else if (n % 3 == 0 || (n + 2) % 3 == 0) {
                    sum = sum + n / 3;
                    n = n / 3;
                } 
                else if ((n + 1) % 3 == 0) {
                    sum = sum + (n + 1) / 3;
                    n = (n + 1) / 3;
                } 
                else if (n < 3) {
                    sum = sum + (n + 2) / 3;
                    n = (n + 2) / 3;
                }
            }
            System.out.println(sum);
        }
    }
    
}
