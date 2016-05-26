
package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Tablero extends JPanel{
    
    Combate combate;
    JefeDeTerreno jefe;
    Criatura criatura;
    private int[][] tableroTerreno = new int[15][15];
    private ArrayList<ArrayList<Criatura>> tableroCriatura = new ArrayList<ArrayList<Criatura>>();
    
    public Tablero() {
        this.setBackground(Color.white);
    }
    @Override
    public void paint(Graphics g){
        
        super.paint(g);
        
        g.setColor(Color.BLACK);
        for(int i = 12; i <= 399; i = i + 25){
            
            g.drawLine(i, 12, i, 387);
            g.drawLine(12, i, 387, i);
            
        }
    }
    
    public void generarTablero(Graphics g, int tab[][], int x, int y){
        super.paint(g);
        g.setColor(Color.BLACK);
        for(int i = 0; i<15; i++){
            for(int j = 0;j<15;j++){
                g.drawLine(i, 12, i, 387);
                g.drawLine(12, i, 387, i);
                g.fillRect(x+i*30, y+j*30, 30, 30);
            }
        }
    }
    

    public Combate getCombate() {
        return combate;
    }

    public void setCombate(Combate combate) {
        this.combate = combate;
    }

    public JefeDeTerreno getJefe() {
        return jefe;
    }

    public void setJefe(JefeDeTerreno jefe) {
        this.jefe = jefe;
    }

    public Criatura getCriatura() {
        return criatura;
    }

    public void setCriatura(Criatura criatura) {
        this.criatura = criatura;
    }

    public int[][] getTableroTerreno() {
        return tableroTerreno;
    }

    public void setTableroTerreno(int[][] tableroTerreno) {
        this.tableroTerreno = tableroTerreno;
    }

    public ArrayList<ArrayList<Criatura>> getTableroCriatura() {
        return tableroCriatura;
    }

    public void setTableroCriatura(ArrayList<ArrayList<Criatura>> tableroCriatura) {
        this.tableroCriatura = tableroCriatura;
    }
    
    public void ponerJefe(int participantes){
        switch (participantes) {
            case 2:
                tableroTerreno[8][1] = 10;
                tableroTerreno[8][15] = 11;
                break;
            case 3:
                tableroTerreno[9][1] = 10;
                tableroTerreno[9][15] = 11;
                tableroTerreno[1][8] = 12;
                break;
            case 4:
                tableroTerreno[8][1] = 10;
                tableroTerreno[8][15] = 11;
                tableroTerreno[1][8] = 12;
                tableroTerreno[15][8] = 13;
                break;
            default:
                break;
        }
    }
    
    public void moverCriatura(Criatura criatura, int posX, int posY){
        int antiguaPosX = criatura.getPosicionX();
        int antiguaPosY = criatura.getPosicionY();
        if (criatura.isMover() == true){
            criatura.setPosicionX(posX);
            criatura.setPosicionY(posY);
            criatura.setMover(false);
            tableroCriatura.get(posX).set(posY, criatura);
            tableroCriatura.get(antiguaPosX).set(antiguaPosY, null);
        }
    }
}
