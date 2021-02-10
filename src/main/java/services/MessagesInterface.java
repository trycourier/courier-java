package services;

import models.Message;
import models.MessageHistory;
import models.Messages;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MessagesInterface {
    @GET("/messages")
    Call<Messages> getMessages(
            @Query("cursor") String cursor,
            @Query("event") String event,
            @Query("list") String list,
            @Query("messageId") String messageId,
            @Query("notification") String notification,
            @Query("recipient") String recipient,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/messages/{messageId}")
    Call<Message> getMessage(
            @Path("messageId") String messageId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/messages/{messageId}/history")
    Call<MessageHistory> getMessageHistory(
            @Path("messageId") String messageId,
            @Query("type") String type,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
