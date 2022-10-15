
public class StringsDemo {

	public static void main(String[] args) {
		String mesaj=" Bugün beni cok bıktıyorlar. ";
		System.out.println(mesaj);
		
		
		System.out.println("Eleman sayisi="+mesaj.length()); //kac karaktere sahip oldugunu soyler 
		System.out.println("5.Eleman ="+mesaj.charAt(4));    
		System.out.println(mesaj.concat("Yetherrrr!!!"));  //stringleri birleştirmek
		System.out.println(mesaj.startsWith("B"));    // string ne ile basşlıyor 
		System.out.println(mesaj.startsWith("."));
		System.out.println(mesaj.endsWith("."));
		char [] karakterler=new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); //kacıncı karakterim a (ilk buldugunu gösterir)
		System.out.println(mesaj.lastIndexOf('e'));
		
		System.out.println(mesaj.replace('u', 'o'));
		System.out.println(mesaj);
		
		System.out.println(mesaj.substring(2, 8));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);	
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		


	}

}
