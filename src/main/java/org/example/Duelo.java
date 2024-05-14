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


    // funciones del Pokemon 1
    public Movimientos ataquePokemon1(int ataque, int pokemon1)
    {
        //funcion para encontrar el ataque seleccionado del pokemon actual
        try
        {
            return jugador1.getListaMounstritos().obtener(pokemon1).getAtaques().obtener(ataque);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del ataque del pokemon del jugador 1" + e.getMessage());

        }
        return null;
    }
    public Mounstritos pokemonJugador1(int pokemon1)
    {
        //funcion para encontrar al pokemon actual

        try
        {
            return jugador1.getListaMounstritos().obtener(pokemon1);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del pokemon del jugador 2" + e.getMessage());

        }
        return null;
    }

    public double DamageDefense1(int ataque, int pokemon1, int pokemon2)
    {
        //hago una regla de 3, consigo attack que es igual al 100%, multiplico attack por el defense, y se lo resto al attack y luego disminuyo por la mitad el defense
        double damage= (attack1(ataque,pokemon1,pokemon2)-(pokemonJugador2(pokemon2).getDefense()*attack1(ataque,pokemon1,pokemon2))/100);
        pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()-pokemonJugador2(pokemon2).getDefense()/2);
        return damage;
    }

    public double attack1(int ataque, int pokemon1, int pokemon2)
    {
        //consigo el daño del ataque del pokemon 1, y lo multiplico por la vida max del pokemon2
        double attack=((Ataques) ataquePokemon1(ataque, pokemon1)).getDamage() * pokemonJugador2(pokemon2).getMaxHP();
        return attack;
    }

    // funciones del Pokemon 2
    public Movimientos ataquePokemon2(int ataque, int pokemon2)
    {
        //funcion para encontrar el ataque seleccionado del pokemon actual
        try
        {
            return jugador2
                    .getListaMounstritos()
                    .obtener(pokemon2)
                    .getAtaques()
                    .obtener(ataque);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del ataque del pokemon del jugador 2" + e.getMessage());

        }
        return null;
    }

    public Mounstritos pokemonJugador2(int pokemon2)
    {
        //funcion para encontrar al pokemon actual
        try
        {
            return jugador2.getListaMounstritos().obtener(pokemon2);
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error en la busqueda del pokemon del jugador 2" + e.getMessage());

        }
        return null;
    }

    public double DamageDefense2(int ataque, int pokemon1, int pokemon2)
    {
        //hago una regla de 3, consigo attack que es igual al 100%, multiplico attack por el defense, y se lo resto al attack y luego disminuyo por la mitad el defense
        double damage= (attack2(ataque,pokemon1,pokemon2)-(pokemonJugador1(pokemon1).getDefense()*attack2(ataque,pokemon1,pokemon2))/100);
        pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()-pokemonJugador1(pokemon1).getDefense()/2);
        return damage;
    }

    public double attack2(int ataque, int pokemon1, int pokemon2)
    {
        //consigo el daño del ataque del pokemon 1, y lo multiplico por la vida max del pokemon2
        double attack=((Ataques) ataquePokemon2(ataque, pokemon2)).getDamage() * pokemonJugador1(pokemon1).getMaxHP();
        return attack;
    }

    public void movimientoPLayer1(int ataque, int pokemon1, int pokemon2)
    {
        try {
            //Damage
            if (ataquePokemon1(ataque, pokemon1) instanceof Ataques)
            {
                //checar los elementos para ver si el ataque mas damage, sino hacer damage normal
                if (ataquePokemon1(ataque, pokemon1).getTipo() == pokemonJugador2(pokemon2).getDebilidades1() ||
                        ataquePokemon1(ataque, pokemon1).getTipo() == pokemonJugador2(pokemon2).getDebilidades2())
                {
                    //consigo el daño extra, solo que este no esta afectado por el defense, hago la funcion normal para quitar vida, solo que le sumo el extra damage
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - DamageDefense1(ataque, pokemon1, pokemon2));
                    double extraDamage = (attack1(ataque,pokemon1,pokemon2) * .5);
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - (DamageDefense1(ataque, pokemon1, pokemon2)+extraDamage));
                }
                else
                {
                    //Primero consigo la vida del pokemno activo del jugador 2, del ataque consigo el daño que hace, Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - DamageDefense1(ataque, pokemon1, pokemon2));

                }

                //checar si sigue vivo el pokemon
                if (pokemonJugador2(pokemon2).getHP() <= 0)
                {
                    pokemonJugador2(pokemon2).setVivo(false);
                }
            }

            //Healing
            else if (ataquePokemon1(ataque, pokemon1) instanceof Healing)
            {
                //funcion para curar: checo si esta al tope de su vida, si no esta hago el heal
                if (pokemonJugador1(pokemon1).getHP() < pokemonJugador1(pokemon1).getMaxHP())
                {
                    pokemonJugador1(pokemon1).setHP(pokemonJugador1(pokemon1).getHP() + ((Healing) ataquePokemon1(ataque, pokemon1)).getHeal());

                    //checar si al sumar vida, esta es mayor a la vida max, si es, solo lo igualo a vida max y ya
                    if ((pokemonJugador1(pokemon1).getHP() + ((Healing) ataquePokemon1(ataque, pokemon1)).getHeal()) > pokemonJugador1(pokemon1).getMaxHP())
                    {
                        pokemonJugador1(pokemon1).setHP(pokemonJugador1(pokemon1).getMaxHP());
                    }
                }
            }
            else if (ataquePokemon1(ataque, pokemon1) instanceof buff)
            {
                pokemonJugador1(pokemon1).getDefense();
                ((buff) ataquePokemon1(ataque, pokemon1)).setBuffActivado(true);
            }

        }
        catch (Exception e)
        {
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

