// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

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
import com.courier.services.blocking.workspacepreferences.TopicService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface WorkspacePreferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkspacePreferenceService

    fun topics(): TopicService

    /**
     * Create a workspace preference. The workspace preference id is generated and returned. Topics
     * are created inside a workspace preference via POST /preferences/sections/{section_id}/topics.
     */
    fun create(params: WorkspacePreferenceCreateParams): WorkspacePreferenceGetResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkspacePreferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceGetResponse

    /** @see create */
    fun create(
        workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceGetResponse =
        create(
            WorkspacePreferenceCreateParams.builder()
                .workspacePreferenceCreateRequest(workspacePreferenceCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest
    ): WorkspacePreferenceGetResponse =
        create(workspacePreferenceCreateRequest, RequestOptions.none())

    /** Retrieve a workspace preference by id, including its topics. */
    fun retrieve(sectionId: String): WorkspacePreferenceGetResponse =
        retrieve(sectionId, WorkspacePreferenceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceGetResponse =
        retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
    ): WorkspacePreferenceGetResponse = retrieve(sectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WorkspacePreferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceGetResponse

    /** @see retrieve */
    fun retrieve(params: WorkspacePreferenceRetrieveParams): WorkspacePreferenceGetResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        requestOptions: RequestOptions,
    ): WorkspacePreferenceGetResponse =
        retrieve(sectionId, WorkspacePreferenceRetrieveParams.none(), requestOptions)

    /**
     * List the workspace's preferences. Each workspace preference embeds its topics. Scoped to the
     * workspace of the API key.
     */
    fun list(): WorkspacePreferenceListResponse = list(WorkspacePreferenceListParams.none())

    /** @see list */
    fun list(
        params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceListResponse

    /** @see list */
    fun list(
        params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none()
    ): WorkspacePreferenceListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WorkspacePreferenceListResponse =
        list(WorkspacePreferenceListParams.none(), requestOptions)

    /**
     * Archive a workspace preference. The workspace preference must be empty: delete its topics
     * first, otherwise the request fails with 409.
     */
    fun archive(sectionId: String) = archive(sectionId, WorkspacePreferenceArchiveParams.none())

    /** @see archive */
    fun archive(
        sectionId: String,
        params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see archive */
    fun archive(
        sectionId: String,
        params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
    ) = archive(sectionId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: WorkspacePreferenceArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see archive */
    fun archive(params: WorkspacePreferenceArchiveParams) = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(sectionId: String, requestOptions: RequestOptions) =
        archive(sectionId, WorkspacePreferenceArchiveParams.none(), requestOptions)

    /**
     * Publish the workspace's preferences page. Takes a snapshot of every workspace preference with
     * its topics under a new published version, making the current state visible on the hosted
     * preferences page (non-draft).
     */
    fun publish(): PublishPreferencesResponse = publish(WorkspacePreferencePublishParams.none())

    /** @see publish */
    fun publish(
        params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublishPreferencesResponse

    /** @see publish */
    fun publish(
        params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none()
    ): PublishPreferencesResponse = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(
        publishPreferencesRequest: PublishPreferencesRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PublishPreferencesResponse =
        publish(
            WorkspacePreferencePublishParams.builder()
                .publishPreferencesRequest(publishPreferencesRequest)
                .build(),
            requestOptions,
        )

    /** @see publish */
    fun publish(publishPreferencesRequest: PublishPreferencesRequest): PublishPreferencesResponse =
        publish(publishPreferencesRequest, RequestOptions.none())

    /** @see publish */
    fun publish(requestOptions: RequestOptions): PublishPreferencesResponse =
        publish(WorkspacePreferencePublishParams.none(), requestOptions)

    /**
     * Replace a workspace preference. Full document replacement; missing optional fields are
     * cleared. Topics attached to the workspace preference are unaffected.
     */
    fun replace(
        sectionId: String,
        params: WorkspacePreferenceReplaceParams,
    ): WorkspacePreferenceGetResponse = replace(sectionId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        sectionId: String,
        params: WorkspacePreferenceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceGetResponse =
        replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see replace */
    fun replace(params: WorkspacePreferenceReplaceParams): WorkspacePreferenceGetResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: WorkspacePreferenceReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WorkspacePreferenceGetResponse

    /**
     * A view of [WorkspacePreferenceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkspacePreferenceService.WithRawResponse

        fun topics(): TopicService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /preferences/sections`, but is otherwise the same
         * as [WorkspacePreferenceService.create].
         */
        @MustBeClosed
        fun create(
            params: WorkspacePreferenceCreateParams
        ): HttpResponseFor<WorkspacePreferenceGetResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WorkspacePreferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            create(
                WorkspacePreferenceCreateParams.builder()
                    .workspacePreferenceCreateRequest(workspacePreferenceCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            workspacePreferenceCreateRequest: WorkspacePreferenceCreateRequest
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            create(workspacePreferenceCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}`, but is
         * otherwise the same as [WorkspacePreferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sectionId: String): HttpResponseFor<WorkspacePreferenceGetResponse> =
            retrieve(sectionId, WorkspacePreferenceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sectionId: String,
            params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sectionId: String,
            params: WorkspacePreferenceRetrieveParams = WorkspacePreferenceRetrieveParams.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            retrieve(sectionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WorkspacePreferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WorkspacePreferenceRetrieveParams
        ): HttpResponseFor<WorkspacePreferenceGetResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            retrieve(sectionId, WorkspacePreferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /preferences/sections`, but is otherwise the same as
         * [WorkspacePreferenceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WorkspacePreferenceListResponse> =
            list(WorkspacePreferenceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkspacePreferenceListParams = WorkspacePreferenceListParams.none()
        ): HttpResponseFor<WorkspacePreferenceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WorkspacePreferenceListResponse> =
            list(WorkspacePreferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /preferences/sections/{section_id}`, but is
         * otherwise the same as [WorkspacePreferenceService.archive].
         */
        @MustBeClosed
        fun archive(sectionId: String): HttpResponse =
            archive(sectionId, WorkspacePreferenceArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            sectionId: String,
            params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            sectionId: String,
            params: WorkspacePreferenceArchiveParams = WorkspacePreferenceArchiveParams.none(),
        ): HttpResponse = archive(sectionId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: WorkspacePreferenceArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see archive */
        @MustBeClosed
        fun archive(params: WorkspacePreferenceArchiveParams): HttpResponse =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(sectionId: String, requestOptions: RequestOptions): HttpResponse =
            archive(sectionId, WorkspacePreferenceArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /preferences/publish`, but is otherwise the same as
         * [WorkspacePreferenceService.publish].
         */
        @MustBeClosed
        fun publish(): HttpResponseFor<PublishPreferencesResponse> =
            publish(WorkspacePreferencePublishParams.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublishPreferencesResponse>

        /** @see publish */
        @MustBeClosed
        fun publish(
            params: WorkspacePreferencePublishParams = WorkspacePreferencePublishParams.none()
        ): HttpResponseFor<PublishPreferencesResponse> = publish(params, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(
            publishPreferencesRequest: PublishPreferencesRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PublishPreferencesResponse> =
            publish(
                WorkspacePreferencePublishParams.builder()
                    .publishPreferencesRequest(publishPreferencesRequest)
                    .build(),
                requestOptions,
            )

        /** @see publish */
        @MustBeClosed
        fun publish(
            publishPreferencesRequest: PublishPreferencesRequest
        ): HttpResponseFor<PublishPreferencesResponse> =
            publish(publishPreferencesRequest, RequestOptions.none())

        /** @see publish */
        @MustBeClosed
        fun publish(requestOptions: RequestOptions): HttpResponseFor<PublishPreferencesResponse> =
            publish(WorkspacePreferencePublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /preferences/sections/{section_id}`, but is
         * otherwise the same as [WorkspacePreferenceService.replace].
         */
        @MustBeClosed
        fun replace(
            sectionId: String,
            params: WorkspacePreferenceReplaceParams,
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            replace(sectionId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            sectionId: String,
            params: WorkspacePreferenceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse> =
            replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: WorkspacePreferenceReplaceParams
        ): HttpResponseFor<WorkspacePreferenceGetResponse> = replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: WorkspacePreferenceReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WorkspacePreferenceGetResponse>
    }
}
