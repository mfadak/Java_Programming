package pkt;

public class Sayi {
    private int deger;
    private int uzunluk;
    public Sayi(int dgr){
        deger=dgr;
        uzunluk = String.valueOf(deger).length();
    }
    public short[] Rakamlar(){
        int tmp = deger;
        short []rakamlar = new short[uzunluk];
        int indeks=uzunluk-1;
        while(tmp > 0) {
            rakamlar[indeks--] = (short)(tmp % 10);
            tmp /= 10;
        }
        return rakamlar;
    }
    public int Uzunluk(){
        return uzunluk;
    }
}
