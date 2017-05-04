/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import java.sql.Timestamp;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import trabalho.entity.RegistroPontoEntity;

public class JodaMain {

    /**
     * @return
     */
    public Timestamp insereDataLocal() {

        DateTime data = DateTime.now();
        DateTimeFormat.forPattern("dd/MM/yyyy HH:mm");
        System.out.println(data);
        Timestamp stamp = new Timestamp(data.getMillis());
        return stamp;
    }

    public int retornaTempo(RegistroPontoEntity registro) {
        RegistroPontoEntity registroPonto = registro;
        DateTime dataHoraEntrada = new DateTime(registroPonto.getDataInicial());
        DateTime dataHoraSaida = new DateTime(registroPonto.getDataFinal());
        Period tempoTrabalhado = new Period(dataHoraEntrada, dataHoraSaida);
        int horaLocal = tempoTrabalhado.getMinutes()
                + tempoTrabalhado.getHours() * 60
                + tempoTrabalhado.getDays() * 1440;
        System.out.println(horaLocal);
        return horaLocal;
    }

    public String informaAtraso(RegistroPontoEntity registro) {
        RegistroPontoEntity registroPonto = registro;
        String statusAtraso = null;
        int minutosTrabalhados = registroPonto.getMinutosTrabalhados();
        if (minutosTrabalhados == 540) {
            statusAtraso = "Tempo correto";
        } else if (minutosTrabalhados > 540) {
            statusAtraso = "Hora extra";
        } else if (minutosTrabalhados < 540) {
            statusAtraso = "Atrasado";
        }
        return statusAtraso;
    }
}
