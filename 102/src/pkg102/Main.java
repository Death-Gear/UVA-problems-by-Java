/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg102;

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
    public static int bgc,bcg,gbc,gcb,cbg,cgb,i,x;
    public static int[] ara= new int[9];
    public static void main(String[] args) {
        while (scn.hasNextInt()) {
            ara[0]=scn.nextInt();
            for (i = 1; i < 8; i++) {
                ara[i]=scn.nextInt();
            }
            ara[8]=scn.nextInt();
            bcg = ara[1] + ara[2] + ara[3] + ara[4] + ara[6] + ara[8];
            x = bcg;
            bgc = ara[1] + ara[2] + ara[3] + ara[5] + ara[6] + ara[7];
            if (x > bgc) {
                x = bgc;
            }
            cbg = ara[0] + ara[1] + ara[4] + ara[5] + ara[6] + ara[8];
            if (x > cbg) {
                x = cbg;
            }
            cgb = ara[0] + ara[1] + ara[3] + ara[5] + ara[7] + ara[8];
            if (x > cgb) {
                x = cgb;
            }
            gbc = ara[0] + ara[2] + ara[4] + ara[5] + ara[6] + ara[7];
            if (x > gbc) {
                x = gbc;
            }
            gcb = ara[0] + ara[2] + ara[3] + ara[4] + ara[7] + ara[8];
            if (x > gcb) {
                x = gcb;
            }
            if (x == bcg) {
                System.out.printf("BCG %d", x);
                System.out.println();
            } 
            else if (x == bgc) {
                System.out.printf("BGC %d", x);
                System.out.println();
            } 
            else if (x == cbg) {
                System.out.printf("CBG %d", x);
                System.out.println();
            } 
            else if (x == cgb) {
                System.out.printf("CGB %d", x);
                System.out.println();
            } 
            else if (x == gbc) {
                System.out.printf("GBC %d", x);
                System.out.println();
            } 
            else if (x == gcb) {
                System.out.printf("GCB %d", x);
                System.out.println();
            }

        }
    }
    
}
