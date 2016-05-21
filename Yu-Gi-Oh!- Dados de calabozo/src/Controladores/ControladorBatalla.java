package Controladores;

import Vistas.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;


public class ControladorBatalla implements ActionListener {
    private VistaBatalla vistaBatalla;
    private VistaPrevioBatalla vistaPrevioBatalla;
    private ControladorPrevioBatalla ctrlPrevioBatalla;
    int participantes;
    private int movimiento;
    private int ataque;
    private int defensa;
    private Combate combate;
    Accion accion = new Accion();
    Posicion posicion = new Posicion();
    Tablero tablero = new Tablero();
    Turno turno = new Turno();
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    Criatura criatura1 = new Criatura();
    Criatura criatura2 = new Criatura();
    JefeDeTerreno jefe1 = new JefeDeTerreno();
    JefeDeTerreno jefe2 = new JefeDeTerreno();
    Dado dado1J1 = new Dado();
    Dado dado2J1 = new Dado();
    Dado dado3J1 = new Dado();
    Dado dado4J1 = new Dado();
    Dado dado1J2 = new Dado();
    Dado dado2J2 = new Dado();
    Dado dado3J2 = new Dado();
    Dado dado4J2 = new Dado();
   
    public ControladorBatalla(VistaBatalla vistaBatalla){
        this.vistaBatalla = vistaBatalla;
        
    } 
    
