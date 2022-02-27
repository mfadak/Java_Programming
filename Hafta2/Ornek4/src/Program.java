public class IlkProje {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.print("x:");
        int x=in.nextInt();
        System.out.print("y:");
        int y=in.nextInt();
        System.out.print("k:");
        int k=in.nextInt();
        System.out.print("z:");
        int z=in.nextInt();
        double sonuc = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))/(double)Math.abs(k+Math.log10(z));
        System.out.println("Sonuç:"+sonuc);
    }    
}
