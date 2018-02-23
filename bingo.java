import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;


public class Bingo {

	public static void main(String[] args) {
		Random r= new Random ();
		Scanner odczyt= new Scanner (System.in);
		Set <int> set= new HashSet <int>();
				
		while(true) {
			int number= r.nextInt(75)+1;
			set.add(number);
			String bingo;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Wylosowana liczba:\n"  + number); // system podaje wylosowan¹ liczbê
		{
		System.out.println("Czy jest Bingo ?!?!"); // Sprawdzamy czy ktoœ ma bingo. Wpisujemy w konsoli nie (system dalej dzia³a) lub tak (przerywamy losowanie)
		bingo= odczyt.nextLine();
		System.out.println();
		if ("tak".equals(bingo)) {
			break;
					
			}
		  }
		}
	}
}
