package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        devine(12);
        System.out.println("Au revoir");
    }


    public static void devine(int i){
        int j =0;
        Scanner sc = new Scanner(System.in);
        while ( j != i) {
            System.out.printf("Entrez un nombre : \n");
            j = sc.nextInt();
            if (j==i ) {
                System.out.printf("BRAVOOOO");
            } else System.out.printf("NUL");


        }
    }
}
