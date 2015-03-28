package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/21/15.
 */
public class BotonDerecha extends Image{

    BotonDerecha()
    {
        super(new Texture("flecha derecha.png"));
        addListener(new InputListener()
        {
         @Override
        public boolean touchDown(InputEvent event, float x, float y, int pointer,int button) {
             if (MyGdxGamePrueva.movpel < 60) {
                 MyGdxGamePrueva.moveradelante++;
                 MyGdxGamePrueva.movpel = MyGdxGamePrueva.movpel + 1;
              }
             return true;
         }
        });
        setX(540);
        setY(5);
    }
}
