package com.paginationtask.api_module;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PopularAPIResponse {

    public class PopularArticle {

        @SerializedName("post_author")
        @Expose
        private String postAuthor;
        @SerializedName("post_date")
        @Expose
        private String postDate;
        @SerializedName("post_date_gmt")
        @Expose
        private String postDateGmt;
        @SerializedName("post_title")
        @Expose
        private String postTitle;
        @SerializedName("post_excerpt")
        @Expose
        private String postExcerpt;
        @SerializedName("post_status")
        @Expose
        private String postStatus;
        @SerializedName("comment_status")
        @Expose
        private String commentStatus;
        @SerializedName("ping_status")
        @Expose
        private String pingStatus;
        @SerializedName("post_password")
        @Expose
        private String postPassword;
        @SerializedName("post_name")
        @Expose
        private String postName;
        @SerializedName("to_ping")
        @Expose
        private String toPing;
        @SerializedName("pinged")
        @Expose
        private String pinged;
        @SerializedName("post_modified")
        @Expose
        private String postModified;
        @SerializedName("post_modified_gmt")
        @Expose
        private String postModifiedGmt;
        @SerializedName("post_content_filtered")
        @Expose
        private String postContentFiltered;
        @SerializedName("post_parent")
        @Expose
        private String postParent;
        @SerializedName("guid")
        @Expose
        private String guid;
        @SerializedName("menu_order")
        @Expose
        private String menuOrder;
        @SerializedName("post_type")
        @Expose
        private String postType;
        @SerializedName("post_mime_type")
        @Expose
        private String postMimeType;
        @SerializedName("comment_count")
        @Expose
        private Integer commentCount;
        @SerializedName("ideator")
        @Expose
        private Integer ideator;
        @SerializedName("bookmark_value")
        @Expose
        private Integer bookmarkValue;
        @SerializedName("like_value")
        @Expose
        private Integer likeValue;
        @SerializedName("author_name")
        @Expose
        private String authorName;
        @SerializedName("author_image")
        @Expose
        private String authorImage;
        @SerializedName("like_count")
        @Expose
        private Integer likeCount;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("cid")
        @Expose
        private String cid;
        @SerializedName("city_slug")
        @Expose
        private String citySlug;
        @SerializedName("post_sub_category")
        @Expose
        private String postSubCategory;
        @SerializedName("post_image")
        @Expose
        private String postImage;
        @SerializedName("bucket_status")
        @Expose
        private String bucketStatus;

        public String getPostAuthor() {
            return postAuthor;
        }

        public void setPostAuthor(String postAuthor) {
            this.postAuthor = postAuthor;
        }

        public String getPostDate() {
            return postDate;
        }

        public void setPostDate(String postDate) {
            this.postDate = postDate;
        }

        public String getPostDateGmt() {
            return postDateGmt;
        }

        public void setPostDateGmt(String postDateGmt) {
            this.postDateGmt = postDateGmt;
        }

        public String getPostTitle() {
            return postTitle;
        }

        public void setPostTitle(String postTitle) {
            this.postTitle = postTitle;
        }

        public String getPostExcerpt() {
            return postExcerpt;
        }

        public void setPostExcerpt(String postExcerpt) {
            this.postExcerpt = postExcerpt;
        }

        public String getPostStatus() {
            return postStatus;
        }

        public void setPostStatus(String postStatus) {
            this.postStatus = postStatus;
        }

        public String getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getPingStatus() {
            return pingStatus;
        }

        public void setPingStatus(String pingStatus) {
            this.pingStatus = pingStatus;
        }

        public String getPostPassword() {
            return postPassword;
        }

        public void setPostPassword(String postPassword) {
            this.postPassword = postPassword;
        }

        public String getPostName() {
            return postName;
        }

        public void setPostName(String postName) {
            this.postName = postName;
        }

        public String getToPing() {
            return toPing;
        }

        public void setToPing(String toPing) {
            this.toPing = toPing;
        }

        public String getPinged() {
            return pinged;
        }

        public void setPinged(String pinged) {
            this.pinged = pinged;
        }

        public String getPostModified() {
            return postModified;
        }

        public void setPostModified(String postModified) {
            this.postModified = postModified;
        }

        public String getPostModifiedGmt() {
            return postModifiedGmt;
        }

        public void setPostModifiedGmt(String postModifiedGmt) {
            this.postModifiedGmt = postModifiedGmt;
        }

        public String getPostContentFiltered() {
            return postContentFiltered;
        }

        public void setPostContentFiltered(String postContentFiltered) {
            this.postContentFiltered = postContentFiltered;
        }

        public String getPostParent() {
            return postParent;
        }

        public void setPostParent(String postParent) {
            this.postParent = postParent;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getMenuOrder() {
            return menuOrder;
        }

        public void setMenuOrder(String menuOrder) {
            this.menuOrder = menuOrder;
        }

        public String getPostType() {
            return postType;
        }

        public void setPostType(String postType) {
            this.postType = postType;
        }

        public String getPostMimeType() {
            return postMimeType;
        }

        public void setPostMimeType(String postMimeType) {
            this.postMimeType = postMimeType;
        }

        public Integer getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Integer commentCount) {
            this.commentCount = commentCount;
        }

        public Integer getIdeator() {
            return ideator;
        }

        public void setIdeator(Integer ideator) {
            this.ideator = ideator;
        }

        public Integer getBookmarkValue() {
            return bookmarkValue;
        }

        public void setBookmarkValue(Integer bookmarkValue) {
            this.bookmarkValue = bookmarkValue;
        }

        public Integer getLikeValue() {
            return likeValue;
        }

        public void setLikeValue(Integer likeValue) {
            this.likeValue = likeValue;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public String getAuthorImage() {
            return authorImage;
        }

        public void setAuthorImage(String authorImage) {
            this.authorImage = authorImage;
        }

        public Integer getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(Integer likeCount) {
            this.likeCount = likeCount;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getCitySlug() {
            return citySlug;
        }

        public void setCitySlug(String citySlug) {
            this.citySlug = citySlug;
        }

        public String getPostSubCategory() {
            return postSubCategory;
        }

        public void setPostSubCategory(String postSubCategory) {
            this.postSubCategory = postSubCategory;
        }

        public String getPostImage() {
            return postImage;
        }

        public void setPostImage(String postImage) {
            this.postImage = postImage;
        }

        public String getBucketStatus() {
            return bucketStatus;
        }

        public void setBucketStatus(String bucketStatus) {
            this.bucketStatus = bucketStatus;
        }

    }

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("totalcount")
    @Expose
    private Integer totalcount;
    @SerializedName("popular_articles")
    @Expose
    private List<PopularArticle> popularArticles = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public List<PopularArticle> getPopularArticles() {
        return popularArticles;
    }

    public void setPopularArticles(List<PopularArticle> popularArticles) {
        this.popularArticles = popularArticles;
    }

}
