package test;

import java.math.*;
import java.util.Random;
public class Die {
    // Class variables
    private int die1;
    private int die2;

    // Die object containing two values representing the each die
    public Die (){
        setDie();

    }

    // Method that rolls the two die linked to the die object
    public void setDie() {
        double eyes1 = 1 + (Math.random()*(6));
        this.die1 = (int) eyes1;
        double eyes2 = 1 + (Math.random()*(6));
        this.die2 = (int) eyes2;
    }

    // Method to set the two die values in the die object
    // This method is not to be used if a fair game is to be had
    public void setDieManually(int dieOne, int dieTwo) {
        this.die1 = dieOne;
        this.die2 = dieTwo;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public boolean getEns() {
        if (die1 == die2) {
            return true;

        }else {
            return false;
        }
    }

    public int getSum() {
        return die1+die2;
    }




}
