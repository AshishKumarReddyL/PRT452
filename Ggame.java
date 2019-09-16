import java.util.Random;
import java.util.Scanner;

public class Ggame {
	public static void main(String[] args) {
		Random r = new Random();
		int tries = 0;
		int secretNumber = r.nextInt((100 - 1) + 1) + 1;
		System.out.println("Secret number is " + secretNumber);
		
		Scanner input = new Scanner(System.in);
		String number = "";
		
		boolean check = false;
		do {
			
			System.out.print("Enter Guess Number between 1 -100 or press q to quit ");
			try {
				number = input.next();
				if(number.equals("q"))
				{
					check = false;
				}
				else
				{
					if(secretNumber == Integer.parseInt(number))
						check = false;
					else
						check = true;
					tries = tries + 1;
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error: "+ex.getMessage());
			}
		}while(check);
		input.close();
		
		System.out.println("Number of Attempts taken: "+tries);
		
	}
}

