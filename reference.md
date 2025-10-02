# Reference
<details><summary><code>client.send(request) -> SendMessageResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Use the send API to send a message to one or more recipients.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.send(
    SendMessageRequest
        .builder()
        .message(
            Message.of(
                ContentMessage
                    .builder()
                    .content(
                        Content.of(
                            ElementalContent
                                .builder()
                                .build()
                        )
                    )
                    .to(
                        MessageRecipient.of(
                            Recipient.of(
                                AudienceRecipient
                                    .builder()
                                    .build()
                            )
                        )
                    )
                    .data(
                        new HashMap<String, Object>() {{
                            put("name", "Peter Parker");
                        }}
                    )
                    .routing(
                        Routing
                            .builder()
                            .method(RoutingMethod.SINGLE)
                            .channels(
                                Arrays.asList(
                                    MessageRoutingChannel.of("email")
                                )
                            )
                            .build()
                    )
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**message:** `Message` — Defines the message to be delivered
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Audiences
<details><summary><code>client.audiences.get(audienceId) -> Audience</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the specified audience by id.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audiences().get("audience_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**audienceId:** `String` — A unique identifier representing the audience_id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.audiences.update(audienceId, request) -> AudienceUpdateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Creates or updates audience.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audiences().update(
    "audience_id",
    AudienceUpdateParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**audienceId:** `String` — A unique identifier representing the audience id
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — The name of the audience
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` — A description of the audience
    
</dd>
</dl>

<dl>
<dd>

**filter:** `Optional<Filter>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.audiences.delete(audienceId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes the specified audience.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audiences().delete("audience_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**audienceId:** `String` — A unique identifier representing the audience id
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.audiences.listMembers(audienceId) -> AudienceMemberListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of members of an audience.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audiences().listMembers(
    "audience_id",
    AudienceMembersListParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**audienceId:** `String` — A unique identifier representing the audience id
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of members
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.audiences.listAudiences() -> AudienceListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the audiences associated with the authorization token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.audiences().listAudiences(
    AudiencesListParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of audiences
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AuditEvents
<details><summary><code>client.auditEvents.list() -> ListAuditEventsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch the list of audit events
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.auditEvents().list(
    ListAuditEventsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of audit events.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.auditEvents.get(auditEventId) -> AuditEvent</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch a specific audit event by ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.auditEvents().get("audit-event-id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**auditEventId:** `String` — A unique identifier associated with the audit event you wish to retrieve
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AuthTokens
<details><summary><code>client.authTokens.issueToken(request) -> IssueTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a new access token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.authTokens().issueToken(
    IssueTokenParams
        .builder()
        .scope("scope")
        .expiresIn("expires_in")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**scope:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**expiresIn:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Automations
<details><summary><code>client.automations.invokeAutomationTemplate(templateId, request) -> AutomationInvokeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Invoke an automation run from an automation template.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.automations().invokeAutomationTemplate(
    "templateId",
    AutomationInvokeParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**templateId:** `String` — A unique identifier representing the automation template to be invoked. This could be the Automation Template ID or the Automation Template Alias.
    
</dd>
</dl>

<dl>
<dd>

**request:** `AutomationInvokeParams` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.automations.invokeAdHocAutomation(request) -> AutomationInvokeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Invoke an ad hoc automation run. This endpoint accepts a JSON payload with a series of automation steps. For information about what steps are available, checkout the ad hoc automation guide [here](https://www.courier.com/docs/automations/steps/).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.automations().invokeAdHocAutomation(
    AutomationAdHocInvokeParams
        .builder()
        .automation(
            Automation
                .builder()
                .steps(
                    Arrays.asList(
                        AutomationStepOption.of(
                            AutomationAddToDigestStep
                                .builder()
                                .action("delay")
                                .build()
                        ),
                        AutomationStepOption.of(
                            AutomationAddToDigestStep
                                .builder()
                                .action("send")
                                .build()
                        )
                    )
                )
                .cancelationToken("delay-send--user-yes--abc-123")
                .build()
        )
        .data(
            new HashMap<String, Object>() {{
                put("name", "Foo");
            }}
        )
        .profile(new 
            HashMap<String, Object>() {{put("tenant_id", "abc-123");
            }})
        .recipient("user-yes")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `AutomationAdHocInvokeParams` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Brands
<details><summary><code>client.brands.create(request) -> Brand</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.brands().create(
    BrandParameters
        .builder()
        .name("name")
        .settings(
            BrandSettings
                .builder()
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `BrandParameters` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.brands.get(brandId) -> Brand</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch a specific brand by brand ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.brands().get("brand_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**brandId:** `String` — A unique identifier associated with the brand you wish to retrieve.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.brands.list() -> BrandsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the list of brands.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.brands().list(
    ListBrandsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of brands.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.brands.delete(brandId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a brand by brand ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.brands().delete("brand_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**brandId:** `String` — A unique identifier associated with the brand you wish to retrieve.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.brands.replace(brandId, request) -> Brand</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Replace an existing brand with the supplied values.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.brands().replace(
    "brand_id",
    BrandUpdateParameters
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**brandId:** `String` — A unique identifier associated with the brand you wish to update.
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — The name of the brand.
    
</dd>
</dl>

<dl>
<dd>

**settings:** `Optional<BrandSettings>` 
    
</dd>
</dl>

<dl>
<dd>

**snippets:** `Optional<BrandSnippets>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Bulk
<details><summary><code>client.bulk.createJob(request) -> BulkCreateJobResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulk().createJob(
    BulkCreateJobParams
        .builder()
        .message(
            InboundBulkMessage
                .builder()
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**message:** `InboundBulkMessage` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulk.ingestUsers(jobId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Ingest user data into a Bulk Job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulk().ingestUsers(
    "job_id",
    BulkIngestUsersParams
        .builder()
        .users(
            Arrays.asList(
                InboundBulkMessageUser
                    .builder()
                    .build(),
                InboundBulkMessageUser
                    .builder()
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — A unique identifier representing the bulk job
    
</dd>
</dl>

<dl>
<dd>

**request:** `BulkIngestUsersParams` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulk.runJob(jobId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Run a bulk job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulk().runJob("job_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — A unique identifier representing the bulk job
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulk.getJob(jobId) -> BulkGetJobResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get a bulk job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulk().getJob("job_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — A unique identifier representing the bulk job
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulk.getUsers(jobId) -> BulkGetJobUsersResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get Bulk Job Users
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulk().getUsers(
    "job_id",
    BulkGetUsersParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**jobId:** `String` — A unique identifier representing the bulk job
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of users added to the bulk job
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Inbound
<details><summary><code>client.inbound.track(request) -> TrackAcceptedResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.inbound().track(
    InboundTrackEvent
        .builder()
        .event("New Order Placed")
        .messageId("4c62c457-b329-4bea-9bfc-17bba86c393f")
        .type("track")
        .properties(
            new HashMap<String, Object>() {{
                put("order_id", 123);
                put("total_orders", 5);
                put("last_order_id", 122);
            }}
        )
        .userId("1234")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `InboundTrackEvent` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Lists
<details><summary><code>client.lists.list() -> ListGetAllResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns all of the lists, with the ability to filter based on a pattern.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().list(
    GetAllListsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next page of lists.
    
</dd>
</dl>

<dl>
<dd>

**pattern:** `Optional<String>` — "A pattern used to filter the list items returned. Pattern types supported: exact match on `list_id` or a pattern of one or more pattern parts. you may replace a part with either: `*` to match all parts in that position, or `**` to signify a wildcard `endsWith` pattern match."
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.get(listId) -> List</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a list based on the list ID provided.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().get("list_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.update(listId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create or replace an existing list with the supplied values.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().update(
    "list_id",
    ListPutParams
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**request:** `ListPutParams` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.delete(listId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a list by list ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().delete("list_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.restore(listId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Restore a previously deleted list.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().restore(
    "list_id",
    RestoreListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.getSubscribers(listId) -> ListGetSubscriptionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get the list's subscriptions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().getSubscribers(
    "list_id",
    GetSubscriptionForListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of list subscriptions
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.updateSubscribers(listId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Subscribes the users to the list, overwriting existing subscriptions. If the list does not exist, it will be automatically created.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().updateSubscribers(
    "list_id",
    SubscribeUsersToListRequest
        .builder()
        .recipients(
            Arrays.asList(
                PutSubscriptionsRecipient
                    .builder()
                    .recipientId("recipientId")
                    .build(),
                PutSubscriptionsRecipient
                    .builder()
                    .recipientId("recipientId")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**recipients:** `List<PutSubscriptionsRecipient>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.addSubscribers(listId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Subscribes additional users to the list, without modifying existing subscriptions. If the list does not exist, it will be automatically created.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().addSubscribers(
    "list_id",
    AddSubscribersToList
        .builder()
        .recipients(
            Arrays.asList(
                PutSubscriptionsRecipient
                    .builder()
                    .recipientId("recipientId")
                    .build(),
                PutSubscriptionsRecipient
                    .builder()
                    .recipientId("recipientId")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**recipients:** `List<PutSubscriptionsRecipient>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.subscribe(listId, userId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Subscribe a user to an existing list (note: if the List does not exist, it will be automatically created).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().subscribe(
    "list_id",
    "user_id",
    SubscribeUserToListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the recipient associated with the list
    
</dd>
</dl>

<dl>
<dd>

**preferences:** `Optional<RecipientPreferences>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.lists.unsubscribe(listId, userId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a subscription to a list by list ID and user ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.lists().unsubscribe("list_id", "user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**listId:** `String` — A unique identifier representing the list you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the recipient associated with the list
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Messages
<details><summary><code>client.messages.list() -> ListMessagesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch the statuses of messages you've previously sent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.messages().list(
    ListMessagesRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**archived:** `Optional<Boolean>` — A boolean value that indicates whether archived messages should be included in the response.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of messages.
    
</dd>
</dl>

<dl>
<dd>

**event:** `Optional<String>` — A unique identifier representing the event that was used to send the event.
    
</dd>
</dl>

<dl>
<dd>

**list:** `Optional<String>` — A unique identifier representing the list the message was sent to.
    
</dd>
</dl>

<dl>
<dd>

**messageId:** `Optional<String>` — A unique identifier representing the message_id returned from either /send or /send/list.
    
</dd>
</dl>

<dl>
<dd>

**notification:** `Optional<String>` — A unique identifier representing the notification that was used to send the event.
    
</dd>
</dl>

<dl>
<dd>

**provider:** `Optional<String>` — The key assocated to the provider you want to filter on. E.g., sendgrid, inbox, twilio, slack, msteams, etc. Allows multiple values to be set in query parameters.
    
</dd>
</dl>

<dl>
<dd>

**recipient:** `Optional<String>` — A unique identifier representing the recipient associated with the requested profile.
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<String>` — An indicator of the current status of the message. Allows multiple values to be set in query parameters.
    
</dd>
</dl>

<dl>
<dd>

**tag:** `Optional<String>` — A tag placed in the metadata.tags during a notification send. Allows multiple values to be set in query parameters.
    
</dd>
</dl>

<dl>
<dd>

**tags:** `Optional<String>` — A comma delimited list of 'tags'. Messages will be returned if they match any of the tags passed in.
    
</dd>
</dl>

<dl>
<dd>

**tenantId:** `Optional<String>` — Messages sent with the context of a Tenant
    
</dd>
</dl>

<dl>
<dd>

**enqueuedAfter:** `Optional<String>` — The enqueued datetime of a message to filter out messages received before.
    
</dd>
</dl>

<dl>
<dd>

**traceId:** `Optional<String>` — The unique identifier used to trace the requests
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.messages.get(messageId) -> MessageDetailsExtended</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch the status of a message you've previously sent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.messages().get("message_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**messageId:** `String` — A unique identifier associated with the message you wish to retrieve (results from a send).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.messages.cancel(messageId) -> MessageDetails</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Cancel a message that is currently in the process of being delivered. A well-formatted API call to the cancel message API will return either `200` status code for a successful cancellation or `409` status code for an unsuccessful cancellation. Both cases will include the actual message record in the response body (see details below).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.messages().cancel("message_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**messageId:** `String` — A unique identifier representing the message ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.messages.getHistory(messageId) -> MessageHistoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch the array of events of a message you've previously sent.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.messages().getHistory(
    "message_id",
    GetMessageHistoryRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**messageId:** `String` — A unique identifier representing the message ID
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — A supported Message History type that will filter the events returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.messages.getContent(messageId) -> RenderOutputResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.messages().getContent("message_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**messageId:** `String` — A unique identifier associated with the message you wish to retrieve (results from a send).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.messages.archive(requestId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.messages().archive("request_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**requestId:** `String` — A unique identifier representing the request ID
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Notifications
<details><summary><code>client.notifications.list() -> NotificationListResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().list(
    NotificationListParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**notes:** `Optional<Boolean>` — Retrieve the notes from the Notification template settings.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.notifications.getContent(id) -> NotificationGetContentResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().getContent("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.notifications.getDraftContent(id) -> NotificationGetContentResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().getDraftContent("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.notifications.getSubmissionChecks(id, submissionId) -> SubmissionChecksGetResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().getSubmissionChecks("id", "submissionId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**submissionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.notifications.replaceSubmissionChecks(id, submissionId, request) -> SubmissionChecksReplaceResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().replaceSubmissionChecks(
    "id",
    "submissionId",
    SubmissionChecksReplaceParams
        .builder()
        .checks(
            Arrays.asList(
                BaseCheck
                    .builder()
                    .id("id")
                    .status(CheckStatus.RESOLVED)
                    .type("custom")
                    .build(),
                BaseCheck
                    .builder()
                    .id("id")
                    .status(CheckStatus.RESOLVED)
                    .type("custom")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**submissionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**checks:** `List<BaseCheck>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.notifications.cancelSubmission(id, submissionId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().cancelSubmission("id", "submissionId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**submissionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Profiles
<details><summary><code>client.profiles.get(userId) -> ProfileGetResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the specified user profile.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().get("user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.create(userId, request) -> MergeProfileResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Merge the supplied values with an existing profile or create a new profile if one doesn't already exist.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().create(
    "user_id",
    MergeProfileRequest
        .builder()
        .profile(
            new HashMap<String, Object>() {{
                put("profile", new 
                HashMap<String, Object>() {{put("key", "value");
                }});
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Map<String, Object>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.replace(userId, request) -> ReplaceProfileResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

When using `PUT`, be sure to include all the key-value pairs required by the recipient's profile. 
Any key-value pairs that exist in the profile but fail to be included in the `PUT` request will be 
removed from the profile. Remember, a `PUT` update is a full replacement of the data. For partial updates, 
use the [Patch](https://www.courier.com/docs/reference/profiles/patch/) request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().replace(
    "user_id",
    ReplaceProfileRequest
        .builder()
        .profile(
            new HashMap<String, Object>() {{
                put("profile", new 
                HashMap<String, Object>() {{put("key", "value");
                }});
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Map<String, Object>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.mergeProfile(userId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().mergeProfile(
    "user_id",
    ProfileUpdateRequest
        .builder()
        .patch(
            Arrays.asList(
                UserProfilePatch
                    .builder()
                    .op("op")
                    .path("path")
                    .value("value")
                    .build(),
                UserProfilePatch
                    .builder()
                    .op("op")
                    .path("path")
                    .value("value")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>

<dl>
<dd>

**request:** `ProfileUpdateRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.delete(userId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Deletes the specified user profile.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().delete("user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.getListSubscriptions(userId) -> GetListSubscriptionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the subscribed lists for a specified user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().getListSubscriptions(
    "user_id",
    GetListSubscriptionsRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of message statuses.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.subscribeToLists(userId, request) -> SubscribeToListsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Subscribes the given user to one or more lists. If the list does not exist, it will be created.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().subscribeToLists(
    "user_id",
    SubscribeToListsRequest
        .builder()
        .lists(
            Arrays.asList(
                SubscribeToListsRequestListObject
                    .builder()
                    .listId("listId")
                    .build(),
                SubscribeToListsRequestListObject
                    .builder()
                    .listId("listId")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>

<dl>
<dd>

**request:** `SubscribeToListsRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.profiles.deleteListSubscription(userId) -> DeleteListSubscriptionResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Removes all list subscriptions for given user.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.profiles().deleteListSubscription("user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier representing the user associated with the requested profile.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Templates
<details><summary><code>client.templates.list() -> ListTemplatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a list of notification templates
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.notifications().list(
    NotificationListParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**cursor:** `Optional<String>` — A unique identifier that allows for fetching the next set of templates
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants
<details><summary><code>client.tenants.createOrReplace(tenantId, request) -> Tenant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().createOrReplace(
    "tenant_id",
    TenantCreateOrReplaceParams
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — A unique identifier representing the tenant to be returned.
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — Name of the tenant.
    
</dd>
</dl>

<dl>
<dd>

**parentTenantId:** `Optional<String>` — Tenant's parent id (if any).
    
</dd>
</dl>

<dl>
<dd>

**defaultPreferences:** `Optional<DefaultPreferences>` — Defines the preferences used for the tenant when the user hasn't specified their own.
    
</dd>
</dl>

<dl>
<dd>

**properties:** `Optional<Map<String, Object>>` — Arbitrary properties accessible to a template.
    
</dd>
</dl>

<dl>
<dd>

**userProfile:** `Optional<Map<String, Object>>` — A user profile object merged with user profile on send.
    
</dd>
</dl>

<dl>
<dd>

**brandId:** `Optional<String>` — Brand to be used for the account when one is not specified by the send call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.get(tenantId) -> Tenant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().get("tenant_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — A unique identifier representing the tenant to be returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.list() -> TenantListResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().list(
    ListTenantParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**parentTenantId:** `Optional<String>` — Filter the list of tenants by parent_id
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 

The number of tenants to return 
(defaults to 20, maximum value of 100)
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Continue the pagination with the next cursor
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.delete(tenantId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().delete("tenant_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant to be deleted.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.getUsersByTenant(tenantId) -> ListUsersForTenantResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().getUsersByTenant(
    "tenant_id",
    ListUsersForTenantParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant for user membership.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 

The number of accounts to return 
(defaults to 20, maximum value of 100)
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Continue the pagination with the next cursor
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.createOrReplaceDefaultPreferencesForTopic(tenantId, topicId, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().createOrReplaceDefaultPreferencesForTopic(
    "tenantABC",
    "HB529N49MD4D5PMX9WR5P4JH78NA",
    SubscriptionTopicNew
        .builder()
        .status(SubscriptionTopicStatus.OPTED_IN)
        .hasCustomRouting(true)
        .customRouting(
            Optional.of(
                Arrays.asList(ChannelClassification.INBOX)
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant to update the default preferences for.
    
</dd>
</dl>

<dl>
<dd>

**topicId:** `String` — Id fo the susbcription topic you want to have a default preference for.
    
</dd>
</dl>

<dl>
<dd>

**request:** `SubscriptionTopicNew` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.removeDefaultPreferencesForTopic(tenantId, topicId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().removeDefaultPreferencesForTopic("tenant_id", "topic_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant to update the default preferences for.
    
</dd>
</dl>

<dl>
<dd>

**topicId:** `String` — Id fo the susbcription topic you want to have a default preference for.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.getTemplateByTenant(tenantId, templateId) -> GetTemplateByTenantResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().getTemplateByTenant("tenant_id", "template_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant for which to retrieve the template.
    
</dd>
</dl>

<dl>
<dd>

**templateId:** `String` — Id of the template to be retrieved.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.getTemplateListByTenant(tenantId) -> ListTemplatesByTenantResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().getTemplateListByTenant(
    "tenant_id",
    GetTemplateListByTenantParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant for which to retrieve the templates.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — The number of templates to return (defaults to 20, maximum value of 100)
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Continue the pagination with the next cursor
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Translations
<details><summary><code>client.translations.get(domain, locale) -> String</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get translations by locale
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.translations().get("domain", "locale");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**domain:** `String` — The domain you want to retrieve translations for. Only `default` is supported at the moment
    
</dd>
</dl>

<dl>
<dd>

**locale:** `String` — The locale you want to retrieve the translations for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.translations.update(domain, locale, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a translation
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.translations().update("domain", "locale", "string");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**domain:** `String` — The domain you want to retrieve translations for. Only `default` is supported at the moment
    
</dd>
</dl>

<dl>
<dd>

**locale:** `String` — The locale you want to retrieve the translations for
    
</dd>
</dl>

<dl>
<dd>

**request:** `String` — .po file translation content
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Users Preferences
<details><summary><code>client.users.preferences.list(userId) -> UserPreferencesListResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch all user preferences.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().preferences().list(
    "user_id",
    UserPreferencesParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier associated with the user whose preferences you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**tenantId:** `Optional<String>` — Query the preferences of a user for this specific tenant context.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.preferences.get(userId, topicId) -> UserPreferencesGetResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetch user preferences for a specific subscription topic.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().preferences().get(
    "user_id",
    "topic_id",
    UserPreferencesTopicParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier associated with the user whose preferences you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**topicId:** `String` — A unique identifier associated with a subscription topic.
    
</dd>
</dl>

<dl>
<dd>

**tenantId:** `Optional<String>` — Query the preferences of a user for this specific tenant context.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.preferences.update(userId, topicId, request) -> UserPreferencesUpdateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update or Create user preferences for a specific subscription topic.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().preferences().update(
    "abc-123",
    "74Q4QGFBEX481DP6JRPMV751H4XT",
    UserPreferencesUpdateParams
        .builder()
        .topic(
            TopicPreferenceUpdate
                .builder()
                .status(PreferenceStatus.OPTED_IN)
                .hasCustomRouting(true)
                .customRouting(
                    Optional.of(
                        Arrays.asList(ChannelClassification.INBOX, ChannelClassification.EMAIL)
                    )
                )
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — A unique identifier associated with the user whose preferences you wish to retrieve.
    
</dd>
</dl>

<dl>
<dd>

**topicId:** `String` — A unique identifier associated with a subscription topic.
    
</dd>
</dl>

<dl>
<dd>

**tenantId:** `Optional<String>` — Update the preferences of a user for this specific tenant context.
    
</dd>
</dl>

<dl>
<dd>

**topic:** `TopicPreferenceUpdate` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Users Tenants
<details><summary><code>client.users.tenants.addMultple(userId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint is used to add a user to
multiple tenants in one call.
A custom profile can also be supplied for each tenant. 
This profile will be merged with the user's main 
profile when sending to the user with that tenant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tenants().addMultple(
    "user_id",
    AddUserToMultipleTenantsParams
        .builder()
        .tenants(
            Arrays.asList(
                UserTenantAssociation
                    .builder()
                    .tenantId("tenant_id")
                    .build(),
                UserTenantAssociation
                    .builder()
                    .tenantId("tenant_id")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>

<dl>
<dd>

**tenants:** `List<UserTenantAssociation>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tenants.add(userId, tenantId, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This endpoint is used to add a single tenant.

A custom profile can also be supplied with the tenant. 
This profile will be merged with the user's main profile 
when sending to the user with that tenant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tenants().add(
    "user_id",
    "tenant_id",
    AddUserToSingleTenantsParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — Id of the user to be added to the supplied tenant.
    
</dd>
</dl>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant the user should be added to.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tenants.removeAll(userId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Removes a user from any tenants they may have been associated with.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tenants().removeAll("user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — Id of the user to be removed from the supplied tenant.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tenants.remove(userId, tenantId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Removes a user from the supplied tenant.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tenants().remove("user_id", "tenant_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — Id of the user to be removed from the supplied tenant.
    
</dd>
</dl>

<dl>
<dd>

**tenantId:** `String` — Id of the tenant the user should be removed from.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tenants.list(userId) -> ListTenantsForUserResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a paginated list of user tenant associations.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tenants().list(
    "user_id",
    ListTenantsForUserParams
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — Id of the user to retrieve all associated tenants for.
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 

The number of accounts to return 
(defaults to 20, maximum value of 100)
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Continue the pagination with the next cursor
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Users Tokens
<details><summary><code>client.users.tokens.addMultiple(userId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds multiple tokens to a user and overwrites matching existing tokens.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tokens().addMultiple("user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tokens.add(userId, token, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Adds a single token to a user and overwrites a matching existing token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tokens().add(
    "user_id",
    "token",
    UserToken
        .builder()
        .providerKey(ProviderKey.FIREBASE_FCM)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>

<dl>
<dd>

**token:** `String` — The full token string.
    
</dd>
</dl>

<dl>
<dd>

**request:** `UserToken` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tokens.update(userId, token, request)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Apply a JSON Patch (RFC 6902) to the specified token.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tokens().update(
    "user_id",
    "token",
    PatchUserTokenOpts
        .builder()
        .patch(
            Arrays.asList(
                PatchOperation
                    .builder()
                    .op("op")
                    .path("path")
                    .build(),
                PatchOperation
                    .builder()
                    .op("op")
                    .path("path")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>

<dl>
<dd>

**token:** `String` — The full token string.
    
</dd>
</dl>

<dl>
<dd>

**request:** `PatchUserTokenOpts` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tokens.get(userId, token) -> GetUserTokenResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get single token available for a `:token`
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tokens().get("user_id", "token");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>

<dl>
<dd>

**token:** `String` — The full token string.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tokens.list(userId) -> List&lt;UserToken&gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Gets all tokens available for a :user_id
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tokens().list("user_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.users.tokens.delete(userId, token)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.users().tokens().delete("user_id", "token");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `String` — The user's ID. This can be any uniquely identifiable string.
    
</dd>
</dl>

<dl>
<dd>

**token:** `String` — The full token string.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
