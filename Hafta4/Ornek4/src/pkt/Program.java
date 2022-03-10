package pkt;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Sayı:");
		int sayi = in.nextInt();
		Hesap hesap = new Hesap();
		System.out.println("Faktöriyel: "+hesap.faktoriyel(sayi));
		System.out.println("Fibonacci: "+hesap.fibonacci(sayi));
	}
}
