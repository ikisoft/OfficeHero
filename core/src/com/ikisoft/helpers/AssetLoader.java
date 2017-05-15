package com.ikisoft.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Max on 15.5.2017.
 */

public class AssetLoader {

    public static Texture texture;
    public static TextureRegion idle1, idle2, running1, running2;

    public static Animation<TextureRegion> playerIdle, playerRunning;



    public void load(){

        texture = new Texture(Gdx.files.internal("images/textures.png"));
        texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        idle1 = new TextureRegion(texture, 0, 0, 32 ,32 );
        idle2 = new TextureRegion(texture, 32, 0, 32 ,32 );

        running1 = new TextureRegion(texture, 0, 32, 32, 32);
        running2 = new TextureRegion(texture, 32, 32, 32, 32);
        TextureRegion[] idle = {idle1, idle2};
        TextureRegion[] running = {running1, running2};

        playerIdle = new Animation<TextureRegion>(0.8f, idle);
        playerIdle.setPlayMode(Animation.PlayMode.LOOP);
        playerRunning = new Animation<TextureRegion>(0.3f, running);
        playerRunning.setPlayMode(Animation.PlayMode.LOOP);



    }

    public void dispose(){
        texture.dispose();

    }
}
