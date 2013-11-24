/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Entity.Deal;
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
public class DealDAO implements IDao<Deal , Integer> {

    private static DealDAO instance;
    private Connection connexion;
    

    private DealDAO() {
         connexion = ConnexionMySql.getInstance().getConnection();
    }
    
    
     public static DealDAO getInstance()
{
    if(instance==null)
        instance=new DealDAO();
    return instance;
}
    
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Deal obj) {
        try {
            String sql = "insert into deal(description,dateCreation,dateLimit,nom,typeDeal,image,idResponsable,idCatalogue) values (?,?,?,?,?,?,?,?)";
                             
                             
                             
                             
                             PreparedStatement pstmt = connexion.prepareStatement(sql);
                             pstmt.setString(1,obj.getDescription());
                             pstmt.setString(2, obj.getDateCreation());
                             pstmt.setString(3, obj.getDateLimit());
                             pstmt.setString(4, obj.getNom());
                             pstmt.setString(5, obj.getType());
                             pstmt.setString(6, obj.getImage());
                             pstmt.setInt(7, obj.getResponsableSociete().getId());
                             pstmt.setInt(8, obj.getCatalogue().getId());
                             
                             
                             
                             int var = pstmt.executeUpdate();
                             if (var == 0) {
                                 return false;
                             } else {
                                 return true;    
                             }
        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Deal> readAll() {
        try {
            List<Deal> deals = new ArrayList<Deal>();
                         Deal deal;
                      String sql = "select * from deal";
                      Statement stmt = connexion.createStatement();
                      ResultSet rs = stmt.executeQuery(sql);
                      while (rs.next()) {
                    
                       deal=new Deal(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),ResponsableSocieteDAO.getInstance().readByID(rs.getInt(8)) ,CatalogueDAO.getInstance().readByID(rs.getInt(9)));
                         
                         
                         deals.add(deal);
                    
                  
                  
                  }
                      return deals;
        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Deal readByID(Integer id) {
        Deal deal=null;
        try {
            
            Statement st =connexion.createStatement();
                              String sql="select * from deal where id="+id;
                              ResultSet rs=st.executeQuery(sql);
                              
                              if(rs.next())
                              {
                                  deal=new Deal(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),ResponsableSocieteDAO.getInstance().readByID(rs.getInt(8)) ,CatalogueDAO.getInstance().readByID(rs.getInt(9)));
                              }
        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deal;
    }

    
     public Deal readByName(String id) {
        Deal deal=null;
        try {
            
            Statement st =connexion.createStatement();
                              String sql="select * from deal where nom='"+id+"'";
                              ResultSet rs=st.executeQuery(sql);
                              
                              if(rs.next())
                              {
                                  deal=new Deal(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),ResponsableSocieteDAO.getInstance().readByID(rs.getInt(8)) ,CatalogueDAO.getInstance().readByID(rs.getInt(9)));
                              }
        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return deal;
    }

    
    
    
    @Override
    public boolean update(Deal obj) {
        try {
            String sql="update deal set description=?,dateCreation=?,dateLimit=?,nom=?,typeDeal=?,image=?,idResponsable=?,idCatalogue=? where id="+obj.getId();
                            PreparedStatement pstmt=connexion.prepareStatement(sql);

                                 pstmt.setString(1,obj.getDescription());
                                 pstmt.setString(2, obj.getDateCreation());
                                 pstmt.setString(3, obj.getDateLimit());
                                 pstmt.setString(4, obj.getNom());
                                 pstmt.setString(5, obj.getType());
                                 pstmt.setString(6, obj.getImage());
                                 pstmt.setInt(7, obj.getResponsableSociete().getId());
                                 pstmt.setInt(8, obj.getCatalogue().getId());
                      
              

                            int var=pstmt.executeUpdate();
                                if(var==0)
                                    return false;
                                else
                                    return true;
        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Deal obj) {
        try {
            String sql="delete from deal where id="+obj.getId();
                                 
                         Statement stmt= connexion.createStatement();
                         
                         int var = stmt.executeUpdate(sql);
                                if (var == 0) {
                                    return false;
                                } else {
                                    return true;
                                }
        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
