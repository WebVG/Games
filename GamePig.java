package GamePig;

import java.util.*;

public class GamePig {

    public static void main(String[] args, String option) {

        int win = 100; // variable of winning score //
        int player1 = 0;
        int player2 = 0; // variable to hold player scores //
        boolean man, cpu, game;  // computer player //
        //Random roll = new Random(); // generates a number 0-5 plus 1. 
       // int diceRoll = roll.nextInt(5) + 1;
        Scanner input = new Scanner(System.in); // object to take the input. //
        option = input.nextLine();
        int setScore1;
        int setScore2;
        // i have one diceroll that generates a number
        // another that is 
        

        man = false;
        cpu = false;
        setScore1 = player1 + diceRoll();
        setScore2 = player2 + diceRoll;

        while (man = true);    // the game starts as user's turn. //
        do {
            // game starts, rules are displayed.
            System.out.println("Controls: R button = Roll       H button = hold.\n "
                    + "Rules: Roll = 1 the turn is lost Player is awarded zero points.\n"
                    + "      Roll = 2-6 The player may roll again or hold.       "
                    + "Hold = All points rolled are added to player score and the turn is over.");
            /* if the dice is a 1, player gets nothing. boolean values change the turns 
             setScore1 or setScore2 wll adjust the according players overall score.*/
            diceRoll();
            if (diceRoll == 1) {
                System.out.println("End of turn no points.");
                man = false;
                cpu = true;
            } else if (diceRoll != 1) {
                System.out.println("You scored: " + diceRoll); // shows score //
                setScore1();
                System.out.println("Roll again or hold? hint* presss r or h.");
                option = input.nextLine();
                // taken user input is used as controls. //
                if (input.equals('r')) {
                    diceRoll();
                    setScore1();
                    System.out.println("You scored: " + setScore1);
                }
                if (input.equals('h')) {
                    System.out.println("It is the cpu's turn.");
                    man = false;
                    cpu = true;
                }
                if (player1 >= win) {
                    System.out.println("You have beat the computer!!");
                }
            }
        } while (cpu == true);
        do {
            diceRoll();
            if (diceRoll == 1) {
                System.out.println("The cpu has rolled a 1 and the turn is over.");
                setScore2();
                cpu = false;
                man = true;
            }
            if (diceRoll != 1) {
                System.out.println("The cpu has rolled: " + diceRoll);
                setScore2();
                cpu = true;
                man = false;
            }
            if (player2 >= 20) {
                System.out.println("The computer has the lead.");
                setScore2();
                System.out.println("Player 2 has a score of: " + setScore2 + " The computer's turn is over.");
                cpu = false;
                man = true;
            }
            if (player2 >= win) {
                System.out.println("The computer has won.");
            }
        }
    } 
    // needs a method to roll the dice and return it.
    public int diceRoll(int diceRoll){
            Random roll = new Random();
            diceRoll = roll.nextInt(5) + 1;
        } return diceRoll;
}

/* 
 Program a game of pig between player and computer. A two player dice game to reach
 a score of 100 or more points. Players take turns rolling a single six-sided die.

 rules:

 if a player rolls a 1, that player gets no new points and it becomes the other players turn

 if player rolls 2-6 they can either
 roll again or hold
 if they hold the sum of all previous rolls starting with the first roll of 2-6,
 are added together and then to the score, switch turns.

 when it is player ones turn it should show the score and the previous rolls number.

 r = roll
 h = hold

 computer rules: 
 the computer should keep rolling until it has accumulated 20 or more points, then hold.
 if the computer wins or rolls 1, then the turn ends immediately.
 */
