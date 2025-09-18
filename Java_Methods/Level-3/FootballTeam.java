import java.util.Random;

public class FootballTeam {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }
    public static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static int[] generateHeights() {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
        }
        return heights;
    }
}