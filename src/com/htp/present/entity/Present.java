package com.htp.present.entity;

import com.htp.present.candies.Alenka;
import com.htp.present.candies.CandiedRoastedNuts;
import com.htp.present.candies.Candy;
import com.htp.present.candies.Mint;
import com.htp.present.candies.TakeOff;

public class Present {

	private int weight = 0;
	private Candy[] candies = new Candy[0];

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Candy[] getCandies() {
		return candies;
	}

	public void setCandies(Candy[] candies) {
		this.candies = candies;
	}

}
