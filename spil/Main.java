package spil;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        // Creating the necessary variables for 2 players
        int sum1 = 0;
        int sum2 = 0;
        int abort = 0;
        Die die1 = new Die();
        Die die2 = new Die();
        int menuOption = -1;

        System.out.println("Welcome to the Dice game.\nThis is two person a multiplayer game.");
        System.out.println("When asked to enter something, please only enter integers.\n\n");

        // The following while loop will run until one of the players have a sum of 40 points
        while((sum1<40) && (sum2<40)) {
            menuOption = -1;

            //Menu for the first player, they'll press 1 to start or 0 to abort
            while(menuOption != 0) {
                System.out.println("The first players turn.\nPress 1 followed by enter to roll the dice.");
                System.out.println("You can end the game by pressing 0 followed by enter.");
                try {
                    while(menuOption != 1) {
                        menuOption = console.nextInt();

                        if(menuOption == 0) {
                            System.out.println("The game is shut down. Player 1 gave in.");
                            break;
                        }
                        if(menuOption != 1) {
                            System.out.println("You did not press 0 or 1 followed by enter try again.");
                        }

                    }


                }catch(Exception e) {
                    System.out.println("An error has occured.\nSystem is shuting down.\nSucks to be you huh.");
                    abort = 1;
                    break;
                }

                if(menuOption == 0 || abort == 1) {
                    break;
                }



                // If they choose one to throw the dice the following dice throw is then run and their player sum is updated
                long startTime = System.nanoTime();
                die1.setDie();
                System.out.println("The First player rolled a "+die1.getDie1()+" and a "+die1.getDie2());
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Time in miliseconds it took to show the dice: "+elapsedTime/1000000.0);
                System.out.println("Value of sum1: "+sum1);
                sum1 =sum1 + die1.getSum();
                System.out.println("New value of sum1: "+sum1+"\n\n");
                break;


            }

            if (menuOption == 0 || abort == 1) {
                break;
            }

            if (sum1>=40) {
                System.out.println("The first player have won. Congrats!!");
                break;
            }



            menuOption = -1;

            //Menu for the second player, they'll press 1 to start or 0 to abort
            while(menuOption != 0) {
                System.out.println("The second players turn.\nPress 1 followed by enter to roll the dice.");
                System.out.println("You can end the game by pressing 0 followed by enter.");
                try {
                    while(menuOption != 1) {
                        menuOption = console.nextInt();

                        if(menuOption == 0) {
                            System.out.println("The game is shut down. Player 2 gave in.");
                            break;
                        }
                        if(menuOption != 1) {
                            System.out.println("You did not press 0 or 1 followed by enter try again.");
                        }

                    }


                }catch(Exception e) {
                    System.out.println("An error has occured.\nSystem is shuting down.\nSucks to be you huh.");
                    abort = 1;
                    break;
                }

                if(menuOption == 0 || abort == 1) {
                    break;
                }

                // If they choose one to throw the dice the following dice throw is then run and their player sum is updated
                long startTime = System.nanoTime();
                die2.setDie();
                System.out.println("The Second player rolled a "+die2.getDie1()+" and a "+die2.getDie2());
                long elapsedTime = System.nanoTime() - startTime;
                System.out.println("Time in miliseconds it took to show the dice: "+elapsedTime/1000000.0);
                System.out.println("Value of sum2: "+sum2);
                sum2 =sum2 + die2.getSum();
                System.out.println("New value of sum2: "+sum2+"\n\n");
                break;


            }

            if (menuOption == 0 || abort == 1) {
                break;
            }



            if (sum2>=40) {
                System.out.println("The second player have won. Congrats!!");
            }
        }
        console.close();
    }
}








//Hvad kalder man to gifte får? et fårhold