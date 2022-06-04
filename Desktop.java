package org.comp;

public class Desktop implements Software,Hardware{

	@Override
	public void hardware() {
System.out.println("total hardwares in desktop:20");		
	}

	@Override
	public void monitor() {
		System.out.println("monit:40");		
		
	}

	@Override
	public void cpu() {
		System.out.println("cpu:40");		
		
	}

	@Override
	public void whatsapp() {
		System.out.println("whatsapp installed:35");		
		
	}

	@Override
	public void facebook() {
		System.out.println("facebook installed:30");		
		
	}

	@Override
	public void chrome() {
		System.out.println("chrome installed:40");		
		
	}
	
	private void desktopmdl() {
		System.out.println("desktop model:HP");		

	}
	public static void main(String[] args) {
		
	
	Desktop lab=new Desktop();
	lab.hardware();
	lab.monitor();
	lab.cpu();
	lab.whatsapp();
	lab.facebook();
	lab.chrome();
	lab.desktopmdl();
	}

}
