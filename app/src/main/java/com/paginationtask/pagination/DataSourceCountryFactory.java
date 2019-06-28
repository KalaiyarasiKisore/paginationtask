package com.paginationtask.pagination;


import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.paginationtask.api_module.CountryAPIResponse;
import com.paginationtask.pagination.CountryDataSource;

public class DataSourceCountryFactory extends DataSource.Factory {
    private MutableLiveData<PageKeyedDataSource<Integer, CountryAPIResponse.CountryList>> countryLiveDataSource = new
            MutableLiveData<>();



    public MutableLiveData<PageKeyedDataSource<Integer, CountryAPIResponse.CountryList>> getCountryLiveDataSource() {
        return countryLiveDataSource;
    }

    @NonNull
    @Override
    public DataSource<Integer, CountryAPIResponse.CountryList> create() {
        CountryDataSource countryDataSource = new CountryDataSource();
        countryLiveDataSource.postValue(countryDataSource);
        return countryDataSource;

    }
}
