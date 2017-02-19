package com.htp.present.entity;

import com.htp.present.candies.Alenka;
import com.htp.present.candies.CandiedRoastedNuts;
import com.htp.present.candies.Candy;
import com.htp.present.candies.Mint;
import com.htp.present.candies.TakeOff;

public class CandyMan {

	private String name;

	public void addCandies(Present present, Candy candy, int weight) {
		Candy[] list = present.getCandies();
		Candy[] newArray = new Candy[list.length + 1];
		System.arraycopy(list, 0, newArray, 0, list.length);
		newArray[list.length] = candy;
		present.setCandies(newArray);
		present.setWeight(present.getWeight() + weight);
	}

	public void printContentPresent(Present present) {
		Candy[] list = present.getCandies();
		System.out.println("Состав подарка:");
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.print(list[i].getName() + " ");
			}
		}
		System.out.println("Вес подарка:" + present.getWeight());
	}

	public void sortCandies(Present present) {
		Candy[] list = present.getCandies();
		for (int i = list.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (list[j].getSugarContent() > list[j + 1].getSugarContent()) {
					Candy tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				}
			}
		}
		System.out.println("Отсортированный состав подарка:");
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.print(list[i].getName() + " ");
			}
		}
	}

	public void fillPresent(Present present) {
		this.addCandies(present, new Alenka(), 300);
		this.addCandies(present, new CandiedRoastedNuts(), 400);
		this.addCandies(present, new Mint(), 200);
		this.addCandies(present, new TakeOff(), 200);
	}

	public void printFoundCandy(Present present) {
		Candy[] list = present.getCandies();
		String result = null;
		for (int i = 0; i < list.length; i++) {
			if (list[i].getSugarContent() > 60 && list[i].getSugarContent() < 70) {
				result = list[i].getName();
				break;
			}
		}
		System.out.println(result);
	}
}
