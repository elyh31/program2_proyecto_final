package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/21/15.
 */
public class MaderaFondoBotones extends Image {

    MaderaFondoBotones()
    {
        super(new Texture("madera fondo de botones.png"));
        addListener(new MyImputListener(this));
    }
}
