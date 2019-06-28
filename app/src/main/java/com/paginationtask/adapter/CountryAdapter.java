package com.paginationtask.adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.paginationtask.R;
import com.paginationtask.api_module.CountryAPIResponse;

public class CountryAdapter extends PagedListAdapter<CountryAPIResponse.CountryList, CountryAdapter.MyViewHolder> {

    private Context context;

    @Override
    public int getItemCount() {
        return super.getItemCount();
    }

    public CountryAdapter(Context context) {
        super(DIFF_CALL_BACK);
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_country, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        CountryAPIResponse.CountryList countryList = getItem(position);
        if (countryList != null) {
            Glide.with(context).load(countryList.getCountryImageThumb()).into(myViewHolder.imageView);
            myViewHolder.tvName.setText(countryList.getCountryName());
        } else {
            Toast.makeText(context, "No Countries", Toast.LENGTH_LONG).show();
        }
    }

    private static DiffUtil.ItemCallback<CountryAPIResponse.CountryList> DIFF_CALL_BACK = new DiffUtil.ItemCallback<CountryAPIResponse.CountryList>() {
        @Override
        public boolean areItemsTheSame(@NonNull CountryAPIResponse.CountryList oldItem, @NonNull CountryAPIResponse.CountryList newItem) {
            return oldItem.getCountryId().equals(newItem.getCountryId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull CountryAPIResponse.CountryList oldItem, @NonNull CountryAPIResponse.CountryList newItem) {
            return oldItem.equals(newItem);
        }
    };

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgPhoto);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
