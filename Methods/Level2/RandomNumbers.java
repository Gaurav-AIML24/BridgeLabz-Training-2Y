public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        double[] result = findAverageMinMax(numbers);
        System.out.println("Average = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
}


