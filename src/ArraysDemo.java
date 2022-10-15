
public class ArraysDemo {

	public static void main(String[] args) {
		//
		String ogrenci1 = "Semanur";
		String ogrenci2 = "Duru";
		String ogrenci3 = "İpek";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("++++++++++++++++++++++");
		
		String[] ogrenciler = new String[5]; //kac elemandan olusacagı
		ogrenciler[0] ="Semanur";
		ogrenciler[1] ="Duru";
		ogrenciler[2] ="İpek";
		ogrenciler[3] ="Fevzullah";
		ogrenciler[4] ="İpek";
		
		// ogrenciler.length = ogrencileerin elemen sayisi
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			}
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
	}

}
}
