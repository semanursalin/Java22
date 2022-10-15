package ReCapDemo1;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int sayi = 26 ;
		int sayi2 = 25;
		int sayi3 = 3;	
		int enBuyuk = sayi ;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En buyuk = "+enBuyuk);

	}

}
