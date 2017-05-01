/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.entity;

import java.sql.Timestamp;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author savio
 */
@Entity(name = "RegistroFuncionario")
public class RegistroPontoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoRegistroFuncionario;
    private Timestamp dataInicial;
    private Timestamp dataFinal;
    @OneToOne(cascade = CascadeType.ALL)
    private FuncionarioEntity funcionario;

    public int getCodigoRegistroFuncionario() {
        return codigoRegistroFuncionario;
    }

    public void setCodigoRegistroFuncionario(int codigoRegistroFuncionario) {
        this.codigoRegistroFuncionario = codigoRegistroFuncionario;
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

    public FuncionarioEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioEntity funcionario) {
        this.funcionario = funcionario;
    }

}
