<!-- AUTO-GENERATED-OVERVIEW:START — Do not edit this section. It is synced from mintlify-docs. -->
# Courier Java SDK

The Courier Java SDK provides typed access to the Courier REST API from applications written in Java 8+. It uses builder-pattern request construction, OkHttp for transport, and returns strongly typed response objects.

## Installation

### Gradle

```kotlin
implementation("com.courier:courier-java:LATEST_VERSION")
```

### Maven

```xml
<dependency>
  <groupId>com.courier</groupId>
  <artifactId>courier-java</artifactId>
  <version>LATEST_VERSION</version>
</dependency>
```

Find the latest version on [Maven Central](https://central.sonatype.com/artifact/com.courier/courier-java).

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

## Error handling

The SDK throws custom unchecked exception types:

- [`CourierServiceException`](courier-java-core/src/main/kotlin/com/courier/errors/CourierServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                |
  | ------ | ------------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](courier-java-core/src/main/kotlin/com/courier/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](courier-java-core/src/main/kotlin/com/courier/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](courier-java-core/src/main/kotlin/com/courier/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](courier-java-core/src/main/kotlin/com/courier/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](courier-java-core/src/main/kotlin/com/courier/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](courier-java-core/src/main/kotlin/com/courier/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](courier-java-core/src/main/kotlin/com/courier/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](courier-java-core/src/main/kotlin/com/courier/errors/UnexpectedStatusCodeException.kt) |

- [`CourierIoException`](courier-java-core/src/main/kotlin/com/courier/errors/CourierIoException.kt): I/O networking errors.

- [`CourierRetryableException`](courier-java-core/src/main/kotlin/com/courier/errors/CourierRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`CourierInvalidDataException`](courier-java-core/src/main/kotlin/com/courier/errors/CourierInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`CourierException`](courier-java-core/src/main/kotlin/com/courier/errors/CourierException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

Enable logging by setting the `COURIER_LOG` environment variable to `info`:

```sh
export COURIER_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export COURIER_LOG=debug
```

Or configure the client manually using the `logLevel` method:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import com.courier.core.LogLevel;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    .logLevel(LogLevel.INFO)
    .build();
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `courier-java-core` is published with a [configuration file](courier-java-core/src/main/resources/META-INF/proguard/courier-java-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`CourierOkHttpClient`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClient.kt) or [`CourierOkHttpClientAsync`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import com.courier.models.send.SendMessageResponse;

SendMessageResponse response = client.send().message(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import java.time.Duration;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

If the proxy responds with `407 Proxy Authentication Required`, supply credentials by also configuring `proxyAuthenticator`:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import com.courier.core.http.ProxyAuthenticator;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    .proxy(...)
    // Or a custom implementation of `ProxyAuthenticator`.
    .proxyAuthenticator(ProxyAuthenticator.basic("username", "password"))
    .build();
```

### Connection pooling

To customize the underlying OkHttp connection pool, configure the client using the `maxIdleConnections` and `keepAliveDuration` methods:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;
import java.time.Duration;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    // If `maxIdleConnections` is set, then `keepAliveDuration` must be set, and vice versa.
    .maxIdleConnections(10)
    .keepAliveDuration(Duration.ofMinutes(2))
    .build();
```

If both options are unset, OkHttp's default connection pool settings are used.

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `courier-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`CourierClient`](courier-java-core/src/main/kotlin/com/courier/client/CourierClient.kt), [`CourierClientAsync`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientAsync.kt), [`CourierClientImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientImpl.kt), and [`CourierClientAsyncImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientAsyncImpl.kt), all of which can work with any HTTP client
- `courier-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`CourierOkHttpClient`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClient.kt) and [`CourierOkHttpClientAsync`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClientAsync.kt), which provide a way to construct [`CourierClientImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientImpl.kt) and [`CourierClientAsyncImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientAsyncImpl.kt), respectively, using OkHttp
- `courier-java`
  - Depends on and exposes the APIs of both `courier-java-core` and `courier-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`courier-java` dependency](#installation) with `courier-java-core`
2. Copy `courier-java-client-okhttp`'s [`OkHttpClient`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`CourierClientImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientImpl.kt) or [`CourierClientAsyncImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientAsyncImpl.kt), similarly to [`CourierOkHttpClient`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClient.kt) or [`CourierOkHttpClientAsync`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`courier-java` dependency](#installation) with `courier-java-core`
2. Write a class that implements the [`HttpClient`](courier-java-core/src/main/kotlin/com/courier/core/http/HttpClient.kt) interface
3. Construct [`CourierClientImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientImpl.kt) or [`CourierClientAsyncImpl`](courier-java-core/src/main/kotlin/com/courier/client/CourierClientAsyncImpl.kt), similarly to [`CourierOkHttpClient`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClient.kt) or [`CourierOkHttpClientAsync`](courier-java-client-okhttp/src/main/kotlin/com/courier/client/okhttp/CourierOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import com.courier.core.JsonValue;
import com.courier.models.send.SendMessageParams;

SendMessageParams params = SendMessageParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set undocumented parameters on _nested_ headers, query params, or body classes, call the `putAdditionalProperty` method on the nested class:

```java
import com.courier.core.JsonValue;
import com.courier.models.send.SendMessageParams;

SendMessageParams params = SendMessageParams.builder()
    .message(SendMessageParams.Message.builder()
        .putAdditionalProperty("secretProperty", JsonValue.from("42"))
        .build())
    .build();
```

These properties can be accessed on the nested built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](courier-java-core/src/main/kotlin/com/courier/core/Values.kt) object to its setter:

```java
import com.courier.core.JsonValue;
import com.courier.models.send.SendMessageParams;

SendMessageParams params = SendMessageParams.builder()
    .message(JsonValue.from(42))
    .build();
```

The most straightforward way to create a [`JsonValue`](courier-java-core/src/main/kotlin/com/courier/core/Values.kt) is using its `from(...)` method:

```java
import com.courier.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](courier-java-core/src/main/kotlin/com/courier/core/Values.kt):

```java
import com.courier.core.JsonMissing;
import com.courier.models.send.SendMessageParams;

SendMessageParams params = SendMessageParams.builder()
    .message(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import com.courier.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.send().message(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import com.courier.core.JsonField;
import com.courier.models.send.SendMessageParams;
import java.util.Optional;

JsonField<SendMessageParams.Message> message = client.send().message(params)._message();

if (message.isMissing()) {
  // The property is absent from the JSON response
} else if (message.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = message.asString();

  // Try to deserialize into a custom type
  MyClass myObject = message.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`CourierInvalidDataException`](courier-java-core/src/main/kotlin/com/courier/errors/CourierInvalidDataException.kt) only if you directly access the property.

Validating the response is _not_ forwards compatible with new types from the API for existing fields.

If you would still prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import com.courier.models.send.SendMessageResponse;

SendMessageResponse response = client.send().message(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import com.courier.models.send.SendMessageResponse;

SendMessageResponse response = client.send().message(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;

CourierClient client = CourierOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:
The client reads `COURIER_API_KEY` from your environment (or `courier.apiKey` system property) automatically.

## Documentation

Full documentation: **[courier.com/docs/sdk-libraries/java](https://www.courier.com/docs/sdk-libraries/java/)**

- [Quickstart](https://www.courier.com/docs/getting-started/quickstart/)
- [Send API](https://www.courier.com/docs/platform/sending/send-message/)
- [API Reference](https://www.courier.com/docs/reference/get-started/)
- [Javadocs](https://javadoc.io/doc/com.courier/courier-java/)
<!-- AUTO-GENERATED-OVERVIEW:END -->
