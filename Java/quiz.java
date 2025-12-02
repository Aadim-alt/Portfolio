import java.util.Scanner;

public class quiz
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Declare Variables
        int guess;
        int score = 0;
        String[] questions = {"Whats My Favourite Colour?",
                               "Whats My Favourite Pet?",
                            "Which Age Did I fall in Love first time?",
                        "Whats My Height?",
                    "Whats The name of My first Love or the First girl i Loved?"};
        String[][] options = {{"1)Blue","2)Red","3)Black","4)Gray"},
        {"1)Chicken","2)Parrot","3)Cat","4)Dog"},
        {"1)15","2)16","3)17","4)18"},
        {"1)5'4","2)5'2","3)5'6","4)5"},
        {"1)Smarika","2)Anushka","3)Aashika","4)Palpasa"}};
        int[] correct = {4,4,4,2,4};
        //Welcome Message
        System.out.println("---------------------------------");
        System.out.println("Welcome to How better you know me");
        System.out.println("---------------------------------");
        
        //Question loop
        for(int i =0; i<questions.length; i++)
        {
            System.out.println(questions[i]);
            //options
            for(String option: options[i])//the bracker options[i] means from the 2d array display every value of the array number[]
            {
                System.out.println(option);
                
            }
            System.out.println("Enter Your Choice: ");
            guess = scanner.nextInt();
            if(guess == correct[i])
            {
                System.out.println("Correct");
                score++;
            }
            else
            {
                System.out.println("Incorrect");
            }
            
        }
        System.out.println("You Scored "+score+" out of "+questions.length);
        
        //points
        scanner.close();
    }
}