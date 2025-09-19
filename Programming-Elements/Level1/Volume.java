public class Volume {
    public static void main(String[] args) {
        double radius = 6378;
        double radiusmiles = radius * 1.6;
        double volumekm = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        double volumemiles = (4.0/3.0)*Math.PI*Math.pow(radiusmiles,3);
        System.out.println("The volume of earth in cubic kilometers is "+volumekm+" and cubic miles is "+volumemiles);
    }
}
