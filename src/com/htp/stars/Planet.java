package com.htp.stars;

public class Planet {

	private String name;
	private int weight;

	public Planet(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Planet) obj).getName());
	}

	@Override
	public int hashCode() {
		return  weight;
	}

	@Override
	public String toString() {
		return "Planet's name: " + name;
	}

}
