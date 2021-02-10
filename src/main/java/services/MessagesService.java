package services;

import models.Message;
import models.MessageHistory;
import models.Messages;

import java.io.IOException;

public class MessagesService {
    private final MessagesInterface messagesInterface;

    public MessagesService() {
        messagesInterface = Courier.getRetrofit().create(MessagesInterface.class);
    }

    public Messages getMessages(
            String cursor,
            String event,
            String list,
            String messageId,
            String notification,
            String recipient
    ) throws IOException {
        return messagesInterface.getMessages(
                cursor,
                event,
                list,
                messageId,
                notification,
                recipient,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Message getMessage(
            String messageId
    ) throws IOException {
        return messagesInterface.getMessage(
                messageId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public MessageHistory getMessageHistory(
            String messageId,
            String type
    ) throws IOException {
        return messagesInterface.getMessageHistory(
                messageId,
                type,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
