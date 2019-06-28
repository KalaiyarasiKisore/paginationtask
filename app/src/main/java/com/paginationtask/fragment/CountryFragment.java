package com.paginationtask.fragment;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.paginationtask.R;
import com.paginationtask.adapter.CountryAdapter;
import com.paginationtask.api_module.CountryAPIResponse;
import com.paginationtask.utils.CountryViewModel;

public class CountryFragment extends Fragment {

    RecyclerView recyclerView;
    Activity activity;

    public CountryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.country_list, container, false);
        recyclerView = rootView.findViewById(R.id.rv_country);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        //recyclerView.setHasFixedSize(true);

        CountryViewModel countryViewModel = ViewModelProviders.of(this).get(CountryViewModel.class);

        final CountryAdapter adapter = new CountryAdapter(activity);

        countryViewModel.countryList.observe((LifecycleOwner) activity, new Observer<PagedList<CountryAPIResponse.CountryList>>() {
            @Override
            public void onChanged(@Nullable PagedList<CountryAPIResponse.CountryList> countryLists) {
                adapter.submitList(countryLists);
            }
        });

        recyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (Activity) context;
    }
}
