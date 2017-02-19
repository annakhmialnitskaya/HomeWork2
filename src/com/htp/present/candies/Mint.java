package com.htp.present.candies;

public class Mint extends Caramel {

	public Mint() {
		super("Мятные", "Рошен", 65, 50);
	}
	
	@Override
	public void eatCandy() {
		System.out.println("Конфета 'Мятная' съедена.");
	}
}
