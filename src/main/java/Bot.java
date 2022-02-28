import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return BotRegister.getName();
    }

    @Override
    public String getBotToken() {
        return BotRegister.getToken();
    }


    @Override
    public void onUpdateReceived(Update update) {

        String start = update.getMessage().getText();
        if(start.equals("/start"))
            infoStart(update);
        else
            ReportsHelper(update);

    }

    public  void infoStart(Update update){
        SendMessage sendMessageStart = new SendMessage();
        sendMessageStart.setChatId(update.getMessage().getChatId().toString());

        sendMessageStart.setText(
                        "Привет я бот, мое имя Винни!"
                        +"\nЯ родился совершенно недавно, моя версия v0.2"
                        +"\nПомоги мне стать лучше, для этого ты можешь написать моему создателю @MalenkovaSofya."
                        +"\n\nСейчас я умею присылать ссылки на полезные отчеты твоих клиентов"
                        +"\nДля этого просто отправь мне логин клиента и я сделаю все сам."
        );


        try{
            execute(sendMessageStart);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    public void ReportsHelper(Update update){
        SendMessage sendMessageReports = new SendMessage();
        sendMessageReports.setChatId(update.getMessage().getChatId().toString());
        sendMessageReports.enableMarkdown(true);
        sendMessageReports.setText(ChangeUrls.urls(update.getMessage().getText()));

        try{
            execute(sendMessageReports);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }
}
