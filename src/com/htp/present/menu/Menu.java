package com.htp.present.menu;

import java.util.Scanner;

import com.htp.present.entity.CandyMan;
import com.htp.present.entity.Child;
import com.htp.present.entity.Present;

public class Menu {

	public static void callMenu(Present present, CandyMan man, Child child) {
		Scanner sc = new Scanner(System.in);
		String s;
		while (true) {
			System.out.println();
			System.out.println("1 Провести сортировку конфет в подарке на основе содержания сахара.");
			System.out.println("2 Найти конфету в подарке с содержанием сахара от 60 до 70%.");
			System.out.println("3 Вывести на экран содержимое подарка.");
			System.out.println("4 Cъесть подарок.");
			System.out.println("q Выход");
			s = sc.next();
			if ("1".equals(s)) {
				man.sortCandies(present);
			} else if ("2".equals(s)) {
				man.printFoundCandy(present);
			} else if ("3".equals(s)) {
				man.printContentPresent(present);
			} else if ("4".equals(s)) {
				child.eatPresent(present);
			} else if ("q".equals(s)) {
				System.out.println("quit");
				break;
			} else {
				System.out.println("error: incorrect symbol");
			}
		}
	}
}
