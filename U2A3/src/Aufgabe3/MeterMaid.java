/**
 * 
 */
package Aufgabe3;

import java.util.Random;

/**
 * @author bruce
 *
 */
public class MeterMaid extends TransportAuthority
{
	public static void checkCar(String licensePlate)
	{
		checkString = licensePlate;
	}

	public static void fine()
	{
		Random generator = new Random();
		registerDelict(checkString, (generator.nextInt(90) + 10), generator.nextInt(3));
	}

	public static void printTicket()
	{
		System.out.println("\nSTRAFZETTEL:");
		System.out.println("\nFahrzeughalter:\t" + getOwner(checkString));
		System.out.println("Addresse:\t" + getAddress(checkString));
		System.out.println("Strafen:");

		String[] tmpString = TransportAuthority.getFees(checkString);
		double totalFees = 0.;
		for(int i = 0; tmpString[i] != null; ++i)
		{
			totalFees += Double.parseDouble(tmpString[i]);
			System.out.println("\t\t" + tmpString[i]);
		}
		System.out.println("Gesammt:\t" + totalFees);

		System.out.println("\nPunkte:");
		tmpString = TransportAuthority.getPoints(checkString);
		int totalPoints = 0;
		for(int i = 0; tmpString[i] != null; ++i)
		{
			totalPoints += Integer.parseInt(tmpString[i]);
			System.out.println("\t\t" + tmpString[i]);
		}
		System.out.println("Gesammt:\t" + totalPoints);
	}

	private static String checkString;
}
