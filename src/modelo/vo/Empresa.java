/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.vo;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Yeison RonK
 */
public class Empresa {
    
    private String idempresa;
    private String nombre;
    private String nit;
    private String usuario_idusuario;

    public Empresa(String idempresa, String nombre, String nit, String usuario_idusuario) {
        this.idempresa = idempresa;
        this.nombre = nombre;
        this.nit = nit;
        this.usuario_idusuario = usuario_idusuario;
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }
    
    public Empresa(){
    }

    public String getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(String idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(String usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public static Vector<Empresa> getEmpresa(){
        Vector<Empresa> empresa = conexiondb.ConexionDB.leerDatosVector("SELECT idempresa, nombre, nit, usuario_idusuario FROM empresa");
        return empresa;
    }
}
