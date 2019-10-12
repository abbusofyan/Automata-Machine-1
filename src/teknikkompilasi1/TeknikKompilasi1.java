/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknikkompilasi1;

import java.util.Scanner;

/**
 *
 * @author Abu
 */
public class TeknikKompilasi1 {

    /**
     * @param args the command line arguments
     */
    static int step = 0;
    public static void main(String [] args)
    {
    System.out.print("Input =  ");
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int inputLength = input.length();
    int currentPosition = 1;
        if (input.charAt(0) == 'a') {
            step++;
            System.out.println("S -> A diterima");
            nodeA(input, inputLength, currentPosition);
        } else {
            System.out.println("S -> A di tolak");
            System.out.println("Jumlah step :" + step);
        }
    }
    
    static void nodeA(String input, int inputLength, int currentPosition ) {
        if (currentPosition == inputLength) {
            System.out.println("Stop");
            System.out.println("Jumlah step :" + step);
        } else {
            if (input.charAt(currentPosition) == 'b') {
                currentPosition++;
                step++;
                System.out.println("A -> B diterima");
                nodeB(input, inputLength, currentPosition);
            } else {
                System.out.println("A -> B di tolak");
                System.out.println("Input ditolak di node A");
                System.out.println("Jumlah step :" + step);
            }
        }
    }
    
    static void nodeB(String input, int inputLength, int currentPosition ) {
        if (currentPosition == inputLength) {
            System.out.println("Stop");
            System.out.println("Jumlah step :" + step);
        } else {
            if (input.charAt(currentPosition) == 'a') {
                step++;
                currentPosition++;
                System.out.println("B -> A diterima");
                nodeA(input, inputLength, currentPosition);
            } else {
                System.out.println("B -> A di tolak");
                System.out.println("Input ditolak di node B");
                System.out.println("Jumlah step :" + step);
            }
        }
    }
}
