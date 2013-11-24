package metier;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import util.ConnexionMySql;

/**
 *
 * @salma
 */
public class GenererPDF {

    private static GenererPDF instance;

    private Connection connexion;

    private GenererPDF() {
        connexion = ConnexionMySql.getInstance().getConnection();

    }

    public static GenererPDF getInstance() {
        if (instance == null) {
            instance = new GenererPDF();
        } 
        return instance;
    }

    public void generer(String nom) {

        // - Paramètres de connexion à la base de données
        try {
            // - Connexion à la base
            connexion = ConnexionMySql.getInstance().getConnection();

            // - Chargement et compilation du rapport
            JasperDesign jasperDesign = JRXmlLoader.load("C:\\Users\\Sahrour\\Documents\\NetBeansProjects\\Jasper_Commande_Best_Deal\\rapport\\commande1.jrxml");

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            // - Paramètres à envoyer au rapport
            Map parameters = new HashMap();
            parameters.put("parameter1", nom);
            // - Execution du rapport
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connexion);

            // - Création du rapport au format PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\Sahrour\\Desktop\\monpdf1.pdf");
            System.out.println("pdf generé !");
            System.out.println("success");
        } catch (JRException e) {
            System.out.println("erreur de compilation" + e.getMessage());
        }
    }

}
