package com.mygdx.game.pruva;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by ely on 3/16/15.
 */
public class MyImputListener extends InputListener {

    PelotaPrincipal pelota;

    MyImputListener(PelotaPrincipal pelota)
    {
        super();
        this.pelota = pelota;
    }

    Fondo fondo;
    MyImputListener(Fondo fondo)
    {
        super();
        this.fondo = fondo;
    }

    MaderaFondoBotones maderafondobotones;
    MyImputListener(MaderaFondoBotones maderafondobotones)
    {
        super();
        this.maderafondobotones = maderafondobotones;
    }

    BotonDerecha botonderecha;
    MyImputListener(BotonDerecha botonderecha)
    {
        super();
        this.botonderecha = botonderecha;
    }

    BotonIzquierda botonizquierda;
    MyImputListener(BotonIzquierda botonizquierda)
    {
        super();
        this.botonizquierda = botonizquierda;
    }
}
