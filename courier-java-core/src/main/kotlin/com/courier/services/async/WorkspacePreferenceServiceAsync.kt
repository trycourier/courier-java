// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.workspacepreferences.PublishPreferencesRequest
import com.courier.models.workspacepreferences.PublishPreferencesResponse
import com.courier.models.workspacepreferences.WorkspacePreferenceArchiveParams
import com.courier.models.workspacepreferences.WorkspacePreferenceCreateParams
import com.courier.models.workspacepreferences.WorkspacePreferenceCreateRequest
import com.courier.models.workspacepreferences.WorkspacePreferenceGetResponse
import com.courier.models.workspacepreferences.WorkspacePreferenceListParams
import com.courier.models.workspacepreferences.WorkspacePreferenceListResponse
import com.courier.models.workspacepreferences.WorkspacePreferencePublishParams
import com.courier.models.workspacepreferences.WorkspacePreferenceReplaceParams
import com.courier.models.workspacepreferences.WorkspacePreferenceRetrieveParams
import com.courier.services.async.workspacepreferences.TopicServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkspacePreferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspacePreferenceServiceAsync

    fun topics(): TopicServiceAsync

    /**
     * Create a workspace preference. The workspace preference id is generated and returned. Topics
     * are created inside a workspace preference via POST /preferences/sections/{section_id}/topics.
     */
    fun create(
        params: WorkspacePreferenceCreateParams
    ): CompletableFuture<WorkspacePreferenceGetResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkspacePreferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse>

    /** @see create */
    fun create(
        workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        create(
            WorkspacePreferenceCreateParams.builder()
                .workspacePreferenceCreateRequest(workspacePreferenceCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        create(workspacePreferenceCreateRequest, RequestOptions.none())

    /** Retrieve a workspace preference by id, including its topics. */
    fun retrieve(sectionId: String): CompletableFuture<WorkspacePreferenceGetResponse> =
        retrieve(sectionId, WorkspacePreferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        retrieve(sectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WorkspacePreferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse>

    /** @see retrieve */
    fun retrieve(
        params: WorkspacePreferenceRetrieveParams
    ): CompletableFuture<WorkspacePreferenceGetResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        retrieve(sectionId, WorkspacePreferenceRetrieveParams.none(), requestOptions)

    /**
     * List the workspace's preferences. Each workspace preference embeds its topics. Scoped to the
     * workspace of the API key.
     */
    fun list(): CompletableFuture<WorkspacePreferenceListResponse> =
        list(WorkspacePreferenceListParams.none())

    /** @see list */
    fun list(
        params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceListResponse>

    /** @see list */
    fun list(
        params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none()
    ): CompletableFuture<WorkspacePreferenceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WorkspacePreferenceListResponse> =
        list(WorkspacePreferenceListParams.none(), requestOptions)

    /**
     * Archive a workspace preference. The workspace preference must be empty: delete its topics
     * first, otherwise the request fails with 409.
     */
    fun archive(sectionId: String): CompletableFuture<Void?> =
        archive(sectionId, WorkspacePreferenceArchiveParams.none())

    /** @see archive */
    fun archive(
        sectionId: String,
        params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see archive */
    fun archive(
        sectionId: String,
        params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(sectionId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: WorkspacePreferenceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: WorkspacePreferenceArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(sectionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(sectionId, WorkspacePreferenceArchiveParams.none(), requestOptions)

    /**
     * Publish the workspace's preferences page. Takes a snapshot of every workspace preference with
     * its topics under a new published version, making the current state visible on the hosted
     * preferences page (non-draft).
     */
    fun publish(): CompletableFuture<PublishPreferencesResponse> =
        publish(WorkspacePreferencePublishParams.none())

    /** @see publish */
    fun publish(
        params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublishPreferencesResponse>

    /** @see publish */
    fun publish(
        params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none()
    ): CompletableFuture<PublishPreferencesResponse> = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        publishPreferencesRequest: PublishPreferencesRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublishPreferencesResponse> =
        publish(
            WorkspacePreferencePublishParams.builder()
                .publishPreferencesRequest(publishPreferencesRequest)
                .build(),
            requestOptions,
        )

    /** @see publish */
    fun publish(
        publishPreferencesRequest: PublishPreferencesRequest
    ): CompletableFuture<PublishPreferencesResponse> =
        publish(publishPreferencesRequest, RequestOptions.none())

    /** @see publish */
    fun publish(requestOptions: RequestOptions): CompletableFuture<PublishPreferencesResponse> =
        publish(WorkspacePreferencePublishParams.none(), requestOptions)

    /**
     * Replace a workspace preference. Full document replacement; missing optional fields are
     * cleared. Topics attached to the workspace preference are unaffected.
     */
    fun replace(
        sectionId: String,
        params: WorkspacePreferenceReplaceParams,
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        replace(sectionId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        sectionId: String,
        params: WorkspacePreferenceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse> =
        replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see replace */
    fun replace(
        params: WorkspacePreferenceReplaceParams
    ): CompletableFuture<WorkspacePreferenceGetResponse> = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: WorkspacePreferenceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WorkspacePreferenceGetResponse>

    /**
     * A view of [WorkspacePreferenceServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspacePreferenceServiceAsync.WithRawResponse

        fun topics(): TopicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /preferences/sections`, but is otherwise the same
         * as [WorkspacePreferenceServiceAsync.create].
         */
        fun create(
            params: WorkspacePreferenceCreateParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WorkspacePreferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>>

        /** @see create */
        fun create(
            workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            create(
                WorkspacePreferenceCreateParams.builder()
                    .workspacePreferenceCreateRequest(workspacePreferenceCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            create(workspacePreferenceCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}`, but is
         * otherwise the same as [WorkspacePreferenceServiceAsync.retrieve].
         */
        fun retrieve(
            sectionId: String
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            retrieve(sectionId, WorkspacePreferenceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            retrieve(sectionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WorkspacePreferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WorkspacePreferenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            retrieve(sectionId, WorkspacePreferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /preferences/sections`, but is otherwise the same as
         * [WorkspacePreferenceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WorkspacePreferenceListResponse>> =
            list(WorkspacePreferenceListParams.none())

        /** @see list */
        fun list(
            params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceListResponse>>

        /** @see list */
        fun list(
            params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none()
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceListResponse>> =
            list(WorkspacePreferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /preferences/sections/{section_id}`, but is
         * otherwise the same as [WorkspacePreferenceServiceAsync.archive].
         */
        fun archive(sectionId: String): CompletableFuture<HttpResponse> =
            archive(sectionId, WorkspacePreferenceArchiveParams.none())

        /** @see archive */
        fun archive(
            sectionId: String,
            params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see archive */
        fun archive(
            sectionId: String,
            params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(sectionId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: WorkspacePreferenceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: WorkspacePreferenceArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(sectionId, WorkspacePreferenceArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /preferences/publish`, but is otherwise the same as
         * [WorkspacePreferenceServiceAsync.publish].
         */
        fun publish(): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(WorkspacePreferencePublishParams.none())

        /** @see publish */
        fun publish(
            params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>>

        /** @see publish */
        fun publish(
            params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none()
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            publishPreferencesRequest: PublishPreferencesRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(
                WorkspacePreferencePublishParams.builder()
                    .publishPreferencesRequest(publishPreferencesRequest)
                    .build(),
                requestOptions,
            )

        /** @see publish */
        fun publish(
            publishPreferencesRequest: PublishPreferencesRequest
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(publishPreferencesRequest, RequestOptions.none())

        /** @see publish */
        fun publish(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(WorkspacePreferencePublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /preferences/sections/{section_id}`, but is
         * otherwise the same as [WorkspacePreferenceServiceAsync.replace].
         */
        fun replace(
            sectionId: String,
            params: WorkspacePreferenceReplaceParams,
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            replace(sectionId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            sectionId: String,
            params: WorkspacePreferenceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: WorkspacePreferenceReplaceParams
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: WorkspacePreferenceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WorkspacePreferenceGetResponse>>
    }
}
