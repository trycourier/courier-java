// File generated from our OpenAPI spec by Stainless.

package com.courier.services.async

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponse
import com.courier.core.http.HttpResponseFor
import com.courier.models.profiles.ProfileCreateParams
import com.courier.models.profiles.ProfileCreateResponse
import com.courier.models.profiles.ProfileDeleteParams
import com.courier.models.profiles.ProfileReplaceParams
import com.courier.models.profiles.ProfileReplaceResponse
import com.courier.models.profiles.ProfileRetrieveParams
import com.courier.models.profiles.ProfileRetrieveResponse
import com.courier.models.profiles.ProfileUpdateParams
import com.courier.services.async.profiles.ListServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Store the contact information Courier delivers to for each user — email, phone number, push
 * tokens, and any custom data you send to.
 */
interface ProfileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProfileServiceAsync

    /**
     * Store the contact information Courier delivers to for each user — email, phone number, push
     * tokens, and any custom data you send to.
     */
    fun lists(): ListServiceAsync

    /**
     * Merges the supplied values into a user's profile, creating it if absent and leaving any key
     * you omit untouched. Prefer this for everyday writes.
     */
    fun create(
        userId: String,
        params: ProfileCreateParams,
    ): CompletableFuture<ProfileCreateResponse> = create(userId, params, RequestOptions.none())

    /** @see create */
    fun create(
        userId: String,
        params: ProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileCreateResponse> =
        create(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see create */
    fun create(params: ProfileCreateParams): CompletableFuture<ProfileCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProfileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileCreateResponse>

    /**
     * Returns a user's stored profile and preferences, including the email address, phone number,
     * and push tokens Courier can reach them on.
     */
    fun retrieve(userId: String): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(userId, ProfileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
    ): CompletableFuture<ProfileRetrieveResponse> = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProfileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ProfileRetrieveParams): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProfileRetrieveResponse> =
        retrieve(userId, ProfileRetrieveParams.none(), requestOptions)

    /**
     * Applies a JSON Patch to a user profile, adding, removing, or replacing individual fields
     * without sending the whole object.
     */
    fun update(userId: String, params: ProfileUpdateParams): CompletableFuture<Void?> =
        update(userId, params, RequestOptions.none())

    /** @see update */
    fun update(
        userId: String,
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see update */
    fun update(params: ProfileUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProfileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Deletes a user's profile and stored contact details. List subscriptions and preferences are
     * separate resources, so remove those too if required.
     */
    fun delete(userId: String): CompletableFuture<Void?> =
        delete(userId, ProfileDeleteParams.none())

    /** @see delete */
    fun delete(
        userId: String,
        params: ProfileDeleteParams = ProfileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see delete */
    fun delete(
        userId: String,
        params: ProfileDeleteParams = ProfileDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(userId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProfileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ProfileDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(userId, ProfileDeleteParams.none(), requestOptions)

    /**
     * Overwrites a user profile in full, removing any key absent from the request body. Use the
     * patch endpoint when changing a single field.
     */
    fun replace(
        userId: String,
        params: ProfileReplaceParams,
    ): CompletableFuture<ProfileReplaceResponse> = replace(userId, params, RequestOptions.none())

    /** @see replace */
    fun replace(
        userId: String,
        params: ProfileReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileReplaceResponse> =
        replace(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see replace */
    fun replace(params: ProfileReplaceParams): CompletableFuture<ProfileReplaceResponse> =
        replace(params, RequestOptions.none())

    /** @see replace */
    fun replace(
        params: ProfileReplaceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProfileReplaceResponse>

    /**
     * A view of [ProfileServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProfileServiceAsync.WithRawResponse

        /**
         * Store the contact information Courier delivers to for each user — email, phone number,
         * push tokens, and any custom data you send to.
         */
        fun lists(): ListServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /profiles/{user_id}`, but is otherwise the same as
         * [ProfileServiceAsync.create].
         */
        fun create(
            userId: String,
            params: ProfileCreateParams,
        ): CompletableFuture<HttpResponseFor<ProfileCreateResponse>> =
            create(userId, params, RequestOptions.none())

        /** @see create */
        fun create(
            userId: String,
            params: ProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileCreateResponse>> =
            create(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ProfileCreateParams
        ): CompletableFuture<HttpResponseFor<ProfileCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProfileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /profiles/{user_id}`, but is otherwise the same as
         * [ProfileServiceAsync.retrieve].
         */
        fun retrieve(userId: String): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(userId, ProfileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: ProfileRetrieveParams = ProfileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProfileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ProfileRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProfileRetrieveResponse>> =
            retrieve(userId, ProfileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /profiles/{user_id}`, but is otherwise the same as
         * [ProfileServiceAsync.update].
         */
        fun update(userId: String, params: ProfileUpdateParams): CompletableFuture<HttpResponse> =
            update(userId, params, RequestOptions.none())

        /** @see update */
        fun update(
            userId: String,
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see update */
        fun update(params: ProfileUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProfileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /profiles/{user_id}`, but is otherwise the same
         * as [ProfileServiceAsync.delete].
         */
        fun delete(userId: String): CompletableFuture<HttpResponse> =
            delete(userId, ProfileDeleteParams.none())

        /** @see delete */
        fun delete(
            userId: String,
            params: ProfileDeleteParams = ProfileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see delete */
        fun delete(
            userId: String,
            params: ProfileDeleteParams = ProfileDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(userId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProfileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ProfileDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(userId, ProfileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /profiles/{user_id}`, but is otherwise the same as
         * [ProfileServiceAsync.replace].
         */
        fun replace(
            userId: String,
            params: ProfileReplaceParams,
        ): CompletableFuture<HttpResponseFor<ProfileReplaceResponse>> =
            replace(userId, params, RequestOptions.none())

        /** @see replace */
        fun replace(
            userId: String,
            params: ProfileReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileReplaceResponse>> =
            replace(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see replace */
        fun replace(
            params: ProfileReplaceParams
        ): CompletableFuture<HttpResponseFor<ProfileReplaceResponse>> =
            replace(params, RequestOptions.none())

        /** @see replace */
        fun replace(
            params: ProfileReplaceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProfileReplaceResponse>>
    }
}
