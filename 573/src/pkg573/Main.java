/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg573;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Risad
 */
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static double h,u,d,f,height,up,x;
    public static int i;
    public static void main(String[] args) {
        // TODO code application logic here
        while(true)
    {
        h=scan.nextDouble();
        if(h==0)break;
        u=scan.nextDouble();
        d=scan.nextDouble();
        f=scan.nextDouble();
        f=u*(f/100);
        height=0;
        for(i=0; height>=0; i++)
        {
            if(u>0)height+=u;
            u-=f;
            if(height>h)break;
            height-=d;
        }
        if(height<0)System.out.println("failure on day "+i);
        else System.out.println("success on day "+(i+1));
    }
        scan.close();
    }
 
}