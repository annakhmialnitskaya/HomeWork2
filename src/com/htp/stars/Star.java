package com.htp.stars;

public class Star {

	private String name;
	private int weight;
	private int luminosity;

	public Star(String name, int weight, int luminosity) {
		this.name = name;
		this.weight = weight;
		this.luminosity = luminosity;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Star) obj).getName());
	}

	@Override
	public int hashCode() {
		return  weight*5+luminosity*8;
	}

	@Override
	public String toString() {
		return "Star's name: " + name;
	}

}
