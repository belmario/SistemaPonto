/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

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
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            sessao.close();
        }
    }
    
}
