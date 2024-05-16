package org.example;

public class Time implements Runnable{

    private Jugador player1;
    private Jugador player2;
    private long sleepTime; //Creo que estaria bien que fuera de 30 segundos o menos
    private Jugador actualPlayer;
    private boolean movimientoRealizado;


    public Time(Jugador player1,Jugador player2,long sleepTime){ // Constructor para crear el tiempo de juego del jugador
        this.player1 = player1;
        this.sleepTime = sleepTime;
        this.actualPlayer = player1; // Se iguala al primer jugador del turno
        this.player2 = player2;
        this.movimientoRealizado = false;
    }

    @Override
    public void run() {
            try {
                Thread.sleep(sleepTime);
                if(!movimientoRealizado){
                    changeTurno(); // Cambia de turno automaticamente si no hizo nada
                }
                else{
                    movimientoRealizado = false;// Se reinicia el hilo
                    actualPlayer = player2;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public void hizoMovimiento(){ // Este metodo sirve para poner que si ya se hizo el movimiento, aunque no se si se podra implmenetar bien,CHECK
        movimientoRealizado = true;
    }

    public void changeTurno(){ //Este es el metdod0 que se encarga de cambiar de jugadores

        if(actualPlayer.equals(player1)){
            System.out.println("El tiempo de " + player1.getNombre() + " a terminado ");
            System.out.println("Es turno del siguiente jugador");
            actualPlayer = player2; // se iguala al jugador 2
        }

        else if(actualPlayer.equals(player2)){
            System.out.println("El tiempo de " + player2.getNombre() + "a terminado");
            System.out.println("Es turno del siguiente jugador");
            actualPlayer = player1; // se iguala al jugador 1
        }
        else{
            System.out.println("Aun tienes tiempo");
        }
    }
}
