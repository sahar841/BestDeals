/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Publicite;
import Entity.Question;
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
public class publiciteDAO implements IDao<Publicite , Integer> {

    private static publiciteDAO instance;
    private Connection connexion;
    private Publicite p;

    private publiciteDAO() {
         connexion = ConnexionMySql.getInstance().getConnection();
    }
     public static publiciteDAO getInstance()
{
    if(instance==null)
        instance=new publiciteDAO();
    return instance;
}
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Publicite obj) {
       
            String sql = "insert into publicité(description,dateDebut,dateFin,prix) values (?,?,?,?)";
       try {
             PreparedStatement preparq=connexion.prepareStatement(sql);

                   preparq.setString(1, obj.getDescription());
                   preparq.setString(2, obj.getDateDebut());
                   preparq.setString(3, obj.getDateFin());
                   preparq.setFloat(4, obj.getPrix());
                   int var=preparq.executeUpdate();
                   if(var==0)
                       return false; 
                               else 
                       return true;
        } catch (SQLException ex) {
            Logger.getLogger(publiciteDAO.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
    }

    @Override
    public List<Publicite> readAll() {
        
            List<Publicite> c=new ArrayList<Publicite>();
          try {  
            Statement st =connexion.createStatement();
                     String sql="select * from publicité";
                     ResultSet res=st.executeQuery(sql);
                     while(res.next())
                     {
                         c.add(new Publicite(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getFloat(5)));
                     }
        } catch (SQLException ex) {
            Logger.getLogger(publiciteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          return c;

    }

    @Override
    public Publicite readByID(Integer id) {
       
            Publicite p=null;
            try { 
             Statement st =connexion.createStatement();
                         String sql="select * from publicité where id="+id;
                         ResultSet res=st.executeQuery(sql);
                         while(res.next())
                         {
                             p=new Publicite(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getFloat(5));
                         }
        } catch (SQLException ex) {
            Logger.getLogger(publiciteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return p;
    
    }

    @Override
    public boolean update(Publicite obj) {
        
            String sql="update publicité set description=?,dateDebut=?,dateFin=?,prix=? where id=?"+obj.getId();
                try {   
                   PreparedStatement psmt=connexion.prepareStatement(sql);

                         psmt.setString(1, obj.getDescription());
                          psmt.setString(2, obj.getDateDebut());
                           psmt.setString(3, obj.getDateFin());
                            psmt.setFloat(4, obj.getPrix());


                         int var=psmt.executeUpdate();
                             if(var==0)
                                 return false;
                             else
                                 return true;
        } catch (SQLException ex) {
            Logger.getLogger(publiciteDAO.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        
    }

    @Override
    public boolean delete(Publicite obj) {
       
            String sql="delete from publicité where id="+obj.getId();
           try {  
            Statement stmt= connexion.createStatement();
                     int var = stmt.executeUpdate(sql);
                            if (var == 0) {
                                return false;
                            } else {
                                return true;
                            }
        } catch (SQLException ex) {
            Logger.getLogger(publiciteDAO.class.getName()).log(Level.SEVERE, null, ex);
       return false;
        }
         
    
    }

   
    
}
