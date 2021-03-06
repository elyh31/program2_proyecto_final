package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/27/15.
 */
public class Lapiz extends Image{

    public static Rectangle lapirect;

    Lapiz()
    {
        super(new Texture("lapiz.png"));
        setX((float)(Math.random()*1000)%605);
        setY(900);
        addListener(new InputListener());
    }

    @Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja - MyGdxGamePrueva.nivel;
        setY(posicion_nueva);
        lapirect = new Rectangle(getX(),posicion_nueva,getWidth(),getHeight());
    }
}