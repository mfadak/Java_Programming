package pkt;

import java.util.Random;

public class Pi {
    private final double hassasiyet;
    public Pi(double denemeSayisi){
        hassasiyet = denemeSayisi;
    }
    public double Deger(){
        int basarilivurus=0;
        Random generator = new Random();
        for(double i=0;i<hassasiyet;i++){
            double x = generator.nextDouble();
            double y = generator.nextDouble();
            double uzunluk = Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
            if(uzunluk <= 1) basarilivurus++;
        }
        return 4*(basarilivurus/hassasiyet);
    }
}
