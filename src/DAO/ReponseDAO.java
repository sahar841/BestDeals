/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Question;
import Entity.Reponse;
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
public class ReponseDAO implements IDao<Reponse , Integer> {

    private static ReponseDAO instance;
    private Connection connexion;

    public ReponseDAO() {
         connexion = ConnexionMySql.getInstance().getConnection();
    }
    
     public static ReponseDAO getInstance()
{
    if(instance==null)
        instance=new ReponseDAO();
    return instance;
}
    
    
    
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Reponse obj) {
      String sql = "insert into reponse(contenu,idQuestion,idClient) values (?,?,?)"; 
        try {
             PreparedStatement preparq=connexion.prepareStatement(sql);

                preparq.setString(1, obj.getContinu());
                preparq.setInt(2, obj.getQuestion().getId());
                preparq.setInt(1, obj.getClient().getId());
                
                int var=preparq.executeUpdate();
                if(var==0)
                    return false; 
                            else 
                    return true;
         } catch (SQLException ex) {
             Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
           return false;
         }   
    }

    @Override
    public List<Reponse> readAll() {
        
            List<Reponse> c=new ArrayList<Reponse>();
          try {  
             Statement st =connexion.createStatement();
                         String sql="select * from reponse";
                         ResultSet res=st.executeQuery(sql);
                         while(res.next())
                         {
                             c.add(new Reponse(res.getInt(1),res.getString(2),QuestionDAO.getInstance().readByID(res.getInt(3)),ClientDAO.getInstance().readByID(res.getInt(4))));
                         }
        } catch (SQLException ex) {
            Logger.getLogger(ReponseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
          return c;
     
    }

    @Override
    public Reponse readByID(Integer id) {
       
            Reponse r=null;
            try {
            Statement st =connexion.createStatement();
                     String sql="select * where id="+id;    
                     ResultSet res=st.executeQuery(sql);
                    if(res.next())
                     {
                  
                       r=new Reponse(res.getInt(1),res.getString(2),QuestionDAO.getInstance().readByID(res.getInt(3)),ClientDAO.getInstance().readByID(res.getInt(4))) ;
                     }
        } catch (SQLException ex) {
            Logger.getLogger(ReponseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return r;
    }

    @Override
    public boolean update(Reponse obj) {
       
            String sql="update reponse set contenu=? where id=?"+obj.getId();
            try {    
               PreparedStatement psmt=connexion.prepareStatement(sql);

                     psmt.setString(1, obj.getContinu());


                     int var=psmt.executeUpdate();
                         if(var==0)
                             return false;
                         else
                             return true;
        } catch (SQLException ex) {
            Logger.getLogger(ReponseDAO.class.getName()).log(Level.SEVERE, null, ex);
      return false;
        }
    
    }

    @Override
    public boolean delete(Reponse obj) {
       
            String sql="delete from reponse where id="+obj.getId();
            try {
            Statement stmt= connexion.createStatement();
                     ClientDAO.getInstance().delete(obj.getClient());
                    QuestionDAO.getInstance().delete(obj.getQuestion());
                     int var = stmt.executeUpdate(sql);
                            if (var == 0) {
                                return false;
                            } else {
                                return true;
                            }
        } catch (SQLException ex) {
            Logger.getLogger(ReponseDAO.class.getName()).log(Level.SEVERE, null, ex);
       return false;
        }
    }
    
}
