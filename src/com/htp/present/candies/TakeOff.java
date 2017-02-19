package com.htp.present.candies;

public class TakeOff extends Caramel {

	public TakeOff() {
		super("Взлетные","Красный пищевик", 70, 68);
	}
	
	@Override
	public void eatCandy() {
		System.out.println("Конфета 'Взлетная' съедена.");
	}
}
