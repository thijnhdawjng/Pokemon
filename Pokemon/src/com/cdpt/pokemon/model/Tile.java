package com.cdpt.pokemon.model;

public class Tile {
	private Terrain terrain;
	private Player actor;
	
	public Tile(Terrain terrain) {
		this.terrain = terrain;
	}

	public Terrain getTerrain() {
		return terrain;
	}
	
	public void setActor(Player actor) {
		this.actor = actor;
	}
	
	public Player getActor() {
		return actor;
	}
}
