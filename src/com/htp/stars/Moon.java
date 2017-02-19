package com.htp.stars;

public class Moon {

	private String name;
	private int weight;

	public Moon(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		return name.equals(((Moon) obj).getName());
	}

	@Override
	public int hashCode() {
		return weight * 7;
	}

	@Override
	public String toString() {
		return "Moon's name: " + name;
	}
}
