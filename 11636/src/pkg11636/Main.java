/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11636;

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

    public static void main(String[] args) {
        int n, i, j, k;
        for (k = 1; sc.hasNextInt(); k++) {
            n=sc.nextInt();
            if(n<0)break;
            for (i = 0, j = 1; j < n; i++) {
                j *= 2;
            }
            System.out.printf("Case %d: %d", k, i);
            System.out.println();
        }
    }

}
