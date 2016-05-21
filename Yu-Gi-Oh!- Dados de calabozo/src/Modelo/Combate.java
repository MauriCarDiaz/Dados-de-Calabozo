
package Modelo;



public class Combate {
    
    public int competidores;
    public int modo;
    private int turno;
    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private Jugador jugadorActual;
    private Jugador jugadorSiguente, jugadorSiguiente2, jugadorSiguiente3;

    public Combate(int competidores, int modo, Tablero tablero, Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4) {
        this.competidores = competidores;
        this.modo = modo;
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
        this.jugador4 = jugador4;
        
    }

    public int getCompetidores() {
        return competidores;
    }

    public void setCompetidores(int competidores) {
        this.competidores = competidores;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
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

    public Jugador getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(Jugador jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public Jugador getJugadorSiguente() {
        return jugadorSiguente;
    }

    public void setJugadorSiguente(Jugador jugadorSiguente) {
        this.jugadorSiguente = jugadorSiguente;
    }

    public Jugador getJugadorSiguiente2() {
        return jugadorSiguiente2;
    }

    public void setJugadorSiguiente2(Jugador jugadorSiguiente2) {
        this.jugadorSiguiente2 = jugadorSiguiente2;
    }

    public Jugador getJugadorSiguiente3() {
        return jugadorSiguiente3;
    }

    public void setJugadorSiguiente3(Jugador jugadorSiguiente3) {
        this.jugadorSiguiente3 = jugadorSiguiente3;
    }
    
    public void configurarCombate(int participantes, int modo, String jugador1, String jugador2, String jugador3, String jugador4){
        if (modo == 0){
            
        }
    }
    
    
    
}
