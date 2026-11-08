package daspro_jobsheet9;

import java.util.Scanner;

public class Square23 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the value of N = ");
       int N = input.nextInt();
       for(int iOuter=1; iOuter<=N; iOuter++) {
        for(int i=1; i<=N; i++) {
            System.out.print("*");
        }
       System.out.println();
       
    }

        
       input.close();  
    }
}
