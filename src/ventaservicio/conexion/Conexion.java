/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 
 */
public class Conexion {

    public static Connection conexion;

    public Conexion() {

    }

    public static Connection getInstance() {
        if (conexion == null) {
            //String[] parte;
            //parte = infoConexion.split(",");

            String url = "jdbc:oracle:thin:@MSP-PM-04-01.aws.smartcloud.cl:1521:xe";

            String user = "usuario01";
            String pass = "usuario01";
            try {
                conexion = DriverManager.getConnection(url, user, pass);
                System.out.println("Conectado");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                //e.printStackTrace();

            }
            return conexion;
        }
        else
            return conexion;
    }

   
}
