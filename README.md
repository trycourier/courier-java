<!-- AUTO-GENERATED-OVERVIEW:START — Do not edit this section. It is synced from mintlify-docs. -->
# Courier Java SDK

The Courier Java SDK provides typed access to the Courier REST API from applications written in Java 8+. It uses builder-pattern request construction, OkHttp for transport, and returns strongly typed response objects.

## Installation

### Gradle

```kotlin
implementation("com.courier:courier-java:4.9.1")
```

### Maven

```xml
<dependency>
  <groupId>com.courier</groupId>
  <artifactId>courier-java</artifactId>
  <version>4.9.1</version>
</dependency>
```

## Quick Start

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import com.courier.core.JsonValue;
import com.courier.models.UserRecipient;
import com.courier.models.send.SendMessageParams;

CourierClient client = CourierOkHttpClient.fromEnv();

SendMessageParams params = SendMessageParams.builder()
    .message(SendMessageParams.Message.builder()
        .to(UserRecipient.builder().userId("your_user_id").build())
        .template("your_template_id")
        .data(SendMessageParams.Message.Data.builder()
            .putAdditionalProperty("foo", JsonValue.from("bar"))
            .build())
        .build())
    .build();

var response = client.send().message(params);
System.out.println(response.requestId());
```

The client reads `COURIER_API_KEY` from your environment (or `courier.apiKey` system property) automatically.

## Documentation

Full documentation: **[courier.com/docs/sdk-libraries/java](https://www.courier.com/docs/sdk-libraries/java/)**

- [Quickstart](https://www.courier.com/docs/getting-started/quickstart/)
- [Send API](https://www.courier.com/docs/platform/sending/send-message/)
- [API Reference](https://www.courier.com/docs/reference/get-started/)
- [Javadocs](https://javadoc.io/doc/com.courier/courier-java/)
<!-- AUTO-GENERATED-OVERVIEW:END -->
