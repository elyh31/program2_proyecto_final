package com.mygdx.game.pruva;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by ely on 3/22/15.
 */
public class BotonIzquierda extends Image{

    BotonIzquierda()
    {
        super(new Texture("flecha izquierda.png"));
        addListener(new InputListener()
        {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
            if (MyGdxGamePrueva.movpel > 0){
                MyGdxGamePrueva.moveratras++;
                MyGdxGamePrueva.movpel = MyGdxGamePrueva.movpel - 1;
            }
                return true;
            }
        });
        setX(10);
        setY(5);
    }

}
