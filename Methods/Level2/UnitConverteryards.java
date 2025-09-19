public class UnitConverteryards {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        System.out.println("10 yards to feet = " + convertYardsToFeet(10));
        System.out.println("30 feet to yards = " + convertFeetToYards(30));
        System.out.println("2 meters to inches = " + convertMetersToInches(2));
        System.out.println("100 inches to meters = " + convertInchesToMeters(100));
        System.out.println("25 inches to cm = " + convertInchesToCm(25));
    }
}

