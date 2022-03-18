package orn;

import java.util.UUID;

public class Motor {
	private String motorNo;
	private boolean calisiyor;
	
	public Motor() {
		this.motorNo = UUID.randomUUID().toString();
		calisiyor = false;
	}
	public Motor(String motorNo) {
		this.motorNo = motorNo;
		calisiyor = false;
	}
	public void calistir() {
		calisiyor = true;
	}
	public void durdur() {
		calisiyor = false;
	}
	public String getMotorNo() {
		return motorNo;
	}
	@Override
	public String toString() {
		String durum = calisiyor ? "Motor Çalışıyor." : "Motor Çalışmıyor";
		return durum;
	}
}
