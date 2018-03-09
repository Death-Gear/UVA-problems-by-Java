/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10018;

/**
 *
 * @author Risad
 */
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class entity{
    static boolean isCar(entity e){
        if(e instanceof car)return true;
        else return false;
    }
    static boolean isPlayer(entity e){
        if(e instanceof player)return true;
        else return false;
    }
}
class car extends entity{
    
}
class player extends entity{
    
}

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(entity.isCar(new car()));
        System.out.println(entity.isPlayer(new player()));
    }

}
