/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10696;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, f;
        while (true) {
            n=scn.nextInt();
            if(n==0)break;
            if (n>=101) {
                f = n - 10;
            } 
            else {
                f = 91;
            }
            System.out.println("f91("+n+") = "+f);
        }
    }

}
