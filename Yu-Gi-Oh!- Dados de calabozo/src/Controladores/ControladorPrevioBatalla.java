package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vistas.*;
import Modelo.*;
import javax.swing.ButtonGroup;


public class ControladorPrevioBatalla implements ActionListener {
    private VistaPrevioBatalla previoBatalla;
    private VistaBatalla vistaBatalla;
    private Combate combate;
    public int competidores;
    public String[] jugadores;
    ButtonGroup grupoCompetidores = new ButtonGroup();
    ButtonGroup grupoModalidad = new ButtonGroup();
    
    public ControladorPrevioBatalla(VistaPrevioBatalla previoBatalla){
        this.previoBatalla = previoBatalla;
    }
    
    public void iniciar_PrevioBatalla(){
        //Botones que contiene la vista Previo Batalla.
        this.previoBatalla.GenerarBatalla.addActionListener(this);
        this.previoBatalla.cantidadCpu.addActionListener(this);
        this.previoBatalla.Volver.addActionListener(this);
        this.previoBatalla.cantidadUsuarios.addActionListener(this);
        this.previoBatalla.equipos.addActionListener(this);
        this.previoBatalla.escogerDados.addActionListener(this);
        this.previoBatalla.individual.addActionListener(this);
        this.previoBatalla.soloUsuarios.addActionListener(this);
        this.previoBatalla.soloCpu.addActionListener(this);
        this.previoBatalla.usuariosCpu.addActionListener(this);
        //Grupo de botones que sirve para seleccionar quienes competiran.
        grupoCompetidores.add(this.previoBatalla.soloUsuarios);
        grupoCompetidores.add(this.previoBatalla.soloCpu);
        grupoCompetidores.add(this.previoBatalla.usuariosCpu);
        //Grupo de botones que sirve para seleccionar solo una modalidad.
        grupoModalidad.add(this.previoBatalla.individual);
        grupoModalidad.add(this.previoBatalla.equipos);
        //
        this.previoBatalla.soloUsuarios.setActionCommand("solo usuarios");
        this.previoBatalla.soloCpu.setActionCommand("solo cpu");
        this.previoBatalla.usuariosCpu.setActionCommand("usuarios cpu");
        //
        this.previoBatalla.individual.setActionCommand("individual");
        this.previoBatalla.equipos.setActionCommand("equipos");
        //
        //this.previoBatalla.cantidadCpu.setEnabled(false);
        //this.previoBatalla.cantidadUsuarios.setEnabled(false); 
    }
    
    public void configurarCombate(int competidores, String[] jugadores){
        if (competidores == 2){
            
        }
        if (competidores == 3){
            
        }
        if (competidores == 4){
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       Object boton = e.getSource();
        if (boton == this.previoBatalla.GenerarBatalla){
            String botonGrupo1 = grupoCompetidores.getSelection().getActionCommand();
            //String botonGrupo2 = grupoModalidad.getSelection().getActionCommand();
            //int cantidadUsuario = (int) this.previoBatalla.cantidadUsuarios.getSelectedItem();
            //int cantidadCpu = (int) this.previoBatalla.cantidadCpu.getSelectedItem();
            if ("solo usuarios".equals(botonGrupo1)){
                this.previoBatalla.cantidadUsuarios.setEnabled(true);
                VistaBatalla vistaBatalla = new VistaBatalla();
                ControladorBatalla ctrlBatalla = new ControladorBatalla(vistaBatalla);
                ctrlBatalla.iniciar_VistaBatalla(2);
                vistaBatalla.setVisible(true);
                previoBatalla.setVisible(false);
               
            }
            if ("solo cpu".equals(botonGrupo1)){
                this.previoBatalla.cantidadCpu.setEnabled(true);
            }
            if ("usuarios cpu".equals(botonGrupo1)){
               this.previoBatalla.cantidadUsuarios.setEnabled(true);
               
            }
        }
        if (boton == this.previoBatalla.Volver){
            VistaMenuPrincipal menuPrincipal = new VistaMenuPrincipal();
            ControladorMenuPrincipal ctrlMenuPrincipal = new ControladorMenuPrincipal(menuPrincipal);
            ctrlMenuPrincipal.iniciar_MenuPrincipal();
            menuPrincipal.setVisible(true);
            previoBatalla.setVisible(false);
        }
    }
    
}
