package test;

public class Test {
    // This test checks whether there is a normal distribution for the sum of two dice rolls and the individual percentile
    // possibility of each type of dice roll and possibility of getting to two identical dice when rolling two dice.
    public static void main(String[] args) {

        //Creating the necessary variables
        double counter = 0;
        Die die1 = new Die();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int ens = 0;

        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;
        int sum9 = 0;
        int sum10 = 0;
        int sum11 = 0;
        int sum12 = 0;


        while(counter<10000000) {
            // Simple way of registering each value
            // if to shorten the code one could have used a for loop and an array

            die1.setDie();
            if(die1.getDie1() == 1) {
                one++;
            }else if(die1.getDie1() == 2) {
                two++;
            }else if(die1.getDie1() == 3) {
                three++;
            }else if(die1.getDie1() == 4) {
                four++;
            }else if(die1.getDie1() == 5) {
                five++;
            }else if(die1.getDie1() == 6) {
                six++;
            }

            if(die1.getDie2() == 1) {
                one++;
            }else if(die1.getDie2() == 2) {
                two++;
            }else if(die1.getDie2() == 3) {
                three++;
            }else if(die1.getDie2() == 4) {
                four++;
            }else if(die1.getDie2() == 5) {
                five++;
            }else if(die1.getDie2() == 6) {
                six++;
            }

            if(die1.getEns()) {
                ens++;
            }


            if(die1.getSum() == 2) {
                sum2++;
            }else if(die1.getSum() == 3) {
                sum3++;
            }else if(die1.getSum() == 4) {
                sum4++;
            }else if(die1.getSum() == 5) {
                sum5++;
            }else if(die1.getSum() == 6) {
                sum6++;
            }else if(die1.getSum() == 7) {
                sum7++;
            }else if(die1.getSum() == 8) {
                sum8++;
            }else if(die1.getSum() == 9) {
                sum9++;
            }else if(die1.getSum() == 10) {
                sum10++;
            }else if(die1.getSum() == 11) {
                sum11++;
            }else if(die1.getSum() == 12) {
                sum12++;
            }



            counter++;
        }

        //The following is to make the data available in the prompt
        System.out.println("The following test ran for "+counter+"iterations.\nFollowing amounts are in percentile.");
        counter = counter*2;
        System.out.println("Amount of ones: "+one/counter+"\nAmount of two's: "+two/counter+"\nAmount of three's: "+three/counter);
        System.out.println("Amount of four's: "+four/counter+"\nAmount of five's: "+five/counter+"\nAmount of six's: "+six/counter);
        System.out.println("Amount of dice throws, where the two dice were identical: "+ens/counter);
        counter = counter/2;
        System.out.println("\n\nThe following are the percentile value for each of the possible sums for two dice rolls.");
        System.out.println("Dice sum equals 2: "+sum2/counter);
        System.out.println("Dice sum equals 3: "+sum3/counter);
        System.out.println("Dice sum equals 4: "+sum4/counter);
        System.out.println("Dice sum equals 5: "+sum5/counter);
        System.out.println("Dice sum equals 6: "+sum6/counter);
        System.out.println("Dice sum equals 7: "+sum7/counter);
        System.out.println("Dice sum equals 8: "+sum8/counter);
        System.out.println("Dice sum equals 9: "+sum9/counter);
        System.out.println("Dice sum equals 10: "+sum10/counter);
        System.out.println("Dice sum equals 11: "+sum11/counter);
        System.out.println("Dice sum equals 12: "+sum12/counter);
    }

}