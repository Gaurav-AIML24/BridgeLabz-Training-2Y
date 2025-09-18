import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random scores
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // [students][PCM]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 90) + 10; // random 10–99
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // [students][total, avg, %]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Rounding to 2 decimal places
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%");
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 1: Generate marks
        int[][] scores = generateScores(n);

        // Step 2: Calculate total, avg, percentage
        double[][] results = calculateResults(scores);

        // Step 3: Display scorecard
        displayScoreCard(scores, results);

        sc.close();
    }
}