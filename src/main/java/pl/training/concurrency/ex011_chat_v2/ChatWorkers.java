package pl.training.concurrency.ex011_chat_v2;

public interface ChatWorkers {

    void add(ChatWorker chatWorker);

    void remove(ChatWorker chatWorker);

    void broadcast(String text);

}
