package org.okiwi.pacman;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void aNewGameNotStarded() {
		assertNull(game.getPacman());
	}

	@Test
	public void canStartANewGame() {
		game.start();

		assertTrue(game.getPacman().isMoving());
	}

	@Test
	public void pacmamEatsAdDotAtTheStart() {
		game.start();
		int dots = game.getRemainingDots();
		game.tick();

		assertEquals(dots - 1, game.getRemainingDots());
	}

	@Test
	public void pacmanCameBackAndDontEatADot() {
		game.start();
		int dots = game.getRemainingDots();

		game.tick();
		game.getPacman().setDirection(Direction.LEFT);
		game.tick();

		assertEquals(dots - 1, game.getRemainingDots());
	}

	@Test
	public void pacmanContinuesAndEatAnotherDot() {
		game.start();
		int dots = game.getRemainingDots();

		game.tick();
		game.tick();

		assertEquals(dots - 2, game.getRemainingDots());
	}
	


}
