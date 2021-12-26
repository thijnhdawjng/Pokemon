package com.cdpt.pokemon.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.cdpt.pokemon.Pokemon;
import com.cdpt.pokemon.Settings;
import com.cdpt.pokemon.controller.Controller;
import com.cdpt.pokemon.model.Player;
import com.cdpt.pokemon.model.Camera;
import com.cdpt.pokemon.model.TileMap;
import com.cdpt.pokemon.util.AnimationSet;

public class GameScreen extends Game implements Screen {
	private Player player;
	private SpriteBatch batch;
	private Camera camera;
	private Texture grass;
	private Controller controller;
	private TileMap map;

	public GameScreen(Pokemon app) {
		grass = new Texture("res/Grass_1.png");
		batch = new SpriteBatch();
		TextureAtlas atlas = app.getAssetManager().get("res/packed/Green/textures.atlas", TextureAtlas.class);
		AnimationSet animations = new AnimationSet(
				new Animation(0.3f / 2f, atlas.findRegions("green_walk_north"), PlayMode.LOOP_PINGPONG),
				new Animation(0.3f / 2f, atlas.findRegions("green_walk_south"), PlayMode.LOOP_PINGPONG),
				new Animation(0.3f / 2f, atlas.findRegions("green_walk_east"), PlayMode.LOOP_PINGPONG),
				new Animation(0.3f / 2f, atlas.findRegions("green_walk_west"), PlayMode.LOOP_PINGPONG),
				atlas.findRegion("green_stand_north"),
				atlas.findRegion("green_stand_south"),
				atlas.findRegion("green_stand_east"),
				atlas.findRegion("green_stand_west"));
		map = new TileMap(100, 100);
		player = new Player(map, 50, 50, animations);
		camera = new Camera();
		controller = new Controller(player);
	}


	@Override
	public void dispose() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(.1f, .12f, .16f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		controller.update(delta);
		player.update(delta);
		camera.update(player.getWorldX() + 0.5f, player.getWorldY() + 0.5f);

		batch.begin();

		float worldStartX = Gdx.graphics.getWidth() / 2 - camera.getCameraX() * Settings.SCALED_TILE_SIZE;
		float worldStartY = Gdx.graphics.getHeight() / 2 - camera.getCameraY() * Settings.SCALED_TILE_SIZE;

		for (int x = 0; x < map.getWidth(); x++ ) {
			for (int y = 0; y < map.getHeight(); y++) {
				Texture render = grass;
				batch.draw(render,
						worldStartX + x * Settings.SCALED_TILE_SIZE,
						worldStartY + y * Settings.SCALED_TILE_SIZE,
						Settings.SCALED_TILE_SIZE,
						Settings.SCALED_TILE_SIZE);
			}
		}

		batch.draw(player.getSprite(),
				worldStartX + player.getWorldX() * Settings.SCALED_TILE_SIZE,
				worldStartY + player.getWorldY() * Settings.SCALED_TILE_SIZE,
				Settings.SCALED_TILE_SIZE,
				Settings.SCALED_TILE_SIZE);
		batch.end();
		super.render();
	}

	@Override
	public void create() {

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void resume() {

	}



	@Override
	public void show() {
		Gdx.input.setInputProcessor(controller);
	}
}

