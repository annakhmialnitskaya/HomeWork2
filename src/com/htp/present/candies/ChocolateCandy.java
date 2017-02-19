package com.htp.present.candies;

public class ChocolateCandy extends Candy {

	private int cacaoContent;

	public ChocolateCandy(String name, String producer, int sugarContent, int cacaoContent) {
		super(name, producer, sugarContent);
		this.cacaoContent = cacaoContent;
	}

	public int getCacaoContent() {
		return cacaoContent;
	}

	@Override
	public void eatCandy(){
		System.out.println("Шоколадная конфета съедена.");
	}
}
