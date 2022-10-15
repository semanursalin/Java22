
public class MiniProje1AsalSayi {

	public static void main(String[] args) {
		int number= 64;
		//int remainder= number%2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Asal degildir.");
			return; }
		if(number<1) {System.out.println("Gecersiz sayi girdiniz.");
		    return;
		}
		
		for(int i=2; i<number ; i++) { 
			if(number%i == 0) {
				isPrime = false ;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		}
		else System.out.println("Sayı asal degildir.");


	}

}
