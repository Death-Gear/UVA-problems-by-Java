/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11185;

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
    public static long n, i, x, sum;

    public static void main(String[] args) {
        while (true) {
            n=scn.nextLong();
            if (n < 0) {
                break;
            }
            sum = 0;
            for (i = 1; n != 0; i = i * 10) {
                x = n % 3;
                n = n / 3;
                sum = sum + x * i;
            }
            System.out.println(sum);
        }
    }

}
