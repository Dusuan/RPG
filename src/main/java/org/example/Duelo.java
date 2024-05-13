package org.example;

import movimientos.*;
import pokemones.Mounstritos;


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

    public Movimientos ataquePokemon1()
    {
        //funcion para encontrar el ataque seleccionado del pokemon actual
        try
        {
            return jugador1.getListaMounstritos().obtener(0).getAtaques().obtener(0);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del ataque del pokemon del jugador 1" + e.getMessage());

        }
        return null;
    }
    public Movimientos ataquePokemon2()
    {
        //funcion para encontrar el ataque seleccionado del pokemon actual
        try
        {
            return jugador2
                    .getListaMounstritos()
                    .obtener(0)
                    .getAtaques()
                    .obtener(0);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del ataque del pokemon del jugador 2" + e.getMessage());

        }
        return null;
    }

    public Mounstritos pokemonJugador2()
    {
        //funcion para encontrar al pokemon actual
        try
        {
            return jugador2.getListaMounstritos().obtener(0);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del pokemon del jugador 2" + e.getMessage());

        }
        return null;
    }
    public Mounstritos pokemonJugador1()
    {
        //funcion para encontrar al pokemon actual

        try
        {
            return jugador1.getListaMounstritos().obtener(0);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del pokemon del jugador 2" + e.getMessage());

        }
        return null;
    }

    public void movimientoPLayer1(int attk) {
        try {
            //Damage
            if (ataquePokemon1() instanceof Ataques) {
                //checar los elementos para ver si el ataque mas damage, sino hacer damage normal
                if (ataquePokemon1().getTipo() == pokemonJugador2().getDebilidades1() ||
                        ataquePokemon1().getTipo() == pokemonJugador2().getDebilidades2())
                {
                    double extraDamage = ((Ataques) ataquePokemon1()).getDamage() * .5;
                    pokemonJugador2().setHP(pokemonJugador2().getHP() - ((Ataques) ataquePokemon1()).getDamage() * pokemonJugador2().getMaxHP() +extraDamage);
                }
                else
                {
                    //Primero consigo la vida del pokemno activo del jugador 2, del ataque consigo el daño que hace, Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                    pokemonJugador2().setHP(pokemonJugador2().getHP() - ((Ataques) ataquePokemon1()).getDamage() * pokemonJugador2().getMaxHP());
                }
                //checar si sigue vivo el pokemon
                if (pokemonJugador2().getHP() <= 0) {
                    pokemonJugador2().setVivo(false);
                }
            }

            //Healing
            else if (ataquePokemon1() instanceof Healing) {
                //funcion para curar: checo si esta al tope de su vida, si no esta hago el heal
                if (pokemonJugador1().getHP() < pokemonJugador1().getMaxHP())
                {
                    pokemonJugador1().setHP(pokemonJugador1().getHP() + ((Healing) ataquePokemon1()).getHeal());

                    //checar si al sumar vida, esta es mayor a la vida max, si es, solo lo igualo a vida max y ya
                    if ((pokemonJugador1().getHP() + ((Healing) ataquePokemon1()).getHeal()) > pokemonJugador1().getMaxHP())
                    {
                        pokemonJugador1().setHP(pokemonJugador1().getMaxHP());
                    }
                }
            }
            else if (ataquePokemon1() instanceof buff)
            {

            }

        }
        catch (Exception e)
        {
            System.out.println("Ha ocurrido un error: relacionado con los movimientos" + e.getMessage());

        }

    }


    public void movimientoPLayer2(int attk) // solo lo copie y cambie los jugadores
    {
        try {
            if (jugador2.getListaMounstritos().obtener(0).getAtaques().obtener(0) instanceof Ataques) {
                //Primero consigo la vida del pokemno activo del jugador 1,
                //Del ataque consigo el daño que hace
                //Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                jugador1
                        .getListaMounstritos()
                        .obtener(0)
                        .setHP
                                (
                                        jugador1.getListaMounstritos()
                                                .obtener(0)
                                                .getHP() -
                                                ((Ataques) jugador2
                                                        .getListaMounstritos()
                                                        .obtener(0)
                                                        .getAtaques()
                                                        .obtener(0))
                                                        .getDamage() *
                                                        jugador1.getListaMounstritos()
                                                                .obtener(0)
                                                                .getMaxHP());
                //checar los elementos para ver si hace mas damage
                if (jugador2.getListaMounstritos().obtener(0).getAtaques().obtener(0).getTipo() == jugador1.getListaMounstritos().obtener(0).getDebilidades1() ||
                        jugador2.getListaMounstritos().obtener(0).getAtaques().obtener(0).getTipo() == jugador1.getListaMounstritos().obtener(0).getDebilidades2()) {
                    double extraDamage = ((Ataques) jugador2
                            .getListaMounstritos()
                            .obtener(0)
                            .getAtaques()
                            .obtener(0)
                    )
                            .getDamage() * .5;
                    jugador1
                            .getListaMounstritos()
                            .obtener(0)
                            .setHP
                                    (jugador1.getListaMounstritos().obtener(0).getHP() - extraDamage);

                }

                //checar si sigue vivo el pokemon
                if (jugador1.getListaMounstritos().obtener(0).getHP() <= 0) {
                    jugador1.getListaMounstritos()
                            .obtener(0)
                            .setVivo(false);
                }
            } else if (jugador2.getListaMounstritos().obtener(0).getAtaques().obtener(0) instanceof Healing) {
                jugador2
                        .getListaMounstritos()
                        .obtener(0)
                        .setHP
                                (
                                        jugador2.getListaMounstritos()
                                                .obtener(0)
                                                .getHP() +
                                                ((Healing) jugador2
                                                        .getListaMounstritos()
                                                        .obtener(0)
                                                        .getAtaques()
                                                        .obtener(0))
                                                        .getHeal());
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: relacionado con los movimientos" + e.getMessage());

        }

    }


    public void cambioPoke1(int poke) {

        try {
            if (jugador1.getListaMounstritos().obtener(poke).isVivo()) {
                jugador1
                        .getListaMounstritos()
                        .SwapPoke(poke); // implempente un metodo para cambiar dos nodos, no estoy seguro si funciona bien porque no es mi lista, pero segun yo deberia de jalar, REVISAR!
            } else {
                System.out.println("Este pokemon ha sido derrotado!");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error relacionado con el cambio de pokemon");
        }
    }

    public void cambioPoke2(int poke) {

        try {
            if (jugador2.getListaMounstritos().obtener(poke).isVivo()) {
                jugador2
                        .getListaMounstritos()
                        .SwapPoke(poke); // implempente un metodo para cambiar dos nodos, no estoy seguro si funciona bien porque no es mi lista, pero segun yo deberia de jalar, REVISAR!
            } else {
                System.out.println("Este pokemon ha sido derrotado!");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error relacionado con el cambio de pokemon");
        }
    }
}

