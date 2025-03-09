/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package seisani.dollar.java;

/**
 *
 * @author SEISANI GUNDO JR
 */
import java.util.Scanner;
public class DollarJava {

    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Please  enter the amount in dollars:");
        int dollars = scanner.nextInt();
        // tell the user  to enter the amount in dollars
        int twenties = dollars/20;
        dollars = dollars%20;
        
        int tens = dollars/10;
        dollars = dollars%10;
        
        int fives = dollars/5;
        dollars = dollars%5;
        
        int ones = dollars;
        
        //show the results
        System.out.println("The amount can be broken down as:");
        System.out.println("20s: " + twenties);
        System.out.println("10s: " + tens);
        System.out.println("5s: " + fives);
        System.out.println("1s: " + ones);
        
        scanner.close();
        
        
    }
}
