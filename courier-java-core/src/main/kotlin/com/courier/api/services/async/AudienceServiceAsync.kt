// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.async

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.audiences.Audience
import com.courier.api.models.audiences.AudienceDeleteParams
import com.courier.api.models.audiences.AudienceListMembersParams
import com.courier.api.models.audiences.AudienceListMembersResponse
import com.courier.api.models.audiences.AudienceListParams
import com.courier.api.models.audiences.AudienceListResponse
import com.courier.api.models.audiences.AudienceRetrieveParams
import com.courier.api.models.audiences.AudienceUpdateParams
import com.courier.api.models.audiences.AudienceUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AudienceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudienceServiceAsync

    /** Returns the specified audience by id. */
    fun retrieve(audienceId: String): CompletableFuture<Audience> =
        retrieve(audienceId, AudienceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        audienceId: String,
        params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Audience> =
        retrieve(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        audienceId: String,
        params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
    ): CompletableFuture<Audience> = retrieve(audienceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AudienceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Audience>

    /** @see retrieve */
    fun retrieve(params: AudienceRetrieveParams): CompletableFuture<Audience> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(audienceId: String, requestOptions: RequestOptions): CompletableFuture<Audience> =
        retrieve(audienceId, AudienceRetrieveParams.none(), requestOptions)

    /** Creates or updates audience. */
    fun update(audienceId: String): CompletableFuture<AudienceUpdateResponse> =
        update(audienceId, AudienceUpdateParams.none())

    /** @see update */
    fun update(
        audienceId: String,
        params: AudienceUpdateParams = AudienceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudienceUpdateResponse> =
        update(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see update */
    fun update(
        audienceId: String,
        params: AudienceUpdateParams = AudienceUpdateParams.none(),
    ): CompletableFuture<AudienceUpdateResponse> = update(audienceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AudienceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudienceUpdateResponse>

    /** @see update */
    fun update(params: AudienceUpdateParams): CompletableFuture<AudienceUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        audienceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudienceUpdateResponse> =
        update(audienceId, AudienceUpdateParams.none(), requestOptions)

    /** Get the audiences associated with the authorization token. */
    fun list(): CompletableFuture<AudienceListResponse> = list(AudienceListParams.none())

    /** @see list */
    fun list(
        params: AudienceListParams = AudienceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudienceListResponse>

    /** @see list */
    fun list(
        params: AudienceListParams = AudienceListParams.none()
    ): CompletableFuture<AudienceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AudienceListResponse> =
        list(AudienceListParams.none(), requestOptions)

    /** Deletes the specified audience. */
    fun delete(audienceId: String): CompletableFuture<Void?> =
        delete(audienceId, AudienceDeleteParams.none())

    /** @see delete */
    fun delete(
        audienceId: String,
        params: AudienceDeleteParams = AudienceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see delete */
    fun delete(
        audienceId: String,
        params: AudienceDeleteParams = AudienceDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(audienceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AudienceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AudienceDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(audienceId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(audienceId, AudienceDeleteParams.none(), requestOptions)

    /** Get list of members of an audience. */
    fun listMembers(audienceId: String): CompletableFuture<AudienceListMembersResponse> =
        listMembers(audienceId, AudienceListMembersParams.none())

    /** @see listMembers */
    fun listMembers(
        audienceId: String,
        params: AudienceListMembersParams = AudienceListMembersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudienceListMembersResponse> =
        listMembers(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see listMembers */
    fun listMembers(
        audienceId: String,
        params: AudienceListMembersParams = AudienceListMembersParams.none(),
    ): CompletableFuture<AudienceListMembersResponse> =
        listMembers(audienceId, params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        params: AudienceListMembersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AudienceListMembersResponse>

    /** @see listMembers */
    fun listMembers(
        params: AudienceListMembersParams
    ): CompletableFuture<AudienceListMembersResponse> = listMembers(params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        audienceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AudienceListMembersResponse> =
        listMembers(audienceId, AudienceListMembersParams.none(), requestOptions)

    /**
     * A view of [AudienceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudienceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audiences/{audience_id}`, but is otherwise the same
         * as [AudienceServiceAsync.retrieve].
         */
        fun retrieve(audienceId: String): CompletableFuture<HttpResponseFor<Audience>> =
            retrieve(audienceId, AudienceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            audienceId: String,
            params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Audience>> =
            retrieve(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            audienceId: String,
            params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Audience>> =
            retrieve(audienceId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AudienceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Audience>>

        /** @see retrieve */
        fun retrieve(params: AudienceRetrieveParams): CompletableFuture<HttpResponseFor<Audience>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            audienceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Audience>> =
            retrieve(audienceId, AudienceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /audiences/{audience_id}`, but is otherwise the same
         * as [AudienceServiceAsync.update].
         */
        fun update(audienceId: String): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>> =
            update(audienceId, AudienceUpdateParams.none())

        /** @see update */
        fun update(
            audienceId: String,
            params: AudienceUpdateParams = AudienceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>> =
            update(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see update */
        fun update(
            audienceId: String,
            params: AudienceUpdateParams = AudienceUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>> =
            update(audienceId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AudienceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>>

        /** @see update */
        fun update(
            params: AudienceUpdateParams
        ): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            audienceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudienceUpdateResponse>> =
            update(audienceId, AudienceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiences`, but is otherwise the same as
         * [AudienceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AudienceListResponse>> =
            list(AudienceListParams.none())

        /** @see list */
        fun list(
            params: AudienceListParams = AudienceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudienceListResponse>>

        /** @see list */
        fun list(
            params: AudienceListParams = AudienceListParams.none()
        ): CompletableFuture<HttpResponseFor<AudienceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AudienceListResponse>> =
            list(AudienceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /audiences/{audience_id}`, but is otherwise the
         * same as [AudienceServiceAsync.delete].
         */
        fun delete(audienceId: String): CompletableFuture<HttpResponse> =
            delete(audienceId, AudienceDeleteParams.none())

        /** @see delete */
        fun delete(
            audienceId: String,
            params: AudienceDeleteParams = AudienceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see delete */
        fun delete(
            audienceId: String,
            params: AudienceDeleteParams = AudienceDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(audienceId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AudienceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AudienceDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            audienceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(audienceId, AudienceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiences/{audience_id}/members`, but is otherwise
         * the same as [AudienceServiceAsync.listMembers].
         */
        fun listMembers(
            audienceId: String
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>> =
            listMembers(audienceId, AudienceListMembersParams.none())

        /** @see listMembers */
        fun listMembers(
            audienceId: String,
            params: AudienceListMembersParams = AudienceListMembersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>> =
            listMembers(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see listMembers */
        fun listMembers(
            audienceId: String,
            params: AudienceListMembersParams = AudienceListMembersParams.none(),
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>> =
            listMembers(audienceId, params, RequestOptions.none())

        /** @see listMembers */
        fun listMembers(
            params: AudienceListMembersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>>

        /** @see listMembers */
        fun listMembers(
            params: AudienceListMembersParams
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>> =
            listMembers(params, RequestOptions.none())

        /** @see listMembers */
        fun listMembers(
            audienceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AudienceListMembersResponse>> =
            listMembers(audienceId, AudienceListMembersParams.none(), requestOptions)
    }
}
