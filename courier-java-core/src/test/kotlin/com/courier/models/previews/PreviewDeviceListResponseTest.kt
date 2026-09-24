// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewDeviceListResponseTest {

    @Test
    fun create() {
        val previewDeviceListResponse =
            PreviewDeviceListResponse.builder()
                .addResult(
                    PreviewDevice.builder()
                        .id("pvd_2tecf6d6pybbvvnkdr0hwdpaxf")
                        .app("outlook_com")
                        .category(PreviewDevice.Category.WEBMAIL)
                        .name("Outlook.com (Firefox, Windows 10, dark mode)")
                        .os("windows")
                        .osVersion("10")
                        .platform("firefox")
                        .platformVersion("15_pro_max")
                        .theme(PreviewDevice.Theme.LIGHT)
                        .build()
                )
                .build()

        assertThat(previewDeviceListResponse.results())
            .containsExactly(
                PreviewDevice.builder()
                    .id("pvd_2tecf6d6pybbvvnkdr0hwdpaxf")
                    .app("outlook_com")
                    .category(PreviewDevice.Category.WEBMAIL)
                    .name("Outlook.com (Firefox, Windows 10, dark mode)")
                    .os("windows")
                    .osVersion("10")
                    .platform("firefox")
                    .platformVersion("15_pro_max")
                    .theme(PreviewDevice.Theme.LIGHT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewDeviceListResponse =
            PreviewDeviceListResponse.builder()
                .addResult(
                    PreviewDevice.builder()
                        .id("pvd_2tecf6d6pybbvvnkdr0hwdpaxf")
                        .app("outlook_com")
                        .category(PreviewDevice.Category.WEBMAIL)
                        .name("Outlook.com (Firefox, Windows 10, dark mode)")
                        .os("windows")
                        .osVersion("10")
                        .platform("firefox")
                        .platformVersion("15_pro_max")
                        .theme(PreviewDevice.Theme.LIGHT)
                        .build()
                )
                .build()

        val roundtrippedPreviewDeviceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewDeviceListResponse),
                jacksonTypeRef<PreviewDeviceListResponse>(),
            )

        assertThat(roundtrippedPreviewDeviceListResponse).isEqualTo(previewDeviceListResponse)
    }
}
