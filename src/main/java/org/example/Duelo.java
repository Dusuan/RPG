package org.example;

import movimientos.Ataques;
import movimientos.buff;
import movimientos.Default;
import movimientos.Healing;


public class Duelo {
    private int turno;
    private Jugador jugador1;
    private Jugador jugador2;

    public Duelo(int turno, Jugador jugador1, Jugador jugador2) {
        this.turno = turno;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public void movimientoPLayer1(int attk)
    {
        try{
            if( jugador1.getListaMounstritos().obtener(0).getAtaques().obtener(0) instanceof Ataques){
                //Primero consigo la vida del pokemno activo del jugador 2,
                //Del ataque consigo el daño que hace
                //Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                jugador2
                        .getListaMounstritos()
                        .obtener(0)
                        .setHP
                                (
                                        jugador2.getListaMounstritos()
                                                .obtener(0)
                                                .getHP() -
                                                ((Ataques) jugador1
                                                .getListaMounstritos()
                                                .obtener(0)
                                                .getAtaques()
                                                .obtener(0))
                                                .getDamage()*
                                                        jugador2.getListaMounstritos()
                                                        .obtener(0)
                                                        .getHP());
            }
            else if( jugador1.getListaMounstritos().obtener(0).getAtaques().obtener(0) instanceof Healing){
                jugador1
                        .getListaMounstritos()
                        .obtener(0)
                        .setHP
                                (
                                        jugador1.getListaMounstritos()
                                                .obtener(0)
                                                .getHP() +
                                                ((Healing) jugador1
                                                        .getListaMounstritos()
                                                        .obtener(0)
                                                        .getAtaques()
                                                        .obtener(0))
                                                        .getHeal());
            }
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error: relacionado con los movimientos" + e.getMessage());

        }

    }





}
