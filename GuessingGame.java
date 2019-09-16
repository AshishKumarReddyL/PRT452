import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args ) {

		Random rand=new Random();
		int secretNumber = rand.nextInt(100);
		int tries = 0;
		System.out.println("Secret number is " + secretNumber);
       
        Scanner keyboard = new Scanner(System.in);

        int guess = 0;
      
		do {

              System.out.print("Enter a guess (1-100): or q to quit ");
             
              String quit =keyboard.nextLine();
              
              if(quit.equalsIgnoreCase("q")) {
            	  System.out.println("thank you");
              	break;
              }
             
               else  
			  
            	   tries++;
            	   guess = keyboard.nextInt();
            	   if (guess == secretNumber)
                   {
                	   System.out.println("Your guess is correct.");
                       System.out.println("It took you "+ tries + " tries.");
                       break;
                   

			  }

           } 
		    while (true);
			keyboard.close();
		
		}

	}


