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
import trabalho.util.NovoHibernateUtil;

/**
 *
 * @author savio
 *
 * @param <E>
 */
public class GenericDAO<E> {

    private Session sessao;
    private Session sessao2;

    public GenericDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        // sessao2 = NovoHibernateUtil.getSessionFactory().openSession();
    }
    public void salvar(E entidade) {
        try {
            sessao.beginTransaction();
            sessao.save(entidade);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    }
    public void iniciaSessao(){
    sessao = HibernateUtil.getSessionFactory().openSession();
}
    /*
    public void atualizar(E entidade) {
        try {
            //sessao.close();
            sessao2 = NovoHibernateUtil.getSessionFactory().openSession();
            sessao2.beginTransaction();
            sessao2.update(entidade);
            sessao2.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");
            sessao2.close();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    } 
*/
}
