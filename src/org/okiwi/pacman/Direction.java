package org.okiwi.pacman;


public enum Direction {
	UP {
		@Override
		Coordinates move(int x, int y) {
			return new Coordinates(x, y+1);
		}

	}, RIGHT{
		@Override
		Coordinates move(int x, int y) {
			return new Coordinates(x+1, y);
		}
	}, LEFT {
		@Override
		Coordinates move(int x, int y) {
			return new Coordinates(x-1, y);
		}
	}, DOWN{
		@Override
		Coordinates move(int x, int y) {
			return new Coordinates(x, y-1);
		}
	};

	abstract Coordinates move(int x, int y);

	public Coordinates move(Coordinates coordinates) {
		return move(coordinates.getPositionX(),coordinates.getPositionY());
	}

}
