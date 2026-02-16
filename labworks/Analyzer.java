package labworks;
import java.util.Scanner;

public class Analyzer {
 public static void main(String[] args) {
		
		Data data = new Data();
		String input = "";
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter your number,type q to quit : ");
			input = scanner.nextLine();
			try {
				if(input.equals("q")) break;
			    double dnum = Double.parseDouble(input);
			    data.Add(dnum);
			} catch (NumberFormatException e) {
			    System.err.println("Invalid str format: " + e.getMessage());
			}
		}



		System.out.println("Average: " + data.Average());
		System.out.println("Max: " + data.Max());
	}
	
}