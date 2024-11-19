# RollDice
Rolling Dice generator with different mathematic functionalities
Description:
The Roll01Dice program simulates the rolling of two dice, performs some mathematical operations on the values rolled, and then displays the results. The key operations include raising one die value to the power of another, finding the square roots of both die values, and then calculating the ceilings of those square roots. The program is a fun exploration of random number generation and mathematical functions in Java.

Features:

Roll Two Dice: The program generates two random integers between 1 and 6 to simulate rolling two six-sided dice.

Raise Die 1 to the Power of Die 2: The value of the first die is raised to the power of the second die (i.e., d1 ^ d2).

Square Roots of Dice: It calculates the square root of each die value (i.e., √d1 and √d2).

Ceilings of the Square Roots: The program finds the ceiling of the square roots of the dice (i.e., the smallest integer greater than or equal to each square root).

Methods:
1. rollDice(int[] dice)
Purpose: Rolls two dice and assigns the values to the provided array.
Parameters: A 2-element integer array (dice) to hold the rolled values.
Returns: Nothing. The dice array is modified directly.
2. raiseToPower(int[] dice)
Purpose: Raises the value of the first die to the power of the second die (i.e., dice[0] ^ dice[1]).
Parameters: An array of integers representing the dice rolls.
Returns: The result of raising dice[0] to the power of dice[1] (as a double).
3. squareRoot(int[] dice)
Purpose: Computes the square root of each die value.
Parameters: An array of integers representing the dice rolls.
Returns: An array of doubles, each holding the square root of the corresponding die value.
4. rootCeiling(double[] roots)
Purpose: Computes the ceiling of each square root (i.e., rounds up to the nearest integer).
Parameters: An array of doubles representing the square roots of the dice values.
Returns: An array of doubles representing the ceiling of each square root.


How to Run:

Clone the repository or download the Java file.
Open the file in your preferred Java IDE or text editor.
Compile and run the Roll01Dice class. The program will simulate the rolling of the dice and display the results.
Requirements:
Java 8 or higher
A Java IDE or compiler for running the program

Author
Ainsley Pyle

Created on: September 25, 2023
