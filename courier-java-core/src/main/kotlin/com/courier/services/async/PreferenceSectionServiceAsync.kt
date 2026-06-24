// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.preferencesections.PreferenceSectionArchiveParams
import com.courier.models.preferencesections.PreferenceSectionCreateParams
import com.courier.models.preferencesections.PreferenceSectionCreateRequest
import com.courier.models.preferencesections.PreferenceSectionGetResponse
import com.courier.models.preferencesections.PreferenceSectionListParams
import com.courier.models.preferencesections.PreferenceSectionListResponse
import com.courier.models.preferencesections.PreferenceSectionPublishParams
import com.courier.models.preferencesections.PreferenceSectionReplaceParams
import com.courier.models.preferencesections.PreferenceSectionRetrieveParams
import com.courier.models.preferencesections.PublishPreferencesResponse
import com.courier.services.async.preferencesections.TopicServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PreferenceSectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreferenceSectionServiceAsync

    fun topics(): TopicServiceAsync

    /**
     * Create a preference section in your workspace. The section id is generated and returned.
     * Topics are created inside a section via POST /preferences/sections/{section_id}/topics.
     */
    fun create(
        params: PreferenceSectionCreateParams
    ): CompletableFuture<PreferenceSectionGetResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PreferenceSectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionGetResponse>

    /** @see create */
    fun create(
        preferenceSectionCreateRequest: PreferenceSectionCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionGetResponse> =
        create(
            PreferenceSectionCreateParams.builder()
                .preferenceSectionCreateRequest(preferenceSectionCreateRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        preferenceSectionCreateRequest: PreferenceSectionCreateRequest
    ): CompletableFuture<PreferenceSectionGetResponse> =
        create(preferenceSectionCreateRequest, RequestOptions.none())

    /** Retrieve a preference section by id, including its topics. */
    fun retrieve(sectionId: String): CompletableFuture<PreferenceSectionGetResponse> =
        retrieve(sectionId, PreferenceSectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionGetResponse> =
        retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
    ): CompletableFuture<PreferenceSectionGetResponse> =
        retrieve(sectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PreferenceSectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionGetResponse>

    /** @see retrieve */
    fun retrieve(
        params: PreferenceSectionRetrieveParams
    ): CompletableFuture<PreferenceSectionGetResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PreferenceSectionGetResponse> =
        retrieve(sectionId, PreferenceSectionRetrieveParams.none(), requestOptions)

    /**
     * List the workspace's preference sections. Each section embeds its topics. Scoped to the
     * workspace of the API key.
     */
    fun list(): CompletableFuture<PreferenceSectionListResponse> =
        list(PreferenceSectionListParams.none())

    /** @see list */
    fun list(
        params: PreferenceSectionListParams = PreferenceSectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionListResponse>

    /** @see list */
    fun list(
        params: PreferenceSectionListParams = PreferenceSectionListParams.none()
    ): CompletableFuture<PreferenceSectionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PreferenceSectionListResponse> =
        list(PreferenceSectionListParams.none(), requestOptions)

    /**
     * Archive a preference section. The section must be empty: delete its topics first, otherwise
     * the request fails with 409.
     */
    fun archive(sectionId: String): CompletableFuture<Void?> =
        archive(sectionId, PreferenceSectionArchiveParams.none())

    /** @see archive */
    fun archive(
        sectionId: String,
        params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see archive */
    fun archive(
        sectionId: String,
        params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
    ): CompletableFuture<Void?> = archive(sectionId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PreferenceSectionArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see archive */
    fun archive(params: PreferenceSectionArchiveParams): CompletableFuture<Void?> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(sectionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        archive(sectionId, PreferenceSectionArchiveParams.none(), requestOptions)

    /**
     * Publish the workspace's preferences page. Takes a snapshot of every section with its topics
     * under a new published version, making the current state visible on the hosted preferences
     * page (non-draft).
     */
    fun publish(): CompletableFuture<PublishPreferencesResponse> =
        publish(PreferenceSectionPublishParams.none())

    /** @see publish */
    fun publish(
        params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PublishPreferencesResponse>

    /** @see publish */
    fun publish(
        params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none()
    ): CompletableFuture<PublishPreferencesResponse> = publish(params, RequestOptions.none())

    /** @see publish */
    fun publish(requestOptions: RequestOptions): CompletableFuture<PublishPreferencesResponse> =
        publish(PreferenceSectionPublishParams.none(), requestOptions)

    /**
     * Replace a preference section. Full document replacement; missing optional fields are cleared.
     * Topics attached to the section are unaffected.
     */
    fun replace(
        sectionId: String,
        params: PreferenceSectionReplaceParams,
    ): CompletableFuture<PreferenceSectionGetResponse> =
        replace(sectionId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        sectionId: String,
        params: PreferenceSectionReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionGetResponse> =
        replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

    /** @see replace */
    fun replace(
        params: PreferenceSectionReplaceParams
    ): CompletableFuture<PreferenceSectionGetResponse> = replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: PreferenceSectionReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PreferenceSectionGetResponse>

    /**
     * A view of [PreferenceSectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): PreferenceSectionServiceAsync.WithRawResponse

        fun topics(): TopicServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /preferences/sections`, but is otherwise the same
         * as [PreferenceSectionServiceAsync.create].
         */
        fun create(
            params: PreferenceSectionCreateParams
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PreferenceSectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>>

        /** @see create */
        fun create(
            preferenceSectionCreateRequest: PreferenceSectionCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            create(
                PreferenceSectionCreateParams.builder()
                    .preferenceSectionCreateRequest(preferenceSectionCreateRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            preferenceSectionCreateRequest: PreferenceSectionCreateRequest
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            create(preferenceSectionCreateRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /preferences/sections/{section_id}`, but is
         * otherwise the same as [PreferenceSectionServiceAsync.retrieve].
         */
        fun retrieve(
            sectionId: String
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            retrieve(sectionId, PreferenceSectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            retrieve(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            params: PreferenceSectionRetrieveParams = PreferenceSectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            retrieve(sectionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PreferenceSectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PreferenceSectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            retrieve(sectionId, PreferenceSectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /preferences/sections`, but is otherwise the same as
         * [PreferenceSectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PreferenceSectionListResponse>> =
            list(PreferenceSectionListParams.none())

        /** @see list */
        fun list(
            params: PreferenceSectionListParams = PreferenceSectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionListResponse>>

        /** @see list */
        fun list(
            params: PreferenceSectionListParams = PreferenceSectionListParams.none()
        ): CompletableFuture<HttpResponseFor<PreferenceSectionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PreferenceSectionListResponse>> =
            list(PreferenceSectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /preferences/sections/{section_id}`, but is
         * otherwise the same as [PreferenceSectionServiceAsync.archive].
         */
        fun archive(sectionId: String): CompletableFuture<HttpResponse> =
            archive(sectionId, PreferenceSectionArchiveParams.none())

        /** @see archive */
        fun archive(
            sectionId: String,
            params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            archive(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see archive */
        fun archive(
            sectionId: String,
            params: PreferenceSectionArchiveParams = PreferenceSectionArchiveParams.none(),
        ): CompletableFuture<HttpResponse> = archive(sectionId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: PreferenceSectionArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see archive */
        fun archive(params: PreferenceSectionArchiveParams): CompletableFuture<HttpResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            sectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            archive(sectionId, PreferenceSectionArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /preferences/publish`, but is otherwise the same as
         * [PreferenceSectionServiceAsync.publish].
         */
        fun publish(): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(PreferenceSectionPublishParams.none())

        /** @see publish */
        fun publish(
            params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>>

        /** @see publish */
        fun publish(
            params: PreferenceSectionPublishParams = PreferenceSectionPublishParams.none()
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(params, RequestOptions.none())

        /** @see publish */
        fun publish(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PublishPreferencesResponse>> =
            publish(PreferenceSectionPublishParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /preferences/sections/{section_id}`, but is
         * otherwise the same as [PreferenceSectionServiceAsync.replace].
         */
        fun replace(
            sectionId: String,
            params: PreferenceSectionReplaceParams,
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            replace(sectionId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            sectionId: String,
            params: PreferenceSectionReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            replace(params.toBuilder().sectionId(sectionId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: PreferenceSectionReplaceParams
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: PreferenceSectionReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PreferenceSectionGetResponse>>
    }
}
