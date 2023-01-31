import java.util.*;
public class GuessTheNumber {
    static Scanner input = new Scanner(System.in);

    public static boolean FindNumber(int Round) {

        int Attempt = 10;
        int Score = 100;
        boolean Answer = false;

        Random random = new Random();
        int randomNumber = random.nextInt( 99) + 1;

        while (Attempt >0 && !Answer) {
            System.out.println("Attempt" + (11-Attempt) + "/10");
            System.out.println("Guess The Number:");

            int guess = input.nextInt();

            if (guess < randomNumber) {
                System.out.println("Little Low \n");
                Attempt -= 1;
            } else if (guess > randomNumber) {
                System.out.println("Little High \n");
                Attempt -= 1;
            } else {
                System.out.println("\n Congratulation Tou Guess the Number " + randomNumber + "in" + (11 - Attempt) + "guesses.");
                System.out.println("Your Score is" + Attempt * 10 + "\n");

                System.out.println("*************************************");
                Answer = true;
            }
        }
        if (Attempt == 0) {
            System.out.println("You Lost the Round Number." + Round + ".");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int Round = 1;
        boolean isGameOn = true;
        System.out.println("Press 1 For Start");
        System.out.println("Press 0 For Exist");
        System.out.println("Enter Your Choise");
        int i = input.nextInt();

        System.out.println("*******************************************");

        if (i == 1) {
            while (true) {
                System.out.println("Round" + Round + "Start......\n");
                isGameOn = FindNumber(Round);

                if (isGameOn) {
                    System.out.println("Press 1 For Start");
                    System.out.println("Press 0 For Exist");
                    System.out.println("Enter Your Choise");

                    int j = input.nextInt();
                    if (j == 2) {
                        break;
                    }
                    Round += 1;
                } else {
                    System.out.println(" Game Over !!.........");
                    break;
                }
            }
        }
    }
}
