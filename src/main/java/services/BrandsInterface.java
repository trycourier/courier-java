package services;

import models.Brand;
import models.BrandCreateBody;
import models.BrandUpdateBody;
import models.Brands;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface BrandsInterface {
    @GET("/brands")
    Call<Brands> getBrands(
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @GET("/brands/{brandId}")
    Call<Brand> getBrand(
            @Path("brandId") String brandId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @POST("/brands")
    Call<Brand> postBrand(
            @Body BrandCreateBody brand,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @PUT("/brands/{brandId}")
    Call<Brand> putBrand(
            @Path("brandId") String brandId,
            @Body BrandUpdateBody brand,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );

    @DELETE("/brands/{brandId}")
    Call<Void> deleteBrand(
            @Path("brandId") String brandId,
            @Header("Authorization") String authorization,
            @Header("User-Agent") String userAgent
    );
}
