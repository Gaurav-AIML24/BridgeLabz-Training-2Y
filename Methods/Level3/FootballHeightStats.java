import java.util.Random;

public class FootballHeightStats {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }

        return heights;
    }

    public static int getSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double getMean(int[] heights) {
        return (double) getSum(heights) / heights.length;
    }

    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        final int PLAYERS = 11;
        int[] heights = generateHeights(PLAYERS);

        System.out.println("Player Heights (in cm):");
        for (int i = 0; i < PLAYERS; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        int sum = getSum(heights);
        double mean = getMean(heights);
        int shortest = getShortest(heights);
        int tallest = getTallest(heights);

        System.out.println("\n--- Height Statistics ---");
        System.out.println("Total Height: " + sum + " cm");
        System.out.printf("Mean Height: %.2f cm%n", mean);
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
