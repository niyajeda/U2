public class TransportAuthority {
	private static String[] licensePlateList = new String[1000];
	private static String[] ownerList = new String[1000];
	private static String[] addressList = new String[1000];
	private static int numberofMembers = 0;

	private static double[][] feeList = new double[1000][500];
	private static int[][] pointList = new int[1000][500];

	public static void registerCar(String licensePlate, String owner, String address) {
		licensePlateList[numberofMembers] = licensePlate;
		ownerList[numberofMembers] = owner;
		addressList[numberofMembers] = address;
		numberofMembers++;
	}

	public static String getOwner(String licensePlate){
		for(int i = 0; i <= 999; i++){
			if(licensePlate.equals(licensePlateList[i])) return ownerList[i];
		}
		return null;
	}
	
	public static String getAddress(String licensePlate){
		for(int i = 0; i <= 999; i++){
			if(licensePlate.equals(licensePlateList[i])) return addressList[i];
		}
		return null;
	}
	
	public static double[] getFees(String licensePlate){
		double[] fees = new double[500];
		for(int i = 0; i <= 999; i++){
			if(licensePlate.equals(licensePlateList[i])){
				for(int j=0; j <= 499; j++){
					fees[j] = feeList[i][j];
				}
			}
		}
		return fees;
	}
	
	public static int[] getPoints(String licensePlate){
		int[] points = new int[500];
		for(int i = 0; i <= 999; i++){
			if(licensePlate.equals(licensePlateList[i])){
				for(int j=0; j <= 499; j++){
					points[j] = pointList[i][j];
				}
			}
		}
		return points;
	}

	public static void registerDelict(String licensePlate, double fee, int points){
		int i;
		for(i = 0; i <= 999; i++){
			if(licensePlate.equals(licensePlateList[i])) break;
		}
		for(int j = 0; j <= 499; j++){
			if(feeList[i][j] == 0){
				feeList[i][j] = fee;
				pointList[i][j] = points;
				break;
			}
		}
	}
}