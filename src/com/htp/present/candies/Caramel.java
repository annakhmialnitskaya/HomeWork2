package com.htp.present.candies;

public class Caramel extends Candy {

	private int syrupContent;

	public Caramel(String name, String producer, int sugarContent, int syrupContent) {
		super(name, producer, sugarContent);
		this.syrupContent = syrupContent;
	}

	public int getSyrupContent() {
		return syrupContent;
	}

	@Override
	public void eatCandy(){
		System.out.println("Карамельная конфета съедена.");
	}
}
