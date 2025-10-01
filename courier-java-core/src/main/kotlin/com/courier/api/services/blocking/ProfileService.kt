// File generated from our OpenAPI spec by Stainless.

package com.courier.api.services.blocking

import com.courier.api.core.ClientOptions
import com.courier.api.core.RequestOptions
import com.courier.api.core.http.HttpResponse
import com.courier.api.core.http.HttpResponseFor
import com.courier.api.models.profiles.ProfileCreateParams
import com.courier.api.models.profiles.ProfileCreateResponse
import com.courier.api.models.profiles.ProfileDeleteParams
import com.courier.api.models.profiles.ProfileReplaceParams
import com.courier.api.models.profiles.ProfileReplaceResponse
import com.courier.api.models.profiles.ProfileRetrieveParams
import com.courier.api.models.profiles.ProfileRetrieveResponse
import com.courier.api.models.profiles.ProfileUpdateParams
import com.courier.api.services.blocking.profiles.ListService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ProfileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService

    fun lists(): ListService

    /**
     * Merge the supplied values with an existing profile or create a new profile if one doesn't
     * already exist.
     */
    fun create(userId: String, params: ProfileCreateParams): ProfileCreateResponse =
        create(userId, params, RequestOptions.none())

    /** @see create */
    fun create(
        userId: String,
        params: ProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileCreateResponse = create(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see create */
    fun create(params: ProfileCreateParams): ProfileCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileCreateResponse

    /** Returns the specified user profile. */
    fun retrieve(userId: String): ProfileRetrieveResponse =
        retrieve(userId, ProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveResponse = retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
    ): ProfileRetrieveResponse = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ProfileRetrieveParams): ProfileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): ProfileRetrieveResponse =
        retrieve(userId, ProfileRetrieveParams.none(), requestOptions)

    /** Update a profile */
    fun update(userId: String, params: ProfileUpdateParams) =
        update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        userId: String,
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(params: ProfileUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: ProfileUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Deletes the specified user profile. */
    fun delete(userId: String) = delete(userId, ProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        userId: String,
        params: ProfileDeleteParams = ProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(userId: String, params: ProfileDeleteParams = ProfileDeleteParams.none()) =
        delete(userId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProfileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProfileDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userId: String, requestOptions: RequestOptions) =
        delete(userId, ProfileDeleteParams.none(), requestOptions)

    /**
     * When using `PUT`, be sure to include all the key-value pairs required by the recipient's
     * profile. Any key-value pairs that exist in the profile but fail to be included in the `PUT`
     * request will be removed from the profile. Remember, a `PUT` update is a full replacement of
     * the data. For partial updates, use the
     * [Patch](https://www.courier.com/docs/reference/profiles/patch/) request.
     */
    fun replace(userId: String, params: ProfileReplaceParams): ProfileReplaceResponse =
        replace(userId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        userId: String,
        params: ProfileReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileReplaceResponse = replace(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see replace */
    fun replace(params: ProfileReplaceParams): ProfileReplaceResponse =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: ProfileReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProfileReplaceResponse

    /** A view of [ProfileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileService.WithRawResponse

        fun lists(): ListService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /profiles/{user_id}`, but is otherwise the same as
         * [ProfileService.create].
         */
        @MustBeClosed
        fun create(
            userId: String,
            params: ProfileCreateParams,
        ): HttpResponseFor<ProfileCreateResponse> = create(userId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            userId: String,
            params: ProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileCreateResponse> =
            create(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ProfileCreateParams): HttpResponseFor<ProfileCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileCreateResponse>

        /**
         * Returns a raw HTTP response for `get /profiles/{user_id}`, but is otherwise the same as
         * [ProfileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userId: String): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(userId, ProfileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProfileRetrieveParams): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProfileRetrieveResponse> =
            retrieve(userId, ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /profiles/{user_id}`, but is otherwise the same as
         * [ProfileService.update].
         */
        @MustBeClosed
        fun update(userId: String, params: ProfileUpdateParams): HttpResponse =
            update(userId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            userId: String,
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ProfileUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /profiles/{user_id}`, but is otherwise the same
         * as [ProfileService.delete].
         */
        @MustBeClosed
        fun delete(userId: String): HttpResponse = delete(userId, ProfileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            params: ProfileDeleteParams = ProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            userId: String,
            params: ProfileDeleteParams = ProfileDeleteParams.none(),
        ): HttpResponse = delete(userId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProfileDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(userId: String, requestOptions: RequestOptions): HttpResponse =
            delete(userId, ProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /profiles/{user_id}`, but is otherwise the same as
         * [ProfileService.replace].
         */
        @MustBeClosed
        fun replace(
            userId: String,
            params: ProfileReplaceParams,
        ): HttpResponseFor<ProfileReplaceResponse> = replace(userId, params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            userId: String,
            params: ProfileReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileReplaceResponse> =
            replace(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see replace */
        @MustBeClosed
        fun replace(params: ProfileReplaceParams): HttpResponseFor<ProfileReplaceResponse> =
            replace(params, RequestOptions.none())

        /** @see replace */
        @MustBeClosed
        fun replace(
            params: ProfileReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProfileReplaceResponse>
    }
}
