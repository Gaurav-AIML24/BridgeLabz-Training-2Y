public class UnitConverterFarenheit {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
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
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKg(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKgToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        System.out.println("10 km to miles = " + convertKmToMiles(10));
        System.out.println("20 miles to km = " + convertMilesToKm(20));
        System.out.println("2 meters to feet = " + convertMetersToFeet(2));
        System.out.println("10 feet to meters = " + convertFeetToMeters(10));
        System.out.println("5 yards to feet = " + convertYardsToFeet(5));
        System.out.println("30 feet to yards = " + convertFeetToYards(30));
        System.out.println("1 meter to inches = " + convertMetersToInches(1));
        System.out.println("100 inches to meters = " + convertInchesToMeters(100));
        System.out.println("12 inches to cm = " + convertInchesToCm(12));
        System.out.println("100°F to °C = " + convertFahrenheitToCelsius(100));
        System.out.println("0°C to °F = " + convertCelsiusToFahrenheit(0));
        System.out.println("150 pounds to kg = " + convertPoundsToKg(150));
        System.out.println("70 kg to pounds = " + convertKgToPounds(70));
        System.out.println("5 gallons to liters = " + convertGallonsToLiters(5));
        System.out.println("20 liters to gallons = " + convertLitersToGallons(20));
    }
}
