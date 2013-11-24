/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Deal;
import Entity.Produit;
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
public class ProduitDAO implements IDao<Produit , Integer> {

    private static ProduitDAO instance;
private Connection connexion;

    public ProduitDAO() {
     connexion=ConnexionMySql.getInstance().getConnection();
    }

    
    
     public static ProduitDAO getInstance()
{
    if(instance==null)
        instance =new ProduitDAO();
    return instance;
}
    
    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Produit obj) {
        try {
            String sql = "insert into produit(description,prix,remise,quantiteInitial,quantiteDisponible,nom,image,idDeal) values (?,?,?,?,?,?,?,?)";
                                  
                                  
                                  
                                  
                                  PreparedStatement pstmt = connexion.prepareStatement(sql);
                                  pstmt.setString(1,obj.getDescription());
                                  pstmt.setFloat(2, obj.getPrix());
                                  pstmt.setInt(3, obj.getRemise());
                                  pstmt.setInt(4, obj.getQuantiteInitial());
                                  pstmt.setInt(5, obj.getQuantiteDisponible());
                                  pstmt.setString(6, obj.getNom());
                                  pstmt.setString(7, obj.getImage());
                                  pstmt.setInt(8, obj.getDeal().getId());
                                  
                                  
                                  
                                  int var = pstmt.executeUpdate();
                                  if (var == 0) {
                                      return false;
                                  } else {
                                      return true;
                                  }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public List<Produit> readAll() {
        try {
            List<Produit> produits = new ArrayList<Produit>();
                         Produit produit;
                         String sql = "select * from produit";
                         Statement stmt = connexion.createStatement();
                         ResultSet rs = stmt.executeQuery(sql);
                         while (rs.next()) {
                       
                          produit=new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),rs.getString(7),rs.getString(8) ,DealDAO.getInstance().readByID(rs.getInt(9)));
                            
                            
                            produits.add(produit);
                       
                     
                     
                     }
                         return produits;
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Produit readByID(Integer id) {
        Produit produit=null;
        try {
            
        
            
                
                Statement st =connexion.createStatement();
                                  String sql="select * from produit where id="+id;
                                  ResultSet rs=st.executeQuery(sql);
                                  
                                  if(rs.next())
                                  {
                                      produit=new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),rs.getString(7),rs.getString(8) ,DealDAO.getInstance().readByID(rs.getInt(9)));
                                  }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return produit;
    }
    
     
     public Produit readByName(String id) {
        Produit produit=null;
        try {
            
        
            
                
                Statement st =connexion.createStatement();
                                  String sql="select * from produit where nom='"+id+"'";
                                  ResultSet rs=st.executeQuery(sql);
                                  
                                  if(rs.next())
                                  {
                                      produit=new Produit(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getInt(4), rs.getInt(5), rs.getInt(6),rs.getString(7),rs.getString(8) ,DealDAO.getInstance().readByID(rs.getInt(9)));
                                  }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return produit;
    }
    
     
    
    

    @Override
    public boolean update(Produit obj) {
        try {
            String sql="update produit set description=?,prix=?,remise=?,quantiteInitial=?,quantiteDisponible=?,nom=?,image=?,idDeal=? where id="+obj.getId();
                                PreparedStatement pstmt=connexion.prepareStatement(sql);

                                     pstmt.setString(1,obj.getDescription());
                                     pstmt.setFloat(2, obj.getPrix());
                                     pstmt.setInt(3, obj.getRemise());
                                     pstmt.setInt(4, obj.getQuantiteInitial());
                                     pstmt.setInt(5, obj.getQuantiteDisponible());
                                     pstmt.setString(6, obj.getNom());
                                     pstmt.setString(7, obj.getImage());
                                     pstmt.setInt(8, obj.getDeal().getId());
                      
              

                                int var=pstmt.executeUpdate();
                                    if(var==0)
                                        return false;
                                    else
                                        return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Produit obj) {
        try {
            String sql="delete from produit where id="+obj.getId();
                                     
                             Statement stmt= connexion.createStatement();
                             
                             int var = stmt.executeUpdate(sql);
                                    if (var == 0) {
                                        return false;
                                    } else {
                                        return true;
                                    }
        } catch (SQLException ex) {
            Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
