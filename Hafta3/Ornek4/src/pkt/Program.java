package pkt;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Sayı: ");
		int sayi = in.nextInt();
		int toplam=0;
		for(int i=1;i<=sayi;i++) {
			toplam += i;
		}
		System.out.println("Toplam: "+toplam);
	}
}
