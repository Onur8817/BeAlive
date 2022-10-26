package com.onurkarahan.bealive;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.Button;
import java.util.Random;

public class BeAlive extends ApplicationAdapter {
    SpriteBatch batch;
    Texture heart1, heart2, heart3, heart4, heart5;
    Texture background;
    Texture charecter;
    Texture forward;
    Button forwardButton;
    Button backButton;
    Texture back;
    Texture heartHalf, heartFull, die, heartOne;
    boolean gamestate;
    float velocityForward;
    float velocityBack;
    float charecterX;
    float charecterY;
    float heartsX[] = new float[5];
    String names[] = new String[5];

    Random random = new Random();

    @Override
    public void create() {
        batch = new SpriteBatch();
        heart1 = new Texture("heart.png");
        heart2 = new Texture("heart.png");
        heart3 = new Texture("heart.png");
        heart4 = new Texture("heart.png");
        heart5 = new Texture("heart.png");
        backButton = new Button();

        background = new Texture("background.png");
        charecter = new Texture("character.png");
        heartFull = new Texture("heartFull.png");
        heartHalf = new Texture("heartHalf.png");
        heartOne = new Texture("heartOne.png");
        die = new Texture("die.png");
        forward = new Texture("forward.png");
        back = new Texture("back.png");
        forward = new Texture("forward.png");
        back = new Texture("back.png");

        charecterX = Gdx.graphics.getWidth() / 2 - 80;
        charecterY = 0;
    }

    @Override
    public void render() {


        batch.begin();

        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        //batch.draw(heart1,500,500 , 64,64);

        batch.draw(heartFull, Gdx.graphics.getWidth() - 400, Gdx.graphics.getHeight() - 200, 350, 100);
        //batch.draw(heartHalf,Gdx.graphics.getWidth()-400,Gdx.graphics.getHeight()-200,350,100);
        // batch.draw(heartOne,Gdx.graphics.getWidth()-400,Gdx.graphics.getHeight()-200,350,100);
        //batch.draw(die,Gdx.graphics.getWidth()-400,Gdx.graphics.getHeight()-200,350,100);
        batch.draw(back, Gdx.graphics.getWidth() - 400, 60, 128, 128);
        batch.draw(forward, Gdx.graphics.getWidth() - 250, 60, 128, 128);

        batch.draw(charecter, charecterX, charecterY, 80, 248);
        if (gamestate){
            for (int i = 1; i <6 ; i++) {

            }
        }

        if (Gdx.input.justTouched()) {
            gamestate = true;


        } else {

        }
        if (gamestate) {
            if (charecterX < Gdx.graphics.getWidth() - 90) {
                velocityForward = velocityForward + +0.2f;
                charecterX = charecterX + velocityForward;

            }
        }


        batch.end();
    }

    @Override
    public void dispose() {


    }

    public float[] heartRainX() {
        for (int i = 1; i < 6; i++) {
            heartsX[i] = random.nextInt(Gdx.graphics.getWidth());

        }

        return heartsX;
    }
    public String[] StringName() {
        for (int i = 1; i < 6; i++) {

            names[i] = "heart"+i;

        }
        return names;

    }
}
