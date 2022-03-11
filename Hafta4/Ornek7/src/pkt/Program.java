package pkt;

import java.util.Scanner;

public class Program {
	public static boolean asalmi(int sayi,int... bolen) {
		if(sayi < 2) return false;
        if(bolen.length == 0) return asalmi(sayi, 2);
        if(sayi == bolen[0]) return true;
        if(sayi%bolen[0] == 0) return false;
        return asalmi(sayi, bolen[0]+1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sayi;
		do {
			System.out.print("Bir Sayı Girin (Çıkmak için sıfır):");
			sayi = in.nextInt();
			if(sayi != 0) {
				if(asalmi(sayi)) System.out.println("Girilen sayı asaldır.");
				else System.out.println("Girilen sayı asal değildir.");
			}
		}while(sayi != 0);
	}
}
