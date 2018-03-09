/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg900;

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
        long a, f1, f2, f, c;
        while (sc.hasNextLong()) {
            a=sc.nextLong();
            if(a==0)break;
            f1 = 0;
            f2 = 1;
            c = 0;
            for (; c <= a; c++) {
                f = f1 + f2;
                f1 = f2;
                f2 = f;
            }
            System.out.println(f1);
        }
    }
    
}
