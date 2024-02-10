import java.util.Scanner;

public class QuestionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of the Question class
        Question[] questions = {
                new Question("What is the capital of France?", "Paris"),
                new Question("Which planet is known as the Red Planet?", "Mars"),
                new Question("Who wrote 'Romeo and Juliet'?", "William Shakespeare"),
                new Question("How many continents are there?", "7"),
                new Question("What is the largest ocean on Earth?", "Pacific Ocean"),
                new Question("What is the speed of light? (in m/s)", "299,792,458"),
                new Question("What is the chemical symbol for gold?", "Au"),
                new Question("What is 2 + 2?", "4"),
                new Question("What is the capital of Japan?", "Tokyo"),
                new Question("Who developed the theory of relativity?", "Albert Einstein")
        };

        // Display questions and get user input for answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].question);
            System.out.print("Enter your answer: ");
            
            String userAnswer = scanner.nextLine();
            
            if (userAnswer.equalsIgnoreCase(questions[i].correctAnswer)) {
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        scanner.close();
    }
}

class Question {
    String question;
    String correctAnswer;

    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }
}
