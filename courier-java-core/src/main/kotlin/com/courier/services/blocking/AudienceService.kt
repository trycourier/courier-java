// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.audiences.Audience
import com.courier.models.audiences.AudienceDeleteParams
import com.courier.models.audiences.AudienceListMembersParams
import com.courier.models.audiences.AudienceListMembersResponse
import com.courier.models.audiences.AudienceListParams
import com.courier.models.audiences.AudienceListResponse
import com.courier.models.audiences.AudienceRetrieveParams
import com.courier.models.audiences.AudienceUpdateParams
import com.courier.models.audiences.AudienceUpdateResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AudienceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudienceService

    /** Returns the specified audience by id. */
    fun retrieve(audienceId: String): Audience = retrieve(audienceId, AudienceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        audienceId: String,
        params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Audience = retrieve(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        audienceId: String,
        params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
    ): Audience = retrieve(audienceId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AudienceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Audience

    /** @see retrieve */
    fun retrieve(params: AudienceRetrieveParams): Audience = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(audienceId: String, requestOptions: RequestOptions): Audience =
        retrieve(audienceId, AudienceRetrieveParams.none(), requestOptions)

    /** Creates or updates audience. */
    fun update(audienceId: String): AudienceUpdateResponse =
        update(audienceId, AudienceUpdateParams.none())

    /** @see update */
    fun update(
        audienceId: String,
        params: AudienceUpdateParams = AudienceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudienceUpdateResponse =
        update(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see update */
    fun update(
        audienceId: String,
        params: AudienceUpdateParams = AudienceUpdateParams.none(),
    ): AudienceUpdateResponse = update(audienceId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AudienceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudienceUpdateResponse

    /** @see update */
    fun update(params: AudienceUpdateParams): AudienceUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(audienceId: String, requestOptions: RequestOptions): AudienceUpdateResponse =
        update(audienceId, AudienceUpdateParams.none(), requestOptions)

    /** Get the audiences associated with the authorization token. */
    fun list(): AudienceListResponse = list(AudienceListParams.none())

    /** @see list */
    fun list(
        params: AudienceListParams = AudienceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudienceListResponse

    /** @see list */
    fun list(params: AudienceListParams = AudienceListParams.none()): AudienceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AudienceListResponse =
        list(AudienceListParams.none(), requestOptions)

    /** Deletes the specified audience. */
    fun delete(audienceId: String) = delete(audienceId, AudienceDeleteParams.none())

    /** @see delete */
    fun delete(
        audienceId: String,
        params: AudienceDeleteParams = AudienceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see delete */
    fun delete(audienceId: String, params: AudienceDeleteParams = AudienceDeleteParams.none()) =
        delete(audienceId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: AudienceDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: AudienceDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(audienceId: String, requestOptions: RequestOptions) =
        delete(audienceId, AudienceDeleteParams.none(), requestOptions)

    /** Get list of members of an audience. */
    fun listMembers(audienceId: String): AudienceListMembersResponse =
        listMembers(audienceId, AudienceListMembersParams.none())

    /** @see listMembers */
    fun listMembers(
        audienceId: String,
        params: AudienceListMembersParams = AudienceListMembersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudienceListMembersResponse =
        listMembers(params.toBuilder().audienceId(audienceId).build(), requestOptions)

    /** @see listMembers */
    fun listMembers(
        audienceId: String,
        params: AudienceListMembersParams = AudienceListMembersParams.none(),
    ): AudienceListMembersResponse = listMembers(audienceId, params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        params: AudienceListMembersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AudienceListMembersResponse

    /** @see listMembers */
    fun listMembers(params: AudienceListMembersParams): AudienceListMembersResponse =
        listMembers(params, RequestOptions.none())

    /** @see listMembers */
    fun listMembers(
        audienceId: String,
        requestOptions: RequestOptions,
    ): AudienceListMembersResponse =
        listMembers(audienceId, AudienceListMembersParams.none(), requestOptions)

    /** A view of [AudienceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudienceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /audiences/{audience_id}`, but is otherwise the same
         * as [AudienceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(audienceId: String): HttpResponseFor<Audience> =
            retrieve(audienceId, AudienceRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            audienceId: String,
            params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Audience> =
            retrieve(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            audienceId: String,
            params: AudienceRetrieveParams = AudienceRetrieveParams.none(),
        ): HttpResponseFor<Audience> = retrieve(audienceId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AudienceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Audience>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AudienceRetrieveParams): HttpResponseFor<Audience> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            audienceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Audience> =
            retrieve(audienceId, AudienceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /audiences/{audience_id}`, but is otherwise the same
         * as [AudienceService.update].
         */
        @MustBeClosed
        fun update(audienceId: String): HttpResponseFor<AudienceUpdateResponse> =
            update(audienceId, AudienceUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            audienceId: String,
            params: AudienceUpdateParams = AudienceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudienceUpdateResponse> =
            update(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            audienceId: String,
            params: AudienceUpdateParams = AudienceUpdateParams.none(),
        ): HttpResponseFor<AudienceUpdateResponse> =
            update(audienceId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AudienceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudienceUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AudienceUpdateParams): HttpResponseFor<AudienceUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            audienceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudienceUpdateResponse> =
            update(audienceId, AudienceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiences`, but is otherwise the same as
         * [AudienceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AudienceListResponse> = list(AudienceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AudienceListParams = AudienceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudienceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AudienceListParams = AudienceListParams.none()
        ): HttpResponseFor<AudienceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AudienceListResponse> =
            list(AudienceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /audiences/{audience_id}`, but is otherwise the
         * same as [AudienceService.delete].
         */
        @MustBeClosed
        fun delete(audienceId: String): HttpResponse =
            delete(audienceId, AudienceDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            audienceId: String,
            params: AudienceDeleteParams = AudienceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            audienceId: String,
            params: AudienceDeleteParams = AudienceDeleteParams.none(),
        ): HttpResponse = delete(audienceId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AudienceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AudienceDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(audienceId: String, requestOptions: RequestOptions): HttpResponse =
            delete(audienceId, AudienceDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /audiences/{audience_id}/members`, but is otherwise
         * the same as [AudienceService.listMembers].
         */
        @MustBeClosed
        fun listMembers(audienceId: String): HttpResponseFor<AudienceListMembersResponse> =
            listMembers(audienceId, AudienceListMembersParams.none())

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            audienceId: String,
            params: AudienceListMembersParams = AudienceListMembersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudienceListMembersResponse> =
            listMembers(params.toBuilder().audienceId(audienceId).build(), requestOptions)

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            audienceId: String,
            params: AudienceListMembersParams = AudienceListMembersParams.none(),
        ): HttpResponseFor<AudienceListMembersResponse> =
            listMembers(audienceId, params, RequestOptions.none())

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            params: AudienceListMembersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AudienceListMembersResponse>

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            params: AudienceListMembersParams
        ): HttpResponseFor<AudienceListMembersResponse> = listMembers(params, RequestOptions.none())

        /** @see listMembers */
        @MustBeClosed
        fun listMembers(
            audienceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudienceListMembersResponse> =
            listMembers(audienceId, AudienceListMembersParams.none(), requestOptions)
    }
}
