package services;

import models.List;
import models.ListBulkSubscriptionUpdate;
import models.ListSubscriptions;
import models.ListUpdateBody;
import models.PureLists;

import java.io.IOException;

public class ListsService {
    private final ListsInterface listsInterface;

    public ListsService() {
        listsInterface = Courier.getRetrofit().create(ListsInterface.class);
    }

    public PureLists getLists(
            String cursor,
            String pattern
    ) throws IOException {
        return listsInterface.getLists(
                cursor,
                pattern,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public List getList(
            String listId
    ) throws IOException {
        return listsInterface.getList(
                listId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public void putList(
            String listId,
            ListUpdateBody listUpdateBody
    ) throws IOException {
        listsInterface.putList(
                listId,
                listUpdateBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }

    public void deleteList(
            String listId
    ) throws IOException {
        listsInterface.deleteList(
                listId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }

    public void restoreList(
            String listId
    ) throws IOException {
        listsInterface.restoreList(
                listId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }

    public ListSubscriptions getListSubscriptions(
            String listId,
            String cursor
    ) throws IOException {
        return listsInterface.getListSubscriptions(
                listId,
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public void bulkSubscribeRecipientToList(
            String listId,
            ListBulkSubscriptionUpdate bulkSubscriptionUpdate
    ) throws IOException {
        listsInterface.bulkSubscribeRecipientsToList(
                listId,
                bulkSubscriptionUpdate,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }

    public void subscribeRecipientToList(
            String listId,
            String recipientId
    ) throws IOException {
        listsInterface.subscribeRecipientToList(
                listId,
                recipientId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }

    public void unsubscribeRecipientFromList(
            String listId,
            String recipientId
    ) throws IOException {
        listsInterface.unsubscribeRecipientFromList(
                listId,
                recipientId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }
}
