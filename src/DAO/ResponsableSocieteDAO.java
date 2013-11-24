/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Reponse;
import Entity.ResponsableSociete;
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
public class ResponsableSocieteDAO implements IDao<ResponsableSociete , Integer> {
    
     private static ResponsableSocieteDAO instance;
    private Connection connexion;
    private ResponsableSociete RespSociete;

    private ResponsableSocieteDAO() {
         connexion = ConnexionMySql.getInstance().getConnection();
        
    }
     public static ResponsableSocieteDAO getInstance()
{
    if(instance==null)
        instance=new ResponsableSocieteDAO();
    return instance;
}
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(ResponsableSociete t) {
       
     try {
            String sql = "insert into responsablesocieté(login,motDePasse,nom,prenom,email,adresseSociete,PhoneNumber,nomSociete,CIN) values (?,?,?,?,?,?,?,?,?)";

               PreparedStatement pstmt;
         
             pstmt = connexion.prepareStatement(sql);
        
           
               pstmt.setString(1, t.getLogin());
               pstmt.setString(2, t.getMotDePasse());
               pstmt.setString(3, t.getNom());
               pstmt.setString(4, t.getPrenom());
               pstmt.setString(5, t.getEmail());
               pstmt.setString(6,t.getAdresseSociete());
               pstmt.setString(7, t.getPhoneNumber()); 
               pstmt.setString(8, t.getNomSociete()); 
               pstmt.setString(9, t.getCin());
               
               
               
             
               int var = pstmt.executeUpdate();
               if (var == 0) {
                   return false;
               } else {
                   return true;
               }
               
                } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
                }
    }

    @Override
    public List<ResponsableSociete> readAll() {
        
             List<ResponsableSociete> e=new ArrayList<ResponsableSociete>();
         try {
            Statement st =connexion.createStatement();
            String sql="select * from responsablesocieté";
            ResultSet res=st.executeQuery(sql);
            while(res.next())
            {
                e.add(new ResponsableSociete(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),(res.getString(10))));
            }
            return e;
         } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
         return null;
         }

    }
    
     public ResponsableSociete readByName(String name) {
        
             ResponsableSociete e=null;
         try {
            Statement st =connexion.createStatement();
            String sql="select * from responsablesocieté where nom='"+name+"'";
            ResultSet res=st.executeQuery(sql);
            while(res.next())
            {
                e=new ResponsableSociete(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),(res.getString(10)));
            }
            return e;
         } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
         return null;
         }

    }
    
    
    
    public ResponsableSociete readByLogin(String login) {
        
             ResponsableSociete e=null;
         try {
            Statement st =connexion.createStatement();
            String sql="select * from responsablesocieté where login='"+login+"'";
            ResultSet res=st.executeQuery(sql);
            while(res.next())
            {
                e=new ResponsableSociete(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),(res.getString(10)));
            }
            return e;
         } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
         return null;
         }

    }

  
   

    @Override
    public boolean update(ResponsableSociete obj) {
         
             String sql="update responsablesocieté set login=?,motDePasse=?,nom=?,prenom=?,email=?,adresseSociete=?,phoneNumber=?,nomSociete=?,CIN=? where id="+obj.getId();
        try {
             PreparedStatement psmt=connexion.prepareStatement(sql);

             psmt.setString(1, obj.getLogin());
             psmt.setString(2, obj.getMotDePasse());
              psmt.setString(3, obj.getNom());
             psmt.setString(4, obj.getPrenom());
             psmt.setString(5, obj.getEmail());
             psmt.setString(6, obj.getAdresseSociete());
            psmt.setString(7, obj.getPhoneNumber());
            psmt.setString(8, obj.getNomSociete());
             psmt.setString(9, obj.getCin());
             

             int var=psmt.executeUpdate();
                 if(var==0)
                     return false;
                 else
                     return true;
         } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
         return false;
         }
  
    
    }

    @Override
    public boolean delete(ResponsableSociete obj) {
        
             String sql="delete from responsablesocieté where id="+obj.getId();
              try {   
             Statement stmt=connexion.createStatement();
                 int var=stmt.executeUpdate(sql);
                 if(var==0)
                     return false;
                 else
                     return true;   
         } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
         return false;
         }
    }

    @Override
    public ResponsableSociete readByID(Integer id) {
       ResponsableSociete r=null;  
        try {
             
                 
                 Statement st =connexion.createStatement();
                          String sql="select * from responsablesocieté where id="+id;    
                          ResultSet res=st.executeQuery(sql);
                         if(res.next())
                          {
                       
                            r=new ResponsableSociete(res.getInt(1),res.getString(2), res.getString(3), res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),(res.getString(10))) ;
                          }
         } catch (SQLException ex) {
             Logger.getLogger(ResponsableSocieteDAO.class.getName()).log(Level.SEVERE, null, ex);
             
         }
        return r;
    }
    
}
