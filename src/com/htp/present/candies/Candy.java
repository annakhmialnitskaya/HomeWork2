package com.htp.present.candies;

import com.htp.present.ability.Eatable;

public class Candy implements Eatable{

	private String name;
	private String producer;
	private int sugarContent;

	public Candy(String name, String producer, int sugarContent) {
		this.name = name;
		this.producer = producer;
		this.sugarContent = sugarContent;
	}

	public String getName() {
		return name;
	}

	public String getProducer() {
		return producer;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	@Override
	public void eatCandy(){
		System.out.println("Конфета съедена.");
	}
}
