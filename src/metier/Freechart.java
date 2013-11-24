/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import DAO.ProduitDAO;
import Entity.Produit;
import static java.awt.Component.TOP_ALIGNMENT;
import java.sql.Connection;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import util.ConnexionMySql;

/**
 *
 * @author Sahrour
 */
public class Freechart {
    
    
    private static Freechart instance;

    private Connection connexion;

    private Freechart() {
        connexion = ConnexionMySql.getInstance().getConnection();

    }

    public static Freechart getInstance() {
        if (instance == null) {
            instance = new Freechart();
        } 
        return instance;
    }
    
    public void stats()
    {
        List<Produit> produits = ProduitDAO.getInstance().readAll();
        
        DefaultPieDataset pieDataset = new  DefaultPieDataset();
        for (Produit pr : produits)
        {
            pieDataset.setValue(pr.getNom() ,new Integer(pr.getQuantiteInitial()-pr.getQuantiteDisponible()) );
            
        }
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
                //.createPieChart(PieChart, pieDataset, true, true, true);
        PiePlot P = (PiePlot)chart.getPlot();
        P.setForegroundAlpha(TOP_ALIGNMENT);
        ChartFrame frame = new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
        
    }

    
}
