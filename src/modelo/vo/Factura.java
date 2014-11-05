/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.vo;

/**
 *
 * @author Yeison RonK
 */
public class Factura {

    private String idfacturacion;
    private String estado;
    private String fecha_factura;
    private String valor_factura;
    private String num_factura;
    private String empresa_idempresa;

    public Factura(String idfacturacion, String estado, String fecha_factura, String valor_factura, String num_factura, String empresa_idempresa) {
        this.idfacturacion = idfacturacion;
        this.estado = estado;
        this.fecha_factura = fecha_factura;
        this.valor_factura = valor_factura;
        this.num_factura = num_factura;
        this.empresa_idempresa = empresa_idempresa;
    }

    public Factura() {

    }

    public String getIdfacturacion() {
        return idfacturacion;
    }

    public void setIdfacturacion(String idfacturacion) {
        this.idfacturacion = idfacturacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public String getValor_factura() {
        return valor_factura;
    }

    public void setValor_factura(String valor_factura) {
        this.valor_factura = valor_factura;
    }

    public String getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(String num_factura) {
        this.num_factura = num_factura;
    }

    public String getEmpresa_idempresa() {
        return empresa_idempresa;
    }

    public void setEmpresa_idempresa(String empresa_idempresa) {
        this.empresa_idempresa = empresa_idempresa;
    }

}
