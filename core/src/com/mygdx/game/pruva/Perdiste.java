package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/24/15.
 */
public class Perdiste extends Image{

    Perdiste()
    {
        super(new Texture("perdiste.png"));
        addListener(new InputListener() {
                        @Override
                        public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
                        {
                            MyGdxGamePrueva.ReiniciarJuego();
                            return true;
                        }
                    }
        );

    }

}
