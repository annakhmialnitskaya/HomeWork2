package com.htp.stars;

public class StarSystem {

	private Star[] stars = new Star[0];
	private Planet[] planets = new Planet[0];
	private Moon[] satellites = new Moon[0];

	public Star[] getStars() {
		return stars;
	}

	public void setStars(Star[] stars) {
		this.stars = stars;
	}

	public Planet[] getPlanets() {
		return planets;
	}

	public void setPlanets(Planet[] planets) {
		this.planets = planets;
	}

	public Moon[] getSatellites() {
		return satellites;
	}

	public void setSatellites(Moon[] satellites) {
		this.satellites = satellites;
	}

	public void addStar(Star star) {
		Star[] list = this.getStars();
		Star[] newArray = new Star[list.length + 1];
		System.arraycopy(list, 0, newArray, 0, list.length);
		newArray[list.length] = star;
		this.setStars(newArray);
	}

	public void addPlanet(Planet planet) {
		Planet[] list = this.getPlanets();
		Planet[] newArray = new Planet[list.length + 1];
		System.arraycopy(list, 0, newArray, 0, list.length);
		newArray[list.length] = planet;
		this.setPlanets(newArray);
	}

	public void addMoon(Moon moon) {
		Moon[] list = this.getSatellites();
		Moon[] newArray = new Moon[list.length + 1];
		System.arraycopy(list, 0, newArray, 0, list.length);
		newArray[list.length] = moon;
		this.setSatellites(newArray);
	}

	public void printPlanetCount() {
		System.out.println("Count of planets in Star System: " + getPlanets().length);
	}

	public void printStarsNames() {
		Star[] array = getStars();
		System.out.println("Stars names in Star System: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getName());
		}
	}
}
