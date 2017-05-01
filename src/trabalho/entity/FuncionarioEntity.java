/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
       @OneToMany(targetEntity = RegistroPontoEntity.class)
    private List<RegistroPontoEntity> registroPonto;

    public List<RegistroPontoEntity> getRegistroPonto() {
        return registroPonto;
    }

    public void setRegistroPonto(List<RegistroPontoEntity> registroPonto) {
        this.registroPonto = registroPonto;
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
