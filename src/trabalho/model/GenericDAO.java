/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import trabalho.util.HibernateUtil;



/**
 *
 * @author savio
 * 
 * @param <E>
 */
public class GenericDAO<E> {
    
    private Session sessao;
    
    public void salvar(E entidade) {

        try {
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.save(entidade);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            sessao.close();
        }
    }
    
}
