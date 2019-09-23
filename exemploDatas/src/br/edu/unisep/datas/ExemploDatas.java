package br.edu.unisep.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemploDatas {

    public static void main(String[] args) throws ParseException {
        var agora = new Date();
        System.out.println(agora.getTime());

        var cal = Calendar.getInstance();
        cal.set(1985, Calendar.FEBRUARY, 13);
        var nascimento = new Date(cal.getTimeInMillis());
        System.out.println(nascimento);

        var df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(nascimento));

        var ferias = "21/12/2019";
        var dtFerias = df.parse(ferias);
        System.out.println(dtFerias);
    }

}
