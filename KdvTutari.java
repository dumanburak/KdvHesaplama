import java.util.Scanner;
public class KdvTutari {

	public static void main(String[] args) {
		double kdvOrani1000alti = 0.18, kdvOrani1000ustu = 0.08, tutar, kdvliTutar, kdvTutar;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�r�n Fiyat�n� Giriniz: ");
		tutar = input.nextDouble();
		
		if (tutar >= 1000) {
			kdvTutar = tutar * kdvOrani1000ustu;
			kdvliTutar = tutar+kdvTutar;
			System.out.println("Kdv'siz Tutar: "+tutar);
			System.out.println("Kdv Oran�: "+kdvOrani1000ustu);
			System.out.println("Kdv Tutar�: "+ kdvTutar);
			System.out.println("Kdv'li Toplam Fiyat: "+ kdvliTutar);
		}
		else if (tutar < 0) {
			System.out.println("Yanl�� fiyat giri�i yap�ld�.");
		}
		else {
			kdvTutar = tutar * kdvOrani1000alti;
			kdvliTutar = tutar+kdvTutar;
			System.out.println("Kdv'siz Tutar: "+tutar);
			System.out.println("Kdv Oran�: "+kdvOrani1000alti);
			System.out.println("Kdv Tutar�: "+ kdvTutar);
			System.out.println("Kdv'li Toplam Fiyat: "+ kdvliTutar);
		}
		input.close();
	}

}
