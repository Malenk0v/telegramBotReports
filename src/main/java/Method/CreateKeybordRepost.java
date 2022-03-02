package Method;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class CreateKeybordRepost {

    public static void createRepost(InlineKeyboardMarkup inlineKeyboardMarkup) {
        InlineKeyboardButton but1 = createButton("365 by months", "/365");
        InlineKeyboardButton but2 = createButton("По кампаниям", "/comp");
        InlineKeyboardButton but3 = createButton("Форматы", "/form");

        List<InlineKeyboardButton> line1 = new ArrayList<>();
        line1.add(but1);
        line1.add(but2);
        line1.add(but3);

        List<List<InlineKeyboardButton>> printButton = new ArrayList<>();
        printButton.add(line1);

        inlineKeyboardMarkup.setKeyboard(printButton);
    }
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
    //create button repost
    private static InlineKeyboardButton createButton(String name, String server) {
        InlineKeyboardButton repost = new InlineKeyboardButton();
        repost.setText(name);
        repost.setCallbackData(server);
        return repost;

    }
    private static InlineKeyboardButton answerButtonUrl(String name, String url){
        InlineKeyboardButton repost = new InlineKeyboardButton();
        repost.setText(name);
        repost.setUrl(url);
        return repost;
    }
}