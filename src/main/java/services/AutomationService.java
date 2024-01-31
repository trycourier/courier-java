package services;

import models.AutomationAdhocRequestBody;
import models.AutomationResponseBody;
import models.AutomationTemplateRequestBody;

import java.io.IOException;

public class AutomationService {
    private final AutomationInterface automationInterface;

    public AutomationService() {
        automationInterface = Courier.getRetrofit().create(AutomationInterface.class);
    }

    public AutomationResponseBody runAdhocAutomation(AutomationAdhocRequestBody automationAdhocRequestBody) throws IOException {
        return automationInterface.runAdhocAutomation(automationAdhocRequestBody, Courier.getAuthorizationHeader(), Courier.getUserAgent()).execute().body();
    }

    public AutomationResponseBody runTemplatedAutomation(String templateId, AutomationTemplateRequestBody automationTemplateRequestBody) throws IOException {
        return automationInterface.runTemplatedAutomation(templateId, automationTemplateRequestBody, Courier.getAuthorizationHeader(), Courier.getUserAgent()).execute().body();
    }

    public AutomationResponseBody runTemplatedAutomationIdempotent(String templateId, AutomationTemplateRequestBody automationTemplateRequestBody, String idempotencyKey) throws IOException {
        return automationInterface.runTemplatedAutomationIdempotent(templateId, automationTemplateRequestBody, Courier.getAuthorizationHeader(), Courier.getUserAgent(), idempotencyKey).execute().body();
    }
}
