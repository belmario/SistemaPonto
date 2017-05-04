/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import trabalho.entity.RegistroPontoEntity;

/**
 *
 * @author Casa
 */
public class RelatorioRegistroPontoModel extends AbstractTableModel{

    private List<RegistroPontoEntity> listaRegistro;
    private final String[] NOME_COLUNA = {"Código", "Data Inicial", "Data Final", "Minutos Trabalhados", "Status Atraso"};
    
    public RelatorioRegistroPontoModel(){
        listaRegistro = new ArrayList<>();
        adicionaTodosRegistro();
    }
    
    public void adicionaTodosRegistro() {

        RegistroDAO dao = new RegistroDAO();

        for (RegistroPontoEntity ponto : dao.selecionaTodosRegistros()) {
            listaRegistro.add(ponto);
        }
    }
    
    @Override
    public int getRowCount() {
        return listaRegistro.size();
    }

    @Override
    public int getColumnCount() {
        return NOME_COLUNA.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        RegistroPontoEntity ponto = listaRegistro.get(rowIndex);
        
        switch (columnIndex) {
            case 0: 
                return ponto.getCodigoRegistroPonto();
            case 1:
                return ponto.getDataInicial();
            case 2:
                return ponto.getDataFinal();
            case 3:
                return ponto.getMinutosTrabalhados();
            case 4:
                return ponto.getStatusAtraso();
            default:
                return listaRegistro;
        }
    }
    
    @Override
    public String getColumnName (int indiceColuna){
        
        return NOME_COLUNA[indiceColuna];
    }
}
