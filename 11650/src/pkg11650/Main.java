/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11650;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        int h, m, t;
        byte ch;
        t = STDIN_SCANNER.nextInt();
        for (int i = 0; i < t; i++) {
            h = STDIN_SCANNER.nextInt();
            ch = (byte)nextChar(STDIN_SCANNER);
            m = STDIN_SCANNER.nextInt();
            if (h == 12 && m > 0) {
                h = h - 1;
            } 
            else if (h < 12) {
                h = 11 - h + (m == 0 ? 1 : 0);
            }
            if (h == 0) {
                h = 12;
            }
            if (h != 0) {
                m = 60 - m;
            }
            if (m == 60) {
                m = 0;
            }
            if (h < 10 && m < 10) {
                System.out.println("0" + h + ch + "0" + m);
            } 
            else if (h < 10 && m >= 10) {
                System.out.println("0" + h + ch + m);
            }
            else if (h >= 10 && m < 10) {
                System.out.println("" + h + ch + "0" + m);
            }
            else {
                System.out.println("" + h + ch + m);
            }
        }
    }
    public final static Scanner STDIN_SCANNER = new Scanner(System.in);
	public final static int nextChar(Scanner scanner) {
		scanner.useDelimiter("");
		int ret = scanner.next().charAt(0);
		scanner.reset();
		return ret;
	}
}
