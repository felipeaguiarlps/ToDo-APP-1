/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author felip
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdc:mysql//localhost.3306/todoapp2";
    public static final String USER = "root";
    public static final String PASS = "";
    
      public static Connection getConnection(){
          try{
              Class.forName(DRIVER);
              return DriverManager.getConnection(URL, USER, PASS);
          } catch (Exception ex){
              throw new RuntimeException("Erro na conex�o com o banco de dados", ex);
          }
      }    
      
      public static void closeConnection(Connection connection){
          try{
              if (connection != null){
                  connection.close();
              }
          }catch (Exception ex){
              throw new RuntimeException("Erro ao fechar a conex�o com o servidor");
          }
      }
      
      public static void closeConnection(Connection connection, PreparedStatement statement){
          try{
              if (connection != null){
                  connection.close();
              }
              if (statement != null){
                  statement.close();
              }
          }catch (Exception ex){
              throw new RuntimeException("Erro ao fechar a conex�o com o servidor");
          }
      }
      public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultset){
          try{
              if (connection != null){
                  connection.close();
              }
              if (statement != null){
                  statement.close();
              }
              
              if(resultset != null){
                  resultset.close();
              }
          }catch (Exception ex){
              throw new RuntimeException("Erro ao fechar a conex�o com o servidor");
          }
      }
}
