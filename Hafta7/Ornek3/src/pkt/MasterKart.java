package pkt;

public class MasterKart implements IKart {
	private Hesap hesap;
	private String sifre;
	
	public MasterKart(Hesap hesap, String sifre) {
		this.hesap = hesap;
		this.sifre = sifre;
	}
	
	@Override
	public boolean girisKontrol(String sifre) {
		return this.sifre == sifre;
	}

	@Override
	public IHesap getHesap() {
		return hesap;
	}

}
