package com.cdpt.pokemon;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.cdpt.pokemon.screen.GameScreen;
import com.cdpt.pokemon.screen.StartScreen;

public class Pokemon extends Game implements Screen{
	
	private GameScreen screen;
	private StartScreen startScreen;
	
	private AssetManager assetManager;

	@Override
	public void create() {
		assetManager = new AssetManager();
		assetManager.load("res/packed/Green/textures.atlas", TextureAtlas.class);
		assetManager.finishLoading();
		startScreen = new StartScreen(this);

		
		this.setScreen(startScreen);
	}
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)	;

		super.render();
	}

	public AssetManager getAssetManager() {
		return assetManager;
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float v) {

	}

	@Override
	public void hide() {

	}
}

