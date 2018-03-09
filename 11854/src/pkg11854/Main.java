/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11854;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static long a, b, c;

    public static void main(String[] args) {
        while (scan.hasNextLong()) {
            a=scan.nextLong();
            b=scan.nextLong();
            c=scan.nextLong();
            if (a == 0 && b == 0 && c == 0) {
                break;
            } 
            else if (a * a == (b * b) + (c * c) || b * b == (a * a) + (c * c) || c * c == (a * a) + (b * b)) {
                System.out.println("right");
            } 
            else {
                System.out.println("wrong");
            }
        }
    }

}
