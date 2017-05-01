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
 * @param <E>
 */
public class GenericDAO<E> {

    private Session sessao;
    private Session sessao2;

    public GenericDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        sessao2 = NovoHibernateUtil.getSessionFactory().openSession();
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

    public void atualizar(E entidade) {

        try {
            sessao.close();
            sessao2 = HibernateUtil.getSessionFactory().openSession();
            sessao2.beginTransaction();
            sessao2.update(entidade);
            sessao2.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");
            sessao2.close();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

    }

    public FuncionarioEntity buscaFuncionario(int codigoFuncionairo) {
        String valorBuscado = "from Funcionario where codigoFuncionario = " + codigoFuncionairo;
        org.hibernate.Query query = sessao.createQuery(valorBuscado);
        query.setMaxResults(1);
        FuncionarioEntity funcionario = (FuncionarioEntity) query.uniqueResult();
        return funcionario;

    }

    public RegistroPontoEntity buscaCodigoRegistro(int codigoFuncionario) {
        RegistroPontoEntity registroPonto = null;
        sessao.beginTransaction();
        Criteria criteria = sessao.createCriteria(RegistroPontoEntity.class);
        criteria.addOrder(Order.asc("codigoBuscaFuncionario"));
        criteria.add(Restrictions.eq("codigoBuscaFuncionario", codigoFuncionario));
        criteria.setMaxResults(1);
        //Retorna os dados da consulta
        List listaRegistro = criteria.list();
        registroPonto = (RegistroPontoEntity) listaRegistro.get(0);

        return registroPonto;
    }

}
