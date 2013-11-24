/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Catalogue;
import Entity.Client;
import util.IDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnexionMySql;

/**
 *
 * @author ahmed
 */
public class ClientDAO implements IDao<Client , Integer> {
     
     private static ClientDAO instance;
    private Connection connexion;
    private Client c;
   
    private ClientDAO() {
      connexion = ConnexionMySql.getInstance().getConnection();
        
    }
     public static ClientDAO getInstance()
{
    if(instance==null)
        instance=new ClientDAO();
    return instance;
}
    
    
   
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Client obj) {
         try {
             String sql = "insert into client(login,motDePasse,adresse,nom,prenom,email,cin,age,sexe,phoneNumber) values (?,?,?,?,?,?,?,?,?,?)";
                 
                 
                 
                 
                 PreparedStatement pstmt = connexion.prepareStatement(sql);
                 pstmt.setString(1,obj.getLogin());
                 pstmt.setString(2, obj.getMotDePasse());
                 pstmt.setString(3, obj.getAdresse());
                 pstmt.setString(4, obj.getNom());
                 pstmt.setString(5, obj.getPrenom());
                 pstmt.setString(6, obj.getEmail());
                 pstmt.setString(7, obj.getCIN());
                 pstmt.setInt(8, obj.getAge());
                 pstmt.setString(9, obj.getSexe());
                 pstmt.setString(10, obj.getPhoneNumber());
                 
                 int var = pstmt.executeUpdate();
                 if (var == 0) {
                     return false;
                 } else {
                     return true;
                 }
         } catch (SQLException ex) {
             Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
    }

    @Override
    public List<Client> readAll() {
         try {
             List<Client> clients = new ArrayList<Client>();
                 Client client;
                 String sql = "select * from client";
                     Statement stmt = connexion.createStatement();
                     ResultSet rs = stmt.executeQuery(sql);
              while (rs.next()) {
             
              
             client=new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getString(10),rs.getString(11));
              
              
              clients.add(client);
         
          
          
          }
              return clients;
         } catch (SQLException ex) {
             Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }

    @Override
    public Client readByID(Integer id) {
        Client a=null ; 
        try {
             
             
             
             Statement st =connexion.createStatement();
                     String sql="select * from client where id="+id;
                     ResultSet rs=st.executeQuery(sql);
                     
                     if(rs.next())
                     {
                         a=new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getString(10),rs.getString(11));
                     }
         } catch (SQLException ex) {
             Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    return a;
    }
    
     public Client readByLogin(String id) {
        Client a=null ; 
        try {
             
             
             
             Statement st =connexion.createStatement();
                     String sql="select * from client where login='"+id+"'";
                     ResultSet rs=st.executeQuery(sql);
                     
                     if(rs.next())
                     {
                         a=new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getString(10),rs.getString(11));
                     }
         } catch (SQLException ex) {
             Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    return a;
    }

    @Override
    public boolean update(Client obj) {
         try {
             String sql="update Client set login=?,motDePasse=?,adresse=?,nom=?,prenom=?,email=?,cin=?,age=?,sexe=?,phoneNumber=? where id="+obj.getId();
                   PreparedStatement pstmt=connexion.prepareStatement(sql);

                      pstmt.setString(1,obj.getLogin());
                      pstmt.setString(2, obj.getMotDePasse());
                      pstmt.setString(3, obj.getAdresse());
                      pstmt.setString(4, obj.getNom());
                      pstmt.setString(5, obj.getPrenom());
                      pstmt.setString(6, obj.getEmail());
                      pstmt.setString(7, obj.getCIN());
                      pstmt.setInt(8, obj.getAge());
                      pstmt.setString(9, obj.getSexe());
                      pstmt.setString(10, obj.getPhoneNumber());
              

                   int var=pstmt.executeUpdate();
                       if(var==0)
                           return false;
                       else
                           return true;
         } catch (SQLException ex) {
             Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
    }

    @Override
    public boolean delete(Client obj) {
         try {
             String sql="delete from client where id="+obj.getId();
                         
                 Statement stmt= connexion.createStatement();
                 
                 int var = stmt.executeUpdate(sql);
                        if (var == 0) {
                            return false;
                        } else {
                            return true;
                        }
         } catch (SQLException ex) {
             Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
    }
    
}
