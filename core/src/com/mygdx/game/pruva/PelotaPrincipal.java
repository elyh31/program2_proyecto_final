package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/16/15.
 */
public class PelotaPrincipal extends Image {

    PelotaPrincipal() {
        super(new Texture("Bola.png"));
        addListener(new InputListener());
        setY(100);
     }

    @Override
    public void act(float delta)
    {
        if (MyGdxGamePrueva.moveradelante == 1) {
            setX(getX() + 10);
            MyGdxGamePrueva.pelotarect.setX(getX() + 10);
        }
        if (MyGdxGamePrueva.moveratras == 1){
            setX(getX() - 10);
            MyGdxGamePrueva.pelotarect.setX(getX() - 10);
        }
     }
}
