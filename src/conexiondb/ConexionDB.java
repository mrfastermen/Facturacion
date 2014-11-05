/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiondb;

/**
 *
 * @author Estudiante
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.vo.Empresa;
import modelo.vo.Factura;

public class ConexionDB {
    
    private static Statement st = null;
    private static ResultSet rs = null;
    private static Connection conexion = null;
    private static PreparedStatement ps = null;

    public static Connection GetConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/compisdb";
            String usuarioDB = "root";
            String passwordDB = "1234";
            conexion = DriverManager.getConnection(servidor, usuarioDB, passwordDB);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la BD " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion = null;
        } finally {
            return conexion;
        }
    }
    
    public static Vector<Empresa> leerDatosVector(String consulta){
        Vector<Empresa> empresa = new Vector<Empresa>();
        Empresa emp = null;
        
        if (conexion == null)
            GetConnection();
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                emp = new Empresa();
                emp.setIdempresa(rs.getString(1));
                emp.setNombre(rs.getString(2));
                emp.setNit(rs.getString(3));
                emp.setUsuario_idusuario(rs.getString(4));
                empresa.add(emp);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return empresa;
    }
    
    public static Vector<Factura> insertarFactura(String consulta){
        Vector<Factura> factura = new Vector<Factura>();
        Factura fact = null;
        
        if (conexion == null)
            GetConnection();
        try {
            st = conexion.createStatement();
            int insert = st.executeUpdate(consulta);
            
            while(rs.next()){
                fact = new Factura();
                fact.setIdfacturacion(rs.getString(1));
                fact.setEstado(rs.getString(2));
                fact.setFecha_factura(rs.getString(3));
                fact.setValor_factura(rs.getString(4));
                fact.setNum_factura(rs.getString(5));
                fact.setEmpresa_idempresa(rs.getString(6));
                factura.add(fact);
            }
            st.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return factura;
    }
}
