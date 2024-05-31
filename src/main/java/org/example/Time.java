package org.example;

public class Time implements Runnable{

    private Duelo match;
    private long sleepTime; //Creo que estaria bien que fuera de 30 segundos o menos
    private Jugador actualPlayer;
    private boolean movimientoRealizado;

    public Time(Duelo match,long sleepTime){ // Constructor para crear el tiempo de juego del jugador
        this.match = match;
        this.sleepTime = sleepTime;
        this.actualPlayer =  match.getJugador1() ; // Se iguala al primer jugador del turno
        this.movimientoRealizado = false;
    }

    String LOGMESSAGE = ""; // le implemente logs aqui tambien

    @Override
    public void run() {
            try {
                Thread.sleep(sleepTime);
                synchronized (this) {
                    if (!movimientoRealizado) {
                        changeTurno(); // Cambia de turno automaticamente si no hizo nada
                    } else {
                        movimientoRealizado = false;// Se reinicia el hilo
                        actualPlayer = match.getJugador2();
                    }

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


    }

    public void hizoMovimiento(){ // Este metodo sirve para poner que si ya se hizo el movimiento, aunque no se si se podra implmenetar bien,CHECK
        movimientoRealizado = true;
    }

    public void changeTurno(){ //Este es el metdod0 que se encarga de cambiar de jugadores

        Jugador player1 = match.getJugador1();
        Jugador player2 = match.getJugador2();

        if(actualPlayer.equals(player1)){

            LOGMESSAGE = "El tiempo de " + player1.getNombre() + " a terminado"; // Se implementa en los logs
            LOGMESSAGE = "Es turno del siguiente jugador";
            LOGMESSAGE = "";

            actualPlayer = player2; // se iguala al jugador 2
        }

        else if(actualPlayer.equals(player2)){

            LOGMESSAGE = "El tiempo de " + player2.getNombre() + " a terminado";
            LOGMESSAGE = "Es turno del siguiente jugador";
            LOGMESSAGE = "";
            actualPlayer = player1;
        }
        else{
            System.out.println("Aun tienes tiempo");
        }
    }
}
