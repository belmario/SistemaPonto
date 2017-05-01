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
import javax.persistence.ManyToOne;

/**
 *
 * @author savio
 */
@Entity(name = "RegistroFuncionario")
public class RegistroPontoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoRegistroPonto;
    private Timestamp dataInicial;
    private Timestamp dataFinal;
    @Column(columnDefinition = "boolean default false")
    private boolean statusPonto;
    @ManyToOne
    private FuncionarioEntity funcionario;
    private int codigoBuscaFuncionario;

    public int getCodigoBuscaFuncionario() {
        return codigoBuscaFuncionario;
    }

    public void setCodigoBuscaFuncionario(int codigoBuscaFuncionario) {
        this.codigoBuscaFuncionario = codigoBuscaFuncionario;
    }   

    public boolean isStatusPonto() {
        return statusPonto;
    }

    public void setStatusPonto(boolean statusPonto) {
        this.statusPonto = statusPonto;
    }

    public int getCodigoRegistroFuncionario() {
        return codigoRegistroPonto;
    }

    public void setCodigoRegistroFuncionario(int codigoRegistroFuncionario) {
        this.codigoRegistroPonto = codigoRegistroFuncionario;
    }

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

    public int getCodigoRegistroPonto() {
        return codigoRegistroPonto;
    }

    public void setCodigoRegistroPonto(int codigoRegistroPonto) {
        this.codigoRegistroPonto = codigoRegistroPonto;
    }

    public FuncionarioEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioEntity funcionario) {
        this.funcionario = funcionario;
    }

}
