// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.automations.AutomationListParams
import com.courier.models.automations.AutomationTemplateListResponse
import com.courier.services.blocking.automations.InvokeService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface AutomationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutomationService

    fun invoke(): InvokeService

    /** Get the list of automations. */
    fun list(): AutomationTemplateListResponse = list(AutomationListParams.none())

    /** @see list */
    fun list(
        params: AutomationListParams = AutomationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AutomationTemplateListResponse

    /** @see list */
    fun list(
        params: AutomationListParams = AutomationListParams.none()
    ): AutomationTemplateListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AutomationTemplateListResponse =
        list(AutomationListParams.none(), requestOptions)

    /** A view of [AutomationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutomationService.WithRawResponse

        fun invoke(): InvokeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /automations`, but is otherwise the same as
         * [AutomationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AutomationTemplateListResponse> =
            list(AutomationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AutomationListParams = AutomationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AutomationTemplateListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AutomationListParams = AutomationListParams.none()
        ): HttpResponseFor<AutomationTemplateListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AutomationTemplateListResponse> =
            list(AutomationListParams.none(), requestOptions)
    }
}
