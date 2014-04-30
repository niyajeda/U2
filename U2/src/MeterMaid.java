public class MeterMaid {
	
	public static String car;

	public static void checkCar(String licensePlate){
		car = licensePlate;
	}
	
	public static void fine(){
		TransportAuthority.registerDelict(car, (new java.util.Random().nextInt(90))+10, (new java.util.Random().nextInt(3)));
	}
	
	public static void printTicket(){
		System.out.println(TransportAuthority.getOwner(car) + "\n" + TransportAuthority.getAddress(car) + "\nRegistrierte Strafen:");
		for(int i = 0; i <= 499; i++){
			if(TransportAuthority.getFees(car)[i] != 0){
				System.out.println(TransportAuthority.getFees(car)[i] + " Euro und " + TransportAuthority.getPoints(car)[i] + " Punkte");
			}
		}
	}
}
