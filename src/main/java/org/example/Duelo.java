package org.example;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

import listas.NodoDE;
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
                        }
                        else
                        {
                            //Primero consigo la vida del pokemno activo del jugador 2, del ataque consigo el daño que hace, Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                            pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - DamageDefense1(ataque, pokemon1, pokemon2));

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
                            pokemonJugador2(pokemon2).setVivo(false);
                        }
                        ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
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
                        ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
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

                        pokemonJugador1(pokemon1).setBuffActivado(true);
                        pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()*2);
                    }
                    ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
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
                        LOGMSSG = "";
                        pokemonJugador2(pokemon2).setBuffActivado(true);
                        pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()/2);
                    }
                    ataquePokemon1(ataque,pokemon1).setPP(ataquePokemon1(ataque,pokemon1).getPP()-1);
                }
            }
            //Default
            else if(ataquePokemon1(ataque, pokemon1) instanceof Default)
            {
                pokemonJugador2(pokemon2).setHP( pokemonJugador2(pokemon2).getHP() - ((Default) ataquePokemon1(ataque, pokemon1)).getDamage() );

                LOGMSSG = pokemonJugador1(pokemon1).getName() + " de " + jugador1.getNombre() + " ha hecho "+((Default) ataquePokemon1(ataque, pokemon1)).getDamage() +" de daño al mounstrito "+pokemonJugador2(pokemon2).getName();
                LOGMSSG = "";

                //checar si sigue vivo el pokemon
                if (pokemonJugador2(pokemon2).getHP() <= 0)
                {
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
                        }
                        else
                        {
                            //Primero consigo la vida del pokemno activo del jugador 2, del ataque consigo el daño que hace, Multiplico el daño por la vida del pokemon, para que me de un porcentaje
                            pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - DamageDefense2(ataque, pokemon1, pokemon2));
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

                        if(pokemonJugador1(pokemon1).isDebuffActivado())
                        {
                            pokemonJugador1(pokemon1).setDebuffActivado(false);
                            pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()*2);
                        }
                        //checar si sigue vivo el pokemon
                        if (pokemonJugador1(pokemon1).getHP() <= 0)
                        {
                            pokemonJugador1(pokemon1).setVivo(false);
                        }
                        ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
                    }
                }


            }
            //Healing
            else if (ataquePokemon1(ataque, pokemon1) instanceof Healing)
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
                        ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
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
                        pokemonJugador2(pokemon2).setBuffActivado(true);
                        pokemonJugador2(pokemon2).setDefense(pokemonJugador2(pokemon2).getDefense()*2);
                    }
                    ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
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
                        pokemonJugador1(pokemon1).setBuffActivado(true);
                        pokemonJugador1(pokemon1).setDefense(pokemonJugador1(pokemon1).getDefense()/2);
                    }
                    ataquePokemon2(ataque,pokemon2).setPP(ataquePokemon2(ataque,pokemon2).getPP()-1);
                }
            }
            //Default
            else if(ataquePokemon2(ataque, pokemon2) instanceof Default)
            {
                pokemonJugador1(pokemon1).setHP( pokemonJugador1(pokemon1).getHP() - ((Default) ataquePokemon2(ataque, pokemon2)).getDamage());
                //checar si sigue vivo el pokemon
                if (pokemonJugador1(pokemon1).getHP() <= 0)
                {
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
        LOGMSSG = "";

        //checar si sigue vivo el pokemon
        if (pokemonJugador1(pokemon1).getHP() <= 0)
        {
            pokemonJugador1(pokemon1).setVivo(false);
        }
    }
    public void Ulti1(int pokemon1, int pokemon2)
    {
        pokemonJugador2(pokemon2).setHP(pokemonJugador2(pokemon2).getHP() - pokemonJugador1(pokemon1).getUltimate());

        LOGMSSG = "El mounstrito "+ pokemonJugador1(pokemon1).getName() + "del jugador "+ jugador1.getNombre() + " ha usado su Ultimate!";
        LOGMSSG = "";

        //checar si sigue vivo el pokemon
        if (pokemonJugador1(pokemon2).getHP() <= 0)
        {
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


    public void Logger(String LOG, String DireccionArchivo) { // esta funcion basicamente va a guardar la linea de lo que pase en el momento ocurrir alguna interaccion
        // creo que lo ideales que cuando se cree una nueva batalla, se guarde un nuevo archivo txt para que no se junten todos los logs.
        try { // toma un archivo y escribe en el lo que se meta en el log
            BufferedWriter writer = new BufferedWriter(new FileWriter(DireccionArchivo));
            writer.write(LOG);
            writer.close();
        } catch (IOException ex) {
            System.out.println("NO se logeo bien papu");
        }
    }

    public static void LeerArchivo(String DireccionArchivo)
    {
        try { // para leer el log en tiempo real
            BufferedReader reader = new BufferedReader(new FileReader(DireccionArchivo));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


