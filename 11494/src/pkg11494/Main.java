/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11494;

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
        int x1, y1, x2, y2, n, dx, dy;
        while (true) {
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
                break;
            }
            dx = x1 - x2;
            dy = y1 - y2;
            if (dx < 0) {
                dx = -dx;
            }
            if (dy < 0) {
                dy = -dy;
            }
            if (x1 == x2 && y1 == y2) {
                n = 0;
            }
            else if (x1 == x2 || y1 == y2 || dx == dy) {
                n = 1;
            }
            else {
                n = 2;
            }
            System.out.println(n);
        }
    }

}
