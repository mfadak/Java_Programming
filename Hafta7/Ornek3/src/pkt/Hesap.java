package pkt;

import java.util.UUID;

public class Hesap implements IHesap {
	private String no;
	private double bakiye;
	
	public Hesap()
	{
		this.no = UUID.randomUUID().toString();
		bakiye = 0;
	}
	
	@Override
	public String getNo() {
		return no;
	}

	@Override
	public boolean paraCek(double miktar) {
		if(miktar <= 0 || miktar > bakiye) return false;
		bakiye -= miktar;
		return true;
	}

	@Override
	public boolean paraYatir(double miktar) {
		if(miktar <= 0) return false;
		bakiye += miktar;
		return true;
	}

	@Override
	public double getBakiye() {
		return bakiye;
	}
	
	@Override
	public String toString() {
		return "Hesap No: " + no + "\nBakiye: " + bakiye;
	}

}
