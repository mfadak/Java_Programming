package pkt;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x,y;
		System.out.print("x:");
		x = in.nextInt();
		System.out.print("y:");
		y = in.nextInt();
		int sonuc = ( x * x )+( y * y );
		System.out.println("x^2+y^2 = "+sonuc);
	}

}
