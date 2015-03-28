package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/16/15.
 */
public class Fondo extends Image{

    Fondo() {
        super(new Texture("suelo nubes.jpg"));
        addListener(new InputListener());
        setY(100);
    }
}
