
public class act {

	public static void main(String[] args) {
		TransportAuthority.registerCar("BN-MM 42", "Max Mustermann", "Musterstrasse 42, 101010 Musterstadt");
		MeterMaid.checkCar("BN-MM 42");
		MeterMaid.fine();
		MeterMaid.fine();
		MeterMaid.fine();
		MeterMaid.printTicket();
	}

}
