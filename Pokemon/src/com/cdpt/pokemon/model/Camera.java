package com.cdpt.pokemon.model;

public class Camera {
	private float cameraX = 0f;
	private float cameraY = 0f;
	
	public void update(float cameraX, float cameraY) {
		this.cameraX = cameraX;
		this.cameraY = cameraY;
	}

	public float getCameraX() {
		return cameraX;
	}

	public float getCameraY() {
		return cameraY;
	}
}
