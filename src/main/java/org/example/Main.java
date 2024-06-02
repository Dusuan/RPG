package org.example;

import listas.ListaDE;
import movimientos.*;
import org.example.ItemsDefinidos.*;

import pokemones.*;

import java.util.*;

public class Main {

    public static void MousntritosMatch(ListaDE<Mounstritos> mons,ListaDE<Mounstritos> monsPlayer1,ListaDE<Mounstritos> monsPlayer2) throws Exception { // Este es el metodo para seleccionar 4 mounstritos al azar para cada juagdor y que no se repitan

        Random random = new Random();
        Set<Integer> mousntritosSeleccionados = new HashSet<>(); // Se usa un Hashset para guaradr los indices de los pokemones ya utilizados

        while(monsPlayer1.size() < 4){

            int index = random.nextInt(mons.size()); // se obtiene un indice random dependiendo del tamaño de la lista

            if(!mousntritosSeleccionados.contains(index)) { // si el indice no esta en el set contunua el codigo
                monsPlayer1.adicionar(mons.obtener(index)); // se adiciona a la lista nueva el mounstrito seleccionado
                mousntritosSeleccionados.add(index); // se guarda el indice para que no se repita
            }

        }

        while(monsPlayer2.size() < 4){

            int index = random.nextInt(mons.size()); // se obtiene un indice random dependiendo del tamaño de la lista del jugador 2

            if(!mousntritosSeleccionados.contains(index)) { // si el indice no esta en el set contunua el codigo
                monsPlayer2.adicionar(mons.obtener(index)); // se adiciona a la lista del jugador 2 el mounstrito seleccionado
                mousntritosSeleccionados.add(index); // se guarda el indice para que no se repita
            }

        }

    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Estan en el orden del Docs
        //Movimientos

        //Ataques
        Movimientos num1 = new Ataques("Fuego", "FIREBALL", 75, 5, 50);
        Movimientos num2 = new Ataques("Fuego", "Bucle Infinito", 33, 2, 200);
        Movimientos num3 = new Ataques("Fuego", "Funa Intensiva", 32, 4, 100);
        Movimientos num4 = new Ataques("Fuego", "Try-Catch", 45, 3, 125);
        Movimientos num5 = new Ataques("Fuego", "JS", 15, 1, 500);

        Movimientos num6 = new Ataques("Aire", "Borrar System 32", 10, 1, 500);
        Movimientos num7 = new Ataques("Aire", "Air Pods Pro Max", 75, 4, 70);
        Movimientos num8 = new Ataques("Agua", "Costas Clasistas", 40, 3, 95);
        Movimientos num9 = new Ataques("Agua", "Mago de Hielo", 20, 2, 195);
        Movimientos num10 = new Ataques("Planta", "Mari-IGUANA", 50, 3, 90);

        Movimientos num11 = new Ataques("Roca", "Meteorito Temporada 8", 33, 2, 125);
        Movimientos num12 = new Ataques("Planta", "Lanza-Guisantes", 75, 5, 40);
        Movimientos num13 = new Ataques("Planta", "Cacahuete", 15, 1, 280);
        Movimientos num14 = new Ataques("Agua", "Chorros Chorreantes", 65, 4, 60);
        Movimientos num15 = new Ataques("Roca", "Paris blast", 10, 1, 550);

        Movimientos num16 = new Ataques("Roca", "Backend in JS", 50, 3, 100);
        Movimientos num17 = new Ataques("Aire", "Aniversario Volaris", 20, 3, 95);
        Movimientos num18 = new Ataques("Agua", "Mini Pekka", 11, 1, 500);
        Movimientos num19 = new Ataques("Aire", "ICloud full", 66, 5, 45);
        Movimientos num20 = new Ataques("Roca", "Maze", 80, 5, 55);

        Movimientos num21 = new Ataques("Planta", "Cebolla", 25, 2, 175);
        Movimientos num22 = new Ataques("Aire", "Vientos Vientosos", 21, 2, 155);
        Movimientos num23 = new Ataques("Agua", "Water Fall", 85, 5, 35);
        Movimientos num24 = new Ataques("Planta", "Pasto Fino", 65, 4, 80);
        Movimientos num25 = new Ataques("Roca", "Bowler", 45, 4, 85);

        //Healing
        Movimientos num26 = new Healing("Planta", "Plantitas Planteras", 70, 5, 50);
        Movimientos num27 = new Healing("Agua", "Oleas Oleadas", 50, 4, 100);
        Movimientos num28 = new Healing("Aire", "Aires Clasistas", 40, 3, 150);
        Movimientos num29 = new Healing("Roca", "Rocky", 33, 2, 175);
        Movimientos num30 = new Healing("Fuego", "Fueguitos", 10, 1, 250);

        //Buff and Debuff

        Movimientos num31 = new buff("Agua", "OMG", 50, 3);
        Movimientos num32 = new Debuff("Fuego", "Tacos", 30, 2);

        ListaDE<Movimientos> movimientosPlayers = new ListaDE<>();

        movimientosPlayers.adicionar(num1);
        movimientosPlayers.adicionar(num2);
        movimientosPlayers.adicionar(num3);
        movimientosPlayers.adicionar(num4);
        movimientosPlayers.adicionar(num5);

        movimientosPlayers.adicionar(num6);
        movimientosPlayers.adicionar(num7);
        movimientosPlayers.adicionar(num8);
        movimientosPlayers.adicionar(num9);
        movimientosPlayers.adicionar(num10);

        movimientosPlayers.adicionar(num11);
        movimientosPlayers.adicionar(num12);
        movimientosPlayers.adicionar(num13);
        movimientosPlayers.adicionar(num14);
        movimientosPlayers.adicionar(num15);

        movimientosPlayers.adicionar(num16);
        movimientosPlayers.adicionar(num17);
        movimientosPlayers.adicionar(num18);
        movimientosPlayers.adicionar(num19);
        movimientosPlayers.adicionar(num20);

        movimientosPlayers.adicionar(num21);
        movimientosPlayers.adicionar(num22);
        movimientosPlayers.adicionar(num23);
        movimientosPlayers.adicionar(num24);
        movimientosPlayers.adicionar(num25);

        movimientosPlayers.adicionar(num26);
        movimientosPlayers.adicionar(num27);
        movimientosPlayers.adicionar(num28);
        movimientosPlayers.adicionar(num29);
        movimientosPlayers.adicionar(num30);

        movimientosPlayers.adicionar(num31);
        movimientosPlayers.adicionar(num32);

        //Creacion de Mounstritos

        ListaDE<Mounstritos> pokemones = new ListaDE<>();

        //Mousntritos

        Mounstritos mon1 = new tipoFuego("Andy Chad", 200, 200, movimientosPlayers, 500, 200, "No definido", true);
        Mounstritos mon2 = new tipoRoca("Many Dormilon", 500, 500, movimientosPlayers, 100, 50, "No definido", true);
        Mounstritos mon3 = new tipoAgua("Pepino White", 300, 350, movimientosPlayers, 200, 75, "No definido", true);
        Mounstritos mon4 = new tipoAire("Blind Guy", 250, 250, movimientosPlayers, 175, 100, "No definido", true);
        Mounstritos mon5 = new tipoFuego("Huh Guy", 300, 350, movimientosPlayers, 350, 50, "No definido", true);

        Mounstritos mon6 = new tipoPlanta("White Bro", 200, 200, movimientosPlayers, 300, 150, "No definido", true);
        Mounstritos mon7 = new tipoAire("Helicopter", 400, 400, movimientosPlayers, 400, 20, "No definido", true);
        Mounstritos mon8 = new tipoRoca("Juan", 450, 450, movimientosPlayers, 90, 50, "No definido", true);
        Mounstritos mon9 = new tipoRoca("Omni-Man", 350, 350, movimientosPlayers, 400, 25, "No definido", true);
        Mounstritos mon10 = new tipoPlanta("Pepina", 200, 200, movimientosPlayers, 200, 100, "No definido", true);

        Mounstritos mon11 = new tipoAgua("Te Falta Alcohol", 350, 350, movimientosPlayers, 1000, 300, "No definido", true);
        Mounstritos mon12 = new tipoFuego("No quema Cuh", 250, 250, movimientosPlayers, 350, 120, "No definido", true);
        Mounstritos mon13 = new tipoFuego("Kenny", 1, 1, movimientosPlayers, 300, 100, "No definido", true);
        Mounstritos mon14 = new tipoPlanta("Uwu", 200, 200, movimientosPlayers, 275, 150, "No definido", true);
        Mounstritos mon15 = new tipoAgua("NPC AVERAGE", 150, 250, movimientosPlayers, 325, 250, "No definido", true);

        Mounstritos mon16 = new tipoAgua("Frozono", 240, 240, movimientosPlayers, 300, 75, "No definido", true);
        Mounstritos mon17 = new tipoAire("Ting Ling", 220, 220, movimientosPlayers, 250, 100, "No definido", true);
        Mounstritos mon18 = new tipoFuego("Wilson", 350, 350, movimientosPlayers, 450, 125, "No definido", true);
        Mounstritos mon19 = new tipoAire("Va a ganar el Cruz Azul we", 150, 250, movimientosPlayers, 250, 50, "No definido", true);
        Mounstritos mon20 = new tipoPlanta("NPC", 150, 150, movimientosPlayers, 200, 75, "No definido", true);

        Mounstritos mon21 = new tipoAire("OMG", 300, 300, movimientosPlayers, 300, 175, "No definido", true);
        Mounstritos mon22 = new tipoRoca("KikeKun", 500, 500, movimientosPlayers, 200, 20, "No definido", true);
        Mounstritos mon23 = new tipoPlanta("Eric-Chan", 80, 80, movimientosPlayers, 150, 300, "No definido", true);
        Mounstritos mon24 = new tipoAgua("Tucan", 50, 50, movimientosPlayers, 666, 205, "No definido", true);
        Mounstritos mon25 = new tipoRoca("Little Demon", 50, 200, movimientosPlayers, 777, 50, "No definido", true);

        pokemones.adicionar(mon1);
        pokemones.adicionar(mon2);
        pokemones.adicionar(mon3);
        pokemones.adicionar(mon4);
        pokemones.adicionar(mon5);

        pokemones.adicionar(mon6);
        pokemones.adicionar(mon7);
        pokemones.adicionar(mon8);
        pokemones.adicionar(mon9);
        pokemones.adicionar(mon10);

        pokemones.adicionar(mon11);
        pokemones.adicionar(mon12);
        pokemones.adicionar(mon13);
        pokemones.adicionar(mon14);
        pokemones.adicionar(mon15);

        pokemones.adicionar(mon16);
        pokemones.adicionar(mon17);
        pokemones.adicionar(mon18);
        pokemones.adicionar(mon19);
        pokemones.adicionar(mon20);

        pokemones.adicionar(mon21);
        pokemones.adicionar(mon22);
        pokemones.adicionar(mon23);
        pokemones.adicionar(mon24);
        pokemones.adicionar(mon25);

        //Aqui cree 2 listas de 4 mousntritos cada una.
        ListaDE<Mounstritos> mons1 = new ListaDE<>();
        ListaDE<Mounstritos> mons2 = new ListaDE<>();

        MousntritosMatch(pokemones, mons1, mons2); // llamamos al metodo

        //Falta completar los Items
        Items item1 = new Berserk("Berserk", false);
        Items item2 = new LifeTotem("LifeTotem", false);
        Items item3 = new SantoHealing("SantoHealing", false);
        Items item4 = new Tornado("Tornado", false);
        Items item5 = new VidaVoodo("VidaVoodo", false);

        ListaDE<Items> Itemstotales = new ListaDE<>();

        Itemstotales.adicionar(item1);
        Itemstotales.adicionar(item2);
        Itemstotales.adicionar(item3);
        Itemstotales.adicionar(item4);
        Itemstotales.adicionar(item5);





        //Inicio de Partida // Version Beta

        int menu =0 ;

        boolean partidaFinalizada = false;

        do {

            System.out.println("CETYS CLASH ");
            System.out.println("[1] Iniciar Partida");
            System.out.println("[2] Salir");
            menu = sc.nextInt();

            switch (menu) {

                case 1:

                    Jugador player1 = new Jugador("NPC", mons1, Itemstotales); // Esta es como una version beta de la creacion de jugadores
                    Jugador player2 = new Jugador("NPC 2", mons2, Itemstotales);

                    Duelo match = new Duelo(1, player1, player2);

                    double dañoAcumulado1 = 0;
                    double dañoAcumulado2 = 0;
                    double damage = 0;
                    Time time = new Time(match, 30000); // Aun ando viendo como implemnetar los hilos, pero creo tener una idea

                    int cantidadDePokemones1 = match.getJugador1().getListaMounstritos().size();
                    int cantidadDePokemones2 = match.getJugador2().getListaMounstritos().size();

                    int turno = match.getTurno();
                    int opcion = 0;
                    int posicion1 = 0; // posicion de la lista de mounstritos
                    int posicion2 = 0;

                    do { //Para los turnos
                        try {

                            boolean turnoFinalizado = false;

                            if (turno % 2 != 0) { // Cuando es turno del jugador 1
                                System.out.println("Es turno del Jugador Uno: " + match.getJugador1().getNombre());
                                System.out.println("Tu Claser es : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());

                                if(dañoAcumulado1 > 150){ // Esta es una posible implemnetacion del ultimate , que depsues de cierto daño acumulado le pregunte al jugador si lo va a usar

                                    System.out.println("Ultimate disponible");
                                    int election = 0;
                                    System.out.println("Desea usar el ultimate del Clahser : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                                    System.out.println("[1] Si , [2] No" );
                                    election = sc.nextInt();

                                    if(election == 1){
                                        match.Ulti1(posicion1,posicion2);
                                        System.out.println("La ulti fue usada");
                                        System.out.println("Causo un daño de " + match.getJugador1().getListaMounstritos().obtener(posicion1).getUltimate());
                                        dañoAcumulado1 = 0; // se reinicia el contador
                                        turno++; // se le suma 1 a los turnos
                                        turnoFinalizado = true; // Indica que se acaba el turno del jugador 1
                                    }

                                    if(election == 2){
                                        System.out.println("El jugador decidio no usar su ultimate");
                                    }

                                }

                                if(!turnoFinalizado) {

                                    System.out.println("Selecciona algun movimiento : [0] Movimiento 0 , [1] Movimiento 1 , [2] Movimiento 2, [3] Movimiento 3,[4] Ataque Default , [5] Swap Pokemon");

                                    for (int i = 0; i < match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().size(); i++) {
                                        System.out.println("Movimiento " + i + " : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i).getNombre());
                                        System.out.println("Tipo : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i).getTipo());
                                        System.out.println("PP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i).getPP());
                                        System.out.println("Acuracy : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i).getAccuracy());

                                        if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i) instanceof Ataques) {
                                            damage = ((Ataques) match.ataquePokemon1(i, posicion1)).getDamage();
                                            System.out.println("Daño de Ataque : " + damage);
                                            System.out.println("--------------------");

                                        } else if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i) instanceof Healing) {
                                            int heal = ((Healing) match.ataquePokemon1(i, posicion1)).getHeal();
                                            System.out.println("Recuperacion de Vida: " + heal);
                                            System.out.println("--------------------");
                                        } else if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(i) instanceof Default) {
                                            damage = ((Default) match.ataquePokemon1(i, posicion1)).getDamage(); // El damage se queda definido como default
                                            System.out.println("Daño : " + damage);
                                            System.out.println("--------------------");
                                        } else {
                                            System.out.println("--------------------");
                                        }

                                    }

                                    System.out.println("Movimiento 5 : Swap Pokemon");
                                    System.out.println("--------------------");
                                    opcion = sc.nextInt();

                                    switch (opcion) {

                                        case 0:

                                            match.movimientoPLayer1(0, posicion1, posicion2); // Primero se realiza el movimiento

                                            if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(0) instanceof Ataques) { // Checo si el movimiento fue un ataque
                                                damage = ((Ataques) match.ataquePokemon1(0, posicion1)).getDamage(); // Aqui obtengo el damagae, falta ver si se suma los plus si es debilidad

                                                if (((Ataques) match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(0)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado1 += damage;
                                                }

                                            }

                                            if (!match.getJugador2().getListaMounstritos().obtener(posicion2).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador2().getListaMounstritos().eliminar(posicion2);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 2 solo le restan : " + match.getJugador2().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones2--;
                                                posicion1 = 0; // Si el pokemon que fue eliminado no es el primero de la lista, se pone por default el primero

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());
                                                System.out.println("HP : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;
                                        case 1:

                                            match.movimientoPLayer1(1, posicion1, posicion2);

                                            if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(1) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon1(1, posicion1)).getDamage();

                                                if (((Ataques) match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(1)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado1 += damage;
                                                }
                                            }

                                            if (!match.getJugador2().getListaMounstritos().obtener(posicion2).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador2().getListaMounstritos().eliminar(posicion2);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 2 solo le restan : " + match.getJugador2().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones2--;
                                                posicion2 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());
                                                System.out.println("HP : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;
                                        case 2:

                                            match.movimientoPLayer1(2, posicion1, posicion2);

                                            if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(2) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon1(2, posicion1)).getDamage();

                                                if (((Ataques) match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(2)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado1 += damage;
                                                }

                                            }

                                            if (!match.getJugador2().getListaMounstritos().obtener(posicion2).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador2().getListaMounstritos().eliminar(posicion2);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 2 solo le restan : " + match.getJugador2().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones2--;
                                                posicion2 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());
                                                System.out.println("HP : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;

                                        case 3:

                                            match.movimientoPLayer1(3, posicion1, posicion2);

                                            if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(3) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon1(3, posicion1)).getDamage();

                                                if (((Ataques) match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(3)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado1 += damage;
                                                }
                                            }

                                            if (!match.getJugador2().getListaMounstritos().obtener(posicion2).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador2().getListaMounstritos().eliminar(posicion2);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 2 solo le restan : " + match.getJugador2().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones2--;
                                                posicion2 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());
                                                System.out.println("HP : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;
                                        case 4:

                                            match.movimientoPLayer1(4, posicion1, posicion2);

                                            if (match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(4) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon1(4, posicion1)).getDamage();

                                                if (((Ataques) match.getJugador1().getListaMounstritos().obtener(posicion1).getAtaques().obtener(4)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado1 += damage;
                                                }
                                            }

                                            if (!match.getJugador2().getListaMounstritos().obtener(posicion2).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador2().getListaMounstritos().eliminar(posicion2);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 2 solo le restan : " + match.getJugador2().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones2--;
                                                posicion2 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());
                                                System.out.println("HP : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;

                                        case 5: // Ya quedo

                                            boolean validClasher = false; // Sirve para verificar si el usuario ya ingreso un  indice valido
                                            int newPosition = -1; // se inicializa la variable

                                            while(!validClasher) {

                                                    System.out.println("--------------------");

                                                    System.out.println("Clashers disponibles : ");

                                                    for (int i = 0; i < match.getJugador1().getListaMounstritos().size(); i++) {
                                                        System.out.println("Clasher : " + i);
                                                        System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(i).getName());
                                                        System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(i).getHP());
                                                        System.out.println("Defense : " + match.getJugador1().getListaMounstritos().obtener(i).getDefense());
                                                        System.out.println("--------------------");
                                                    }

                                                    System.out.println("Ingresa al nuevo Clasher : ");
                                                    newPosition = sc.nextInt(); // se obtiene la nueva posicion

                                                    if (newPosition < match.getJugador1().getListaMounstritos().size() && newPosition >= 0) {
                                                        validClasher = true; //
                                                        posicion1 = newPosition; // se iguala a la posicion actual del pokemon

                                                    }
                                                    else{
                                                        System.out.println("Ingresa un indice valido");
                                                    }


                                            }

                                            break;

                                    }

                                }


                            } else { // Cuando es turno del jugador 2

                                System.out.println("Es turno del Jugador Dos: " + match.getJugador2().getNombre());
                                System.out.println("Tu Claser es : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());

                                if (dañoAcumulado2 > 150) { // Esta es una posible implemnetacion del ultimate , que depsues de cierto daño acumulado le pregunte al jugador si lo va a usar

                                    System.out.println("Ultimate disponible");
                                    int election = 0;
                                    System.out.println("Desea usar el ultimate del Clahser : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getName());
                                    System.out.println("[1] Si , [2] No");
                                    election = sc.nextInt();

                                    if (election == 1) {
                                        match.Ulti2(posicion1, posicion2);
                                        System.out.println("La ulti fue usada");
                                        System.out.println("Causo un daño de " + match.getJugador1().getListaMounstritos().obtener(posicion1).getUltimate());
                                        dañoAcumulado1 = 0; // se reinicia el contador
                                        turno++; // se acaba el turno del jugador 2
                                        turnoFinalizado = true;
                                    }

                                    if (election == 2) {
                                        System.out.println("El jugador decidio no usar su ultimate");
                                    }

                                }

                                if (!turnoFinalizado) {
                                    System.out.println("Selecciona algun movimiento : [0] Movimiento 0 , [1] Movimiento 1 , [2] Movimiento 2, [3] Movimiento 3,[4] Ataque Default , [5] Swap Pokemon");

                                    for (int i = 0; i < match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().size(); i++) {
                                        System.out.println("Movimiento " + i + " : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i).getNombre());
                                        System.out.println("Tipo : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i).getTipo());
                                        System.out.println("PP : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i).getPP());
                                        System.out.println("Acuracy : " + match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i).getAccuracy());

                                        if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i) instanceof Ataques) {
                                            damage = ((Ataques) match.ataquePokemon2(i, posicion2)).getDamage();
                                            System.out.println("Daño de Ataque : " + damage);
                                            System.out.println("--------------------");

                                        } else if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i) instanceof Healing) {
                                            int heal = ((Healing) match.ataquePokemon2(i, posicion2)).getHeal();
                                            System.out.println("Recuperacion de Vida: " + heal);
                                            System.out.println("--------------------");

                                        } else if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(i) instanceof Default) {
                                            damage = ((Default) match.ataquePokemon2(i, posicion2)).getDamage();
                                            System.out.println("Daño : " + damage);
                                            System.out.println("--------------------");
                                        } else {
                                            System.out.println("--------------------");
                                        }

                                    }

                                    System.out.println("Movimiento 5 : Swap Pokemon");
                                    opcion = sc.nextInt();

                                    switch (opcion) {
                                        case 0:

                                            match.movimientoPLayer2(0, posicion1, posicion2);

                                            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(0) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon2(0, posicion2)).getDamage();

                                                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(0)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado2 += damage;

                                                }
                                            }

                                            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones1--;
                                                posicion1= 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                                                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
                                            }


                                            turno++; // se le suma al turno


                                            break;
                                        case 1:

                                            match.movimientoPLayer2(1, posicion1, posicion2);

                                            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(1) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon2(1, posicion2)).getDamage();

                                                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(1)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado2 += damage;
                                                }

                                            }

                                            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones1--;
                                                posicion1 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                                                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
                                            }

