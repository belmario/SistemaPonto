/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import trabalho.entity.FuncionarioEntity;
import trabalho.entity.RegistroPontoEntity;
import trabalho.util.HibernateUtil;
import trabalho.util.NovoHibernateUtil;

/**
 *
 * @author savio
 *
 */

public class RegistroDAO {
 private Session sessao;
   

    public RegistroPontoEntity buscaCodigoRegistro(int codigoFuncionario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        RegistroPontoEntity registroPonto = null;
        sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(RegistroPontoEntity.class);
        criteria.add(Restrictions.eq("codigoBuscaFuncionario", codigoFuncionario));
        criteria.addOrder(Order.desc("codigoRegistroPonto"));
        criteria.setMaxResults(1);
        //Retorna os dados da consulta
        List<RegistroPontoEntity> listaRegistro = criteria.list();
        registroPonto = (RegistroPontoEntity) listaRegistro.get(0);
        sessao.close();
        return registroPonto;      
    }

    public void updateRegistro(RegistroPontoEntity registro) {
        try {
            //sessao.close();
            //sessao = NovoHibernateUtil.getSessionFactory().openSession();
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(registro);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");
            sessao.close();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    }

}
