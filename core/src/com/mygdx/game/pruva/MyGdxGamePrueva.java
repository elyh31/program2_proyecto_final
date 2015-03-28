package com.mygdx.game.pruva;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.ArrayList;


public class MyGdxGamePrueva extends ApplicationAdapter {
	Stage stage;

    SpriteBatch spritebatch;

    BitmapFont bitmapfont;

    static Perdiste perdiste;

   public static PelotaPrincipal pelotaPrincipal;

    static Rectangle pelotarect;

    static int moveradelante;
    static int moveratras;
    static int movpel;

    static int frame;
    static int restador_de_frame;

    static int nivel;
    static int puntos;


    static ArrayList<Lanza>cont_lanza;
    static ArrayList<Dardo>cont_dardo;
    static ArrayList<Jeringa>cont_jeringa;
    static ArrayList<Lapiz>cont_lapiz;
    static ArrayList<PelotaPrincipal>cont_pelota;

	@Override
	public void create () {

        cont_dardo = new ArrayList<Dardo>();
        cont_jeringa = new ArrayList<Jeringa>();
        cont_lanza = new ArrayList<Lanza>();
        cont_lapiz = new ArrayList<Lapiz>();
        cont_pelota = new ArrayList<PelotaPrincipal>();

        stage = new Stage();

        pelotaPrincipal = new PelotaPrincipal();
        stage.addActor(pelotaPrincipal);

        moveradelante = 0;
        moveratras = 0;
        movpel = 0;

        frame = 0;
        restador_de_frame = 1000;

        nivel = 3;
        puntos = -1;

        stage.addActor(new Fondo());
        stage.addActor(new PelotaPrincipal());

        perdiste = new Perdiste();
        perdiste.setVisible(false);
        stage.addActor(perdiste);

        Gdx.input.setInputProcessor(stage);

        spritebatch = new SpriteBatch();
        bitmapfont = new BitmapFont();
	}

	@Override
	public void render () {

        if (frame % restador_de_frame == 0){
            stage.addActor(new Lanza());
            stage.addActor(new Lapiz());
            stage.addActor(new Jeringa());
            stage.addActor(new Dardo());

            stage.addActor(new MaderaFondoBotones());
            stage.addActor(new BotonDerecha());
            stage.addActor(new BotonIzquierda());
            puntos = puntos + 1;
            if (puntos % 10 == 0){
                nivel = nivel + 1;
                restador_de_frame = restador_de_frame - 30;
            }
        }
        frame++;

        stage.draw();
        stage.act();
        spritebatch.begin();
        bitmapfont.draw(spritebatch,"Nivel: "+nivel,10,470);
        bitmapfont.draw(spritebatch,"puntos: "+puntos,550,470);
        spritebatch.end();
        moveradelante = 0;
        moveratras = 0;

        pelotarect = new Rectangle(pelotaPrincipal.getX(),pelotaPrincipal.getY(),pelotaPrincipal.getWidth(),pelotaPrincipal.getHeight());

        if (Lanza.rectangle.overlaps(pelotarect)){
            perdiste.setVisible(true);
            stage.addActor(new Fondo());
            perdiste.toFront();
        }
        if (Lapiz.lapirect.overlaps(pelotarect)){
            perdiste.setVisible(true);
            stage.addActor(new Fondo());
            perdiste.toFront();
        }
        if (Jeringa.jeringarect.overlaps(pelotarect)){
            perdiste.setVisible(true);
            stage.addActor(new Fondo());
            perdiste.toFront();
        }
        if (Dardo.dardorect.overlaps(pelotarect)){
            perdiste.setVisible(true);
            stage.addActor(new Fondo());
            perdiste.toFront();
        }
	}

    public void dispose()
    {
        stage.dispose();
        spritebatch.dispose();
    }

    static void ReiniciarJuego()
    {
        perdiste.setVisible(false);

        for (int i=0; i <cont_lanza.size(); i++)
        {
            cont_lanza.get(i).remove();
        }
        for (int i=0; i<cont_lapiz.size(); i++)
        {
            cont_lapiz.get(i).remove();
        }
        for (int i=0; i<cont_jeringa.size(); i++)
        {
            cont_jeringa.get(i).remove();
        }
        for (int i=0; i<cont_dardo.size(); i++)
        {
            cont_dardo.get(i).remove();
        }
        for (int i=0; i<cont_pelota.size(); i++)
        {
            cont_pelota.get(i).remove();
        }

        moveradelante = 0;
        moveratras = 0;
        movpel = 0;

        frame = 0;
        restador_de_frame = 1000;

        nivel = 0;
        puntos = -1;
    }
}
