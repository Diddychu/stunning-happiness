import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Trivia Game: Plants!");

        String question1 = "First question: What are Peas classified as?";
        String question2 = "Second question: Around how many species of Tropical Orchids are there? (In Numbers)";
        String question3 = "Third question: What is another name for Deadly Nightshade?";

        String correctAnswer1 = "Fruit";
        int correctAnswer2 = 10000;
        String correctAnswer3 = "Belladonna";

        int gamePoints = 0;

        System.out.println(question1);

        Scanner scanner1 = new Scanner(System.in);
        String userInput1 = scanner1.next();

        if (userInput1.equals(correctAnswer1)) {
            gamePoints++;
            System.out.println("That is correct! You have " + gamePoints + " points!");
        } else {
            System.out.println("That is incorrect, the correct answer is: " + correctAnswer1);
        }

        System.out.println(question2);

        Scanner scanner2 = new Scanner(System.in);
        int userInput2 = scanner2.nextInt();

        if (userInput2 == correctAnswer2) {
            gamePoints++;
            System.out.println("That is correct! You have " + gamePoints + " points!");
        } else {
            System.out.println("That is incorrect, the correct answer is: " + correctAnswer2);

        }

        System.out.println(question3);

        Scanner scanner3 = new Scanner(System.in);
        String userInput3 = scanner3.next();

        if (userInput3.equals(correctAnswer3)) {
            gamePoints++;
            System.out.println("That is correct! You have " + gamePoints + " points!");
        } else {
            System.out.println("That is incorrect, the correct answer is: " + correctAnswer3);
        }

        if (gamePoints == 3) {
            System.out.println("Congratulations! You ended the game with " + gamePoints + " points!");
        } else if(gamePoints >= 1) {
            System.out.println("Nice! You ended the game with " + gamePoints + " points!");
        } else {
            System.out.println("You ended the game with " + gamePoints + " points. Better luck next time!");
        }



        // Hey, teach!
        //
        // Plans for Trivia game:
        // Three questions about Plants.

    }
}