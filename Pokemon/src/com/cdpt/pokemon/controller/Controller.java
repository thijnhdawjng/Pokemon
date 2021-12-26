package com.cdpt.pokemon.controller;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.cdpt.pokemon.model.Player;
import com.cdpt.pokemon.model.Direction;

public class Controller extends InputAdapter{
	
	private Player player;
	private boolean up, down, left, right;
	
	public Controller(Player player) {
		this.player = player;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.W) {
			up = true;
		}
		if (keycode == Keys.S) {
			down = true;		
		}
		if (keycode == Keys.A) {
			left = true;
		}
		if (keycode == Keys.D) {
			right = true;
		}
		return false;
	}
	
	@Override
	public boolean keyUp(int keycode) {
		if (keycode == Keys.W) {
			up = false;
		}
		if (keycode == Keys.S) {
			down = false;		
		}
		if (keycode == Keys.A) {
			left = false;
		}
		if (keycode == Keys.D) {
			right = false;
		}
		return false;
	}
	
	public void update(float delta) {
		if (up) {
			player.move(Direction.NORTH);
			return;
		}
		if (down) {
			player.move(Direction.SOUTH);
			return;
		}
		if (left) {
			player.move(Direction.WEST);
			return;
		}
		if (right) {
			player.move(Direction.EAST);
			return;
		}
	}
}
