import java.util.Scanner;
import java.util.Random;

class Guess {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n \t < < < Welcome 2 Number Guessing Game > > >\n");

        System.out.println("\t ---Guess a number between 1 to 100---");

        //intialise the variables
        int score, userNumber, systemGeneratedNumber, chancesToGuess;

        //call random class's object to generate random values b/w 1 - 100
        Random random = new Random();

        systemGeneratedNumber = random.nextInt(50);
        //Testing random object >>> System.out.println(systemGeneratedNumber);

        // intializing with zero(0) bcz @starting chancesToGuess is absolutly 0 & score too.
        chancesToGuess = 0;

        //printing exit or quit game message
        System.out.println("for exit game - 404!");

        // intialize with true boolean to start game loop & if found false game is terminated!
        boolean gameLoop = true;

        while (gameLoop) {
            System.out.print(">>> : ");
            userNumber = sc.nextInt();
            System.out.println();

            // Check if the user input is within the valid range
            if (userNumber < 1 || userNumber > 100) {
                System.out.println("Invalid input! Please enter a number between 1 and 100.");
                continue;
            }

            //Check if the user enter same as random to validate
            if (userNumber == systemGeneratedNumber)
            {
                System.out.println("Well-done!!!");
                chancesToGuess++;
                break;
            } else {

                //to calculating the number of turns for getting correct number...
                chancesToGuess++;

                if (userNumber > systemGeneratedNumber)
                {
                    if (userNumber > systemGeneratedNumber*2+1)
                    {
                        System.out.println("too big...decrease number!");
                    }
                    else
                    {
                        if (userNumber < (systemGeneratedNumber*2) && userNumber > systemGeneratedNumber)
                            System.out.println("big & close...keep decreasing!");
                    }

                }
                else
                {
                    if (userNumber < systemGeneratedNumber && userNumber >= systemGeneratedNumber/2)
                    {
                        System.out.println("small...increase number!");
                    } else
                    {
                        if (userNumber < systemGeneratedNumber/2)
                            System.out.println("too small...keep increasing!");
                    }
                }
            }

            //check if the user wants to exit from the game
            if(userNumber == 404) {
                System.out.println("You quit the game...");
                gameLoop = false;
                break;
            }
        }

        // Remark based on the number of chances
        String remark;
        if (chancesToGuess <= 5) {
            remark = "Excellent!";
        } else if (chancesToGuess <= 10) {
            remark = "Good!";
        } else if (chancesToGuess <= 15) {
            remark = "Average.";
        } else {
            remark = "Better luck next time.";
        }

        System.out.println("\nTotal chances: " + chancesToGuess);
        System.out.println("Remark: " + remark);
        sc.close();
    }
}
