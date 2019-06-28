package com.paginationtask.api;


import com.paginationtask.api_module.CountryAPIResponse;
import com.paginationtask.api_module.PopularAPIResponse;
import com.paginationtask.utils.Urls;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST(Urls.COUNTRY)
    Call<CountryAPIResponse> country(@Field("page") int page);

    @FormUrlEncoded
    @POST(Urls.POPULAR)
    Call<PopularAPIResponse> popular(@Field("page") int page);

    }
