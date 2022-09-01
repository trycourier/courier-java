package services;

import models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BulkService {
    private final BulkInterface bulkInterface;

    public BulkService() {
        bulkInterface = Courier.getRetrofit().create(BulkInterface.class);
    }

    public BulkCreateJobResponseBody createJob(
            BulkCreateJobRequestBody bulkCreateJobRequestBody
    ) throws IOException {
        return bulkInterface.createJob(
                bulkCreateJobRequestBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public BulkIngestUsersResponseBody ingestUsers(
            String jobId,
            BulkIngestUsersRequestBody bulkIngestUsersRequestBody
    ) throws IOException {
        return bulkInterface.ingestUsers(
                jobId,
                bulkIngestUsersRequestBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public void runJob(
            String jobId
    ) throws IOException {
         bulkInterface.runJob(
                jobId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public BulkGetJobResponseBody getJob(
            String jobId
    ) throws IOException {
        return bulkInterface.getJob(
                jobId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public BulkJobUsers getJobUsers(
            String jobId,
            String cursor
    ) throws IOException {
        return bulkInterface.getJobUsers(
                jobId,
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }
}
