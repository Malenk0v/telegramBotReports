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
}
