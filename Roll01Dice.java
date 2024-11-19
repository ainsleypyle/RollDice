/**
 * Number fun project
 *
 * 
 * @author Ainsley Pyle
 *
 * Created at     : 2023-09-25 12:02:26 
 * Last modified  : 2023-09-25 13:11:59
 */

import java.util.Random;

public class Roll01Dice {
     //Method for rolling the dice using a random number generator
    private static void rollDice(int[] dice){
    Random randomEngine = new Random();
    for (int i = 0; i < dice.length; ++i){
        dice[i]=randomEngine.nextInt(6)+1;
    }
}


    //Method for raising dice 0 to power of dice 1
    private static double raiseToPower(int[] dice){
            double rtn;
            rtn = Math.pow((double)dice[0], (double)dice[1]);
            return rtn;
    }

    //Method for finding the square root of both values 
    private static double[] squareRoot (int[] dice){
        double[] roots = new double[dice.length];
        for(int i=0; i < dice.length; i++) {
            roots[i] = Math.sqrt((double)dice[i]);
        }
        return roots;
    }

    //Method for finding the ceiling of the roots
    private static double[] rootCeiling(double[] roots){
        double[] ceilings = new double[roots.length];
        for (int i=0; i < roots.length; i++){
            ceilings[i] = Math.ceil(roots[i]);
        }
        return ceilings;
    }
    //Main
    public static void main (String [] args){
        int[] dice = new int[2];
        rollDice(dice);
        System.out.println ("The dice are "+ dice[0]+ " and "+dice[1]+".");
        double powValue = raiseToPower(dice);
        double[] roots = squareRoot(dice);
        double[] ceilings = rootCeiling(roots);
        System.out.println("The value of d1 raised to the power of d2 is "+ powValue+".");
        System.out.println("The square roots are " +roots[0]+" for dice 1 and "+roots[1]+" for dice 2.");
        System.out.println("The ceilings of the roots are "+ ceilings[0]+" and "+ceilings[1]+".");
    }
}



