//Programmer: Marissa Gonçalves
//Date: October 25, 2017
//Purpose: This program allows the user to play a slot-machine game and calculate the bet that has been won or lost.

//make sure that these packages are being used in the program
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

//make this program public and there is a class named SlotMachine.java
public class SlotMachine
{

    //create a method in order to input the bet needed
    public static double readDouble() 
            
    {
        
        //define a scanner
        Scanner keyboard = new Scanner(System.in);

        
        //initialize the invalid input to false, so that the correct input can continue the program
        boolean invalidInput = false;

        
        //create a do-while which the condition will determine whether it is true or false in the end
        do 
        {

            invalidInput = false;
            
            //print out the question which will repeat itself every time.
            System.out.println("Please enter a non-negative amount that ends with .0, .25, .50, or .75");
            System.out.print("How much would you like to bet (enter 0 to quit)? ");

            //determine the error if the input is not a double variable
            if (!keyboard.hasNextDouble()) 
            {
                String badInput = keyboard.nextLine();
                System.out.println("Error. " + badInput + " is not a number.");
                System.out.println();
                invalidInput = true;
            }

        } 
        while (invalidInput);

        
        //allow the user to input a double bet
        double x = keyboard.nextDouble();
        
        
        //return the method once the program already executes once
        return x;
        
      
    }

    public static void main(String[] args) 
    
