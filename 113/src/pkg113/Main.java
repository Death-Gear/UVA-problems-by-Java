/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg113;

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
        double p, k, n, i;
        while (scn.hasNextDouble()) {
            n=scn.nextDouble();
            p=scn.nextDouble();
            k = 1 / n;
            i =Math.pow(p, k);
            System.out.printf("%.0f", i);
            System.out.println();
        }
    }

}
