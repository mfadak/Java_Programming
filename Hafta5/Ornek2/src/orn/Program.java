package orn;

public class Program {

	public static void main(String[] args) {
		Tasit tasit = new Tasit(60);
		tasit.marsaBas();
		tasit.hizAyarla(140);
		tasit.sur(3);
		System.out.println("Kullanılan Taşıt:");
		System.out.println(tasit);
        System.out.println("3 saatte alınan yol "+tasit.getYol()+" kilometredir.");
        System.out.println("Kalan yakıt ile "+tasit.menzil()+" km yol gidilebilir.\n");
        
        Tasit tasit2 = new Tasit(60);
        if(tasit.equals(tasit2)) System.out.println("Taşıtlar aynı");
        else System.out.println("Taşıtlar farklı");
        
        System.out.println("\nFarklı bir karşılaştırma");
        Tasit tasit3 = tasit;
        if(tasit.equals(tasit3)) System.out.println("Taşıtlar aynı");
        else System.out.println("Taşıtlar farklı");
	}

}
