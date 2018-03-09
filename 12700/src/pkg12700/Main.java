/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12700;

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
    public final static int nextChar(Scanner scanner) {
        scanner.useDelimiter("");
        int ret = scanner.next().charAt(0);
        scanner.reset();
        return ret;
    }
   
    public static void main(String[] args) {
        int f, n, b, w, t, a;
        byte ch;
        f = scn.nextInt();
        for (int i = 0; i < f; i++) {
            b = 0;
            w = 0;
            t = 0;
            a = 0;
            n = scn.nextInt();
            for (int j = 0; j <= n; j++) {
                ch = (byte) nextChar(scn);
                if (ch == 'B') {
                    b++;
                }
                else if (ch == 'W') {
                    w++;
                }
                else if (ch == 'T') {
                    t++;
                }
                else if (ch == 'A') {
                    a++;
                }
            }
            if (a == n) {
                System.out.println("Case " + (i + 1) + ": ABANDONED");
            }
            else if (w == 0 && t == 0) {
                System.out.println("Case " + (i + 1) + ": BANGLAWASH");
            }
            else if (b == 0 && t == 0) {
                System.out.println("Case " + (i + 1) + ": WHITEWASH");
            }
            else if (w == b) {
                System.out.println("Case " + (i + 1) + ": DRAW " + b + " " + t);
            }
            else if (b > w) {
                System.out.println("Case " + (i + 1) + ": BANGLADESH " + b + " - " + w);
            }
            else if (w > b) {
                System.out.println("Case " + (i + 1) + ": WWW " + w + " - " + b);
            }
        }
    }

}
