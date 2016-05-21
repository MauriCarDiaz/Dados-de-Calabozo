
package Modelo;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Jugador {
    private String nombre;
    private String contraseña;
    private boolean PNJ;
    private boolean turnoActual;
    //private Dado dado;???
    //private Criatura criatura;???

    
    public void nuevoUsuario(String nombre,String contraseña) throws SQLException{
        ConeccionBD conexion = new ConeccionBD();
        boolean resultado = conexion.conectar();
        if (resultado==true){
            //Depende de la base de datos
            final String consulta = "INSERT INTO USUARIO (NOMBRE,PASS) VALUES ('"+nombre+"','"+contraseña+")";
            Statement stmt = conexion.crearConsulta();
            if (stmt != null){
                stmt.executeUpdate(consulta);
                stmt.close();
                conexion.desconectar();
            }
            else{
                stmt.close();
                conexion.desconectar();
            }
        }   
    }
    
    public java.util.List<String> UsuariosRegistrados() throws SQLException{
        java.util.List<String> listaUsuarios = new ArrayList<String>();
        ConeccionBD conexion = new ConeccionBD();
        boolean resultado = conexion.conectar();
        if (resultado==true){
            final String consulta = "SELECT NOMBRE FROM USUARIO";//Depende del nombre de las tablas de la base de datos.
            Statement stmt = conexion.crearConsulta();
            ResultSet resultados = null;
            if (stmt != null){
                resultados = stmt.executeQuery(consulta);
                while(resultados.next()){
                    String nombreUsuario = resultados.getString(1);
                    listaUsuarios.add(nombreUsuario);
                }
                resultados.close();
                stmt.close();
                conexion.desconectar();
                return listaUsuarios;
            }
            else{
                conexion.desconectar();
                return null;
            } 
        }
        else{
            return null;
        }   
    }
    
    public String contraseñaUsuarios(String usuario) throws SQLException{
        ConeccionBD conexion = new ConeccionBD();
        boolean resultado = conexion.conectar();
        if (resultado==true){
            final String consulta = "SELECT PASS FROM USUARIO WHERE NOMBRE = '" +usuario+"'";//ESTO DEPENDE DE LAS TABLAS DE LA BASE DE DATOS
            Statement stmt = conexion.crearConsulta();
            ResultSet resultados = null;
            if (stmt != null){
                resultados = stmt.executeQuery(consulta);
                resultados.next();
                String passUsuario = resultados.getString(1);//El numero depende de la base de datos.
                resultados.close();
                stmt.close();
                conexion.desconectar();
                return passUsuario;
            }
            else{
                conexion.desconectar();
                return null;
            }   
        }
        else{
            return null;
        }
    }

    public boolean getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(boolean turnoActual) {
        this.turnoActual = turnoActual;
    }
    
    public String getNombreJugador(){
        return nombre;
    }
    
    public void setNombreJugador(String nombreJugador){
        nombre = nombreJugador;
    }
    
    public String getContraseñaJugador(){
        return contraseña;
    }
    
    public void setContraseñaJugador(String contrasena){
        contraseña = contrasena;
    }
    
    public boolean getPersonajeNoJugable(){
        return PNJ;
    }
    
    public void setPersonajeNoJugable(boolean pnj){
        PNJ = pnj;
    }
}
