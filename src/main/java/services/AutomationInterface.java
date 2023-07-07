package services;

import models.AutomationAdhocRequestBody;
import models.AutomationResponseBody;
import models.AutomationTemplateRequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AutomationInterface {
    @POST("/automations/invoke")
    Call<AutomationResponseBody> runAdhocAutomation(
            @Body AutomationAdhocRequestBody automationAdhocRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @POST("/automations/{templateId}/invoke")
    Call<AutomationResponseBody> runTemplatedAutomation(
            @Path("templateId") String templateId,
            @Body AutomationTemplateRequestBody automationTemplateRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
