package com.paginationtask.utils;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

import com.paginationtask.api_module.CountryAPIResponse;

public class CountryViewModel extends ViewModel {

    public LiveData<PagedList<CountryAPIResponse.CountryList>> countryList;
    LiveData<PageKeyedDataSource<Integer, CountryAPIResponse.CountryList>> liveDataSource;

    public CountryViewModel()
    {
        DataSourceCountryFactory countryFactory = new DataSourceCountryFactory();
        liveDataSource = countryFactory.getCountryLiveDataSource();

        PagedList.Config config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(false)
                .build();

        countryList = (new LivePagedListBuilder(countryFactory,config))
                .build();
    }
}
