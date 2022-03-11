package valuefunc;

public class Program {
	public static double ortalama(double... sayi) {
		double toplam=0;
		for(int i=0;i<sayi.length;i++) {
			toplam += sayi[i];
		}
		return toplam/sayi.length;
	}
	public static void main(String[] args) {
		System.out.println("{25 30 9 12} sayılarının ortalaması: "+ortalama(25,30,9,12));
		System.out.println("{5 8} sayılarının ortalaması: "+ortalama(5,8));
		System.out.println("{1 19 6 30 24 89 33} sayılarının ortalaması: "+ortalama(1,19,6,30,24,89,33));
	}
}
