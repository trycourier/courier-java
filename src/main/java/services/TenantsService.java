package services;

import models.Tenant;
import models.TenantRequestBody;
import models.TenantsResponseBody;

import java.io.IOException;

public class TenantsService {
    private final TenantsInterface tenantsInterface;

    public TenantsService() {
        tenantsInterface = Courier.getRetrofit().create(TenantsInterface.class);
    }

    public Tenant getTenant(String tenantId) throws IOException {
        return tenantsInterface.getTenant(
                tenantId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
                ).execute().body();
    }

    public Tenant updateTenant(String tenantId, TenantRequestBody requestBody) throws IOException {
        return tenantsInterface.updateTenant(
                tenantId,
                requestBody,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public TenantsResponseBody getTenants(String limit, String cursor) throws IOException {
        return tenantsInterface.getTenants(
                limit,
                cursor,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public void deleteTenant(String tenantId) throws IOException {
        tenantsInterface.deleteTenant(
                tenantId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }
}
