package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/27/15.
 */
public class Dardo extends Image{

    public static Rectangle dardorect;

    Dardo()
    {
        super(new Texture("dardo.png"));
        setX((float)(Math.random()*1000)%605);
        setY(1100);
        addListener(new InputListener());
    }

    @Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja - MyGdxGamePrueva.nivel;
        setY(posicion_nueva);
        dardorect = new Rectangle(getX(),posicion_nueva,getWidth(),getHeight());
    }
}

