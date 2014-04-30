
public class Act {

	public static void main(String[] args) {
		TransportAuthority.registerCar("BN-MM 42", "Max Mustermann", "Musterstrasse 42, 101010 Musterstadt");
		TransportAuthority.registerCar("BN-DD 42", "Donald Duck", "Geldspeicher 1, 12345 Entenhausen");
		MeterMaid.checkCar("BN-MM 42");
		MeterMaid.fine();
		MeterMaid.fine();
		MeterMaid.fine();
		MeterMaid.printTicket();
		MeterMaid.checkCar("BN-DD 42");
		MeterMaid.fine();
		MeterMaid.printTicket();
	}	

}
