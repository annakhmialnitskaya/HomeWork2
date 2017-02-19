package com.htp.present.candies;

public class Alenka extends ChocolateCandy {

	public Alenka() {
		super("Аленка", "Коммунарка", 80, 50);
	}

	@Override
	public void eatCandy() {
		System.out.println("Конфета 'Аленка' съедена.");
	}
}
