package pkt;

public class Hesap {
	public int faktoriyel(int deger) {
		if(deger < 2) return deger;
		return deger*faktoriyel(deger-1);
	}
	public int fibonacci(int deger) {
		if(deger <= 2) return 1;
		
		return fibonacci(deger-1) + fibonacci(deger-2);
	}
}
