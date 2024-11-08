/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Withorya_3862
 */
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    public class UsuarioDAO {
 private Connection connection;
 Long id;
 String nome;
 String cpf;
 String email;
 String telefone;
 String senha;
 public UsuarioDAO(){
 this.connection = new ConnectionFactory().getConnection();
 }
 public void adiciona(Usuario usuario){
    
String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,?)";
 try {
 PreparedStatement stmt = connection.prepareStatement(sql);
 stmt.setString(1, usuario.getNome());
 stmt.setString(2, usuario.getCpf());
 stmt.setString(3, usuario.getEmail());
 stmt.setString(4, usuario.getTelefone());
 stmt.setString(5, usuario.getSenha());
 stmt.execute();
 stmt.close();
 } catch (SQLException u) {
 throw new RuntimeException(u);
 }
 }
}