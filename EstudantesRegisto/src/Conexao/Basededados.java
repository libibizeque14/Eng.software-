/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.*;

/**
 *
 * @Libi Bizeque
 */
public class Basededados {

    //metodo conexao com O banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama o drive importaado

        String drive = "com.mysql.jdbc.Driver";
        //armazenando informacoes ref ao banco
        String url = "jdbc:mysql://localhost:3306/estudantes";
        String user = "root";
        String password = "";
        
        //conectando com BD
        try {
            Class.forName(drive);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            //apoio ao erro
            //System.out.println("e");
            return null;
        }
    }
}
