package org.okiwi.pacman;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionTest {

	@Test
	public void test() {
		Direction direction = Direction.RIGHT;
		Coordinates newCoords = direction.move(new Coordinates(0, 0));
		assertEquals(1, newCoords.getPositionX());
	}

}
