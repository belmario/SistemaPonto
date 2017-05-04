/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import trabalho.entity.FuncionarioEntity;

/**
 *
 * @author savio
 */
public class RelatorioFuncionarioModel extends AbstractTableModel {

    private List<FuncionarioEntity> listaFuncionario;
    private final String[] NOME_COLUNA = {"Código", "Nome", "CPF", "Idade", "Funcao"};

    public RelatorioFuncionarioModel() {
        listaFuncionario = new ArrayList<>();
        adicionaTodosFuncionarios();
    }

    @Override
    public int getRowCount() {
        return listaFuncionario.size();
    }

    @Override
    public int getColumnCount() {
        return NOME_COLUNA.length;
    }

    public void adicionaTodosFuncionarios() {

        FuncionarioDAO dao = new FuncionarioDAO();

        for (FuncionarioEntity func : dao.selecionaTodosFuncionarios()) {
            listaFuncionario.add(func);
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        FuncionarioEntity func = listaFuncionario.get(rowIndex);
        
        switch (columnIndex) {
            case 0: 
                return func.getCodigoFuncionario();
            case 1:
                return func.getNomeFuncionario();
            case 2:
                return func.getCpfFuncionario();
            case 3:
                return func.getIdadeFuncionario();
            case 4:
                return func.getFuncaoFuncionario();
            default:
                return listaFuncionario;
        }
    }
}
