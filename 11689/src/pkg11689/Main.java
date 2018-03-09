/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11689;

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
        int a, sum, x, f, n, i;
        n=sc.nextInt();
        for(i=0; i<n; i++){
            a=sc.nextInt();
            f=sc.nextInt();
            x=sc.nextInt();
            a += f;
            sum = 0;
            while (a / x >= 1) {
                sum += (a / x);
                a = a % x + a / x;
            }
            System.out.println(sum);
        }
    }

}
