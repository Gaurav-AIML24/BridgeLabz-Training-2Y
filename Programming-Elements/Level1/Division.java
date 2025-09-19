public class Division {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pensperstudent = pens / students;
        int notdistributed = pens % students;
        System.out.println("The Pen Per Student is "+pensperstudent+ " and the remaining pen not distributed is "+notdistributed);
    }
}
