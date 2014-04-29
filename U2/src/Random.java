public class Random {

	public static int quersumme(int zahl){
		int rest, summe = 0;

		while(zahl != 0) 
		{ 
		  rest = zahl % 10; 
		  summe += rest; 
		  zahl = zahl / 10; 
		}
		return summe;
	}


	public static void binary(int z){
		int rest;
		for(int i = 32; i >= 0; i--){
			rest = z % (int)Math.pow(2, i);
			if(rest == z){
				System.out.print("0");
			}
			else{
				System.out.print("1");
				z = rest;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intV = (int) (Math.random() * 999 + 1);
		System.out.println(intV);
		System.out.println(quersumme(intV));
		binary(intV);
	}

}