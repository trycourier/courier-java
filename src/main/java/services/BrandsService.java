package services;

import models.Brand;
import models.BrandCreateBody;
import models.BrandUpdateBody;
import models.Brands;

import java.io.IOException;

public class BrandsService {
    private final BrandsInterface brandsInterface;

    public BrandsService() {
        brandsInterface = Courier.getRetrofit().create(BrandsInterface.class);
    }

    public Brands getBrands(
    ) throws IOException {
        return brandsInterface.getBrands(
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Brand getBrand(
            String brandId
    ) throws IOException {
        return brandsInterface.getBrand(
                brandId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Brand postBrand(
            BrandCreateBody brand
    ) throws IOException {
        return brandsInterface.postBrand(
                brand,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public Brand putBrand(
            String brandId,
            BrandUpdateBody brand
    ) throws IOException {
        return brandsInterface.putBrand(
                brandId,
                brand,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute().body();
    }

    public void deleteBrand(
            String brandId
    ) throws IOException {
        brandsInterface.deleteBrand(
                brandId,
                Courier.getAuthorizationHeader(),
                Courier.getUserAgent()
        ).execute();
    }
}
