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
	public void checkCar(String licensePlate)
	{
		registered = getOwner(licensePlate).equals("Fahrzeughalter nicht gefunden");

		if(!(registered))
			checkString = licensePlate;
		else
			System.out.println("Fahrzeughalter nicht gefunden");
	}

	public void fine()
	{
		if(!(registered))
		{
			Random generator = new Random();
			registerDelict(checkString, (generator.nextInt(90) + 10), generator.nextInt(3));
		} else
			System.out.println("Fahrzeug nicht definiert");
	}

	public void printTicket()
	{
		if(!(registered))
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
		} else
			System.out.println("Fahrzeug nicht definiert");
	}

	private String checkString;
	private boolean registered;
}
