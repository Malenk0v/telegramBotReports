import Method.AnswerKeybordRepost;
import Method.Command;
import Method.CreateKeybordRepost;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "ReportsHelperBot";
    }

    @Override
    public String getBotToken() {
        return "5257318222:AAH2Y_HMCpzwjitjkFaWJr7am7FAl14O6VM";
    }
    String chat_id;
    String login;
    String text;
    @Override
    public void onUpdateReceived(Update update) {



        if(update.hasMessage() && update.getMessage().getText().equals("/start") ){
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId().toString());
            text = update.getMessage().getText();
            if(text.equals("/start")){
                Command.start(sendMessage);
            }
            try {
                execute(sendMessage);
                return;
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if(update.hasMessage()){
            SendMessage sendMessage = new SendMessage();
            chat_id = update.getMessage().getChatId().toString();
            login = update.getMessage().getText();
            sendMessage.setChatId(chat_id);


            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            CreateKeybordRepost.createRepost(inlineKeyboardMarkup);

            try {
                sendMessage.setText("\u2705Вы ввели логин "+login);
                execute(sendMessage);
                sendMessage.setText("\uD83D\uDCD1Отчеты для логина "+login+" построены.");
                sendMessage.setReplyMarkup(inlineKeyboardMarkup);
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        else if(update.hasCallbackQuery()){
            AnswerCallbackQuery answerCallbackQuery = new AnswerCallbackQuery();
            answerCallbackQuery.setCallbackQueryId(update.getCallbackQuery().getId());
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chat_id);

            String nameRepost = update.getCallbackQuery().toString();

            InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
            AnswerKeybordRepost.answer(update,inlineKeyboardMarkup,login);

            try {
                sendMessage.setText("Выберите период отчета "+"\""+nameRepost+"\"");
                sendMessage.setReplyMarkup(inlineKeyboardMarkup);
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

        }

    }
}
