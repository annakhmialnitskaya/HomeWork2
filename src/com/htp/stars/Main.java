package com.htp.stars;

public class Main {

	public static void main(String[] args) {

		StarSystem starSystem = new StarSystem();

		Star star1 = new Star("Sun1", 985, 5000);
		Star star2 = new Star("Sun2", 900, 4800);
		Star star3 = new Star("Sun3", 800, 4000);

		Planet planet1 = new Planet("Pluton", 1500);
		Planet planet2 = new Planet("Venera", 2100);
		Planet planet3 = new Planet("Mars", 1800);

		Moon moon1 = new Moon("Luna", 500);
		Moon moon2 = new Moon("Fobos", 700);

		starSystem.addStar(star1);
		starSystem.addStar(star2);
		starSystem.addStar(star3);
		starSystem.addPlanet(planet1);
		starSystem.addPlanet(planet2);
		starSystem.addPlanet(planet3);
		starSystem.addMoon(moon1);
		starSystem.addMoon(moon2);
		
		starSystem.printPlanetCount();
		starSystem.printStarsNames();
		

	}

}
