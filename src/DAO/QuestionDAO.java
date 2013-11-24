/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class QuestionDAO implements IDao<Question , Integer> {

     private static QuestionDAO instance;
    private Connection connexion;
    private Question d;

    private QuestionDAO() {
         connexion = ConnexionMySql.getInstance().getConnection();
    }
    
    
     public static QuestionDAO getInstance()
{
    if(instance==null)
        instance=new QuestionDAO();
    return instance;
}
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Question obj) {
         String sql = "insert into question(contenu,idClient,idDeal) values (?,?,?)"; 
        try {
             PreparedStatement preparq=connexion.prepareStatement(sql);

                preparq.setString(1, obj.getContenu());
                preparq.setInt(2, obj.getClient().getId());
                preparq.setInt(1, obj.getDeal().getId());
                
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
    public List<Question> readAll() {
        
             List<Question> c=new ArrayList<Question>();
                try {
                Statement st =connexion.createStatement();
                  String sql="select * from question";
                  ResultSet res=st.executeQuery(sql);
                  while(res.next())
                  {
                      c.add(new Question(res.getInt(1),res.getString(2),ClientDAO.getInstance().readByID(res.getInt(3)),DealDAO.getInstance().readByID(res.getInt(4))));
                  }
                 
         } catch (SQLException ex) {
             Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
                
                 return c;
    }

    @Override
    public Question readByID(Integer id) {
        
             Question q=null;
            try {
                 Statement st =connexion.createStatement();
                 String sql="select * from question where Id="+id;    
                 ResultSet res=st.executeQuery(sql);
                if(res.next())
                 {
              
                   q=new Question(res.getInt(1),res.getString(2),ClientDAO.getInstance().readByID(res.getInt(3)),DealDAO.getInstance().readByID(res.getInt(4))) ;
                 }
         } catch (SQLException ex) {
             Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
            return q;
    }

    @Override
    public boolean update(Question obj) {
         try {
             String sql="update question set contenu=? where Id=?"+obj.getId();
             
             PreparedStatement psmt=connexion.prepareStatement(sql);

                   psmt.setString(1, obj.getContenu());


                   int var=psmt.executeUpdate();
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
    public boolean delete(Question obj) {
       
             String sql="delete from question where Id="+obj.getId();
            try {
            Statement stmt= connexion.createStatement();
                  
                  int var = stmt.executeUpdate(sql);
                         if (var == 0) {
                             return false;
                         } else {
                             return true;
                         }
         } catch (SQLException ex) {
             Logger.getLogger(QuestionDAO.class.getName()).log(Level.SEVERE, null, ex);
         return false;
         }
        
    }
    
}
