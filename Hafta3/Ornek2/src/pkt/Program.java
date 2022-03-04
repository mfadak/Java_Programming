package pkt;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		System.out.print("x:");
		x = in.nextInt();
		System.out.print("y:");
		y = in.nextInt();
		if(y != 0 && x/y > 10) System.out.println("Büyük");
		else System.out.println("Küçük");
	}

}
