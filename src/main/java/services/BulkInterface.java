package services;

import models.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface BulkInterface {
    @POST("/bulk")
    Call<BulkCreateJobResponseBody> createJob(
            @Body BulkCreateJobRequestBody bulkCreateJobRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @POST("/bulk/{jobId}")
    Call<BulkIngestUsersResponseBody> ingestUsers(
            @Path("jobId") String jobId,
            @Body BulkIngestUsersRequestBody bulkIngestUsersRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @POST("/bulk/{jobId}/run")
    Call<Void> runJob(
            @Path("jobId") String jobId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/bulk/{jobId}")
    Call<BulkGetJobResponseBody> getJob(
            @Path("jobId") String jobId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/bulk/{jobId}/users")
    Call<BulkJobUsers> getJobUsers(
            @Path("jobId") String jobId,
            @Query("cursor") String cursor,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
