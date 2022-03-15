package com.example.android.codelabs.paging.data;

import com.google.gson.annotations.SerializedName;

public class SfccCategoriesRequestEntity extends BaseEntity {

    @SerializedName("category_id")
    private String categoryId;
    private int page;
    @SerializedName("per_page")
    private int perPage;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

}
