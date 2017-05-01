/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.entity;

import java.sql.Timestamp;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
    private boolean statusPonto;
    @ManyToOne
    private RegistroPontoEntity funcionario;

    public RegistroPontoEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(RegistroPontoEntity funcionario) {
        this.funcionario = funcionario;
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

}
