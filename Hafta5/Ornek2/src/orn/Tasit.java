package orn;

public class Tasit {
    private Motor motor;
	private double hiz; 
    private double yol;
    private double depo; 
    
    public Tasit(double depo){
    	motor = new Motor();
        hiz=0;
        this.depo = depo;
        yol=0;
    }
    public Tasit(String motorNo, double depo){
    	motor = new Motor(motorNo);
        hiz=0;
        this.depo = depo;
        yol=0;
    }
    public void marsaBas() {
    	motor.calistir();
    }
    public void marsiKapat() {
    	motor.durdur();
    }
    public void sur(double zaman){
        yol = hiz * zaman;
        depo -= (yol/100)*ortalamaYakit();
    }
    public void hizAyarla(double hiz){
        this.hiz = hiz;
    }
    public double getHiz(){
        return hiz;
    }
    public double getYol(){
        return yol;
    }
    public double getDepo(){
        return depo;
    }
    public double ortalamaYakit(){
        if(hiz <= 100) return 7;
        else if(hiz <= 130) return 8;
        else if(hiz <= 150) return 9;
        else if(hiz <= 180) return 10;
        else if(hiz <= 200) return 12;
        else return 15;
    }
    public long menzil(){
        return Math.round(100*(depo/ortalamaYakit()));
    }  
    @Override
    public boolean equals(Object obj) {
    	boolean kontrol =false;
    	if(obj != null && obj instanceof Tasit) {
    		kontrol = this.motor.getMotorNo().equals(((Tasit)obj).motor.getMotorNo());
    	}
    	return kontrol;
    }
    @Override
    public String toString() {
    	return "Tasit Motor No: "+motor.getMotorNo()+"\n"+motor;
    }
}