    public void iniciar_VistaBatalla(int Competidores){
        //Jugador 1:
        jugador1.setNombreJugador("Batman");
        //Jefe de Terreno J1:
        jefe1.setNombre("Goblin Superior");
        jefe1.setHabilidad("Velocidad");
        //Criaturas J1:
        //Nivel 1:
        criatura1.setNombre("Goblin");
        criatura1.setNivel(1);
        String caras[] = {"mov","inv","atk","atk","mov","inv"};
        dado1J1.setDado(caras);
        criatura1.setDefensa(110);
        criatura1.setPuntosDeVida(500);
        criatura1.setAtaque(150);
        criatura1.setDado(dado1J1);
        //Nivel 2:
        criatura1.setNombre("Orco");
        criatura1.setNivel(2);
        String caras2[] = {"tramp","inv","atk","atk","inv","tramp"};
        dado2J1.setDado(caras2);
        criatura1.setAtaque(250);
        criatura1.setDefensa(340);
        criatura1.setPuntosDeVida(1500);
        criatura1.setDado(dado2J1);
        //Nivel 3:
        criatura1.setNombre("Uruk-hai");
        criatura1.setNivel(3);
        String caras3[] = {"mov","inv","atk","atk","mov","magia"};
        dado3J1.setDado(caras3);
        criatura1.setAtaque(1500);
        criatura1.setDefensa(0);
        criatura1.setPuntosDeVida(5000);
        criatura1.setDado(dado3J1);
        //Nivel 4:
        criatura1.setNombre("Balrog");
        criatura1.setNivel(4);
        String caras4[] = {"inv","inv","atk","atk","atk","tramp"};
        dado4J1.setDado(caras4);
        criatura1.setAtaque(2500);
        criatura1.setDefensa(2500);
        criatura1.setPuntosDeVida(6000);
        criatura1.setDado(dado4J1);
        //Jugador 2:
        jugador2.setNombreJugador("Superman");
        //Jefe de Terreno J2:
        jefe2.setNombre("Orco Superior");
        jefe2.setHabilidad("+Ataque");
        //Criaturas J2:
        //Nivel 1:
        criatura2.setNombre("Rogbal");
        criatura2.setNivel(1);
        String carasDado1J2[] = {"mov","mov","inv","atk","mov","inv"};
        dado1J2.setDado(carasDado1J2);
        criatura2.setDefensa(120);
        criatura2.setPuntosDeVida(520);
        criatura2.setAtaque(170);
        criatura2.setDado(dado1J2);
        //Nivel 2:
        criatura2.setNombre("Hairuk");
        criatura2.setNivel(2);
        String carasDado2J2[] = {"inv","inv","magia","atk","inv","tramp"};
        dado2J2.setDado(carasDado2J2);
        criatura2.setAtaque(270);
        criatura2.setDefensa(360);
        criatura2.setPuntosDeVida(1520);
        criatura2.setDado(dado2J2);
        //Nivel 3:
        criatura2.setNombre("Coork");
        criatura2.setNivel(3);
        String carasDado3J2[] = {"mov","mov","atk","atk","mov","magia"};
        dado3J2.setDado(carasDado3J2);
        criatura2.setAtaque(1600);
        criatura2.setDefensa(100);
        criatura2.setPuntosDeVida(4000);
        criatura2.setDado(dado3J2);
        //Nivel 4:
        criatura2.setNombre("Blingo");
        criatura2.setNivel(4);
        String carasDado4J2[] = {"inv","magia","mov","mov","atk","tramp"};
        dado4J2.setDado(carasDado4J2);
        criatura2.setAtaque(1500);
        criatura2.setDefensa(1500);
        criatura2.setPuntosDeVida(3000);
        criatura2.setDado(dado4J2);
        
        //Llenar Informacion jugadores.
        this.vistaBatalla.txtJugador1.setText(jugador1.getNombreJugador());
        this.vistaBatalla.txtJugador2.setText(jugador2.getNombreJugador());
        this.vistaBatalla.txtJugador3.setText(null);
        this.vistaBatalla.txtJugador4.setText(null);
        
        //
        //this.vistaBatalla.cambiarColores(combate.getTablero().getTableroTerreno());
        //
        this.vistaBatalla.cantidadMovJ1.setValue(0);
        this.vistaBatalla.cantidadMovJ2.setValue(0);
        this.vistaBatalla.cantidadMovJ3.setValue(0);
        this.vistaBatalla.cantidadMovJ4.setValue(0);
        this.vistaBatalla.cantidadAtkJ1.setValue(0);
        this.vistaBatalla.cantidadAtkJ2.setValue(0);
        this.vistaBatalla.cantidadAtkJ3.setValue(0);
        this.vistaBatalla.cantidadAtkJ4.setValue(0);
        this.vistaBatalla.cantidadPvJ1.setValue(0);
        this.vistaBatalla.cantidadPvJ3.setValue(0);
        this.vistaBatalla.cantidadPvJ2.setValue(0);
        this.vistaBatalla.cantidadPvJ4.setValue(0);
        
        //
        //this.vistaBatalla.panelTablero.
        this.vistaBatalla.comenzar.addActionListener(this);
        this.vistaBatalla.txtJugador1.addActionListener(this);
        this.vistaBatalla.txtJugador2.addActionListener(this);
        this.vistaBatalla.txtJugador3.addActionListener(this);
        this.vistaBatalla.txtJugador4.addActionListener(this);
        this.vistaBatalla.boxCriaturasJ1.addActionListener(this);
        this.vistaBatalla.boxCriaturaJ2.addActionListener(this);
        this.vistaBatalla.boxCriaturasJ3.addActionListener(this);
        this.vistaBatalla.boxCriaturasJ4.addActionListener(this);
        /*this.vistaBatalla.cantidadAtkJ1.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadAtkJ2.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadAtkJ3.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadAtkJ4.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadMovJ1.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadMovJ2.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadMovJ3.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadMovJ4.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadPvJ1.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadPvJ2.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadPvJ3.addAncestorListener((AncestorListener) this);
        this.vistaBatalla.cantidadPvJ4.addAncestorListener((AncestorListener) this);*/
        this.vistaBatalla.estadisticasCriaturasJ1.addActionListener(this);
        this.vistaBatalla.estadisticaCriaturaJ2.addActionListener(this);
        this.vistaBatalla.estadisticasCriaturasJ3.addActionListener(this);
        this.vistaBatalla.estadisticasCriaturaJ4.addActionListener(this);  
        JButton [][] botonesTablero = vistaBatalla.botonesTablero();
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 15; j++){
                JButton boton = botonesTablero[i][j];
                boton.addActionListener(this);
            }
        }
        this.vistaBatalla.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        turno.isTurnoActual();
        if (boton == this.vistaBatalla.comenzar){
            this.vistaBatalla.cambiarColores(combate.getTablero().getTableroTerreno());
        }
        if (boton == this.vistaBatalla.atacar && this.vistaBatalla.cantidadAtkJ1.getValue() > 0){
            
        }
    }
    
    
    
    
}
