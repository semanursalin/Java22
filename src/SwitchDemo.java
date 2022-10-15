
public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		 
		switch (grade) {
			case 'A': 
				System.out.println("geçtinnn");
				break;
			case 'B':
			case 'C':
				System.out.println("orta derecede geçtin");
				break;
			case 'D':
				System.out.println("geçtin iştee");
			case 'F':
				System.out.println("tebrikler kaldın");
				break;
				default:
					System.out.println("Geçersiz not girdiniz!!");


	}

}
}
