package pkt;

public class Atm {
	public boolean paraCek(IKart kart,String sifre, double miktar) {
		if(!kart.girisKontrol(sifre)) return false;
		return kart.getHesap().paraCek(miktar);
	}
	
	public boolean paraYatir(IKart kart,String sifre, double miktar) {
		if(!kart.girisKontrol(sifre)) return false;
		return kart.getHesap().paraYatir(miktar);
	}
}
