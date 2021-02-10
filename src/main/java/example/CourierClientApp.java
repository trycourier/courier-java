package example;

import com.google.gson.Gson;
import models.*;
import services.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class CourierClientApp {
    public static void main(String[] args) throws IOException {
        // Reads from Environment
        Courier.init();

        /*
        Send API
         */
        SendRequestBody sendRequestBody = new SendRequestBody();
        sendRequestBody.setEvent("TEST_WELCOME");
        sendRequestBody.setRecipient(UUID.randomUUID().toString());
        HashMap<String, String> profile = new HashMap<>();
        profile.put("phone_number", "+16147793748");
        sendRequestBody.setProfile(new Gson().toJson(profile));

        SendResponseBody sendResponseBody1 = new SendService().send(sendRequestBody);
        System.out.println(sendResponseBody1);

        SendResponseBody idempotentSend = new SendService()
                .sendIdempotent(sendRequestBody, UUID.randomUUID().toString());
        System.out.println(idempotentSend);

        SendListRequestBody sendListRequestBody = new SendListRequestBody();
        sendListRequestBody.setList("tejas.list.test");
        sendListRequestBody.setEvent("TEST_WELCOME");

        SendResponseBody sendResponseBody2 = new SendService().sendToList(sendListRequestBody);
        System.out.println(sendResponseBody2);

        /*
        Messages API
         */
        Message message = new MessagesService().getMessage("1-60178fe6-575a25580d6d6a7f78b0e9c7");
        System.out.println(message);

        Messages messages = new MessagesService()
                .getMessages(null,
                        null,
                        null,
                        null,
                        null,
                        null
                );
        System.out.println(messages);

        MessageHistory messageHistory = new MessagesService()
                .getMessageHistory(
                        "1-60178fe6-575a25580d6d6a7f78b0e9c7",
                        null
                );
        System.out.println(messageHistory);

        /*
        Events API
         */
        Event event = new EventsService()
                .getEvent("TEST_WELCOME");
        System.out.println(event);

        Events events = new EventsService()
                .getEvents();
        System.out.println(events);

        Event newEventRequest = new Event();
        newEventRequest.setId("JRV6HF5HD6MHE6HD12B4B74YPEWP");
        newEventRequest.setType("notification");
        Event newEventResponse = new EventsService()
                .putEvent("WELCOME_BACK", newEventRequest);
        System.out.println(newEventResponse);

        /*
        Brands API
         */
        BrandCreateBody brandCreateBody = new BrandCreateBody();
        brandCreateBody.setName("tejas-test");
        Settings settings = new Settings();
        Colors colors = new Colors();
        colors.setPrimary("blue");
        settings.setColors(colors);
        brandCreateBody.setSettings(settings);
        Snippets snippets = new Snippets();
        SnippetItem snippetItem = new SnippetItem();
        snippetItem.setName("foo");
        snippetItem.setValue("bar");
        snippetItem.setFormat("handlebars");
        ArrayList<SnippetItem> snippetItems = new ArrayList<>();
        snippetItems.add(snippetItem);
        snippets.setItems(snippetItems);
        brandCreateBody.setSnippets(snippets);
        Brand brand = new BrandsService()
                .postBrand(brandCreateBody);
        System.out.println(brand);

        Brand myBrand = new BrandsService()
                .getBrand(brand.getId());
        System.out.println(myBrand);

        Brands brands = new BrandsService()
                .getBrands();
        System.out.println(brands);

        BrandUpdateBody brandUpdateBody = new BrandUpdateBody();
        brandUpdateBody.setName("tejas-test-updated");
        Settings updatedSettings = myBrand.getSettings();
        Colors updatedColors = updatedSettings.getColors();
        updatedColors.setPrimary("red");
        updatedSettings.setColors(updatedColors);
        brandUpdateBody.setSettings(updatedSettings);
        Brand myBrandUpdated = new BrandsService()
                .putBrand(myBrand.getId(), brandUpdateBody);
        System.out.println(myBrandUpdated);

        new BrandsService().deleteBrand(myBrand.getId());

        /*
        Preferences API
         */
        Preferences preferences = new PreferencesService()
                .getPreferences();
        System.out.println(preferences);

        // Assuming categoryId GG6QK23WS5MEXEQ7832W6ZVBKBS8 exists
        // Assuming notificationId WPK2HQ07FXMGT7MH8JVXEZEFZ2G8 exists
        Preference newPreference = new Preference();
        HashMap<String, Object> categoriesMap = new HashMap<>();
        categoriesMap.put("GG6QK23WS5MEXEQ7832W6ZVBKBS8", new Object());
        HashMap<String, Object> notificationsMap = new HashMap<>();
        notificationsMap.put("WPK2HQ07FXMGT7MH8JVXEZEFZ2G8", new Object());
        newPreference.setCategories(categoriesMap);
        newPreference.setNotifications(notificationsMap);
        UpdateResponseBody preferenceUpdateResponseBody = new PreferencesService()
                .putPreference(
                        "hello@example.com",
                        newPreference
                );
        System.out.println(preferenceUpdateResponseBody);

        Preference preference = new PreferencesService()
                .getPreference("hello@example.com");
        System.out.println(preference);

        /*
        Profiles API
         */
        Profile myProfile = new Profile();
        HashMap<String, String> details = new HashMap<>();
        details.put("email", "foo@bar.com");
        details.put("phone_number", "123456789");
        myProfile.setProfile(details);
        UpdateResponseBody postResponseBody = new ProfilesService()
                .postProfile("5ed558d4-d2eb-4e0f-984a-81a0f04054b1", myProfile);
        System.out.println(postResponseBody);

        Profile retrievedProfile = new ProfilesService()
                .getProfile("5ed558d4-d2eb-4e0f-984a-81a0f04054b1");
        System.out.println(retrievedProfile);

        PatchRequestBody profilePatch = new PatchRequestBody();
        List<PatchOperation> patchOps = new ArrayList<>();
        PatchOperation patchOperation = new PatchOperation();
        patchOperation.setOp("replace");
        patchOperation.setPath("/email");
        patchOperation.setValue("bar@foo.com");
        patchOps.add(patchOperation);
        profilePatch.setPatch(patchOps);
        UpdateResponseBody patchResponseBody = new ProfilesService()
                .patchProfile("5ed558d4-d2eb-4e0f-984a-81a0f04054b1", profilePatch);
        System.out.println(patchResponseBody);

        Profile myUpdatedProfile = new Profile();
        HashMap<String, String> updatedDetails = new HashMap<>();
        updatedDetails.put("email", "foo@bar.com");
        updatedDetails.put("phone_number", "123456789");
        myUpdatedProfile.setProfile(updatedDetails);
        UpdateResponseBody putResponseBody = new ProfilesService()
                .putProfile("5ed558d4-d2eb-4e0f-984a-81a0f04054b1", myUpdatedProfile);
        System.out.println(putResponseBody);

        ProfileLists profileLists = new ProfilesService()
                .getProfileLists("5ed558d4-d2eb-4e0f-984a-81a0f04054b1", null);
        System.out.println(profileLists);

        /*
        Lists API
         */
        PureLists lists = new ListsService()
                .getLists(null, null);
        System.out.println(lists);

        models.List list = new ListsService()
                .getList("tejas.list.test");
        System.out.println(list);

        ListUpdateBody listUpdateBody = new ListUpdateBody();
        listUpdateBody.setName("Updated list name");
        new ListsService().putList("tejas.list.test", listUpdateBody);

        new ListsService().deleteList("tejas.list.test");

        new ListsService().restoreList("tejas.list.test");

        ListSubscriptions listSubscriptions = new ListsService()
                .getListSubscriptions("tejas.list.test", null);
        System.out.println(listSubscriptions);

        ListBulkSubscriptionUpdate bulkSubscriptionUpdate = new ListBulkSubscriptionUpdate();
        Recipient recipient = new Recipient();
        recipient.setRecipientId("5ed558d4-d2eb-4e0f-984a-81a0f04054b1");
        List<Recipient> recipients = new ArrayList<>();
        recipients.add(recipient);
        bulkSubscriptionUpdate.setRecipients(recipients);
        new ListsService()
                .bulkSubscribeRecipientToList("tejas.list.test", bulkSubscriptionUpdate);

        new ListsService()
                .unsubscribeRecipientFromList("tejas.list.test", "5ed558d4-d2eb-4e0f-984a-81a0f04054b1");

        new ListsService()
                .subscribeRecipientToList("tejas.list.test", "5ed558d4-d2eb-4e0f-984a-81a0f04054b1");
    }
}
