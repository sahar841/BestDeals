/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Administrateur;
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
public class CatalogueDAO implements IDao<Catalogue , Integer>{

    
    private static CatalogueDAO instance;
    private Connection connexion;
    private Catalogue c;

    public CatalogueDAO() {
        connexion = ConnexionMySql.getInstance().getConnection();
    }
    
      public static CatalogueDAO getInstance()
{
    if(instance==null)
        instance=new CatalogueDAO();
    return instance;
}
    
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Catalogue obj) {
        try {
            String sql = "insert into catalogue(description,nom) values (?,?)";
            
            
            
            
            PreparedStatement pstmt = connexion.prepareStatement(sql);
            pstmt.setString(1,obj.getDescription());
            pstmt.setString(2, obj.getNom());
            
            
            int var = pstmt.executeUpdate();
            if (var == 0) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CatalogueDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Catalogue> readAll() {
        try {
            List catalogues = new ArrayList<Catalogue>();
           Catalogue catalogue;
           String sql = "select * from catalogue";
               Statement stmt = connexion.createStatement();
               ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
       
        
       catalogue=new Catalogue(rs.getInt(1),rs.getString(2),rs.getString(3));
        
        
        catalogues.add(catalogue);
   
    
    
    }
        return catalogues;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogueDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }

    @Override
    public Catalogue readByID(Integer id) {
         Catalogue a=null;
        try {
           
            
            
            Statement st =connexion.createStatement();
                String sql="select * from catalogue where id="+id;
                ResultSet res=st.executeQuery(sql);
                
                if(res.next())
                {
                    a=new Catalogue(res.getInt(1),res.getString(2), res.getString(3));
                
                    
                }
                
        } catch (SQLException ex) {
            Logger.getLogger(CatalogueDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return a;
    }

    public Catalogue readByName(String id) {
         Catalogue a=null;
        try {
           
            
            
            Statement st =connexion.createStatement();
                String sql="select * from catalogue where nom='"+id+"'";
                ResultSet res=st.executeQuery(sql);
                
                if(res.next())
                {
                    a=new Catalogue(res.getInt(1),res.getString(2), res.getString(3));
                
                    
                }
                
        } catch (SQLException ex) {
            Logger.getLogger(CatalogueDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return a;
    }

    
    @Override
    public boolean update(Catalogue obj) {
        try {
            String sql="update Catalogue set description=?,nom=? where id="+obj.getId();
              PreparedStatement psmt=connexion.prepareStatement(sql);

              psmt.setString(1, obj.getDescription());
              psmt.setString(2, obj.getNom());

              int var=psmt.executeUpdate();
                  if(var==0)
                      return false;
                  else
                      return true;
        } catch (SQLException ex) {
            Logger.getLogger(CatalogueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Catalogue obj) {
        try {
            String sql="delete from catalogue where id="+obj.getId();
                    
            Statement stmt= connexion.createStatement();
            
            int var = stmt.executeUpdate(sql);
                   if (var == 0) {
                       return false;
                   } else {
                       return true;
                   }
        } catch (SQLException ex) {
            Logger.getLogger(CatalogueDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
