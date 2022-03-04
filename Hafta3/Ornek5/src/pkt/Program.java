package pkt;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("İfade: ");
		String ifade = in.next();
		String boslukluIfade="";
		for(char karakter : ifade.toCharArray()) {
			boslukluIfade += karakter + " ";
		}
		System.out.println(boslukluIfade);
	}
}
