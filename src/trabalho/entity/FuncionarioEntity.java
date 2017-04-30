/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/**
 *
 * @author savio
 */
@Entity(name = "Funcionario")
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoFuncionario;
    private String nomeFuncionario;
    private int idadeFuncionario;
    @Column(unique = true)
    private String cpfFuncionario;
    private String funcaoFuncionario;
    @Column(unique = true)
    private String emailFuncionario;
    private String telefoneFuncionairo;
    private Timestamp dataInicial;
    private Timestamp dataFinal;

    /*
    public DateTime getDataInicial() {
        return dataInicial;
    }

    public java.sql.Date getDataInicialFormatadoSQL() {
        return new java.sql.Date(dataInicial.getMillis());
    }

    public void setDataInicial(DateTime dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setDataInicial(java.sql.Date data) {
        dataInicial = new DateTime(data);
    }

    public DateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(DateTime dataFinal) {
        this.dataFinal = dataFinal;
    }
     */

    public Timestamp getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Timestamp dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Timestamp getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Timestamp dataFinal) {
        this.dataFinal = dataFinal;
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdadeFuncionario() {
        return idadeFuncionario;
    }

    public void setIdadeFuncionario(int idadeFuncionario) {
        this.idadeFuncionario = idadeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getFuncaoFuncionario() {
        return funcaoFuncionario;
    }

    public void setFuncaoFuncionario(String funcaoFuncionario) {
        this.funcaoFuncionario = funcaoFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getTelefoneFuncionairo() {
        return telefoneFuncionairo;
    }

    public void setTelefoneFuncionairo(String telefoneFuncionairo) {
        this.telefoneFuncionairo = telefoneFuncionairo;
    }

}