    { //main
        
        //print out the instructions of the game
        System.out.println("Welcome to 3-Reel Slot Machine Game!");
        System.out.println("The bet amounts must be non-negative and end with .0, .25, .50, or .75");
        System.out.println("Each reel will randomly display on of the follwoing seven symbols:");
        System.out.println("     Orange, Cherry, Lime, Apple, Banana, Peach, Melon            ");
        System.out.println();

        System.out.println("There are four types of payouts:");
        System.out.println("1) Triple      : all 3 symbols must match.");
        System.out.println("2) Left Double : the left symbol must match either of the other two symbols.");
        System.out.println("3) Right Double: the center and the rightmost symbols match.");
        System.out.println("4) Zero        : none of the symbols match.");
        System.out.println();

        System.out.println("Get a triple to win 3 times your bet.");
        System.out.println("Get a left double to win 2 times your bet.");
        System.out.println("Get a right double to win 1 times your bet.");
        System.out.println("Otherwise, you lose your bet.");
        System.out.println();

        
        
        //allow the following numbers to be converted into currency format
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

       
        //initalize the variables to double values
        double betTotal = 0;
        double slotTotal = 0;
        double betTrack = 0;
        double bet;
        
        
        //create a while loop to repeat the readDouble() method 
        
        while (true) 
            
        { //while
            do 
            {
                bet = readDouble();
                
                //add all the inputs for every execution
                betTotal += bet;

                //when the bet is greater or equal to 0, there are some considerations to follow
                if (bet >= 0) 
                {
                    //make the bet a multiple of 25
                    int x = (int) (bet * 100);
                    if (x % 25 == 0) 
                    {
                        break;
                    } 
                    
                    //if the bet is not a multiple of 25, there must be an error
                    else 
                    {
                        System.out.println();
                        System.out.println("Sorry, your bet " + formatter.format(bet) + " does not end with .00, .25, .50 or .75");
                        System.out.println();
                    }

                } 
                
                //if the bet is entriely negative, then there is another error
                else 
                {
                    System.out.println();
                    System.out.println("Sorry, a negative input such as $" + bet + " makes no sense to me.");
                    System.out.println();
                }

            } 
            while (true);

            
            //when the bet is equal to 0, the loop is exits entriely
            if (bet == 0)
            {
                break;
            }

            
            //print out a message to demonstrate the reels spun
            System.out.println();
            System.out.println("Here is your spin of the reels...");
            System.out.println();

            
            //create a random object for the number of reels for every input
            Random rand1 = new Random();

            int low1 = 2;
            int high1 = 7;

            int randomReels = rand1.nextInt(high1 - low1 + 1) + low1;

            
            
            //repeat the reels until the random number of reels is being reached
            for (int reels = 1; reels <= randomReels; reels++) 
            {

                //create another random object for the choice of a fruit, according to their number
                Random rand2 = new Random();

                int low2 = 0;
                int high2 = 6;

                int randomNumber1 = rand2.nextInt(high2 - low2 + 1) + low2;
                
                
                //use a swtich statement to print the first fruit according to their number
                switch (randomNumber1) 
                {
                    case 0:
                        System.out.print("Orange     ");
                        break;
                    case 1:
                        System.out.print("Cherry     ");
                        break;
                    case 2:
                        System.out.print("Lime       ");
                        break;
                    case 3:
                        System.out.print("Apple      ");
                        break;
                    case 4:
                        System.out.print("Banana     ");
                        break;
                    case 5:
                        System.out.print("Peach      ");
                        break;
                    case 6:
                        System.out.print("Melon      ");
                        break;
                }
                
                //repeat the random number interval for the second number, which will be printed out as another random fruit
                int randomNumber2 = rand2.nextInt(high2 - low2 + 1) + low2;
                switch (randomNumber2) 
                {
                    case 0:
                        System.out.print("Orange     ");
                        break;
                    case 1:
                        System.out.print("Cherry     ");
                        break;
                    case 2:
                        System.out.print("Lime       ");
                        break;
                    case 3:
                        System.out.print("Apple      ");
                        break;
                    case 4:
                        System.out.print("Banana     ");
                        break;
                    case 5:
                        System.out.print("Peach      ");
                        break;
                    case 6:
                        System.out.print("Melon      ");
                        break;
                }

                //repeat the random number interval for the third number, which will be printed out as another random fruit
                int randomNumber3 = rand2.nextInt(high2 - low2 + 1) + low2;
                switch (randomNumber3) 
                {
                    case 0:
                        System.out.print("Orange     ");
                        break;
                    case 1:
                        System.out.print("Cherry     ");
                        break;
                    case 2:
                        System.out.print("Lime       ");
                        break;
                    case 3:
                        System.out.print("Apple      ");
                        break;
                    case 4:
                        System.out.print("Banana     ");
                        break;
                    case 5:
                        System.out.print("Peach      ");
                        break;
                    case 6:
                        System.out.print("Melon      ");
                        break;
                }

                //skip a line
                System.out.println();

            }

            //print out a specific number of dashes
            System.out.println("----------------------------");

            
            //once the for loop exits, the payline must use a random object to determine the final results
            Random rand2 = new Random();

            int low2 = 0;
            int high2 = 6;

            int randomNumber4 = rand2.nextInt(high2 - low2 + 1) + low2;
            
            //repeat the random number interval for the fourth number, which will be printed out as another random fruit
            switch (randomNumber4)
            {
                case 0:
                    System.out.print("Orange     ");
                    break;
                case 1:
                    System.out.print("Cherry     ");
                    break;
                case 2:
                    System.out.print("Lime       ");
                    break;
                case 3:
                    System.out.print("Apple      ");
                    break;
                case 4:
                    System.out.print("Banana     ");
                    break;
                case 5:
                    System.out.print("Peach      ");
                    break;
                case 6:
                    System.out.print("Melon      ");
                    break;
            }

            //repeat the random number interval for the fifth number, which will be printed out as another random fruit
            int randomNumber5 = rand2.nextInt(high2 - low2 + 1) + low2;
            switch (randomNumber5) 
            {
                case 0:
                    System.out.print("Orange     ");
                    break;
                case 1:
                    System.out.print("Cherry     ");
                    break;
                case 2:
                    System.out.print("Lime       ");
                    break;
                case 3:
                    System.out.print("Apple      ");
                    break;
                case 4:
                    System.out.print("Banana     ");
                    break;
                case 5:
                    System.out.print("Peach      ");
                    break;
                case 6:
                    System.out.print("Melon      ");
                    break;
            }

            //repeat the random number interval for the sixth number, which will be printed out as another random fruit
            int randomNumber6 = rand2.nextInt(high2 - low2 + 1) + low2;
            switch (randomNumber6) 
            {
                case 0:
                    System.out.print("Orange     ");
                    break;
                case 1:
                    System.out.print("Cherry     ");
                    break;
                case 2:
                    System.out.print("Lime       ");
                    break;
                case 3:
                    System.out.print("Apple      ");
                    break;
                case 4:
                    System.out.print("Banana     ");
                    break;
                case 5:
                    System.out.print("Peach      ");
                    break;
                case 6:
                    System.out.print("Melon      ");
                    break;
            }

            //skip a line
            System.out.println();

            
            
            //print out a specific number of dashes
            System.out.println("----------------------------");
            
            
            
            
            //for a right-double to occur, the second and third numbers must match
            if (randomNumber5 == randomNumber6 && randomNumber5 != randomNumber4) 
            {
                
                //calculate the right-double total and track the bet by adding the input from the previous value, according to the first or previous values

                double right_doubleTotal = bet * 1;
                betTrack += right_doubleTotal;
                slotTotal += right_doubleTotal;
                
                
                //print out the right-double total
                System.out.println("You got a right double - You win " + formatter.format(right_doubleTotal));

                
                //print the final bet value, whether it is either is negative, positive or zero with if-statements
                if (betTrack == 0)
                System.out.println("You're even.");
                  
                if (betTrack < 0)
                System.out.println("You're down " + formatter.format(betTrack));
        
                if (betTrack > 0)
                System.out.println("You're up " + formatter.format(betTrack));
                
                
               //skip a line
                System.out.println();
            }
            
            
            
           
            //for a triple to occur, all the numbers must match one another
            else if (randomNumber4 == randomNumber5 && randomNumber4 == randomNumber6) 
            {
                
                //calculate the triple total and track the bet by adding the input from the previous value, according to the first or previous values 

                double tripleTotal = bet * 3;
                betTrack += tripleTotal;
                slotTotal += tripleTotal;

                
                //print out the triple total
                System.out.println("You got a triple - You win " + formatter.format(tripleTotal));
                
                
                //print the final bet value, whether it is either is negative, positive or zero with if-statements
                if (betTrack == 0)
                System.out.println("You're even.");
                  
                if (betTrack < 0)
                System.out.println("You're down " + formatter.format(betTrack));
        
                if (betTrack > 0)
                System.out.println("You're up " + formatter.format(betTrack));
                
                
               //skip a line
                System.out.println();
            } 
           
            //for a left-double to occur, the first must match with the second or third number
            else if (randomNumber4 == randomNumber5 || randomNumber4 == randomNumber6) 
            {
                
                //calculate the left-double total and track the bet by adding the input from the previous value, according to the first or previous values
                
                double left_doubleTotal = bet * 2;
                betTrack += left_doubleTotal;
                slotTotal += left_doubleTotal;
                

                //print out the left-double total
                System.out.println("You got a left double - You win " + formatter.format(left_doubleTotal));
                
                
                //print the final bet value, whether it is either is negative, positive or zero with if-statements
                if (betTrack == 0)
                System.out.println("You're even.");
                  
                if (betTrack < 0)
                System.out.println("You're down " + formatter.format(betTrack));
        
                if (betTrack > 0)
                System.out.println("You're up " + formatter.format(betTrack));
                
                
                //skip a line
                System.out.println();
            } 
            
            //when the user loses his/her bet, all the numbers don't match whatsoever
            else if (randomNumber4 != randomNumber5 && randomNumber4 != randomNumber6) 
            {
                //calculate the tracking bet by subtracting the input from the previous value
                betTrack -= bet;
             
                //print that the bet has lost
                System.out.println("You lose your bet.");
                
                
                //print the final bet value, whether it is either is negative, positive or zero with if-statements
                if (betTrack == 0)
                System.out.println("You're even.");
                  
                if (betTrack < 0)
                System.out.println("You're down " + formatter.format(betTrack));
        
                if (betTrack > 0)
                System.out.println("You're up " + formatter.format(betTrack));
             
                
                //skip a line
                System.out.println();
            } 
            
        
            
        } // while
        
       
        //skip a line
        System.out.println();
        
        
        //print out the bet total and the slot total from all valid inputs
        System.out.println("Game Over.");
        System.out.println("You bet a total of " + formatter.format(betTotal));
        System.out.println("Slots paid out a total of " + formatter.format(slotTotal));
        
        
        //print out the final net loss, net win, or even statement according to the final bet tracking value
        if (betTrack == 0)
        System.out.println("You're even.");
                  
        if (betTrack < 0)
        System.out.println("Your net loss is " + formatter.format(betTrack));
        
        if (betTrack > 0)
        System.out.println("Your net win is " + formatter.format(betTrack));
        
        
    } // main 

}
