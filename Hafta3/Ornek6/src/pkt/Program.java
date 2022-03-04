package pkt;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println(" Çarpım Tablosu");
		System.out.println("----------------------------------------------------------------------------");
		// sayı başlıklarını yaz
		System.out.print("# | ");
		for(int i=1;i<=9;i++){
			System.out.print("\t" + i);
		}
		System.out.println("\n----------------------------------------------------------------------------");
		for(int i=1;i<=9;i++){
			System.out.print(i + " |");
			for(int j=1; j<=9; j++){
				if(i*j <10) System.out.print("\t" + (i*j));
				else System.out.print("\t" + (i*j));
			}
			System.out.println();
		}
	}
}
