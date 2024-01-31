package studio2;
import java.util.Scanner;
public class Ruin{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your start amount?");
		int startAmount = scan.nextInt();
		System.out.println("what is your win chance?");
		double winChance =  scan.nextDouble();
		System.out.println("what is your win limit?");
		int winLimit =  scan.nextInt();
		int totalSimulations = 5;
		int playsWon = 0;
		int playsLost = 0;
		int totalPlays;
		int day = 0;
		

	while (totalSimulations <= 5) {
		while (startAmount > 0 && startAmount != winLimit) {
			double chance = Math.random();
			
			if (winChance >= chance) {
				startAmount++; 
				playsWon ++;
				if (startAmount == winLimit)
				{
				totalPlays = playsWon + playsLost;
				day++;
				System.out.println("day " + day + " you played " + totalPlays + " plays, and the day was a success" );
				totalSimulations--;
				}
			}
			else {
				startAmount--;
				playsLost ++;
				if (startAmount == 0)
				{ 
					
					totalPlays = playsWon + playsLost;
					day++;
					System.out.println("day " + day + " you played " + totalPlays + " plays, and the day was a ruin" );
					totalSimulations--;
					}
				
				}
			}
		}
		
	}
}
