/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10323;

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

    public static long fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int n;
        while (sc.hasNextInt()) {
            n=sc.nextInt();
            if (n < 0 && n % 2 == 0) {
                System.out.println("Underflow!");
            }
            else if (n < 0 && n % 2 != 0) {
                System.out.println("Overflow!");
            }
            else if (n > 13) {
                System.out.println("Overflow!");
            }
            else if (n < 8) {
                System.out.println("Underflow!");
            }
            else {
                System.out.println(fact(n));
            }
        }
    }

}
