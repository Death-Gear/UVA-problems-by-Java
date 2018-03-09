/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11936;

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
    public static int i,n,a,b,c;
    public static void main(String[] args) {
        n=sc.nextInt();
    for(i=0; i<n; i++)
    {
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a+b<=c || b+c<=a || c+a<=b)System.out.println("Wrong!!");
        else System.out.println("OK");
    }
    }
    
}
