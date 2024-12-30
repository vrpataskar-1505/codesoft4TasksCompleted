import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApp {
    static Scanner sc = new Scanner(System.in);
    static int score = 0; // Keeps track of user's score
    static boolean answered = false; // To track if the user has answered within time

    public static void main(String[] args) {
        // Questions, options, and answers
        String[][] questions = {
            {"What is the capital of France?", "1. Paris", "2. Berlin", "3. Madrid", "4. Rome"},
            {"Which planet is known as the Red Planet?", "1. Venus", "2. Mars", "3. Jupiter", "4. Saturn"},
            {"What is the largest ocean on Earth?", "1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"}
        };
        int[] correctAnswers = {1, 2, 4}; // Correct answers for each question

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i][0]);

            // Display options
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }

            // Start a timer
            answered = false;
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!answered) {
                        System.out.println("\nTime's up! Moving to the next question.");
                    }
                }
            }, 10000); // 10 seconds for each question

            // Get user's answer
            System.out.print("Your answer (1-4): ");
            int userAnswer = getUserAnswer();

            // Stop the timer if the user answers in time
            answered = true;
            timer.cancel();

            // Check the answer
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else if (userAnswer > 0) {
                System.out.println("Wrong! The correct answer was: " + correctAnswers[i]);
            }
        }

        // Display results
        System.out.println("\nQuiz Over!");
        System.out.println("Your final score: " + score + "/" + questions.length);
    }

    // Method to safely get user's answer
    private static int getUserAnswer() {
        int userAnswer = -1;
        try {
            userAnswer = sc.nextInt();
            if (userAnswer < 1 || userAnswer > 4) {
                System.out.println("Invalid option. Skipping question.");
                userAnswer = -1;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Skipping question.");
            sc.next(); // Clear the invalid input
        }
        return userAnswer;
    }
}


