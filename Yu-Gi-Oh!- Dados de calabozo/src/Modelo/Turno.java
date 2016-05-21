
package Modelo;


public class Turno {
    
    public int competidores;
    private int turnos[];
    private boolean turnoActual;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private Jugador jugadorActual;
    private Jugador jugadorSiguente, jugadorSiguiente2, jugadorSiguiente3;

    /*public Turno(int[] turnos, boolean turnoActual, Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4) {
        this.turnos = turnos;
        this.turnoActual = turnoActual;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
        this.jugador4 = jugador4;
    }*/

    
    public int[] getTurnos() {
        return turnos;
    }

    public void setTurnos(int[] turnos) {
        this.turnos = turnos;
    }

    public boolean isTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(boolean turnoActual) {
        this.turnoActual = turnoActual;
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

    public Jugador getJugador3() {
        return jugador3;
    }

    public void setJugador3(Jugador jugador3) {
        this.jugador3 = jugador3;
    }

    public Jugador getJugador4() {
        return jugador4;
    }

    public void setJugador4(Jugador jugador4) {
        this.jugador4 = jugador4;
    }
    
    public void seleccionTurno(Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4, int competidores){
        
    }
    
    public void cambiarYSeleccionarTurno(){
        switch (competidores) {
            case 2:
                if (this.jugadorActual == this.jugador1){
                    this.jugadorActual = jugador2;
                    this.jugadorSiguente = jugador1;
                }
                else{
                    this.jugadorActual = jugador1;
                    this.jugadorSiguente = jugador2;
                }   break;
            case 3:
                if (this.jugadorActual == this.jugador1){
                    this.jugadorActual = jugador2;
                    this.jugadorSiguente = jugador3;
                    this.jugadorSiguiente2 = jugador1;
                }
                else if (this.jugadorActual == this.jugador2){
                    this.jugadorActual = jugador3;
                    this.jugadorSiguente = jugador1;
                    this.jugadorSiguiente2 = jugador2;
                }
                else {
                    this.jugadorActual = jugador1;
                    this.jugadorSiguente = jugador2;
                    this.jugadorSiguiente2 = jugador3;
                }   break;
            case 4:
                if (this.jugadorActual == this.jugador1){
                    this.jugadorActual = jugador2;
                    this.jugadorSiguente = jugador3;
                    this.jugadorSiguiente2 = jugador4;
                    this.jugadorSiguiente3 = jugador1;
                }
                else if (this.jugadorActual == this.jugador2){
                    this.jugadorActual = jugador3;
                    this.jugadorSiguente = jugador4;
                    this.jugadorSiguiente2 = jugador1;
                    this.jugadorSiguiente3 = jugador2;
                }
                else if (this.jugadorActual == this.jugador3) {
                    this.jugadorActual = jugador4;
                    this.jugadorSiguente = jugador1;
                    this.jugadorSiguiente2 = jugador2;
                    this.jugadorSiguiente3 = jugador3;
                }
                else{
                    this.jugadorActual = jugador1;
                    this.jugadorSiguente = jugador2;
                    this.jugadorSiguiente2 = jugador3;
                    this.jugadorSiguiente3 = jugador4;
                }   break;
            default:
                break;
        }
    }   
}
