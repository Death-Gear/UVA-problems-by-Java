/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11877;

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
    public static int a,sum;
    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            a=sc.nextInt();
            if (a == 0) {
                break;
            }
            sum = 0;
            while (a / 3 >= 1) {
                sum = sum + (a / 3);
                a = a % 3 + a / 3;
            }
            if (a == 2) {
                sum++;
            }
            System.out.println(sum);
        }
    }
    
}
