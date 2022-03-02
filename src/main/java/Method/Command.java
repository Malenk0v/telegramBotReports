package Method;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class Command {

    public static void start(SendMessage sendMessage){
        sendMessage.setText(
                "\uD83D\uDC4BПривет я бот, мое имя Винни!"
                + "\nЯ родился совершенно недавно, моя версия v1.0"
                + "\nПомоги мне стать лучше, для этого ты можешь написать моему создателю @MalenkovaSofya."
                + "\n\nСейчас я умею присылать ссылки на полезные отчеты твоих клиентов"
                + "\n\uD83D\uDD0DДля этого просто отправь мне логин клиента и я сделаю все сам.");
    }
}
