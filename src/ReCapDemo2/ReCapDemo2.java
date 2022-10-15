package ReCapDemo2;

public class ReCapDemo2 {

	public static void main(String[] args) {

		double[] myList = {1.2,1.3,4.3,5.6,6.23,7.5,6,0};
		double total=0;
		double max = myList[0];
		double min = myList[2];
		for (double number:myList) {
			if (max<number) {
				max = number;	
			}
			if (min>number) {
				min =number;			
			}
			
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = "+ total);
		System.out.println("En buyuk = "+ max);
		System.out.println("En kucuk = "+ min);


	}

}
