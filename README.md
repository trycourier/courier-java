# Courier Java SDK

Courier Java SDK supporting:
* Send API
* Messages API
* Profiles API
* Preferences API
* Events API
* Brands API
* Lists API

## Official Courier API docs

For a full description of request and response payloads and properties, please see the [official Courier API docs](https://docs.courier.com/reference).

## Installation

```xml
<dependency>
  <groupId>com.courier</groupId>
  <artifactId>courier-java</artifactId>
  <version>X.X.X</version>
  <scope>compile</scope>
</dependency>
````

## Configuration
`Courier.init(); // Reads authToken from environment, users Bearer Auth Scheme`

`Courier.init(baseUrl, authToken, username, password) // Explicitly override if necessary` 

Providing just a authorization token will generate a "Bearer" authorization header, 
while providing a username and password will generate a "Basic" (base64-encoded) authorization header.

Following Environment variables are supported -
* COURIER_AUTH_TOKEN
* COURIER_BASE_URL
* COURIER_AUTH_USERNAME
* COURIER_AUTH_USERNAME

Please note: COURIER_BASE_URL defaults to https://api.courier.com/

## Example

Send API
```
// Gets AuthToken from the Environment
Courier.init();

SendRequestBody sendRequestBody = new SendRequestBody();
sendRequestBody.setEvent("event");
sendRequestBody.setRecipient(UUID.randomUUID().toString());
HashMap<String, String> profile = new HashMap<>();
profile.put("phone_number", "+11234567890");
sendRequestBody.setProfile(new Gson().toJson(profile));

SendResponseBody sendResponseBody = new SendService().send(sendRequestBody);
System.out.println(sendResponseBody);
```

Example usages for all the APIs can be found in `src/main/java/example/CourierClientApp.java`

## License

[MIT License](http://www.opensource.org/licenses/mit-license.php)

## Author

[Courier](https://github.com/trycourier) ([support@courier.com](mailto:support@courier.com))