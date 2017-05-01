/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.model;

import java.sql.Timestamp;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

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
