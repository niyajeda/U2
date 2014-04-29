/**
 * 
 */
package Aufgabe3;

/**
 * @author bruce
 *
 */
public class TransportAuthority
{
	final public static boolean TEST = false;

	final static int MAX = 1000;
	final static int MAXDL = 500;

	public static void registerCar(String licensePlate, String owner, String address)
	{
		if(++id <= MAX)
		{
			licensePlateList[id] = licensePlate;
			ownerList[id] = owner;
			addressList[id] = address;
			if(TEST)
				System.out.println("Eintrag erstellt.");
		} else
			System.out.println("Sie haben " + MAX + " Einträge überschritten.");
	}

	public static void registerDelict(String licensPlate, double fee, int points)
	{
		int count = getId(licensPlate);

		if((count > 0) && (idFee < MAXDL))
		{
			feeList[count][idFee] = Double.toString(fee);
			pointsList[count][idFee++] = Integer.toString(points);
			if(TEST)
				System.out.println("Delikt eingetragen.");
		} else if(count < 0)
		{
			System.out.println("Fahrzeughalter nicht gefunden.");
		} else
			System.out.println("Deliktanzahl überschritten");
	}

	public static String getOwner(String licensePlate)
	{
		int count = id;
		boolean found = false;
		while((count > 0) && (!found))
			found = licensePlateList[count--].equals(licensePlate);
		return found ? ownerList[++count] : "Fahrzeughalter nicht gefunden";
	}

	public static String getAddress(String licensePlate)
	{
		int count = id;
		boolean found = false;
		while((count > 0) && (!found))
			found = licensePlateList[count--].equals(licensePlate);
		return found ? addressList[++count] : "Fahrzeughalter nicht gefunden";
	}

	public static int getId(String licensePlate)
	{
		int count = id;
		boolean found = false;
		while((count > 0) && (!found))
			found = licensePlateList[count--].equals(licensePlate);
		return found ? ++count : -1;
	}

	public static String[] getFees(String licensePlate)
	{
		int count = getId(licensePlate);

		if(count > 0)
			return feeList[count];
		else
			return null;
	}

	public static String[] getPoints(String licensePlate)
	{
		int count = getId(licensePlate);

		if(count > 0)
			return pointsList[count];
		else
			return null;
	}

	private static int id = 0;
	private static int idFee = 0; // als 2.dim array
	private static String[] licensePlateList = new String[MAX];
	private static String[] ownerList = new String[MAX];
	private static String[] addressList = new String[MAX];
	private static String[][] feeList = new String[MAX][MAXDL];
	private static String[][] pointsList = new String[MAX][MAXDL];

}
