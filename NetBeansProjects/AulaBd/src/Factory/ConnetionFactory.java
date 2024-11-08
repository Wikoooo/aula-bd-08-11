/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author Withorya_3862
 */
import java.sql.Connection;
import java.sql.DriverManager;
import.java.sql.SQLException;


public class ConnetionFactory {
    public Connetion getConnetion(){
        
    try{
        return
                DriverManeger.getConnetin("jdbc:mysql://localhost/projetojava","seu-nome-de-usuario","sua-senha");
    }
    catch(SQLException excecao){
        
        throw new RuntimeException(excecao);
    }
  }
}
