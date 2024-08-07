package org.example;
import java.io.*;
import java.util.Random;

import listas.ListaDE;
import movimientos.*;
import pokemones.Mounstritos;
public class Duelo {
    
    private static File Log;
    private int turno;
    private Jugador jugador1;
    private Jugador jugador2;
    
    private static int posicion1 = 0;
    private static int posicion2 = 0;
    
    private static double dañoAcumulado1 = 0;
    private static double dañoAcumulado2 = 0;

    public Duelo(int turno, Jugador jugador1, Jugador jugador2) {
        this.turno = turno;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.Log = null;
    }

    public File getLog() {
        return Log;
    }

    public void setLog(File log) {
        Log = log;
    }

    public String getLOGMSSG() {
        return LOGMSSG;
    }

    public void setLOGMSSG(String LOGMSSG) {
        this.LOGMSSG = LOGMSSG;
    }
    
    public int getPosicion1(){
        return posicion1;
    }
    
    public int getPosicion2(){
        return  posicion2;
    }
    
    public void setPosicion1(int posicion){
        posicion1 = posicion;
    }
    
     public void setPosicion2(int posicion){
        posicion2 = posicion;
    }
     
      public int getdañoAcumulado1(){
        return posicion1;
    }
    
    public int getdañoAcumulado2(){
        return  posicion2;
    }
    
    public void setdañoAcumulado1(double dañoAcumulado){
        dañoAcumulado1 = dañoAcumulado;
    }
    
