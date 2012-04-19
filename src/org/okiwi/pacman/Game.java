package org.okiwi.pacman;

public class Game {

	private Pacman pacman;
	private int numberOfDots;
	private boolean grid[];
	
	public Game(){
		this.numberOfDots = 100;
		grid = new boolean[numberOfDots];
		grid[0] = true;
	}
	
	public Pacman getPacman() {
		return pacman;
	}

	public void start() {
		pacman = new Pacman(0,0);
	}

	public int getRemainingDots() {
		return this.numberOfDots;
	}

	public void tick() {
		pacman.move();
		if (!grid[pacman.getPositionX()]){
			this.numberOfDots --;
			this.grid[pacman.getPositionX()] = true;
		}
	}

}
