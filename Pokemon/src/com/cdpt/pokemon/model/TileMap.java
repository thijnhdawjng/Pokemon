package com.cdpt.pokemon.model;

public class TileMap {
	private Tile[][] tiles;
	private int width;
	private int height;
	
	public TileMap(int width, int height) {
		this.width = width;
		this.height = height;
		tiles = new Tile[width][height];
		
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				tiles[x][y] = new Tile(Terrain.GRASS);
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		return tiles[x][y];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
