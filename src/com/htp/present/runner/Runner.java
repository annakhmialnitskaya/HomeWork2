package com.htp.present.runner;

import com.htp.present.entity.CandyMan;
import com.htp.present.entity.Child;
import com.htp.present.entity.Present;
import com.htp.present.menu.Menu;

public class Runner {

	public static void main(String[] args) {

		Present present = new Present();
		CandyMan man = new CandyMan();
		Child child = new Child("Ваня", 7);
		man.fillPresent(present);
		Menu.callMenu(present, man, child);
	}

}
