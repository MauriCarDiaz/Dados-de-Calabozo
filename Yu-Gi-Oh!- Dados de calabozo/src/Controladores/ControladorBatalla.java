package Controladores;

import Vistas.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorBatalla implements ActionListener {
    private VistaBatalla vistaBatalla;
    private VistaPrevioBatalla vistaPrevioBatalla;
    private ControladorPrevioBatalla ctrlPrevioBatalla;
    int participantes;
    private int movimiento;
    private int ataque;
    private int defensa;
    Combate combate = new Combate();
    Accion accion = new Accion();
    Tablero tablero = new Tablero();
    Jugador jugador1 = new Jugador();
    Jugador jugador2 = new Jugador();
    Criatura criatura1 = new Criatura();
    Criatura criatura2 = new Criatura();
    Criatura criatura3 = new Criatura();
    Criatura criatura4 = new Criatura();
    Criatura criatura5 = new Criatura();
    Criatura criatura6 = new Criatura();
    Criatura criatura7 = new Criatura();
    Criatura criatura8 = new Criatura();
    JefeDeTerreno jefe1 = new JefeDeTerreno();
    JefeDeTerreno jefe2 = new JefeDeTerreno();
    PuzleDeDados puzleJ1 = new PuzleDeDados();
    PuzleDeDados puzleJ2 = new PuzleDeDados();
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
    
    public void iniciar_VistaBatalla(){
        //Jugador 1:
        jugador1.setNombreJugador("Batman");
        this.combate.setJugador1(jugador1.getNombreJugador());
        //Jefe de Terreno J1:
        jefe1.setNombre("Goblin Superior");
        jefe1.setHabilidad("Velocidad");
        //Criaturas J1:
        //Nivel 1:
        criatura1.setNombre("Goblin");
        criatura1.setNivel(1);
        String caras[] = {"mov","inv","atk","atk","mov","inv"};
        dado1J1.setCaras(caras);
        dado1J1.setNombre(criatura1.getNombre());
        criatura1.setDefensa(110);
        criatura1.setPuntosDeVida(500);
        criatura1.setAtaque(150);
        criatura1.setDado(dado1J1);
        //Nivel 2:
        criatura2.setNombre("Orco");
        criatura2.setNivel(2);
        String caras2[] = {"tramp","inv","atk","atk","inv","tramp"};
        dado2J1.setCaras(caras2);
        dado2J1.setNombre(criatura2.getNombre());
        criatura2.setAtaque(250);
        criatura2.setDefensa(340);
        criatura2.setPuntosDeVida(1500);
        criatura2.setDado(dado2J1);
        //Nivel 3:
        criatura3.setNombre("Uruk-hai");
        criatura3.setNivel(3);
        String caras3[] = {"mov","inv","atk","atk","mov","magia"};
        dado3J1.setCaras(caras3);
        dado3J1.setNombre(criatura3.getNombre());
        criatura3.setAtaque(1500);
        criatura3.setDefensa(0);
        criatura3.setPuntosDeVida(5000);
        criatura3.setDado(dado3J1);
        //Nivel 4:
        criatura4.setNombre("Balrog");
        criatura4.setNivel(4);
        String caras4[] = {"inv","inv","atk","atk","atk","tramp"};
        dado4J1.setCaras(caras4);
        dado4J1.setNombre(criatura4.getNombre());
        criatura4.setAtaque(2500);
        criatura4.setDefensa(2500);
        criatura4.setPuntosDeVida(6000);
        criatura4.setDado(dado4J1);
        //Puzle de dados Jugador1
        String dados[] = {criatura1.getNombre(), criatura2.getNombre(), criatura3.getNombre(), criatura4.getNombre()};
        puzleJ1.setDados(dados);
        puzleJ1.setPuzleDeDados(dados);
        //Jugador 2:
        jugador2.setNombreJugador("Superman");
        combate.setJugador2(jugador2.getNombreJugador());
        //Jefe de Terreno J2:
        jefe2.setNombre("Orco Superior");
        jefe2.setHabilidad("+Ataque");
        //Criaturas J2:
        //Nivel 1:
        criatura5.setNombre("Rogbal");
        criatura5.setNivel(1);
        String carasDado1J2[] = {"mov","mov","inv","atk","mov","inv"};
        dado1J2.setCaras(carasDado1J2);
        dado1J2.setNombre(criatura5.getNombre());
        criatura5.setDefensa(120);
        criatura5.setPuntosDeVida(520);
        criatura5.setAtaque(170);
        criatura5.setDado(dado1J2);
        //Nivel 2:
        criatura6.setNombre("Hairuk");
        criatura6.setNivel(2);
        String carasDado2J2[] = {"inv","inv","magia","atk","inv","tramp"};
        dado2J2.setCaras(carasDado2J2);
        dado2J2.setNombre(criatura6.getNombre());
        criatura6.setAtaque(270);
        criatura6.setDefensa(360);
        criatura6.setPuntosDeVida(1520);
        criatura6.setDado(dado2J2);
        //Nivel 3:
        criatura7.setNombre("Coork");
        criatura7.setNivel(3);
        String carasDado3J2[] = {"mov","mov","atk","atk","mov","magia"};
        dado3J2.setCaras(carasDado3J2);
        dado3J2.setNombre(criatura7.getNombre());
        criatura7.setAtaque(1600);
        criatura7.setDefensa(100);
        criatura7.setPuntosDeVida(4000);
        criatura7.setDado(dado3J2);
        //Nivel 4:
        criatura8.setNombre("Blingo");
        criatura8.setNivel(4);
        String carasDado4J2[] = {"inv","magia","mov","mov","atk","tramp"};
        dado4J2.setCaras(carasDado4J2);
        dado4J2.setNombre(criatura8.getNombre());
        criatura8.setAtaque(1500);
        criatura8.setDefensa(1500);
        criatura8.setPuntosDeVida(3000);
        criatura8.setDado(dado4J2);
        //Puzle Dados Jugdor 2
        String dadosJ2[] = {criatura5.getNombre(), criatura6.getNombre(), criatura7.getNombre(), criatura8.getNombre()};
        puzleJ2.setDados(dadosJ2);
        puzleJ2.setPuzleDeDados(dadosJ2);
        //Llenar Informacion jugadores.
        this.vistaBatalla.txtJugador1.setText(jugador1.getNombreJugador());
        this.vistaBatalla.txtJugador2.setText(jugador2.getNombreJugador());
        this.vistaBatalla.txtJugador3.setText(null);
        this.vistaBatalla.txtJugador4.setText(null);
        this.vistaBatalla.boxCriaturasJ1.addItem(criatura1.getNombre());
        this.vistaBatalla.boxCriaturasJ1.addItem(criatura2.getNombre());
        this.vistaBatalla.boxCriaturasJ1.addItem(criatura3.getNombre());
        this.vistaBatalla.boxCriaturasJ1.addItem(criatura4.getNombre());
        this.vistaBatalla.boxCriaturaJ2.addItem(criatura5.getNombre());
        this.vistaBatalla.boxCriaturaJ2.addItem(criatura6.getNombre());
        this.vistaBatalla.boxCriaturaJ2.addItem(criatura7.getNombre());
        this.vistaBatalla.boxCriaturaJ2.addItem(criatura7.getNombre());
        //
        this.vistaBatalla.dadosPuzle.addActionListener(this);
        this.vistaBatalla.seleccionarDado.addActionListener(this);
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
        //this.vistaBatalla.panelTablero.addMouseListener((MouseListener) this);
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
        this.vistaBatalla.dadosPuzle.addActionListener(this);
        this.vistaBatalla.turno.addActionListener(this);
        this.vistaBatalla.lanzarDados.addActionListener(this);
        this.vistaBatalla.magia.addActionListener(this);
        this.vistaBatalla.trampa.addActionListener(this);
        this.vistaBatalla.mover.addActionListener(this);
        this.vistaBatalla.atacar.addActionListener(this);
        this.vistaBatalla.defender.addActionListener(this);
        this.vistaBatalla.seleccionarDado.addActionListener(this);
        this.vistaBatalla.seleccionarDado.setVisible(false);
        this.vistaBatalla.lanzar.addActionListener(this);
        this.vistaBatalla.dibujo();
        this.vistaBatalla.setVisible(true);
   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();  
        String[] dados = new String[4];
        if (boton == this.vistaBatalla.turno){
            combate.seleccionarTurno(2, jugador1.getNombreJugador(), jugador2.getNombreJugador(), null, null);
            System.out.println(combate.getJugadorActual());
            JOptionPane.showMessageDialog(null, "Comienza el jugador" + combate.getJugadorActual());
            this.vistaBatalla.turno.setEnabled(false);
        }
        //Condicion para mostrar los dados del jugador actual///////////////////
        if (boton == this.vistaBatalla.lanzarDados){                     ///////
            this.vistaBatalla.seleccionarDado.setVisible(true);          ///////
            this.vistaBatalla.panelLanzarDados.setEnabled(true);         ///////
            String turno = combate.getJugadorActual();                   /////// 
            if (turno.equals(combate.getJugador1())){                    /////// 
                System.out.print(combate.getJugador1());                 ///////
                String[] criaturasDado = puzleJ1.getPuzleDeDados();      ///////
                for (String criaturasDado1 : criaturasDado) {            ///////
                    this.vistaBatalla.dadosPuzle.addItem(criaturasDado1);///////
                }                                                        ///////
            }                                                            ///////
            else if (turno.equals(combate.getJugador2())){               ///////
                System.out.print(combate.getJugador1());                 ///////
                String[] criaturasDado2 = puzleJ2.getPuzleDeDados();     ///////
                for (String criaturasDado1 : criaturasDado2) {           ///////
                this.vistaBatalla.dadosPuzle.addItem(criaturasDado1);///////
                }                                                    ///////////
            }                                                        ///////////
        }                                                            ///////////
        ////////////////////////////////////////////////////////////////////////
        //Condicion para seleccionar dado y guardarlo en una variable//////////////
        int i = 0;                                                              /// 
        if (boton == this.vistaBatalla.seleccionarDado && i<4){                 ///
            dados[i] = this.vistaBatalla.dadosPuzle.getSelectedItem().toString();// 
            System.out.print(dados[i]);                                       ///
            i++;                                                                ///
        }                                                                       ///
        ///////////////////////////////////////////////////////////////////////////    
        if (boton == this.vistaBatalla.lanzar){
            
            }
            if (dados.equals(dado1J1.getNombre())){
                String caraEscogida = dado1J1.lanzarDado(dado1J1.getCaras());
                String caraEscogida2 = dado2J1.lanzarDado(dado2J1.getCaras());
                String caraEscogida3 = dado3J1.lanzarDado(dado3J1.getCaras());
                String caraEscogida4 = dado4J1.lanzarDado(dado4J1.getCaras());
                this.vistaBatalla.caraDado1.setText(caraEscogida);
                this.vistaBatalla.caraDado2.setText(caraEscogida2);
                this.vistaBatalla.caraDado3.setText(caraEscogida3);
                this.vistaBatalla.caraDado4.setText(caraEscogida4);
            }
            /*else if(dado1 == dado1J2.getNombre() && dado2 == dado2J2.getNombre() && dado3 == dado3J2.getNombre() && dado4 == dado4J2.getNombre()){
                String caraEscogida = dado1J2.lanzarDado(dado1J2.getCaras());
                String caraEscogida2 = dado2J2.lanzarDado(dado2J2.getCaras());
                String caraEscogida3 = dado3J2.lanzarDado(dado3J2.getCaras());
                String caraEscogida4 = dado4J2.lanzarDado(dado4J2.getCaras());
                this.vistaBatalla.caraDado1.setText(caraEscogida);
                this.vistaBatalla.caraDado2.setText(caraEscogida2);
                this.vistaBatalla.caraDado3.setText(caraEscogida3);
                this.vistaBatalla.caraDado4.setText(caraEscogida4);
            }*/        
        }
        
    }
            
