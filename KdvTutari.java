import java.util.Scanner;
public class KdvTutari {

	public static void main(String[] args) {
		double kdvOrani1000alti = 0.18, kdvOrani1000ustu = 0.08, tutar, kdvliTutar, kdvTutar;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ürün Fiyatýný Giriniz: ");
		tutar = input.nextDouble();
		
		if (tutar >= 1000) {
			kdvTutar = tutar * kdvOrani1000ustu;
			kdvliTutar = tutar+kdvTutar;
			System.out.println("Kdv'siz Tutar: "+tutar);
			System.out.println("Kdv Oraný: "+kdvOrani1000ustu);
			System.out.println("Kdv Tutarý: "+ kdvTutar);
			System.out.println("Kdv'li Toplam Fiyat: "+ kdvliTutar);
		}
		else if (tutar < 0) {
			System.out.println("Yanlýþ fiyat giriþi yapýldý.");
		}
		else {
			kdvTutar = tutar * kdvOrani1000alti;
			kdvliTutar = tutar+kdvTutar;
			System.out.println("Kdv'siz Tutar: "+tutar);
			System.out.println("Kdv Oraný: "+kdvOrani1000alti);
			System.out.println("Kdv Tutarý: "+ kdvTutar);
			System.out.println("Kdv'li Toplam Fiyat: "+ kdvliTutar);
		}
		input.close();
	}

}
