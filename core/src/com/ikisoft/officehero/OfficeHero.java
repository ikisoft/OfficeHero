package com.ikisoft.officehero;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ikisoft.helpers.AssetLoader;

public class OfficeHero extends ApplicationAdapter {

	private AssetLoader assetLoader;
	private static SpriteBatch batch;
	private float runTime;

	
	@Override
	public void create () {
		assetLoader = new AssetLoader();
		assetLoader.load();
		batch = new SpriteBatch();
	}

	@Override
	public void render () {

		runTime += Gdx.graphics.getDeltaTime();

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.enableBlending();
		batch.draw(AssetLoader.playerIdle.getKeyFrame(runTime), 0, 0);
		batch.draw(AssetLoader.playerRunning.getKeyFrame(runTime), 50, 100);
		batch.draw(AssetLoader.idle1, 20, 30);
		batch.end();

	}
	
	@Override
	public void dispose () {
	}
}
