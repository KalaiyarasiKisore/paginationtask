package com.paginationtask.api_module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CountryAPIResponse {

    public class CountryList {

        @SerializedName("term_group")
        @Expose
        private Integer termGroup;
        @SerializedName("country_image")
        @Expose
        private String countryImage;
        @SerializedName("country_image_thumb")
        @Expose
        private String countryImageThumb;
        @SerializedName("country_id")
        @Expose
        private Integer countryId;
        @SerializedName("country_name")
        @Expose
        private String countryName;
        @SerializedName("country_slug")
        @Expose
        private String countrySlug;
        @SerializedName("city_status")
        @Expose
        private Integer cityStatus;

        public Integer getTermGroup() {
            return termGroup;
        }

        public void setTermGroup(Integer termGroup) {
            this.termGroup = termGroup;
        }

        public String getCountryImage() {
            return countryImage;
        }

        public void setCountryImage(String countryImage) {
            this.countryImage = countryImage;
        }

        public String getCountryImageThumb() {
            return countryImageThumb;
        }

        public void setCountryImageThumb(String countryImageThumb) {
            this.countryImageThumb = countryImageThumb;
        }

        public Integer getCountryId() {
            return countryId;
        }

        public void setCountryId(Integer countryId) {
            this.countryId = countryId;
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getCountrySlug() {
            return countrySlug;
        }

        public void setCountrySlug(String countrySlug) {
            this.countrySlug = countrySlug;
        }

        public Integer getCityStatus() {
            return cityStatus;
        }

        public void setCityStatus(Integer cityStatus) {
            this.cityStatus = cityStatus;
        }

    }

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("totalcount")
    @Expose
    private Integer totalcount;
    @SerializedName("country_list")
    @Expose
    private List<CountryList> countryList = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public List<CountryList> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<CountryList> countryList) {
        this.countryList = countryList;
    }

}
