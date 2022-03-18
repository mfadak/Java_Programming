package orn;

public class Kisi {
    private String isim;
    private int yas; 
    private float boy; 
    private float kilo; 
    private Canta tasidigiCanta;
    
    public Kisi(String ad,float by,float kl,int ys){
        isim=ad;
        yas=ys;
        boy=by;
        kilo=kl;
        tasidigiCanta = null;
    }
    public Kisi(String isim){
        this.isim=isim;
        yas=0;
        boy=20;
        kilo=4;
        tasidigiCanta = null;
    }
    public void yasIlerle(int yil){
        yas+=yil;
        if(yas<18)boy+=1;
    }
    public void yemekYe(float kalori){
        kilo+= (kalori/1000);
    }    
    public void cantaTut(Canta canta) {
    	this.tasidigiCanta = canta;
    }
    public void cantaBirak() {
    	this.tasidigiCanta = null;
    }
    public boolean cantaVarmi() {
    	return tasidigiCanta != null;
    }
    @Override
    public String toString() {
    	return isim + " Yaş: "+yas+" Kilo: "+kilo+" kg Boy: "+boy+" cm";
    }

}
