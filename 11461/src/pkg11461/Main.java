/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11461;

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
    public static int a, b, n, c;

    public static void main(String[] args) {
        while (sc.hasNextInt()) {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0 && b==0)break;
            c = 0;
            for (n = 1; n <= Math.sqrt(b); n++) {
                if (n * n >= a && n * n <= b) {
                    c++;
                }
            }
            System.out.println(c);
        }
    }

}
