package pl.training.concurrency.ex011_chat_v2;

import java.util.concurrent.ExecutorService;

public interface ChatServerFactory {

    ChatWorkers createChatWorkers();

    ExecutorService createExecutorService();

    Logger createLogger();

}
