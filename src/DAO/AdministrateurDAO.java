/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Administrateur;
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
 * @author HAMZA
 */
public class AdministrateurDAO implements IDao<Administrateur,Integer>{
    private static AdministrateurDAO instance;
    private Connection connexion;
    private AdministrateurDAO() {
        connexion = ConnexionMySql.getInstance().getConnection();
    }
    public static AdministrateurDAO getInstance() {
        if (instance == null) {
            instance = new AdministrateurDAO();
        }
        return instance;
    }

    

    @Override
    public boolean insert(Administrateur t) {
        try {
            String sql = "insert into administrateur(login,motDePasse) values (?,?)";
                    PreparedStatement pstmt = connexion.prepareStatement(sql);
                    
                    pstmt.setString(1,t.getLogin());
                    pstmt.setString(2, t.getMotDePasse());
                    
                    
                    int var = pstmt.executeUpdate();
                    if (var == 0) {
                        return false;
                    } else {
                        return true;
                    }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Administrateur> readAll() {
        try {        
            List administrateurs = new ArrayList<Administrateur>();
               Administrateur administrateur;
               String sql = "select * from administrateur";
                   Statement stmt = connexion.createStatement();
                   ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
            
            administrateur=new Administrateur(rs.getInt(1),rs.getString(2),rs.getString(3));
            
            
            administrateurs.add(administrateur);
       
        
        
        }
            return administrateurs;
        } catch (SQLException ex) {
            
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

       @Override
       public Administrateur readByID(Integer id) {
        Administrateur a=null;
           try {
            
            Statement st =connexion.createStatement();
            String sql="select * from administrateur where id="+id;
            ResultSet res=st.executeQuery(sql);
            
            if(res.next())
            {
                a=new Administrateur(res.getInt(1),res.getString(2), res.getString(3));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
       }
       
       public Administrateur readByName(String id) {
        Administrateur a=null;
           try {
            
            Statement st =connexion.createStatement();
            String sql="select * from administrateur where login='"+id+"'";
            ResultSet res=st.executeQuery(sql);
            
            if(res.next())
            {
                a=new Administrateur(res.getInt(1),res.getString(2), res.getString(3));
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
       }

       @Override
       public boolean update(Administrateur obj) {
        try {
            String sql="update administrateur set login=?,motDePasse=? where id="+obj.getId();
         PreparedStatement psmt=connexion.prepareStatement(sql);

         psmt.setString(1, obj.getLogin());
         psmt.setString(2, obj.getMotDePasse());

         int var=psmt.executeUpdate();
             if(var==0)
                 return false;
             else
                 return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       }

       @Override
       public boolean delete(Administrateur obj) {
        try {
            String sql="delete from administrateur where login='"+obj.getLogin()+"'";
                
        Statement stmt= connexion.createStatement();
        
        int var = stmt.executeUpdate(sql);
               if (var == 0) {
                   return false;
               } else {
                   return true;
               }
        } catch (SQLException ex) {
            Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
       }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
        
    
}
