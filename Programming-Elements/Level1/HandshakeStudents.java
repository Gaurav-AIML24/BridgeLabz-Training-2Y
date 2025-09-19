import java.util.Scanner;
public class HandshakeStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students;
        System.out.println("Enter number of students");
        students = input.nextInt();
        int total = (students * (students - 1)) / 2;
        System.out.println("Possible Handshakes are "+total); 
        input.close();
    }
}
