package MiniProje5SayıBulma;

public class MiniProje5SayıBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,6,4,7,8,9};
		int aranacak=4;
		boolean varMi=false;
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayi bu dizide vardır.");
		}
		else System.out.println("Sayi bu dizide yoktur.");
	}

}