                                            turno++; // se le suma al turno


                                            break;
                                        case 2:

                                            match.movimientoPLayer2(2, posicion1, posicion2);

                                            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(2) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon2(2, posicion2)).getDamage();

                                                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(2)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado2 += damage;
                                                }

                                            }

                                            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones1--;
                                                posicion1 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                                                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
                                            }

                                            turno++; // se le suma al turno


                                            break;
                                        case 3:

                                            match.movimientoPLayer2(3, posicion1, posicion2);

                                            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(3) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon2(3, posicion2)).getDamage();

                                                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(3)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado2 += damage;
                                                }

                                            }


                                            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones1--;
                                                posicion1 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                                                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;
                                        case 4:

                                            match.movimientoPLayer2(4, posicion1, posicion2);

                                            if (match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(4) instanceof Ataques) { //
                                                damage = ((Ataques) match.ataquePokemon2(4, posicion2)).getDamage();

                                                if (((Ataques) match.getJugador2().getListaMounstritos().obtener(posicion2).getAtaques().obtener(4)).isAtaqueEfectivo()) { // Checa si el daño fue efectivo para poder sumar ese damage al damageAcumulado
                                                    dañoAcumulado2 += damage;
                                                }
                                            }

                                            if (!match.getJugador1().getListaMounstritos().obtener(posicion1).isVivo()) { // Checa si esta vivo todavia el pokemon rival
                                                match.getJugador1().getListaMounstritos().eliminar(posicion1);// No se si es buena idea eliminarlos de la lista, ya que se pueden eliminar permanentemente, por lo que se ocupa revisar ESO
                                                System.out.println("El Clasher a muerto");
                                                System.out.println("Al Jugador 1 solo le restan : " + match.getJugador1().getListaMounstritos().size() + " Clashers");
                                                cantidadDePokemones1--;
                                                posicion1 = 0;

                                            } else {
                                                System.out.println("Vida del Clasher rival : ");
                                                System.out.println("Name : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getName());
                                                System.out.println("HP : " + match.getJugador1().getListaMounstritos().obtener(posicion1).getHP());
                                            }

                                            turno++; // se le suma al turno

                                            break;
                                        case 5: // ya quedo

                                            boolean validClasher = false; // Sirve para verificar
                                            int newPosition = -1;

                                            while(!validClasher) {

                                                try {

                                                    System.out.println("--------------------");

                                                    System.out.println("Clashers disponibles : ");

                                                    for (int i = 0; i < match.getJugador2().getListaMounstritos().size(); i++) {
                                                        System.out.println("Clasher : " + i);
                                                        System.out.println("Name : " + match.getJugador2().getListaMounstritos().obtener(i).getName());
                                                        System.out.println("HP : " + match.getJugador2().getListaMounstritos().obtener(i).getHP());
                                                        System.out.println("Defense : " + match.getJugador2().getListaMounstritos().obtener(i).getDefense());
                                                        System.out.println("--------------------");
                                                    }

                                                    System.out.println("Ingresa al nuevo Clasher : ");
                                                    newPosition = sc.nextInt();
                                                    validClasher = true;
                                                    posicion2 = newPosition;

                                                }catch(Exception ex){
                                                    System.out.println("Ingresa un indice valido");
                                                }

                                            }

                                            break;

                                    }
                                }

                            }

                            if(cantidadDePokemones1  == 0 || cantidadDePokemones2 == 0){
                                partidaFinalizada = true;
                            }

                        } catch (Exception ex) {
                            System.out.println("Ocurrio un error inesperado");
                        }

                    } while (!partidaFinalizada);

                    break;


                case 2:
                    System.out.println("Thanks for playing");
                    break;

            }


        }while(menu != 2);






        // Para debugear y ver que si se estan guardando bien los ataques y los pokemones

        /*
        int opcion = 0;
        do{

            System.out.println("Ingresa una opcion : [1] Ver Datos de los Pokemones del Player 1, [2] Ver Datos de los Pokemones del Player 2,[3] Objetos jugador 1,[4] Objetos jugador 2,[5] Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Ingresa el numero de pokemon");
                    int xd = sc.nextInt();

                    System.out.println(mons1.obtener(xd).getName());
                    System.out.println("HP : " + mons1.obtener(xd).getHP());
                    System.out.println("Debilidades: " + mons1.obtener(xd).getDebilidades1());
                    System.out.println(mons1.obtener(xd).getDebilidades2());

                    System.out.println("Movimeinto 1  : " + mons1.obtener(xd).getAtaques().obtener(0).getNombre()
                            + " Tipo : " + mons1.obtener(xd).getAtaques().obtener(0).getTipo()
                            + " PP : " + mons1.obtener(xd).getAtaques().obtener(0).getPP());

                    System.out.println("Movimeinto 2  : " + mons1.obtener(xd).getAtaques().obtener(1).getNombre()
                            + " Tipo : " + mons1.obtener(xd).getAtaques().obtener(1).getTipo()
                            +  " PP " + mons1.obtener(xd).getAtaques().obtener(1).getPP());

                    System.out.println("Movimeinto 3  : " + mons1.obtener(xd).getAtaques().obtener(2).getNombre()
                            + " Tipo : " + mons1.obtener(xd).getAtaques().obtener(2).getTipo()
                            + " PP : " + mons1.obtener(xd).getAtaques().obtener(2).getPP());

                    System.out.println("Movimeinto 4 : " + mons1.obtener(xd).getAtaques().obtener(3).getNombre()
                            + " Tipo : " + mons1.obtener(xd).getAtaques().obtener(3).getTipo()
                            + " PP : " + mons1.obtener(xd).getAtaques().obtener(3).getPP());

                    break;

                case 2:
                    System.out.println("Ingresa el numero de pokemon");
                    int xdd = sc.nextInt();

                    System.out.println(mons2.obtener(xdd).getName());
                    System.out.println("HP : " + mons2.obtener(xdd).getHP());
                    System.out.println("Debilidades: " + mons2.obtener(xdd).getDebilidades1());
                    System.out.println(mons2.obtener(xdd).getDebilidades2());

                    System.out.println("Movimeinto 1  : " + mons2.obtener(xdd).getAtaques().obtener(0).getNombre()
                            + " Tipo : " + mons2.obtener(xdd).getAtaques().obtener(0).getTipo()
                            + " PP : " + mons2.obtener(xdd).getAtaques().obtener(0).getPP());

                    System.out.println("Movimeinto 2  : " + mons2.obtener(xdd).getAtaques().obtener(1).getNombre()
                            + " Tipo : " + mons2.obtener(xdd).getAtaques().obtener(1).getTipo()
                            +  " PP " + mons2.obtener(xdd).getAtaques().obtener(1).getPP());

                    System.out.println("Movimeinto 3  : " + mons2.obtener(xdd).getAtaques().obtener(2).getNombre()
                            + " Tipo : " + mons2.obtener(xdd).getAtaques().obtener(2).getTipo()
                            + " PP : " + mons2.obtener(xdd).getAtaques().obtener(2).getPP());

                    System.out.println("Movimeinto 4 : " + mons2.obtener(xdd).getAtaques().obtener(3).getNombre()
                            + " Tipo : " + mons2.obtener(xdd).getAtaques().obtener(3).getTipo()
                            + " PP : " + mons2.obtener(xdd).getAtaques().obtener(3).getPP());

                    break;

                case 3:
                    for(int i = 0 ; i<player1.getObjetos().size(); i++){
                        System.out.println("Movimiento "+i+": "+player1.getObjetos().obtener(i).getNombre());
                    }
                    break;
                    case 4:
                        for(int i = 0 ; i<player2.getObjetos().size(); i++){
                            System.out.println("Movimiento "+i+": "+player2.getObjetos().obtener(i).getNombre());
                        }
                   break;
            }

        }while(opcion != 5);

        */


    }


}