package com.htp.present.entity;

import com.htp.present.candies.Candy;

public class Child {

	private String name;
	private int age;

	public Child(String name, int age) {
		this.name =name;
		this.age =age;
	}

	public void eatPresent(Present present) {
		Candy[] list = present.getCandies();
		for (int i = 0; i < list.length; i++) {
			Candy candy = list[i];
			candy.eatCandy();
			list[i]=null;
		}
		present.setWeight(0);
	}
}
