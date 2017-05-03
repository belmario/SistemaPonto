/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import trabalho.entity.FuncionarioEntity;
import trabalho.util.HibernateUtil;

/**
 *
 * @author savio
 */
public class FuncionarioDAO {

    private Session sessao;

    public FuncionarioEntity buscaFuncionario(int codigoFuncionairo) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        String valorBuscado = "from Funcionario where codigoFuncionario = " + codigoFuncionairo;
        org.hibernate.Query query = sessao.createQuery(valorBuscado);
        query.setMaxResults(1);
        FuncionarioEntity funcionario = (FuncionarioEntity) query.uniqueResult();
        sessao.close();
        return funcionario;

    }

    public void updateFuncionario(FuncionarioEntity funcionario) {
        try {
            //sessao.close();
            //sessao = NovoHibernateUtil.getSessionFactory().openSession();
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            sessao.update(funcionario);
            sessao.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");
            sessao.close();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    }
}
