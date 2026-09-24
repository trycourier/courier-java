// File generated from our OpenAPI spec by Stainless.

package com.courier.models.previews

import com.courier.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PreviewDeviceTest {

    @Test
    fun create() {
        val previewDevice =
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

        assertThat(previewDevice.id()).isEqualTo("pvd_2tecf6d6pybbvvnkdr0hwdpaxf")
        assertThat(previewDevice.app()).isEqualTo("outlook_com")
        assertThat(previewDevice.category()).isEqualTo(PreviewDevice.Category.WEBMAIL)
        assertThat(previewDevice.name()).isEqualTo("Outlook.com (Firefox, Windows 10, dark mode)")
        assertThat(previewDevice.os()).isEqualTo("windows")
        assertThat(previewDevice.osVersion()).isEqualTo("10")
        assertThat(previewDevice.platform()).contains("firefox")
        assertThat(previewDevice.platformVersion()).contains("15_pro_max")
        assertThat(previewDevice.theme()).isEqualTo(PreviewDevice.Theme.LIGHT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val previewDevice =
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

        val roundtrippedPreviewDevice =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(previewDevice),
                jacksonTypeRef<PreviewDevice>(),
            )

        assertThat(roundtrippedPreviewDevice).isEqualTo(previewDevice)
    }
}
