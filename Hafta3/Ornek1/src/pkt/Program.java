package pkt;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double vizeNotu, finalNotu;
		System.out.print("Vize: ");
		vizeNotu = in.nextDouble();
		System.out.print("Final: ");
		finalNotu = in.nextDouble();
		
		double sonuc = vizeNotu*0.4 + finalNotu*0.6;
		System.out.println("Sonuç: "+sonuc);
		if(sonuc < 50) System.out.print("Başrısız: ");
		else System.out.print("Başarılı :");
		
		System.out.println(hesapla(sonuc));
	}
	
	public static HarfNotu hesapla(double sonuc) {
		if(sonuc < 40) return HarfNotu.FF;
		else if(sonuc < 50) return HarfNotu.FD;
		else if(sonuc < 60) return HarfNotu.DD;
		else if(sonuc < 65) return HarfNotu.DC;
		else if(sonuc < 70) return HarfNotu.CC;
		else if(sonuc < 75) return HarfNotu.CB;
		else if(sonuc < 80) return HarfNotu.BB;
		else if(sonuc < 90) return HarfNotu.BA;
		else return HarfNotu.AA;
	}

}
