package daspro_jobsheet9;

import java.util.Scanner;

public class GroupScore23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int j;
        int score;
        float totalScore, avgScore;
        float maxAvgScore = 0;
        int bestGroup = 0;

        while (i <= 6) {
            System.out.println("Group " + i);
            
            totalScore = 0;
            for (j=1; j<=5; j++) {
                System.out.print("  Score from Rater Group " + j + ": ");
                score = input.nextInt();
                totalScore += score;
            }
            avgScore = totalScore / 5;
            System.out.println("Group " + i + ": average score = " + avgScore);

            if (avgScore > maxAvgScore) {
                maxAvgScore = avgScore; // Update the new highest score
                bestGroup = i;          // Record the group number that achieved it
            }
            i++;
        }
        System.out.println("\n========================================");
        System.out.println("The group with the highest average score is Group " + bestGroup);
        input.close();
    }
}