
package Modelo;


public class Dado {
    
    private String nombre;
    private String caras[];
    private Criatura criatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDado() {
        return caras;
    }

    public void setDado(String[] dado) {
        this.caras = dado;
    }

    public Criatura getCriatura() {
        return criatura;
    }

    public void setCriatura(Criatura criatura) {
        this.criatura = criatura;
    }   
}
