/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12577;



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
    public static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        String s="";
        int i, j, c = 1;
        while (true) {
            try {
                s = sc.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (s.equals("*")) {
                break;
            }
            if (s.equals("Hajj")) {
                System.out.printf("Case %d: Hajj-e-Akbar", c);
                System.out.println();
            } 
            else {
                System.out.printf("Case %d: Hajj-e-Asghar", c);
                System.out.println();
            }
            c++;
        }
    }
    
}
