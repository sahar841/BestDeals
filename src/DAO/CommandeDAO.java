/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Commande;
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
public class CommandeDAO implements IDao<Commande , Integer> {

    private static CommandeDAO instance;
private Connection connexion;

    public CommandeDAO() {
        connexion=ConnexionMySql.getInstance().getConnection();
    }



public static CommandeDAO getInstance()
{
    if(instance==null)
        instance =new CommandeDAO();
    return instance;
}

     
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Commande obj) {
        try {
            String sql = "insert into commande(ref,dateDebut,prix,idClient) values (?,?,?,?)";
                         
                         
                         
                         
                         PreparedStatement pstmt = connexion.prepareStatement(sql);
                         pstmt.setString(1,obj.getRef());
                         pstmt.setString(2, obj.getDateDebut());
                         pstmt.setInt(3, obj.getPrix());
                         pstmt.setInt(4, obj.getClient().getId());
                         
                         
                         int var = pstmt.executeUpdate();
                         if (var == 0) {
                             return false;
                         } else {
                             return true;    
                         }
        } catch (SQLException ex) {
            Logger.getLogger(CommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Commande> readAll() {
        try {
            List<Commande> commandes = new ArrayList<Commande>();
                     Commande commande;
                     String sql = "select * from commande";
                         Statement stmt = connexion.createStatement();
                         ResultSet rs = stmt.executeQuery(sql);
                  while (rs.next()) {
                
                    commande=new Commande(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),ClientDAO.getInstance().readByID(rs.getInt(5)) );
                     
                     
                     commandes.add(commande);
                
              
              
              }
                  return commandes;
        } catch (SQLException ex) {
            Logger.getLogger(CommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Commande readByID(Integer id) {
        Commande commande=null;
        try {
            
                          Statement st =connexion.createStatement();
                          String sql="select * from commande where id="+id;
                          ResultSet rs=st.executeQuery(sql);
                          
                          if(rs.next())
                          {
                              commande=new Commande(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),ClientDAO.getInstance().readByID(rs.getInt(5)) );
                          }
        } catch (SQLException ex) {
            Logger.getLogger(CommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return commande;
    }
    
   

    @Override
    public boolean update(Commande obj) {
        try {
            String sql="update Commande set ref=?,dateDebut=?,prix=?,idClient=? where id="+obj.getId();
                        PreparedStatement pstmt=connexion.prepareStatement(sql);

                           pstmt.setString(1,obj.getRef());
                           pstmt.setString(2, obj.getDateDebut());
                           pstmt.setInt(3, obj.getPrix());
                           pstmt.setInt(4, obj.getClient().getId());
                      
              

                        int var=pstmt.executeUpdate();
                            if(var==0)
                                return false;
                            else
                                return true;
        } catch (SQLException ex) {
            Logger.getLogger(CommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Commande obj) {
        try {
            String sql="delete from commande where id="+obj.getId();
                             
                     Statement stmt= connexion.createStatement();
                     
                     int var = stmt.executeUpdate(sql);
                            if (var == 0) {
                                return false;
                            } else {
                                return true;
                            }
        } catch (SQLException ex) {
            Logger.getLogger(CommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
                    
        }
    }
    
}
