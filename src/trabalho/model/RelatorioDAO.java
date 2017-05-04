/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho.model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static org.hibernate.internal.util.ConfigHelper.getResourceAsStream;

/**
 *
 * @author TECNICO
 */
public class RelatorioDAO {
    
    public void geraRelatorioFuncionario () {
        
        try {
            InputStream inputStream = getResourceAsStream("/relatorio/RelatorioRegistroFuncionario.jasper");

            JasperReport relatorio = (JasperReport) JRLoader.loadObject(inputStream);

            JasperPrint print = JasperFillManager.fillReport(relatorio, null, getConexao());

            JasperViewer view = new JasperViewer(print, false);
            
            view.setVisible(true);

        } catch (Exception ex) {

            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConexao() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection(""
                    + "jdbc:mysql://localhost:3306/bd_sistemaponto", "root", "admin");

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }
}
