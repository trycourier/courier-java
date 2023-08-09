package services;

import models.Tenant;
import models.TenantRequestBody;
import models.TenantsResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface TenantsInterface {
    @PUT("/tenants/{tenantId}")
    Call<Tenant> updateTenant(
            @Path("tenantId") String tenantId,
            @Body TenantRequestBody tenantRequestBody,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/tenants/{tenantId}")
    Call<Tenant> getTenant(
            @Path("tenantId") String tenantId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/tenants")
    Call<TenantsResponseBody> getTenants(
            @Query("limit") String limit,
            @Query("cursor") String cursor,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @DELETE("/tenants/{tenantId}")
    Call<Void> deleteTenant(
            @Path("tenantId") String tenantId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
