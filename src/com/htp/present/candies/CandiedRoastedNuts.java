package com.htp.present.candies;

public class CandiedRoastedNuts extends ChocolateCandy {

	public CandiedRoastedNuts() {
		super("Грильяж", "Спартак", 70, 60);
	}
	
	@Override
	public void eatCandy() {
		System.out.println("Конфета 'Грильяж' съедена.");
	}
}
