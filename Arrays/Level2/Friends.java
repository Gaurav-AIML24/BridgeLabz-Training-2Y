import java.util.Scanner;
public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int minAgeIndex = 0, maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
            if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
        }
        System.out.println("Youngest: " + names[minAgeIndex] + " (Age " + ages[minAgeIndex] + ")");
        System.out.println("Tallest: " + names[maxHeightIndex] + " (Height " + heights[maxHeightIndex] + ")");
        sc.close();
    }
}

