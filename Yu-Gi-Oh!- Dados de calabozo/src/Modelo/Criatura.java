
package Modelo;

import Modelo.*;
import java.util.ArrayList;

public class Criatura {
    
    private String nombre;
    private int puntosDeVida;
    private int defensa;
    private int nivel;
    private int ataque;
    private int posicionX;
    private int posicionY;
    private int cantidadMovimiento; //Aca o en Jugador???
    private int cantidadAtaque; //Aca o en jugador???
    private int dueno;
    private int identificador; //para saber si esta en el tablero
    boolean atacar;
    boolean mover;
    private Dado dado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getCantidadMovimiento() {
        return cantidadMovimiento;
    }

    public void setCantidadMovimiento(int cantidadMovimiento) {
        this.cantidadMovimiento = cantidadMovimiento;
    }

    public int getCantidadAtaque() {
        return cantidadAtaque;
    }

    public void setCantidadAtaque(int cantidadAtaque) {
        this.cantidadAtaque = cantidadAtaque;
    }

    public int getDueno() {
        return dueno;
    }

    public void setDueno(int dueno) {
        this.dueno = dueno;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public boolean isAtacar() {
        return atacar;
    }

    public void setAtacar(boolean atacar) {
        this.atacar = atacar;
    }

    public boolean isMover() {
        return mover;
    }

    public void setMover(boolean mover) {
        this.mover = mover;
    }
    
    public int calculoAtaque(int defensa, int ataque, Criatura enemigo){
        int danoRealizado = ataque - defensa;
        enemigo.setPuntosDeVida(danoRealizado);
        return danoRealizado;
    }
    
    public void invocarCriatura(){
        
    }
}
