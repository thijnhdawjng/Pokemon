package com.cdpt.pokemon.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Interpolation;
import com.cdpt.pokemon.util.AnimationSet;

public class Player {
	private TileMap map;
	private PLAYER_STATE state;
	private Direction facing;
	private AnimationSet animations;
	private int x;
	private int y;
	private int startX;
	private int startY;
	private int stopX;
	private int stopY;
	private float worldX;
	private float worldY;
	private float animationTimer;
	private float ANIMATION_TIME = 0.3f;
	private float walkTimer;
	private boolean moveRequestThisFrame;
	
	public Player(TileMap map, int x, int y, AnimationSet animations) {
		this.map = map;
		this.x = x;
		this.y = y;
		this.worldX = x;
		this.worldY = y;
		this.animations = animations;
		map.getTile(x, y).setActor(this);
		this.state = PLAYER_STATE.STANDING;
		this.facing = Direction.SOUTH;
	}
	
	public enum PLAYER_STATE {
		WALKING,
		STANDING,
		;
	}
	
	public void update(float delta) {
		if (state == PLAYER_STATE.WALKING) {
			animationTimer += delta;
			walkTimer += delta;
			worldX = Interpolation.linear.apply(startX, stopX, animationTimer / ANIMATION_TIME);
			worldY = Interpolation.linear.apply(startY, stopY, animationTimer / ANIMATION_TIME);
			if (animationTimer > ANIMATION_TIME) {
				float leftoverTime = animationTimer - ANIMATION_TIME;
				finishMove();
				if (moveRequestThisFrame) {
					if (move(facing)) {
						walkTimer += leftoverTime;
						worldX = Interpolation.linear.apply(startX, stopX, animationTimer / ANIMATION_TIME);
						worldY = Interpolation.linear.apply(startY, stopY, animationTimer / ANIMATION_TIME);
					}
				} else {
					walkTimer = 0f;
				}
			}
		}
		moveRequestThisFrame = false;
	}
	
	public boolean move(Direction dir) {
		if (state == PLAYER_STATE.WALKING) {
			if (facing == dir) {
				moveRequestThisFrame = true;
			}
			return false;
		}
		if (x + dir.getDx() >= map.getWidth() || x + dir.getDx() < 0 || y + dir.getDy() < 0 || y + dir.getDy() >= map.getHeight()) {
			return false;
		}
		if (map.getTile(x + dir.getDx(), y + dir.getDy()).getActor() != null) {
			return false;
		}
		initMove(dir);
		map.getTile(x, y).setActor(null);
		x += dir.getDx();
		y += dir.getDy();
		map.getTile(x, y).setActor(this);
		return true;
	}
	
	private void initMove(Direction dir) {
		this.facing = dir;
		this.startX = x;
		this.startY = y;
		this.stopX = x + dir.getDx();
		this.stopY = y + dir.getDy();
		this.worldX = x;
		this.worldY = y;
		animationTimer = 0f;
		state = PLAYER_STATE.WALKING;
	}
	
	private void finishMove() {
		state = PLAYER_STATE.STANDING;
		this.worldX = stopX;
		this.worldY = stopY;
		this.startX = 0;
		this.startY = 0;
		this.stopX = 0;
		this.stopY = 0;
	}
	
	public TextureRegion getSprite() {
		if (state == PLAYER_STATE.WALKING) {
			return animations.getWalking(facing).getKeyFrame(walkTimer);
		} else if (state == PLAYER_STATE.STANDING) {
			return animations.getStanding(facing);
		}
		return animations.getStanding(Direction.SOUTH);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public float getWorldX() {
		return worldX;
	}

	public float getWorldY() {
		return worldY;
	}
}
