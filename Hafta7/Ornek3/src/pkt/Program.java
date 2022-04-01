package pkt;

public class Program {
	public static void main(String[] args) {
		Hesap bankaHesabi = new Hesap();
		Kart bankaKarti = new Kart(bankaHesabi, "123456");
		Hesap baskaHesap = new Hesap();
		MasterKart masterKart = new MasterKart(baskaHesap, "777777");
		
		Atm atm = new Atm();
		if(atm.paraYatir(bankaKarti, "123456", 500)) System.out.println("Başarılı");
		else System.out.println("Hata");
		
		if(atm.paraYatir(masterKart, "777777", 750)) System.out.println("Başarılı");
		else System.out.println("Hata");
		
		System.out.println();
		System.out.println(bankaHesabi);
		System.out.println();
		System.out.println(baskaHesap);
		
	}
}
