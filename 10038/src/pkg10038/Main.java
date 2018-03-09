/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10038;

/**
 *
 * @author Risad
 */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		MFU(10,3);
	}
 
	private static void MFU(int np, int bs){
		//np = total string size
		//bs= buffer size
	Scanner sc = new Scanner(System.in);
    //int ma[10][200], pr[200], rb[10][200];
    int[][] ma,rb;
    ma = new int[10][200];
    rb = new int[10][200];
    int[] pr = new int[200];
 
    //memset(ma, -1, sizeof ma);
    Arrays.fill(ma,-1);
    //memset(rb, 0, sizeof rb);
    Arrays.fill(rb,-1);
 
 
    int i,j,p,flag,flag1, victim_i=0, victim_j=0, v, page_fault = 0;
 
    for(j=1; j<=bs; j++)
    {
        //cin>>p;
        p=sc.nextInt();
        pr[j]=p;
        flag = 0;
 
        for(i=1; i<=bs; i++)
        {
            if(ma[i][j-1] == -1 && flag ==0)
            {
                victim_i = i;
                victim_j = j;
                flag = 1;
            }
            ma[i][j] = ma[i][j-1];
        }
        ma[victim_i][victim_j] = p;
    }
    v=1;
    for(; j<=np; j++)
    {
        //cin>>p;
        p=sc.nextInt();
        pr[j]=p;
        flag = 0;
        flag1 = 0;
        v=v%bs;
        if(v==0)v=3;
        for(i=1; i<=bs; i++)
        {
            if(ma[i][j-1]==p)
            {
                flag1 = 1;
                if(rb[i][j]==0)rb[i][j]=1;
                else rb[i][j]= 0;
            }
            ma[i][j] = ma[i][j-1];
        }
        if(flag1 ==1)
        {
            page_fault++;
            v++;
        }
        else
        {
            for(i=1; i<bs; i++)
            {
                if(rb[i][j-1] != rb[i+1][j-1])
                {
                    flag = 1;
                }
            }
            if(flag==0)
            {
                victim_i = v;
                victim_j = j;
                ma[victim_i][victim_j] = p;
                v++;
            }
            else
            {
                for(; ; v++)
                {
                    if(rb[v][j-1]==0)break;
                }
                victim_i = v;
                victim_j = j;
                ma[victim_i][victim_j] = p;
                v++;
            }
        }
 
    }
 
    for(i=1; i<=bs; i++)
    {
        for(j=1; j<=np; j++)
        {
            //cout<<ma[i][j]<<" ";
            System.out.print(ma[i][j]+" ");
        }
        //cout<<endl;
        System.out.println();
    }
    //cout<<"Page Fault: "<<np-page_fault<<"/"<<np-page_fault-bs<<endl;
	System.out.println("Page Fault: "+(np-page_fault)+"/"+(np-page_fault-bs));
	}
}
