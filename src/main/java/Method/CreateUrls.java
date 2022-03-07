package Method;

import java.time.LocalDate;

public class CreateUrls {
   public static LocalDate localDate = LocalDate.now();
    public static String createDay(String login, String urls){

         String LOG = "LOG";
         String DATA = "DATA";

        String dataDay= "date_from="+localDate+"&date_to="+localDate;
        urls = urls.replace("LOG",login);
        urls = urls.replace("DATA",dataDay);
        return urls;
    }
    public static String createWeeks(String login, String urls){

         String LOG = "LOG";
         String DATA = "DATA";



        String dataWeeks= "date_from="+localDate.minusWeeks(1)+"&date_to="+localDate;

        urls = urls.replace(LOG,login);
        urls = urls.replace(DATA,dataWeeks);
        return urls;
    }
    public static String createMonths(String login, String urls){

         String LOG = "LOG";
         String DATA = "DATA";
        LocalDate localDate = LocalDate.now();

        String dataMonths= "date_from="+localDate.minusMonths(1)+"&date_to="+localDate;


        urls = urls.replace(LOG,login);
        urls = urls.replace(DATA,dataMonths);
        return urls;
    }
    public static String createYear(String login, String urls){

         String LOG = "LOG";
         String DATA = "DATA";
        LocalDate localDate = LocalDate.now();

        String dataYear= "date_from="+localDate.minusYears(1)+"&date_to="+localDate;

        urls = urls.replace(LOG,login);
        urls = urls.replace(DATA,dataYear);
        return urls;
    }

    public static String createYear1hAB(String login, String urls){

        LocalDate localDate = LocalDate.now();


        String dataA= "date_from="+localDate.minusYears(1)+"&date_to="+localDate;
        String dataB= "date_from_b="+localDate.minusYears(2).minusDays(1)+"&date_to_b="+localDate.minusYears(1).minusDays(1);

        String LOG = "LOG";
        String ADATA = "ADATA";
        String BDATA = "BDATA";
        urls = urls.replace(LOG,login);
        urls = urls.replace(ADATA,dataA);
        urls = urls.replace(BDATA,dataB);
        return urls;
    }
    public static String createMoth6hAB(String login, String urls){

        LocalDate localDate = LocalDate.now();


        String dataA= "date_from="+localDate.minusMonths(6)+"&date_to="+localDate;
        String dataB= "date_from_b="+localDate.minusMonths(12).minusDays(1)+"&date_to_b="+localDate.minusMonths(6).minusDays(1);

        String LOG = "LOG";
        String ADATA = "ADATA";
        String BDATA = "BDATA";
        urls = urls.replace(LOG,login);
        urls = urls.replace(ADATA,dataA);
        urls = urls.replace(BDATA,dataB);
        return urls;
    }
    public static String createMoth3hAB(String login, String urls){

        LocalDate localDate = LocalDate.now();


        String dataA= "date_from="+localDate.minusMonths(3)+"&date_to="+localDate;
        String dataB= "date_from_b="+localDate.minusMonths(6).minusDays(1)+"&date_to_b="+localDate.minusMonths(3).minusDays(1);

        String LOG = "LOG";
        String ADATA = "ADATA";
        String BDATA = "BDATA";
        urls = urls.replace(LOG,login);
        urls = urls.replace(ADATA,dataA);
        urls = urls.replace(BDATA,dataB);
        return urls;
    }
    public static String createMoth1hAB(String login, String urls){

        LocalDate localDate = LocalDate.now();


        String dataA= "date_from="+localDate.minusMonths(1)+"&date_to="+localDate;
        String dataB= "date_from_b="+localDate.minusMonths(2).minusDays(1)+"&date_to_b="+localDate.minusMonths(1).minusDays(1);

        String LOG = "LOG";
        String ADATA = "ADATA";
        String BDATA = "BDATA";
        urls = urls.replace(LOG,login);
        urls = urls.replace(ADATA,dataA);
        urls = urls.replace(BDATA,dataB);
        return urls;
    }
    public static String createWeekhAB(String login, String urls){

        LocalDate localDate = LocalDate.now();


        String dataA= "date_from="+localDate.minusWeeks(1)+"&date_to="+localDate;
        String dataB= "date_from_b="+localDate.minusWeeks(2).minusDays(1)+"&date_to_b="+localDate.minusWeeks(1).minusDays(1);

        String LOG = "LOG";
        String ADATA = "ADATA";
        String BDATA = "BDATA";
        urls = urls.replace(LOG,login);
        urls = urls.replace(ADATA,dataA);
        urls = urls.replace(BDATA,dataB);
        return urls;
    }
    public static String create365Year(String login, String urls){

        String LOG = "LOG";
        String DATA = "DATA";
        LocalDate localDate = LocalDate.now();

        String dataYear= "date_from="+localDate.minusYears(1)+"&date_to="+localDate;

        urls = urls.replace(LOG,login);
        urls = urls.replace(DATA,dataYear);
        return urls;
    }
    public static String create365M6(String login, String urls){

        String LOG = "LOG";
        String DATA = "DATA";
        LocalDate localDate = LocalDate.now();

        String dataYear= "date_from="+localDate.minusMonths(6)+"&date_to="+localDate;

        urls = urls.replace(LOG,login);
        urls = urls.replace(DATA,dataYear);
        return urls;
    }
    public static String create365M3(String login, String urls){

        String LOG = "LOG";
        String DATA = "DATA";
        LocalDate localDate = LocalDate.now();

        String dataYear= "date_from="+localDate.minusMonths(3)+"&date_to="+localDate;

        urls = urls.replace(LOG,login);
        urls = urls.replace(DATA,dataYear);
        return urls;
    }
}
