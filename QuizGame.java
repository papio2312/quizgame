//import java.util.Random;
import java.util.Scanner;

public class QuizGame {
    private String playerName;
    private int wins;
    private int loses;
    private int points;
    private int questions;
    private int totalScore;
    private char answer;
  

    Scanner input = new Scanner(System.in);

    public QuizGame(){
        playerName = " ";
        wins = 0;
        loses = 0;
        points = 0;
        answer = ' ';
        
   
    
    }

    public void setQuestions(){
        // Random random = new Random();
        // questions = 5;
        // questions = random.nextInt(5)+1;

    for(questions = 1; questions <= 5; questions++){
        switch(questions){
            case 1: 
                System.out.println("Question number 1: What is the capital of Italy: A)Rome  B)Venice");

                System.out.println("Choose your answer: ");    
                char ans = input.next().charAt(0);
                if (ans == 'A') {
                    System.out.println("Correct! You get 1 point!");
                    wins++;
                    System.out.println("Points: "+getWins());
                } else if (ans == 'B') {
                    System.out.println("Oh no! You get 1 negative point");
                    loses++;
                    System.out.println("Negative points: "+getLoses());
                }
                break;
            case 2: 
                System.out.println("Question number 2: What is the capital of Germany: A)Berlin B)Munich");
                System.out.println("Choose your answer: ");    
                char ans2 = input.next().charAt(0);
                if (ans2 == 'A') {
                    System.out.println("Correct! You get 1 point!");
                    wins++;
                    System.out.println("Points: "+getWins());
                } else if (ans2 == 'B') {
                    System.out.println("Oh no! You get 1 negative point");
                    loses++;
                    System.out.println("Negative points: "+getLoses());
                }
                break;
            case 3: 
                System.out.println("Question number 3: What is the capital of Japan: A)Kyoto  B)Tokyo");
                System.out.println("Choose your answer: ");    
                char ans3 = input.next().charAt(0);
                if (ans3 == 'A') {
                    System.out.println("Oh no! You get 1 negative point");
                    loses++;
                    System.out.println("Negative points: "+getLoses());
                } else if (ans3 == 'B') {
                    System.out.println("Correct! You get 1 point!");
                    wins++;
                    System.out.println("Points: "+getWins());
                }
                break;
            case 4: 
                System.out.println("Question number 4: What is the capital of France: A)Paris B)Nice");
                System.out.println("Choose your answer: ");    
                char ans4 = input.next().charAt(0);
                if(ans4 == 'A' ){
                    System.out.println("Correct! You get 1 point!");
                    System.out.println("Points: "+getWins());
                }else if(ans4 =='B'){
                    System.out.println("Oh no! You get 1 negative point");
                    System.out.println("Negative points: "+getLoses());
                }
                break;
            case 5: 
                System.out.println("Question number 5: What is the capital of Greece: A)Nafplio  B)Athens");
                System.out.println("Choose your answer: ");    
                char ans5 = input.next().charAt(0);
                if(ans5 == 'A' ){
                    System.out.println("Correct! You get 1 point!");
                    System.out.println("Points: "+getWins());
                }else if(ans5 =='B'){
                    System.out.println("Oh no! You get 1 negative point");
                    System.out.println("Negative points: "+getLoses());
                }
                break;
        }
    }

    System.out.println("Your total score is: "+getTotalScore());
    if(wins>loses){
        System.out.println("Congratulations! You win!!!");
    }else{
        System.out.println("You lose...");
    }
}

    public int getQuestions(){
        return questions;
    }


    public void setName(String name){
        playerName = name;
    }

    

    public int getWins(){
         return wins;
    }

    public int getLoses(){
        return loses;
    }

    public int getTotalScore(){
        return totalScore + wins - loses;
    }
}
