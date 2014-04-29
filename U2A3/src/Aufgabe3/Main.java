/**
 * 
 */
package Aufgabe3;

/**
 * @author bruce
 *
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		TransportAuthority.registerCar("B22", "niklas", "köln");

		MeterMaid.checkCar("B22");

		MeterMaid.fine();
		MeterMaid.fine();
		MeterMaid.fine();

		MeterMaid.printTicket();
	}

}
