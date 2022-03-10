package valuefunc;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		    Scanner ekran = new Scanner(System.in);
        System.out.print("Tam Sayı:");
        int sayi = ekran.nextInt();
        Sayi s = new Sayi(sayi);
        short []rakamlar = s.Rakamlar();
        for(int indeks=0;indeks<s.Uzunluk();indeks++){
            System.out.print(rakamlar[indeks]+" ");
        }

	}
}
