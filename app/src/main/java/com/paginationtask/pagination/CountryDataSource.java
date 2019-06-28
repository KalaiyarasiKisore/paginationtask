package com.paginationtask.pagination;

import androidx.annotation.NonNull;
import androidx.paging.PageKeyedDataSource;

import com.paginationtask.api.APIConfiguration;
import com.paginationtask.api.ApiInterface;
import com.paginationtask.api_module.CountryAPIResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryDataSource extends PageKeyedDataSource<Integer, CountryAPIResponse.CountryList> {

    public static final int PAGE_SIZE = 0;
    public static final int FIRST_PAGE = 1;
    public static int PAGE_COUNT;

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull final LoadInitialCallback<Integer, CountryAPIResponse.CountryList> callback) {
        ApiInterface apiInterface = APIConfiguration.getClient().create(ApiInterface.class);
        final Call<CountryAPIResponse> call = apiInterface.country(FIRST_PAGE);
        call.enqueue(new Callback<CountryAPIResponse>() {
            @Override
            public void onResponse(Call<CountryAPIResponse> call, Response<CountryAPIResponse> response) {
                if (response.body() != null) {
                    callback.onResult(response.body().getCountryList(), null, FIRST_PAGE + 1);
                    PAGE_COUNT = response.body().getTotalcount();
                }
            }

            @Override
            public void onFailure(Call<CountryAPIResponse> call, Throwable t) {

            }
        });

    }

    @Override
    public void loadBefore(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, CountryAPIResponse.CountryList> callback) {
        ApiInterface apiInterface = APIConfiguration.getClient().create(ApiInterface.class);
        final Call<CountryAPIResponse> call = apiInterface.country(params.key);
        call.enqueue(new Callback<CountryAPIResponse>() {
            @Override
            public void onResponse(Call<CountryAPIResponse> call, Response<CountryAPIResponse> response) {

                if (response.body() != null) {
                    Integer key = (params.key > 1) ? params.key - 1 : null;
                    callback.onResult(response.body().getCountryList(), key);
                }
            }

            @Override
            public void onFailure(Call<CountryAPIResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadAfter(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, CountryAPIResponse.CountryList> callback) {
        ApiInterface apiInterface = APIConfiguration.getClient().create(ApiInterface.class);
        final Call<CountryAPIResponse> call = apiInterface.country(params.key);
        call.enqueue(new Callback<CountryAPIResponse>() {
            @Override
            public void onResponse(Call<CountryAPIResponse> call, Response<CountryAPIResponse> response) {

                if (response.body() != null) {
                    Integer key = params.key.equals(PAGE_COUNT) ? null : params.key + 1;
                    callback.onResult(response.body().getCountryList(), key);
                }
            }

            @Override
            public void onFailure(Call<CountryAPIResponse> call, Throwable t) {

            }
        });
    }
}
