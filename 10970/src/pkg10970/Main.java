/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10970;

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

    public static void main(String[] args) {
        int m, n, t, x;
        while (scn.hasNextInt()) {
            m=scn.nextInt();
            n=scn.nextInt();
            if (m > n) {
                t = m;
                m = n;
                n = t;
            }
            x = (m - 1) + ((n - 1) * m);
            System.out.println(x);
        }
    }

}