    public void setdañoAcumulado2(double dañoAcumulado){
        dañoAcumulado2 = dañoAcumulado;
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

    public void nextTurn(){ // metodo para sumar de turno
        turno++;
    } // metodo tryhard

    public boolean endGame(int cant1,int cant2){

        if(cant1 == 0 || cant2 == 0){
            return true;
        }

        return false;

    }

    String LOGMSSG = "";

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
        pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()-(pokemonJugador2(pokemon2).getDefense()/2));
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
        double damage= (attack2(ataque,pokemon1,pokemon2)-((pokemonJugador1(pokemon1).getDefense()*attack2(ataque,pokemon1,pokemon2)))/100);
        pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()-(pokemonJugador1(pokemon1).getDefense()/2));
        return damage;
    }

    public double attack2(int ataque, int pokemon1, int pokemon2)
    {
        //consigo el daño del ataque del pokemon 1, y lo multiplico por la vida max del pokemon2
        double attack=((Ataques) ataquePokemon2(ataque, pokemon2)).getDamage() * pokemonJugador1(pokemon1).getMaxHP();
        return attack;
    }


  // ya hay logs de player1
    public void movimientoPLayer1(int ataque, int pokemon1, int pokemon2)
    {
        Random random = new Random();
        try {
            //Damage
            if (ataquePokemon1(ataque, pokemon1) instanceof Ataques)
            {
                if(ataquePokemon1(ataque,pokemon1).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon1(ataque, pokemon1).getAccuracy()>randomIntInRange)
                    {
                        //poner buff al daño
                        if(pokemonJugador1(pokemon1).isBuffActivado())
                        {
                            ((Ataques) ataquePokemon1(ataque,pokemon1)).setDamage(((Ataques) ataquePokemon1(ataque,pokemon1)).getDamage()*2);
                        }
                        //Ponerl el debuff en el daño
                        if(pokemonJugador1(pokemon1).isDebuffActivado())
                        {
                            ((Ataques) ataquePokemon1(ataque,pokemon1)).setDamage(((Ataques) ataquePokemon1(ataque,pokemon1)).getDamage()/2);
                        }

                        //checar los elementos para ver si el ataque mas damage, sino hacer damage normal
                        if (ataquePokemon1(ataque, pokemon1).getTipo().equals(pokemonJugador2(pokemon2).getDebilidades1()) ||
                                ataquePokemon1(ataque, pokemon1).getTipo().equals(pokemonJugador2(pokemon2).getDebilidades2()))
                        {
                            //consigo el daño extra, solo que este no esta afectado por el defense, hago la funcion normal para quitar vida, solo que le sumo el extra damage
                            pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - DamageDefense1(ataque, pokemon1, pokemon2));
                            double extraDamage = (attack1(ataque,pokemon1,pokemon2) * .5);
                            pokemonJugador2(pokemon2).setHP(pokemonJugador2(pokemon2).getHP() - (DamageDefense1(ataque, pokemon1, pokemon2)+extraDamage));

                            LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha usado " + ataquePokemon1(ataque, pokemon1).getNombre()+ " en " + pokemonJugador2(pokemon2).getName() + " causando " + ((Ataques) ataquePokemon1(ataque,pokemon1)).getDamage()+ " de daño!";
                            registrarLog(LOGMSSG);
                            LOGMSSG = "Ataque super efectivo! El ataque de " + pokemonJugador1(pokemon1).getName() + " obtuvo " + extraDamage + "mas de daño ";
                            registrarLog(LOGMSSG);

                            LOGMSSG = "";
                        }


                        else
                        {
                            //Primero consigo la vida del pokemno activo del jugador 2, del ataque consigo el daño que hace, Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                            pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - DamageDefense1(ataque, pokemon1, pokemon2));
                            LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha usado " + ataquePokemon1(ataque, pokemon1).getNombre()+ " en " + pokemonJugador2(pokemon2).getName() + " causando " + ((Ataques) ataquePokemon1(ataque,pokemon1)).getDamage()+ " de daño!";
                            registrarLog(LOGMSSG);
                            LOGMSSG = "";
                        }
                        //devolver el damage y el escudo a la normalidad despues de un buff
                        if(pokemonJugador1(pokemon1).isBuffActivado())
                        {
                            pokemonJugador1(pokemon1).setBuffActivado(false);
                            ((Ataques) ataquePokemon1(ataque,pokemon1)).setDamage(((Ataques) ataquePokemon1(ataque,pokemon1)).getDamage()/2);
                            pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()/2);
                        }

                        if(pokemonJugador1(pokemon1).isDebuffActivado())
                        {
                            ((Ataques) ataquePokemon1(ataque,pokemon1)).setDamage(((Ataques) ataquePokemon1(ataque,pokemon1)).getDamage()*2);
                        }

                        if(pokemonJugador2(pokemon2).isDebuffActivado())
                        {
                            pokemonJugador2(pokemon2).setDebuffActivado(false);
                            pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()*2);
                        }

                        //checar si sigue vivo el pokemon
                        if (pokemonJugador2(pokemon2).getHP() <= 0)
                        {
                            LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
                            registrarLog(LOGMSSG);
                            LOGMSSG = "";
                            pokemonJugador2(pokemon2).setVivo(false);
                        }
                        ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
                    }
                    else{
                        LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        ((Ataques)pokemonJugador1(pokemon1).getAtaques().obtener(ataque)).setAtaqueEfectivo(false);
                    }
                }
                else {
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - ((Default) ataquePokemon1(ataque, pokemon1)).getDamage());

                    LOGMSSG = pokemonJugador1(pokemon1).getName() + " de " + jugador1.getNombre() + " ha hecho "+((Default) ataquePokemon1(ataque, pokemon1)).getDamage() +" de daño al mounstrito "+pokemonJugador2(pokemon2).getName();
                    registrarLog(LOGMSSG);

                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador2(pokemon2).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setVivo(false);
                    }
                }
            }
            //Healing
            else if (ataquePokemon1(ataque, pokemon1) instanceof Healing)
            {
                int randomIntInRange = random.nextInt(100);
                if(ataquePokemon1(ataque,pokemon1).getPP()>0)
                {
                    if(ataquePokemon1(ataque, pokemon1).getAccuracy()>randomIntInRange)
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

                        LOGMSSG = pokemonJugador1(pokemon1).getName() + " se ha curado una cantidad de "+((Healing) ataquePokemon1(ataque, pokemon1)).getHeal()+ " de vida";
                        registrarLog(LOGMSSG);

                        LOGMSSG = "";

                    }
                    else{
                        LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);

                        LOGMSSG = "";
                    }
                    ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
                }
                else {
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - ((Default) ataquePokemon1(ataque, pokemon1)).getDamage());

                    LOGMSSG = pokemonJugador1(pokemon1).getName() + " de " + jugador1.getNombre() + " ha hecho "+((Default) ataquePokemon1(ataque, pokemon1)).getDamage() +" de daño al mounstrito "+pokemonJugador2(pokemon2).getName();
                    registrarLog(LOGMSSG);

                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador2(pokemon2).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setVivo(false);
                    }
                }
            }
            //buff
            else if (ataquePokemon1(ataque, pokemon1) instanceof buff)
            {
                if(ataquePokemon1(ataque,pokemon1).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon1(ataque, pokemon1).getAccuracy()>randomIntInRange)
                    {
                        LOGMSSG = pokemonJugador1(pokemon1).getName()+" de "+jugador1.getNombre() + " ha aumentado su defensa y su daño al doble!" ;
                        registrarLog(LOGMSSG);

                        LOGMSSG = "";

                        pokemonJugador1(pokemon1).setBuffActivado(true);
                        pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()*2);
                    }
                    else{
                        LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);

                        LOGMSSG = "";
                    }
                    ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);

                }
                else
                {
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - ((Default) ataquePokemon1(ataque, pokemon1)).getDamage());

                    LOGMSSG = pokemonJugador1(pokemon1).getName() + " de " + jugador1.getNombre() + " ha hecho "+((Default) ataquePokemon1(ataque, pokemon1)).getDamage() +" de daño al mounstrito "+pokemonJugador2(pokemon2).getName();
                    registrarLog(LOGMSSG);

                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador2(pokemon2).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setVivo(false);
                    }
                }
            }
            //Debuff
            else if(ataquePokemon1(ataque, pokemon1) instanceof Debuff)
            {
                if(ataquePokemon1(ataque,pokemon1).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon1(ataque, pokemon1).getAccuracy()>randomIntInRange)
                    {
                        LOGMSSG = pokemonJugador1(pokemon1).getName()+" de "+jugador1.getNombre() + " ha reducido la defensa de "+ pokemonJugador2(pokemon2).getName() + " a la mitad!" ;
                        registrarLog(LOGMSSG);

                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setDebuffActivado(true);
                        pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()/2);
                    }
                    else{
                        LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);

                        LOGMSSG = "";
                    }
                    ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
                }
                else{
                    pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - ((Default) ataquePokemon1(ataque, pokemon1)).getDamage());

                    LOGMSSG = pokemonJugador1(pokemon1).getName() + " de " + jugador1.getNombre() + " ha hecho "+((Default) ataquePokemon1(ataque, pokemon1)).getDamage() +" de daño al mounstrito "+pokemonJugador2(pokemon2).getName();
                    registrarLog(LOGMSSG);

                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador2(pokemon2).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setVivo(false);
                    }
                }
            }
            //Default
            else if(ataquePokemon1(ataque, pokemon1) instanceof Default)
            {
                pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - ((Default) ataquePokemon1(ataque, pokemon1)).getDamage());

                LOGMSSG = pokemonJugador1(pokemon1).getName() + " de " + jugador1.getNombre() + " ha hecho "+((Default) ataquePokemon1(ataque, pokemon1)).getDamage() +" de daño al mounstrito "+pokemonJugador2(pokemon2).getName();
                registrarLog(LOGMSSG);

                LOGMSSG = "";

                //checar si sigue vivo el pokemon
                if (pokemonJugador2(pokemon2).getHP() <= 0)
                {
                    LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
                    registrarLog(LOGMSSG);
                    LOGMSSG = "";
                    pokemonJugador2(pokemon2).setVivo(false);
                }
            }
            //Error
            else
            {
                System.out.println("Ha ocurrido un error: ninguno de los else if de movimientos se cumplio");
            }
        }
        catch (Exception e)
        {
            System.out.println("Ha ocurrido un error: relacionado con los movimientos" + e.getMessage());

        }
    }

    public void movimientoPLayer2(int ataque, int pokemon1, int pokemon2)
    {
        Random random = new Random();
        try {
            if (ataquePokemon2(ataque, pokemon2) instanceof Ataques)
            {
                if(ataquePokemon2(ataque,pokemon2).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon2(ataque, pokemon2).getAccuracy()>randomIntInRange)
                    {
                        //poner buff al daño
                        if(pokemonJugador2(pokemon2).isBuffActivado())
                        {
                            ((Ataques) ataquePokemon2(ataque,pokemon2)).setDamage(((Ataques) ataquePokemon2(ataque,pokemon2)).getDamage()*2);
                        }
                        //Ponerl el debuff en el daño
                        if(pokemonJugador2(pokemon2).isDebuffActivado())
                        {
                            ((Ataques) ataquePokemon2(ataque,pokemon2)).setDamage(((Ataques) ataquePokemon2(ataque,pokemon2)).getDamage()/2);
                        }
                        //checar los elementos para ver si el ataque mas damage, sino hacer damage normal
                        if (ataquePokemon2(ataque, pokemon2).getTipo().equals(pokemonJugador1(pokemon1).getDebilidades1()) ||
                                ataquePokemon2(ataque, pokemon2).getTipo().equals(pokemonJugador1(pokemon1).getDebilidades2()))
                        {
                            //consigo el daño extra, solo que este no esta afectado por el defense, hago la funcion normal para quitar vida, solo que le sumo el extra damage
                            pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - DamageDefense2(ataque, pokemon1, pokemon2));
                            double extraDamage = (attack2(ataque,pokemon1,pokemon2) * .5);
                            pokemonJugador1(pokemon1).setHP(pokemonJugador1(pokemon1).getHP() - (DamageDefense2(ataque, pokemon1, pokemon2)+extraDamage));


                            LOGMSSG = pokemonJugador2(pokemon2).getName() + " ha usado " + ataquePokemon2(ataque, pokemon2).getNombre()+ " en " + pokemonJugador1(pokemon1).getName() + " causando " + ((Ataques) ataquePokemon2(ataque,pokemon2)).getDamage()+ " de daño!";
                            registrarLog(LOGMSSG);

                            LOGMSSG = "Ataque super efectivo! El ataque de " + pokemonJugador1(pokemon1).getName() + " obtuvo " + extraDamage + "mas de daño ";
                            registrarLog(LOGMSSG);

                            LOGMSSG = "";


                        }
                        else
                        {
                            //Primero consigo la vida del pokemno activo del jugador 2, del ataque consigo el daño que hace, Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                            pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - DamageDefense2(ataque, pokemon1, pokemon2));
                            LOGMSSG = pokemonJugador2(pokemon2).getName() + " ha usado " + ataquePokemon2(ataque, pokemon2).getNombre()+ " en " + pokemonJugador1(pokemon1).getName() + " causando " + ((Ataques) ataquePokemon2(ataque,pokemon2)).getDamage()+ " de daño!";
                            registrarLog(LOGMSSG);
                            LOGMSSG = "";
                        }
                        //devolver el damage y el escudo a la normalidad despues de un buff
                        if(pokemonJugador2(pokemon2).isBuffActivado())
                        {
                            pokemonJugador2(pokemon2).setBuffActivado(false);
                            ((Ataques) ataquePokemon2(ataque,pokemon2)).setDamage(((Ataques) ataquePokemon2(ataque,pokemon2)).getDamage()/2);
                            pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()/2);
                        }

                        if(pokemonJugador2(pokemon2).isDebuffActivado())
                        {
                            ((Ataques) ataquePokemon2(ataque,pokemon2)).setDamage(((Ataques) ataquePokemon2(ataque,pokemon2)).getDamage()*2);
                        }

                        if(pokemonJugador2(pokemon2).isDebuffActivado())
                        {
                            pokemonJugador2(pokemon1).setDebuffActivado(false);
                            pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()*2);
                        }
                        //checar si sigue vivo el pokemon
                        if (pokemonJugador1(pokemon1).getHP() <= 0)
                        {
                            LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
                            registrarLog(LOGMSSG);
                            LOGMSSG = "";
                            pokemonJugador1(pokemon1).setVivo(false);
                        }
                        ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
                    }
                    else{
                        LOGMSSG = pokemonJugador2(pokemon2).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        ((Ataques)pokemonJugador2(pokemon2).getAtaques().obtener(ataque)).setAtaqueEfectivo(false); // Aqui se implemneta el booleano
                    }
                }
                else {
                    pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - ((Default) ataquePokemon2(ataque, pokemon2)).getDamage());
                    LOGMSSG = pokemonJugador2(pokemon2).getName() + " de " + jugador2.getNombre() + " ha hecho "+((Default) ataquePokemon2(ataque, pokemon2)).getDamage() +" de daño al mounstrito "+pokemonJugador1(pokemon1).getName();
                    registrarLog(LOGMSSG);
                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador1(pokemon1).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador1(pokemon1).setVivo(false);
                    }
                }

            }
            //Healing
            else if (ataquePokemon2(ataque, pokemon1) instanceof Healing)
            {
                if(ataquePokemon2(ataque,pokemon2).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon2(ataque, pokemon2).getAccuracy()>randomIntInRange)
                    {
                        //funcion para curar: checo si esta al tope de su vida, si no esta hago el heal
                        if (pokemonJugador2(pokemon2).getHP() < pokemonJugador2(pokemon2).getMaxHP())
                        {
                            pokemonJugador2(pokemon2).setHP(pokemonJugador2(pokemon2).getHP() + ((Healing) ataquePokemon2(ataque, pokemon2)).getHeal());

                            //checar si al sumar vida, esta es mayor a la vida max, si es, solo lo igualo a vida max y ya
                            if ((pokemonJugador2(pokemon2).getHP() + ((Healing) ataquePokemon2(ataque, pokemon2)).getHeal()) > pokemonJugador2(pokemon2).getMaxHP())
                            {
                                pokemonJugador2(pokemon2).setHP(pokemonJugador2(pokemon2).getMaxHP());
                            }
                        }
                        LOGMSSG = pokemonJugador2(pokemon2).getName() + " se ha curado una cantidad de "+((Healing) ataquePokemon2(ataque, pokemon2)).getHeal()+ " de vida";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                    }
                    else{
                        LOGMSSG = pokemonJugador2(pokemon2).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                    }
                    ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
                }
                else {
                    pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - ((Default) ataquePokemon2(ataque, pokemon2)).getDamage());
                    LOGMSSG = pokemonJugador2(pokemon2).getName() + " de " + jugador2.getNombre() + " ha hecho "+((Default) ataquePokemon2(ataque, pokemon2)).getDamage() +" de daño al mounstrito "+pokemonJugador1(pokemon1).getName();
                    registrarLog(LOGMSSG);
                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador1(pokemon1).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador1(pokemon1).setVivo(false);
                    }
                }


            }
            //buff
            else if (ataquePokemon2(ataque, pokemon2) instanceof buff)
            {
                if(ataquePokemon2(ataque,pokemon2).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon2(ataque, pokemon2).getAccuracy()>randomIntInRange)
                    {
                        LOGMSSG = pokemonJugador2(pokemon2).getName()+" de "+jugador2.getNombre() + " ha aumentado su defensa el doble!" ;
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setBuffActivado(true);
                        pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()*2);
                    }
                    else{
                        LOGMSSG = pokemonJugador1(pokemon1).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                    }
                    ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);

                }
                else {
                    pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - ((Default) ataquePokemon2(ataque, pokemon2)).getDamage());
                    LOGMSSG = pokemonJugador2(pokemon2).getName() + " de " + jugador2.getNombre() + " ha hecho "+((Default) ataquePokemon2(ataque, pokemon2)).getDamage() +" de daño al mounstrito "+pokemonJugador1(pokemon1).getName();
                    registrarLog(LOGMSSG);
                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador1(pokemon1).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador1(pokemon1).setVivo(false);
                    }
                }
            }
            //Debuff
            else if(ataquePokemon2(ataque, pokemon2) instanceof Debuff)
            {
                if(ataquePokemon2(ataque,pokemon2).getPP()>0)
                {
                    int randomIntInRange = random.nextInt(100);
                    if(ataquePokemon2(ataque, pokemon2).getAccuracy()>randomIntInRange)
                    {
                        LOGMSSG = pokemonJugador2(pokemon2).getName()+" de "+jugador2.getNombre() + " ha reducido la defensa de "+ pokemonJugador1(pokemon1).getName() + " a la mitad!" ;
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador1(pokemon1).setBuffActivado(true);
                        pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()/2);
                    }
                    else{
                        LOGMSSG = pokemonJugador2(pokemon2).getName() + " ha fallado!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                    }
                    ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
                }
                else
                {
                    pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - ((Default) ataquePokemon2(ataque, pokemon2)).getDamage());
                    LOGMSSG = pokemonJugador2(pokemon2).getName() + " de " + jugador2.getNombre() + " ha hecho "+((Default) ataquePokemon2(ataque, pokemon2)).getDamage() +" de daño al mounstrito "+pokemonJugador1(pokemon1).getName();
                    registrarLog(LOGMSSG);
                    LOGMSSG = "";

                    //checar si sigue vivo el pokemon
                    if (pokemonJugador1(pokemon1).getHP() <= 0)
                    {
                        LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
                        registrarLog(LOGMSSG);
                        LOGMSSG = "";
                        pokemonJugador1(pokemon1).setVivo(false);
                    }
                }
            }
            //Default
            else if(ataquePokemon2(ataque, pokemon2) instanceof Default)
            {
                pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - ((Default) ataquePokemon2(ataque, pokemon2)).getDamage());
                LOGMSSG = pokemonJugador2(pokemon2).getName() + " de " + jugador2.getNombre() + " ha hecho "+((Default) ataquePokemon2(ataque, pokemon2)).getDamage() +" de daño al mounstrito "+pokemonJugador1(pokemon1).getName();
                registrarLog(LOGMSSG);
                LOGMSSG = "";

                //checar si sigue vivo el pokemon
                if (pokemonJugador1(pokemon1).getHP() <= 0)
                {
                    LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
                    registrarLog(LOGMSSG);
                    LOGMSSG = "";
                    pokemonJugador1(pokemon1).setVivo(false);
                }
            }
            //Error
            else
            {
                System.out.println("Ha ocurrido un error: ninguno de los else if de movimientos se cumplio");
            }
        }
        catch (Exception e)
        {
            System.out.println("Ha ocurrido un error: relacionado con los movimientos" + e.getMessage());

        }
    }




    // hay logmssg

    public void Ulti2(int pokemon1, int pokemon2)
    {
        pokemonJugador1(pokemon1).setHP(pokemonJugador1(pokemon1).getHP() - pokemonJugador2(pokemon2).getUltimate());

        LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha usado su Ultimate!";
        registrarLog(LOGMSSG);
        LOGMSSG = "";

        //checar si sigue vivo el pokemon
        if (pokemonJugador1(pokemon1).getHP() <= 0)
        {
            LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha fallecido!";
            registrarLog(LOGMSSG);
            LOGMSSG = "";
            pokemonJugador1(pokemon1).setVivo(false);
        }
    }
    public void Ulti1(int pokemon1, int pokemon2)
    {
        pokemonJugador2(pokemon2).setHP(pokemonJugador2(pokemon2).getHP() - pokemonJugador1(pokemon1).getUltimate());

        LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha usado su Ultimate!";
        registrarLog(LOGMSSG);
        LOGMSSG = "";

        //checar si sigue vivo el pokemon
        if (pokemonJugador1(pokemon2).getHP() <= 0)
        {
            LOGMSSG = "El mounstrito "+ pokemonJugador2(pokemon2).getName() + "del jugador "+ jugador2.getNombre() + " ha fallecido!";
            registrarLog(LOGMSSG);
            LOGMSSG = "";
            pokemonJugador2(pokemon2).setVivo(false);
        }
    }



    // hay logmssg
    public void cambioPoke1(int poke)
    {
        try
        {
            if (jugador1.getListaMounstritos().obtener(poke).isVivo())
            {
                jugador1
                        .getListaMounstritos()
                        .SwapPoke(poke); // implempente un metodo para cambiar dos nodos, no estoy seguro si funciona bien porque no es mi lista, pero segun yo deberia de jalar, REVISAR!
                LOGMSSG = jugador1.getNombre()+" ha cambiado "+jugador1.getListaMounstritos().obtener(0).getName()+ " por "+jugador1.getListaMounstritos().obtener(poke).getName();
                registrarLog(LOGMSSG);
                LOGMSSG = "";
            }
            else
            {
                System.out.println("Este pokemon ha sido derrotado!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Ocurrio un error relacionado con el cambio de pokemon");
        }
    }


    // hay logmssg
    public void cambioPoke2(int poke)
    {
        try
        {
            if (jugador2.getListaMounstritos().obtener(poke).isVivo())
            {
                jugador2
                        .getListaMounstritos()
                        .SwapPoke(poke); // implempente un metodo para cambiar dos nodos, no estoy seguro si funciona bien porque no es mi lista, pero segun yo deberia de jalar!
                        LOGMSSG = jugador2.getNombre()+" ha cambiado "+jugador2.getListaMounstritos().obtener(0).getName()+ " por "+jugador2.getListaMounstritos().obtener(poke).getName();
                        registrarLog(LOGMSSG);

                        LOGMSSG = " ";


            }
            else
            {
                System.out.println("Este pokemon ha sido derrotado!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Ocurrio un error relacionado con el cambio de pokemon");
        }
    }

 // ya hay logmssg en los dos items
    public void UsarITEMJugador1(int pos) { // dentro de usar item ya estan los logs
        try{
        Items item = jugador1.getObjetos().obtener(pos);
        if(item.isUsado()){
            System.out.println("El item ya ha sido usado");
        }
        else {
            item.UsarItem(jugador1, jugador2);
        }
        }catch(Exception e){
            System.out.println("Error en UsarITEMJugador1");
        }
    }
    public void UsarITEMJugador2(int pos) { // dentro de el metodo usar item ya estan los logs
        try{
            Items item = jugador2.getObjetos().obtener(pos);
            if(item.isUsado()){
                System.out.println("El item ya ha sido usado");
            }
            else {
                item.UsarItem(jugador2, jugador1);
            }
        }catch(Exception e){
            System.out.println("Error en UsarITEMJugador1");
        }
    }


//    public void Logger(String LOG, String DireccionArchivo) { // esta funcion basicamente va a guardar la linea de lo que pase en el momento ocurrir alguna interaccion
//        // creo que lo ideales que cuando se cree una nueva batalla, se guarde un nuevo archivo txt para que no se junten todos los logs.
//        try { // toma un archivo y escribe en el lo que se meta en el log
//            BufferedWriter writer = new BufferedWriter(new FileWriter(DireccionArchivo));
//            writer.write(LOG);
//            writer.close();
//        } catch (IOException ex) {
//            System.out.println("NO se logeo bien papu");
//        }
//    }

    public static void IniciarLogDuelo() {
        int batalla;
        Random help = new Random();
        batalla = help.nextInt();
        try {
            String nombreArchivo = batalla + ".txt";
            File projectDir = new File(System.getProperty("user.dir"));
            File directorioLogs = new File(projectDir, "LOGS");
            if (!directorioLogs.exists()) {
                directorioLogs.mkdirs();
            }
            Log = new File(directorioLogs, nombreArchivo);
            if (!Log.exists()) {
                Log.createNewFile();
            }
            // Writing the initial log entry
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(Log, true))) {
                writer.write("Comienza el duelo " + batalla + "\n");
                System.out.println("Log file created: " + Log.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void registrarLog(String log) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Log, true))) {
            writer.write(log + "\n");
            writer.close();
            System.out.println("Log: " + log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void finalizarRegistroDuelo() {
        if (Log != null) {
            Log = null;
        }
    }

    public boolean ChecarEquipoVivo(Jugador jugador){
        ListaDE<Mounstritos>  equipo = jugador.getListaMounstritos();
    try {
        for (int i = 0; i < equipo.size(); i++) {
            if (equipo.obtener(i).isVivo()) {
                return true;
            }
        }
    }catch(Exception e ){
        System.out.println("Error en ChecarEquipoVIvo");
    }
        return false;
    }
}


