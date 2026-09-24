// File generated from our OpenAPI spec by Stainless.

package com.courier.services.blocking

import com.courier.core.ClientOptions
import com.courier.core.RequestOptions
import com.courier.core.http.HttpResponseFor
import com.courier.models.previews.CreateDeviceSetRequest
import com.courier.models.previews.DeviceSet
import com.courier.models.previews.DeviceSetListResponse
import com.courier.models.previews.PreviewArchiveDeviceSetParams
import com.courier.models.previews.PreviewCreateDeviceSetParams
import com.courier.models.previews.PreviewDeviceListResponse
import com.courier.models.previews.PreviewListDeviceSetsParams
import com.courier.models.previews.PreviewListDevicesParams
import com.courier.models.previews.PreviewRetrieveDeviceSetParams
import com.courier.models.previews.PreviewUpdateDeviceSetParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Render a template's email content on real email clients and read back the screenshots, so you can
 * check how it looks before you send it.
 */
interface PreviewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService

    /**
     * Archive a device set. This is a soft delete — the archived set is returned and no longer
     * appears in list results. Runs already created against it keep their own copy of the device
     * list and are unaffected. The Courier-provided default set cannot be archived and returns 409.
     */
    fun archiveDeviceSet(deviceSetId: String): DeviceSet =
        archiveDeviceSet(deviceSetId, PreviewArchiveDeviceSetParams.none())

    /** @see archiveDeviceSet */
    fun archiveDeviceSet(
        deviceSetId: String,
        params: PreviewArchiveDeviceSetParams = PreviewArchiveDeviceSetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet =
        archiveDeviceSet(params.toBuilder().deviceSetId(deviceSetId).build(), requestOptions)

    /** @see archiveDeviceSet */
    fun archiveDeviceSet(
        deviceSetId: String,
        params: PreviewArchiveDeviceSetParams = PreviewArchiveDeviceSetParams.none(),
    ): DeviceSet = archiveDeviceSet(deviceSetId, params, RequestOptions.none())

    /** @see archiveDeviceSet */
    fun archiveDeviceSet(
        params: PreviewArchiveDeviceSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet

    /** @see archiveDeviceSet */
    fun archiveDeviceSet(params: PreviewArchiveDeviceSetParams): DeviceSet =
        archiveDeviceSet(params, RequestOptions.none())

    /** @see archiveDeviceSet */
    fun archiveDeviceSet(deviceSetId: String, requestOptions: RequestOptions): DeviceSet =
        archiveDeviceSet(deviceSetId, PreviewArchiveDeviceSetParams.none(), requestOptions)

    /**
     * Create a named, reusable set of preview devices. Every id must be one listed by `GET
     * /previews/devices`; any other is a 422.
     */
    fun createDeviceSet(params: PreviewCreateDeviceSetParams): DeviceSet =
        createDeviceSet(params, RequestOptions.none())

    /** @see createDeviceSet */
    fun createDeviceSet(
        params: PreviewCreateDeviceSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet

    /** @see createDeviceSet */
    fun createDeviceSet(
        createDeviceSetRequest: CreateDeviceSetRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet =
        createDeviceSet(
            PreviewCreateDeviceSetParams.builder()
                .createDeviceSetRequest(createDeviceSetRequest)
                .build(),
            requestOptions,
        )

    /** @see createDeviceSet */
    fun createDeviceSet(createDeviceSetRequest: CreateDeviceSetRequest): DeviceSet =
        createDeviceSet(createDeviceSetRequest, RequestOptions.none())

    /** List the workspace's preview sets. Archived sets are not returned. */
    fun listDeviceSets(): DeviceSetListResponse = listDeviceSets(PreviewListDeviceSetsParams.none())

    /** @see listDeviceSets */
    fun listDeviceSets(
        params: PreviewListDeviceSetsParams = PreviewListDeviceSetsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSetListResponse

    /** @see listDeviceSets */
    fun listDeviceSets(
        params: PreviewListDeviceSetsParams = PreviewListDeviceSetsParams.none()
    ): DeviceSetListResponse = listDeviceSets(params, RequestOptions.none())

    /** @see listDeviceSets */
    fun listDeviceSets(requestOptions: RequestOptions): DeviceSetListResponse =
        listDeviceSets(PreviewListDeviceSetsParams.none(), requestOptions)

    /**
     * List the devices a preview can be rendered on. Reference data, identical for every workspace
     * — these ids are what a device set is built from and what a run reports results for.
     */
    fun listDevices(): PreviewDeviceListResponse = listDevices(PreviewListDevicesParams.none())

    /** @see listDevices */
    fun listDevices(
        params: PreviewListDevicesParams = PreviewListDevicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreviewDeviceListResponse

    /** @see listDevices */
    fun listDevices(
        params: PreviewListDevicesParams = PreviewListDevicesParams.none()
    ): PreviewDeviceListResponse = listDevices(params, RequestOptions.none())

    /** @see listDevices */
    fun listDevices(requestOptions: RequestOptions): PreviewDeviceListResponse =
        listDevices(PreviewListDevicesParams.none(), requestOptions)

    /** Retrieve a preview set by ID. Archived sets return 404. */
    fun retrieveDeviceSet(deviceSetId: String): DeviceSet =
        retrieveDeviceSet(deviceSetId, PreviewRetrieveDeviceSetParams.none())

    /** @see retrieveDeviceSet */
    fun retrieveDeviceSet(
        deviceSetId: String,
        params: PreviewRetrieveDeviceSetParams = PreviewRetrieveDeviceSetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet =
        retrieveDeviceSet(params.toBuilder().deviceSetId(deviceSetId).build(), requestOptions)

    /** @see retrieveDeviceSet */
    fun retrieveDeviceSet(
        deviceSetId: String,
        params: PreviewRetrieveDeviceSetParams = PreviewRetrieveDeviceSetParams.none(),
    ): DeviceSet = retrieveDeviceSet(deviceSetId, params, RequestOptions.none())

    /** @see retrieveDeviceSet */
    fun retrieveDeviceSet(
        params: PreviewRetrieveDeviceSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet

    /** @see retrieveDeviceSet */
    fun retrieveDeviceSet(params: PreviewRetrieveDeviceSetParams): DeviceSet =
        retrieveDeviceSet(params, RequestOptions.none())

    /** @see retrieveDeviceSet */
    fun retrieveDeviceSet(deviceSetId: String, requestOptions: RequestOptions): DeviceSet =
        retrieveDeviceSet(deviceSetId, PreviewRetrieveDeviceSetParams.none(), requestOptions)

    /**
     * Replace a device set. This is a full replace, not a patch — both the name and the device list
     * are always written. The Courier-provided default set cannot be changed and returns 409.
     */
    fun updateDeviceSet(deviceSetId: String, params: PreviewUpdateDeviceSetParams): DeviceSet =
        updateDeviceSet(deviceSetId, params, RequestOptions.none())

    /** @see updateDeviceSet */
    fun updateDeviceSet(
        deviceSetId: String,
        params: PreviewUpdateDeviceSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet =
        updateDeviceSet(params.toBuilder().deviceSetId(deviceSetId).build(), requestOptions)

    /** @see updateDeviceSet */
    fun updateDeviceSet(params: PreviewUpdateDeviceSetParams): DeviceSet =
        updateDeviceSet(params, RequestOptions.none())

    /** @see updateDeviceSet */
    fun updateDeviceSet(
        params: PreviewUpdateDeviceSetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeviceSet

    /** A view of [PreviewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreviewService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /previews/device-sets/{deviceSetId}`, but is
         * otherwise the same as [PreviewService.archiveDeviceSet].
         */
        @MustBeClosed
        fun archiveDeviceSet(deviceSetId: String): HttpResponseFor<DeviceSet> =
            archiveDeviceSet(deviceSetId, PreviewArchiveDeviceSetParams.none())

        /** @see archiveDeviceSet */
        @MustBeClosed
        fun archiveDeviceSet(
            deviceSetId: String,
            params: PreviewArchiveDeviceSetParams = PreviewArchiveDeviceSetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet> =
            archiveDeviceSet(params.toBuilder().deviceSetId(deviceSetId).build(), requestOptions)

        /** @see archiveDeviceSet */
        @MustBeClosed
        fun archiveDeviceSet(
            deviceSetId: String,
            params: PreviewArchiveDeviceSetParams = PreviewArchiveDeviceSetParams.none(),
        ): HttpResponseFor<DeviceSet> = archiveDeviceSet(deviceSetId, params, RequestOptions.none())

        /** @see archiveDeviceSet */
        @MustBeClosed
        fun archiveDeviceSet(
            params: PreviewArchiveDeviceSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet>

        /** @see archiveDeviceSet */
        @MustBeClosed
        fun archiveDeviceSet(params: PreviewArchiveDeviceSetParams): HttpResponseFor<DeviceSet> =
            archiveDeviceSet(params, RequestOptions.none())

        /** @see archiveDeviceSet */
        @MustBeClosed
        fun archiveDeviceSet(
            deviceSetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceSet> =
            archiveDeviceSet(deviceSetId, PreviewArchiveDeviceSetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /previews/device-sets`, but is otherwise the same
         * as [PreviewService.createDeviceSet].
         */
        @MustBeClosed
        fun createDeviceSet(params: PreviewCreateDeviceSetParams): HttpResponseFor<DeviceSet> =
            createDeviceSet(params, RequestOptions.none())

        /** @see createDeviceSet */
        @MustBeClosed
        fun createDeviceSet(
            params: PreviewCreateDeviceSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet>

        /** @see createDeviceSet */
        @MustBeClosed
        fun createDeviceSet(
            createDeviceSetRequest: CreateDeviceSetRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet> =
            createDeviceSet(
                PreviewCreateDeviceSetParams.builder()
                    .createDeviceSetRequest(createDeviceSetRequest)
                    .build(),
                requestOptions,
            )

        /** @see createDeviceSet */
        @MustBeClosed
        fun createDeviceSet(
            createDeviceSetRequest: CreateDeviceSetRequest
        ): HttpResponseFor<DeviceSet> =
            createDeviceSet(createDeviceSetRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /previews/device-sets`, but is otherwise the same as
         * [PreviewService.listDeviceSets].
         */
        @MustBeClosed
        fun listDeviceSets(): HttpResponseFor<DeviceSetListResponse> =
            listDeviceSets(PreviewListDeviceSetsParams.none())

        /** @see listDeviceSets */
        @MustBeClosed
        fun listDeviceSets(
            params: PreviewListDeviceSetsParams = PreviewListDeviceSetsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSetListResponse>

        /** @see listDeviceSets */
        @MustBeClosed
        fun listDeviceSets(
            params: PreviewListDeviceSetsParams = PreviewListDeviceSetsParams.none()
        ): HttpResponseFor<DeviceSetListResponse> = listDeviceSets(params, RequestOptions.none())

        /** @see listDeviceSets */
        @MustBeClosed
        fun listDeviceSets(requestOptions: RequestOptions): HttpResponseFor<DeviceSetListResponse> =
            listDeviceSets(PreviewListDeviceSetsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /previews/devices`, but is otherwise the same as
         * [PreviewService.listDevices].
         */
        @MustBeClosed
        fun listDevices(): HttpResponseFor<PreviewDeviceListResponse> =
            listDevices(PreviewListDevicesParams.none())

        /** @see listDevices */
        @MustBeClosed
        fun listDevices(
            params: PreviewListDevicesParams = PreviewListDevicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreviewDeviceListResponse>

        /** @see listDevices */
        @MustBeClosed
        fun listDevices(
            params: PreviewListDevicesParams = PreviewListDevicesParams.none()
        ): HttpResponseFor<PreviewDeviceListResponse> = listDevices(params, RequestOptions.none())

        /** @see listDevices */
        @MustBeClosed
        fun listDevices(
            requestOptions: RequestOptions
        ): HttpResponseFor<PreviewDeviceListResponse> =
            listDevices(PreviewListDevicesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /previews/device-sets/{deviceSetId}`, but is
         * otherwise the same as [PreviewService.retrieveDeviceSet].
         */
        @MustBeClosed
        fun retrieveDeviceSet(deviceSetId: String): HttpResponseFor<DeviceSet> =
            retrieveDeviceSet(deviceSetId, PreviewRetrieveDeviceSetParams.none())

        /** @see retrieveDeviceSet */
        @MustBeClosed
        fun retrieveDeviceSet(
            deviceSetId: String,
            params: PreviewRetrieveDeviceSetParams = PreviewRetrieveDeviceSetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet> =
            retrieveDeviceSet(params.toBuilder().deviceSetId(deviceSetId).build(), requestOptions)

        /** @see retrieveDeviceSet */
        @MustBeClosed
        fun retrieveDeviceSet(
            deviceSetId: String,
            params: PreviewRetrieveDeviceSetParams = PreviewRetrieveDeviceSetParams.none(),
        ): HttpResponseFor<DeviceSet> =
            retrieveDeviceSet(deviceSetId, params, RequestOptions.none())

        /** @see retrieveDeviceSet */
        @MustBeClosed
        fun retrieveDeviceSet(
            params: PreviewRetrieveDeviceSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet>

        /** @see retrieveDeviceSet */
        @MustBeClosed
        fun retrieveDeviceSet(params: PreviewRetrieveDeviceSetParams): HttpResponseFor<DeviceSet> =
            retrieveDeviceSet(params, RequestOptions.none())

        /** @see retrieveDeviceSet */
        @MustBeClosed
        fun retrieveDeviceSet(
            deviceSetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeviceSet> =
            retrieveDeviceSet(deviceSetId, PreviewRetrieveDeviceSetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /previews/device-sets/{deviceSetId}`, but is
         * otherwise the same as [PreviewService.updateDeviceSet].
         */
        @MustBeClosed
        fun updateDeviceSet(
            deviceSetId: String,
            params: PreviewUpdateDeviceSetParams,
        ): HttpResponseFor<DeviceSet> = updateDeviceSet(deviceSetId, params, RequestOptions.none())

        /** @see updateDeviceSet */
        @MustBeClosed
        fun updateDeviceSet(
            deviceSetId: String,
            params: PreviewUpdateDeviceSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet> =
            updateDeviceSet(params.toBuilder().deviceSetId(deviceSetId).build(), requestOptions)

        /** @see updateDeviceSet */
        @MustBeClosed
        fun updateDeviceSet(params: PreviewUpdateDeviceSetParams): HttpResponseFor<DeviceSet> =
            updateDeviceSet(params, RequestOptions.none())

        /** @see updateDeviceSet */
        @MustBeClosed
        fun updateDeviceSet(
            params: PreviewUpdateDeviceSetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeviceSet>
    }
}
