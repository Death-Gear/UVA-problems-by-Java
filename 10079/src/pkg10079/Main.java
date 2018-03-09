/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10079;

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
    public static long i, n, ans, x;

    public static void main(String[] args) {
        while (scn.hasNextLong()) {
            n=scn.nextLong();
            if(n<0)break;
            if (n != 0) {
                for (i = 0, x = 0; i < n - 1; i++) {
                    x = x + i;
                }
            } else {
                x = 1;
            }
            ans = (n * 2) + x;
            System.out.println(ans);
        }
    }

}
