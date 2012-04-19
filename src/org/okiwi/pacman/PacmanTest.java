package org.okiwi.pacman;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PacmanTest {
	Pacman pacman;
	@Before
	public void setUp(){
		pacman = new Pacman(10, 20);
	}
	
	@Test
	public void canCreateAPacman() {
		assertNotNull(pacman);
		assertEquals(10, pacman.getPositionX());
		assertEquals(20, pacman.getPositionY());
	}
	
	@Test
	public void canHaveADirection(){
		pacman.setDirection(Direction.UP);
		assertEquals(Direction.UP, pacman.getDirection());
		
	}
	
	@Test
	public void defaultDirectionIsRight()
	{
		assertEquals(Direction.RIGHT, pacman.getDirection());
	}
	

	@Test
	public void isMoving()
	{
		assertTrue(pacman.isMoving());
	}
	
	@Test
	public void hasMovedAfterATick()
	{
		pacman.move();
		
		assertEquals(pacman.getPositionX(), 11);
	}
	
	@Test
	public void hasMovedTwiceAfterTwoTick()
	{
		pacman.move();
		pacman.move();
		
		assertEquals(pacman.getPositionX(), 12);
	}
	
	@Test
	public void canGoUp()
	{
		pacman.setDirection(Direction.UP);
		pacman.move();
		
		assertEquals(10, pacman.getPositionX());
		assertEquals(21, pacman.getPositionY());
	}
	
	@Test
	public void canGoDown()
	{
		pacman.setDirection(Direction.DOWN);
		pacman.move();
		
		assertEquals(10, pacman.getPositionX());
		assertEquals(19, pacman.getPositionY());
	}
	
}
