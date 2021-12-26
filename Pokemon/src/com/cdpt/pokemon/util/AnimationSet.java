package com.cdpt.pokemon.util;

import java.util.HashMap;
import java.util.Map;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.cdpt.pokemon.model.Direction;

public class AnimationSet {
	private Map<Direction, Animation> walking;
	private Map<Direction, TextureRegion> standing;
	
	public AnimationSet(Animation walkNorth, 
			Animation walkSouth, 
			Animation walkEast, 
			Animation walkWest, 
			TextureRegion standNorth, 
			TextureRegion standSouth, 
			TextureRegion standEast, 
			TextureRegion standWest) {
		
		walking = new HashMap<Direction, Animation>();
		walking.put(Direction.NORTH, walkNorth);
		walking.put(Direction.SOUTH, walkSouth);
		walking.put(Direction.EAST, walkEast);
		walking.put(Direction.WEST, walkWest);
		
		standing = new HashMap<Direction, TextureRegion>();
		standing.put(Direction.NORTH, standNorth);
		standing.put(Direction.SOUTH, standSouth);
		standing.put(Direction.EAST, standEast);
		standing.put(Direction.WEST, standWest);
	}
	
	public Animation getWalking(Direction dir) {
		return walking.get(dir);
	}
	
	public TextureRegion getStanding(Direction dir) {
		return standing.get(dir);
	}
}
