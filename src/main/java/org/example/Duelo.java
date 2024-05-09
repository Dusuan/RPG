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
                                                .getDamage());
            }
        }
        catch(Exception e){

        }

    }


}
