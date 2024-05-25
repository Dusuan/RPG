package org.example;

import listas.ListaDE;
import movimientos.*;
import org.example.ItemsDefinidos.Berserk;
import pokemones.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
        Movimientos num15 = new Ataques("Roca", "Who is in Paris?", 10, 1, 550);

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

        Movimientos num31 = new buff("Agua","OMG",50,3);
        Movimientos num32 = new Debuff("Fuego","Tacos",30,2);

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

        Mounstritos mon1 = new tipoFuego("Andy Hot",200,200,movimientosPlayers,500,200,"No definido",true);
        Mounstritos mon2 = new tipoRoca("Many Dormilon",500,500,movimientosPlayers,100,50,"No definido",true);
        Mounstritos mon3 = new tipoAgua("Pepino White",300,350,movimientosPlayers,200,75,"No definido",true);
        Mounstritos mon4 = new tipoAire("Blind Guy",250,250,movimientosPlayers,175,100,"No definido",true);
        Mounstritos mon5 = new tipoFuego("Sex Guy",300,350,movimientosPlayers,350,50,"No definido",true);

        Mounstritos mon6 = new tipoPlanta("White Igga",200,200,movimientosPlayers,300,150,"No definido",true);
        Mounstritos mon7 = new tipoAire("Helicopter",400,400,movimientosPlayers,400,20,"No definido",true);
        Mounstritos mon8 = new tipoRoca("Juan",450,450,movimientosPlayers,90,50,"No definido",true);
        Mounstritos mon9 = new tipoRoca("Omni-Man",350,350,movimientosPlayers,400,25,"No definido",true);
        Mounstritos mon10 = new tipoPlanta("Pepina",200,200,movimientosPlayers,200,100,"No definido",true);

        Mounstritos mon11 = new tipoAgua("Te Falta Alcohol",350,350,movimientosPlayers,1000,300,"No definido",true);
        Mounstritos mon12 = new tipoFuego("No quema Cu",250,250,movimientosPlayers,350,120,"No definido",true);
        Mounstritos mon13 = new tipoFuego("Kenny",1,1,movimientosPlayers,300,100,"No definido",true);
        Mounstritos mon14 = new tipoPlanta("Uwu",200,200,movimientosPlayers,275,150,"No definido",true);
        Mounstritos mon15 = new tipoAgua("NPC AVERAGE",150,250,movimientosPlayers,325,250,"No definido",true);

        Mounstritos mon16 = new tipoAgua("Frozono",240,240,movimientosPlayers,300,75,"No definido",true);
        Mounstritos mon17 = new tipoAire("Ting Ling",220,220,movimientosPlayers,250,100,"No definido",true);
        Mounstritos mon18 = new tipoFuego("Wilson",350,350,movimientosPlayers,450,125,"No definido",true);
        Mounstritos mon19= new tipoAire("Va a ganar el Cruz Azul we",150,250,movimientosPlayers,250,50,"No definido",true);
        Mounstritos mon20 = new tipoPlanta("NPC",150,150,movimientosPlayers,200,75,"No definido",true);

        Mounstritos mon21= new tipoAire("OMG",300,300,movimientosPlayers,300,175,"No definido",true);
        Mounstritos mon22= new tipoRoca("KikeKum",500,500,movimientosPlayers,200,20,"No definido",true);
        Mounstritos mon23 = new tipoPlanta("Eric-Chan",80,80,movimientosPlayers,150,300,"No definido",true);
        Mounstritos mon24= new tipoAgua("Tucan",50,50,movimientosPlayers,666,205,"No definido",true);
        Mounstritos mon25 = new tipoRoca("Little Demon",50,200,movimientosPlayers,777,50,"No definido",true);

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

        MousntritosMatch(pokemones,mons1,mons2); // llamamos al metodo


        //Falta completar los Items
        ListaDE<Items> items = new ListaDE<>();
        Items ite1 = new Berserk("Bersi",false);

        items.adicionar(ite1);

        Jugador player1 = new Jugador("NPC",mons1,items); // Esta es como una version beta de la creacion de jugadores
        Jugador player2 = new Jugador("NPC 2",mons2,items);

        // Para debugear y ver que si se estan guardando bien los ataques y los pokemones
        int opcion = 0;
        do{

            System.out.println("Ingresa una opcion : [1] Ver Datos de los Pokemones del Player 1, [2] Ver Datos de los Pokemones del Player 2,[3] Salir");
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

            }

        }while(opcion != 3);




    }


}