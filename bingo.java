import java.util.Scanner;
import java.util.Random;


public class Bingo {

	public static void main(String[] args) {
		Random r= new Random ();
		Scanner odczyt= new Scanner (System.in);
		
		
		while(true) {
			int number= r.nextInt(75)+1;
			String bingo;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Wylosowana liczba:\n"  + number);
		{
		System.out.println("Czy jest Bingo ?!?!");
		bingo= odczyt.nextLine();
		System.out.println();
		if ("tak".equals(bingo)) {
			break;
					
		}
		

		
		  }
		}
		}
	
}