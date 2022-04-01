package pkt;

public interface IHesap {
	public String getNo();
	public boolean paraCek(double miktar);
	public boolean paraYatir(double miktar);
	public double getBakiye();
}
