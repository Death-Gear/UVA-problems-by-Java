/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10346;

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
    public static int a, sum, x;

    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            a=sc.nextInt();
            x=sc.nextInt();
            sum = a;
            while (a / x >= 1) {
                sum = sum + (a / x);
                a = a % x + a / x;
            }
            System.out.println(sum);
        }
    }
}
