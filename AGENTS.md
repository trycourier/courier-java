# Courier Java SDK

Courier is a notifications API for sending messages across email, SMS, push, in-app inbox, Slack, and WhatsApp from a single API call.

## Setup

```java
import com.courier.client.CourierClient;
import com.courier.client.okhttp.CourierOkHttpClient;

CourierClient client = CourierOkHttpClient.fromEnv(); // reads COURIER_API_KEY from env
```

## Core pattern

```java
import com.courier.core.JsonValue;
import com.courier.models.UserRecipient;
import com.courier.models.send.SendMessageParams;
import com.courier.models.send.SendMessageResponse;

SendMessageParams params = SendMessageParams.builder()
    .message(SendMessageParams.Message.builder()
        .to(UserRecipient.builder().userId("user_123").build())
        .template("TEMPLATE_ID")
        .data(SendMessageParams.Message.Data.builder()
            .putAdditionalProperty("order_id", JsonValue.from("456"))
            .build())
        .build())
    .build();

SendMessageResponse response = client.send().message(params);
System.out.println(response.requestId());
```

## Key rules

- Use `routing.method: "single"` (fallback chain) unless the user explicitly asks for parallel delivery (`"all"`).
- Use `client.profiles().create()` for partial profile updates (it merges). Use `client.profiles().replace()` only when fully replacing all profile data.
- Test and production use different API keys from the same workspace. Always confirm which environment before sending.
- For transactional sends (OTP, orders, billing), pass an `Idempotency-Key` header via `.putAdditionalHeader("Idempotency-Key", value)` on the params builder to prevent duplicates.
- Bulk sends are a 3-step flow: `client.bulk().createJob()` → `client.bulk().addUsers()` → `client.bulk().runJob()`.
- `requestId` from a single-recipient send doubles as the `message_id`. For multi-recipient sends, each recipient gets a unique `message_id`.
- Java uses the builder pattern for all params; all model classes are immutable.

## Concepts

- `template` — notification template ID from the Courier dashboard
- `routing.method` — `"single"` = try channels in order until one succeeds; `"all"` = send on every channel simultaneously
- `tenant_id` — multi-tenant context; affects brand and preference defaults for the message
- `list_id` — send to all subscribers of a named list
- `UserRecipient` — registered user whose profile has channel addresses
- Ad-hoc recipients: pass email or phone directly in the `to` field (no stored profile needed)

## More context

- Full docs index: https://www.courier.com/docs/llms.txt
- API reference: https://www.courier.com/docs/reference/get-started
- MCP server: https://mcp.courier.com
- Courier Skills (Cursor / Claude Code): https://github.com/trycourier/courier-skills
