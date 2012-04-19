package org.okiwi.pacman;

import org.okiwi.pacman.Direction;

public class Pacman {

	private Coordinates position;
	private Direction direction;
	
	public Pacman(final int positionX, final int positionY) {
		this.position = new Coordinates(positionX, positionY);	
		this.direction = Direction.RIGHT;
	}

	public int getPositionX() {
		return position.getPositionX();
	}
	public int getPositionY() {
		return position.getPositionY();
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public boolean isMoving() {
		return true;
	}

	public void move() {
		this.position = this.getDirection().move(position);
	}
}
