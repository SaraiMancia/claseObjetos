
package Ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatoFecha {
    public static void main(String [] args){
      
        String date_time = "10-06-2012 ";
        SimpleDateFormat dateParser = new SimpleDateFormat("MM-dd-yy ");
        {
            try { 
                Date date = dateParser.parse(date_time);
                System.out.println(date);

                SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yy");
                System.out.println(dateFormatter.format(date));

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    
        
    }
    
}

