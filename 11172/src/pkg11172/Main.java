/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11172;

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
    public static int t, i, j, x;

    public static void main(String[] args) {
    t=scn.nextInt();
            if (t < 15) {
            char[] ara= new char[t];
    for (x = 0; x < t; x++) {
                i=scn.nextInt();
                j=scn.nextInt();
                if (i < j) {
                    ara[x] = '<';
                } 
                else if (i > j) {
                    ara[x] = '>';
                } 
                else {
                    ara[x] = '=';
                }
            }
            for (x = 0; x < t; x++) {
                System.out.println(ara[x]);
            }
        }
    }

}
