package pkt;

public class Program {
	public static void degistir(Ogrenci o1) {
		o1 = new Ogrenci("Mehmet");
	}
	public static void dolayliDegistir(Ogrenci o1) {
		o1.isim = "Mehmet";
	}
	public static void main(String[] args) {
		Ogrenci ogr = new Ogrenci("Ahmet");
		degistir(ogr);
		System.out.println(ogr.isim);
		dolayliDegistir(ogr);
		System.out.println(ogr.isim);
	}
}
