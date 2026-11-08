package daspro_jobsheet9;

import java.util.Scanner;

public class Star23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.print("*");
        }
        input.close();
    }
}
