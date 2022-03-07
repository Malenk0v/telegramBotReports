package Method;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class CreateKeybordRepost {

    /// have methods CreateUrls, i'm use this methods

    public static void createRepost(InlineKeyboardMarkup inlineKeyboardMarkup) {
        InlineKeyboardButton but1 = createButton("365 by months", "/365");
        InlineKeyboardButton but2 = createButton("По типу площадки", "/plosh");
        InlineKeyboardButton but3 = createButton("Форматы", "/form");
        //line2
        InlineKeyboardButton but4 = createButton("По кампаниям", "/Comp");
        InlineKeyboardButton but5 = createButton("А/B сравнение периодов", "/AB");
        InlineKeyboardButton but6 = createButton("По условию показа", "/Uslov");
        //line3
        InlineKeyboardButton but7 = createButton("По типу условия показа", "/TUslov");
        InlineKeyboardButton but8 = createButton("По названию площадок", "/NamePlosh");
        InlineKeyboardButton but9 = createButton("По региону таргетинг", "/regtarget");
        //line4
        InlineKeyboardButton but10 = createButton("Демографический срез", "/dem");


        List<InlineKeyboardButton> line1 = new ArrayList<>();
        line1.add(but1);
        line1.add(but2);

        List<InlineKeyboardButton> line2 = new ArrayList<>();
        line2.add(but3);
        line2.add(but4);
        List<InlineKeyboardButton> line3 = new ArrayList<>();
        line3.add(but5);
        line3.add(but6);
        List<InlineKeyboardButton> line4 = new ArrayList<>();
        line4.add(but7);
        line4.add(but8);
        List<InlineKeyboardButton> line5 = new ArrayList<>();
        line5.add(but9);
        line5.add(but10);



        List<List<InlineKeyboardButton>> printButton = new ArrayList<>();
        printButton.add(line1);
        printButton.add(line2);
        printButton.add(line3);
        printButton.add(line4);
        printButton.add(line5);

        inlineKeyboardMarkup.setKeyboard(printButton);
    }
    //create answer day and month and week and year url button
    public static void answerRepost(InlineKeyboardMarkup inlineKeyboardMarkup, String login, String urls){

        String urlDay = CreateUrls.createDay(login,urls);
        String urlWeeks = CreateUrls.createWeeks(login,urls);
        String urlMonths = CreateUrls.createMonths(login,urls);
        String urlYear = CreateUrls.createYear(login,urls);



        InlineKeyboardButton but1 = answerButtonUrl("День", urlDay);
        InlineKeyboardButton but2 = answerButtonUrl("Неделя", urlWeeks);
        InlineKeyboardButton but3 = answerButtonUrl("Месяц", urlMonths);
        InlineKeyboardButton but4 = answerButtonUrl("Год", urlYear);

        List<InlineKeyboardButton> line1 = new ArrayList<>();
        line1.add(but1);
        line1.add(but2);
        line1.add(but3);
        line1.add(but4);

        List<List<InlineKeyboardButton>> printButton = new ArrayList<>();
        printButton.add(line1);

        inlineKeyboardMarkup.setKeyboard(printButton);

    }
    //create answer repost "А/B сравнение периодов" urls button
    public static  void answerRepostAB(InlineKeyboardMarkup inlineKeyboardMarkup, String login, String urls){
        //год-год, 6 месяцев/6 месяцев, 3 месяца/3 месяца, месяц/месяц, неделя/неделя

        String urlYear1 = CreateUrls.createYear1hAB(login,urls);
        String urlMonths6 = CreateUrls.createMoth6hAB(login,urls);
        String urlMonths3 = CreateUrls.createMoth3hAB(login,urls);
        String urlMonths1 = CreateUrls.createMoth1hAB(login,urls);
        String urlWeek = CreateUrls.createWeekhAB(login,urls);

        InlineKeyboardButton but1 = answerButtonUrl("Год/Год", urlYear1);
        InlineKeyboardButton but2 = answerButtonUrl("6 месяцев/6 месяцев", urlMonths6);
        InlineKeyboardButton but3 = answerButtonUrl("3 месяца/3 месяца", urlMonths3);
        InlineKeyboardButton but4 = answerButtonUrl("месяц/месяц", urlMonths1);
        InlineKeyboardButton but5 = answerButtonUrl("неделя/неделя", urlWeek);

        List<InlineKeyboardButton> line1 = new ArrayList<>();
        line1.add(but1);
        List<InlineKeyboardButton> line2 = new ArrayList<>();
        line2.add(but2);
        line2.add(but3);
        line2.add(but4);
        List<InlineKeyboardButton> line3 = new ArrayList<>();
        line3.add(but5);

        List<List<InlineKeyboardButton>> printButton = new ArrayList<>();
        printButton.add(line1);
        printButton.add(line2);
        printButton.add(line3);

        inlineKeyboardMarkup.setKeyboard(printButton);

    }
    //create answer repost "А/B сравнение периодов" urls button
    public  static void answerRepost365(InlineKeyboardMarkup inlineKeyboardMarkup, String login, String urls){
        //1 год,6 месяце, 3 месяц
        String urlYear = CreateUrls.create365Year(login,urls);
        String urlMonths6 = CreateUrls.create365M6(login,urls);
        String urlMonths3 = CreateUrls.create365M3(login,urls);


        InlineKeyboardButton but1 = answerButtonUrl("Год", urlYear);
        InlineKeyboardButton but2 = answerButtonUrl("6 месяцев", urlMonths6);
        InlineKeyboardButton but3 = answerButtonUrl("3 месяца", urlMonths3);


        List<InlineKeyboardButton> line1 = new ArrayList<>();
        line1.add(but1);
        List<InlineKeyboardButton> line2 = new ArrayList<>();
        line2.add(but2);
        line2.add(but3);


        List<List<InlineKeyboardButton>> printButton = new ArrayList<>();
        printButton.add(line1);
        printButton.add(line2);


        inlineKeyboardMarkup.setKeyboard(printButton);

    }


    //create button repost methods createRepost
    private static InlineKeyboardButton createButton(String name, String server) {
        InlineKeyboardButton repost = new InlineKeyboardButton();
        repost.setText(name);
        repost.setCallbackData(server);
        return repost;

    }
    // create button url methods  createRepost
    private static InlineKeyboardButton answerButtonUrl(String name, String url){
        InlineKeyboardButton repost = new InlineKeyboardButton();
        repost.setText(name);
        repost.setUrl(url);
        return repost;
    }
}