/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import javax.persistence.Query;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import trabalho.entity.FuncionarioEntity;
import trabalho.util.HibernateUtil;

/**
 *
 * @author savio
 *
 * @param <E>
 */
public class GenericDAO<E> {

    private Session sessao;

    public GenericDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }

    public void salvar(E entidade) {

        try {
            sessao.beginTransaction();
            sessao.save(entidade);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
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

}
