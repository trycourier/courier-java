package services;

import models.ListUpdateBody;
import models.PureLists;
import models.ListBulkSubscriptionUpdate;
import models.ListSubscriptions;
import models.List;
import retrofit2.Call;
import retrofit2.http.*;

public interface ListsInterface {
    @GET("/lists")
    Call<PureLists> getLists(
            @Query("cursor") String cursor,
            @Query("pattern") String pattern,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/lists/{listId}")
    Call<List> getList(
            @Path("listId") String listId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/lists/{listId}")
    Call<Void> putList(
            @Path("listId") String listId,
            @Body ListUpdateBody listUpdateBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @DELETE("/lists/{listId}")
    Call<Void> deleteList(
            @Path("listId") String listId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/lists/{listId}/restore")
    Call<Void> restoreList(
            @Path("listId") String listId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/lists/{listId}/subscriptions")
    Call<ListSubscriptions> getListSubscriptions(
            @Path("listId") String listId,
            @Query("cursor") String cursor,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/lists/{listId}/subscriptions")
    Call<Void> bulkSubscribeRecipientsToList(
            @Path("listId") String listId,
            @Body ListBulkSubscriptionUpdate bulkSubscriptionUpdate,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/lists/{listId}/subscriptions/{recipientId}")
    Call<Void> subscribeRecipientToList(
            @Path("listId") String listId,
            @Path("recipientId") String recipientId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @DELETE("/lists/{listId}/subscriptions/{recipientId}")
    Call<Void> unsubscribeRecipientFromList(
            @Path("listId") String listId,
            @Path("recipientId") String recipientId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
