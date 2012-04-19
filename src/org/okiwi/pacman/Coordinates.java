package org.okiwi.pacman;

public class Coordinates {

	private final int positionX;
	private final int positionY;

	public Coordinates(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}
}
