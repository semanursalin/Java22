package MiniProje3MükemmelSayi;

public class MiniProje3MükemmelSayılar {

	public static void main(String[] args) {
		//Mükemmel sayı: Kendinden başka pozitif tam bölenlerinin toplamı kendisine eşit olan sayıdır
				// 6  1+2+3
				
				int number = 6;
				int mük=0;
				for(int i=1; i<number; i++)
				{
					if(number%i == 0) {
						mük= mük + i;
					}
					 
				}
				if (mük == number) {System.out.println("Mükemmel sayidir.");}
				else {System.out.println("Mükemmel sayi değildir.");}


	}

}
