import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User Wins!";
        }
        return "Computer Wins!";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter rock, paper, or scissors: ");
        String user = sc.next().toLowerCase();
        String[] choices = {"rock", "paper", "scissors"};
        String computer = choices[rand.nextInt(3)];
        System.out.println("Computer chose: " + computer);
        System.out.println(getWinner(user, computer));
    }
}

