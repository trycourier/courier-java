# Courier Java SDK

The Courier Java SDK provides typed access to the Courier REST API from Java and Kotlin applications. Use it to send notifications, manage user profiles, check message status, issue JWT tokens for client-side SDKs, and more.

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.courier:courier-java:6.0.0")
```

### Maven

```xml
<dependency>
  <groupId>com.courier</groupId>
  <artifactId>courier-java</artifactId>
  <version>6.0.0</version>
</dependency>
```

<!-- x-release-please-end -->

Requires Java 8+.

## Quick Start

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import com.courier.models.UserRecipient;
import com.courier.models.send.SendMessageParams;
import com.courier.models.send.SendMessageResponse;

// Reads COURIER_API_KEY and COURIER_BASE_URL from the environment
CourierClient client = CourierOkHttpClient.fromEnv();

SendMessageParams params = SendMessageParams.builder()
    .message(SendMessageParams.Message.builder()
        .to(UserRecipient.builder()
            .userId("your_user_id")
            .build())
        .template("your_template_id")
        .build())
    .build();

SendMessageResponse response = client.send().message(params);
System.out.println(response.requestId());
```

`fromEnv()` reads `COURIER_API_KEY` automatically; use `CourierOkHttpClient.builder().apiKey(...)` to pass it explicitly.

## Documentation

Full documentation: **[courier.com/docs/sdk-libraries/java](https://www.courier.com/docs/sdk-libraries/java/)**

- [Quickstart](https://www.courier.com/docs/getting-started/quickstart/)
- [Send API](https://www.courier.com/docs/platform/sending/send-message/)
- [API Reference](https://www.courier.com/docs/reference/get-started/)
