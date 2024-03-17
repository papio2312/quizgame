import java.util.Scanner;
public class QuizMain{
    public static void main(String[] args) {
        QuizGame quiz = new QuizGame();
        Scanner input = new Scanner(System.in);

        System.out.print("Please type your name: ");
        String name = input.nextLine();
        quiz.setName(name);

        System.out.println("Hello, "+ name +"!"+" We welcome you to our tonight's geography quiz game!\n");

        quiz.setQuestions();
      
    }
}