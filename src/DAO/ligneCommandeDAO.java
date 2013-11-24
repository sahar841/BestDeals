/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.ligneCommande;
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
public class ligneCommandeDAO implements IDao<ligneCommande , Integer> {

   private static ligneCommandeDAO instance;
private Connection connexion;

    private ligneCommandeDAO() {
        connexion=ConnexionMySql.getInstance().getConnection();
    }
    
    public static ligneCommandeDAO getInstance()
{
    if(instance==null)
        instance=new ligneCommandeDAO();
    return instance;
}



    @Override
    public boolean insert(ligneCommande obj) {
       try {
           PreparedStatement preparl=connexion.prepareStatement("insert into lignecommande(idcommande,idproduit,quantite,prix) values(?,?,?,?)");

            preparl.setInt(1, obj.getCommande().getId());
            preparl.setInt(2, obj.getProduit().getId());
            preparl.setInt(3, obj.getQuantite());
            preparl.setFloat(4, obj.getPrix());
            int var=preparl.executeUpdate();
            if(var==0)
                return false; 
                        else 
                return true;
       } catch (SQLException ex) {
           Logger.getLogger(ligneCommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return false;

    
    }

    @Override
    public List<ligneCommande> readAll() {
       try {
           List<ligneCommande> c=new ArrayList<ligneCommande>();
           
            Statement st =connexion.createStatement();
              String sql="select * from lignecommande";
              ResultSet res=st.executeQuery(sql);
              while(res.next())
              {
                  c.add(new ligneCommande(res.getInt(1),CommandeDAO.getInstance().readByID(res.getInt(2)),ProduitDAO.getInstance().readByID(res.getInt(3)), res.getInt(4), res.getFloat(5)));
              }
              return c;
       } catch (SQLException ex) {
           Logger.getLogger(ligneCommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
         return null;
       }

        
    
    }

    @Override
    public ligneCommande readByID(Integer id) {
     
        ligneCommande c=null;
           try { 
            Statement st =connexion.createStatement();
              String sql="select *  from lignecommande where id="+id;
              ResultSet res=st.executeQuery(sql);
             if(res.next())
              {
           
                c=new ligneCommande(res.getInt(1),CommandeDAO.getInstance().readByID(res.getInt(2)), ProduitDAO.getInstance().readByID(res.getInt(3)), res.getInt(4),res.getFloat(5));
              }
            
              } catch (SQLException ex) {
                Logger.getLogger(ligneCommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
            
              }
            return c;
              }    
    
    
    

    @Override
    public boolean update(ligneCommande obj) {
       
           String sql="update lignecommande set idcommande=?,set idProduit,quantite=?,prix=? where id=?"+obj.getId();
          try {
           PreparedStatement psmt=connexion.prepareStatement(sql);

              psmt.setInt(1, obj.getCommande().getId());
              psmt.setInt(2, obj.getProduit().getId());
              psmt.setInt(3, obj.getQuantite());
              psmt.setFloat(4, obj.getPrix());
              int var=psmt.executeUpdate();
                  if(var==0)
                      return false;
                  else
                      return true;
       } catch (SQLException ex) {
           Logger.getLogger(ligneCommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
         return false;
       }

    
    }

    @Override
    public boolean delete(ligneCommande obj) {
       
           String sql="delete from lignecommande where id="+obj.getId();
            try {      
          Statement stmt= connexion.createStatement();
          
          
          int var = stmt.executeUpdate(sql);
                 if (var == 0) {
                     return false;
                 } else {
                     return true;
                 }
       } catch (SQLException ex) {
           Logger.getLogger(ligneCommandeDAO.class.getName()).log(Level.SEVERE, null, ex);
      return false;
       }
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
