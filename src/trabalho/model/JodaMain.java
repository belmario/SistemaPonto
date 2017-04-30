/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

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
}
