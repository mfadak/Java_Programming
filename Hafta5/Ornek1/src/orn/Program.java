package orn;

public class Program {

	public static void main(String[] args) {
		Canta x = new Canta(150);
		Canta y = new Canta(180);
		Kisi ahmet = new Kisi("Ahmet");
		Kisi mehmet = new Kisi("Mehmet",170,85,35);
		ahmet.cantaTut(x);
		mehmet.cantaTut(y);
		
		if(ahmet.cantaVarmi()) System.out.println("Taşıdığı çanta var");
		else System.out.println("Taşıdığı çanta yok");
		
		mehmet.yemekYe(1200);
		System.out.println(ahmet);
		System.out.println(mehmet);
	}

}
