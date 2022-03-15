package com.example.android.codelabs.paging.data;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class SfccCategoriesResponseEntity extends BaseEntity {

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private List<RowsBean> rows;

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean implements Serializable {
            private PaginationBean pagination;
            @SerializedName("category_id")
            private String categoryId;
            @SerializedName("category_name")
            private String categoryName;
            private List<ProductsBean> products;

            public PaginationBean getPagination() {
                return pagination;
            }

            public void setPagination(PaginationBean pagination) {
                this.pagination = pagination;
            }

            public String getCategoryId() {
                return categoryId;
            }

            public void setCategoryId(String categoryId) {
                this.categoryId = categoryId;
            }

            public String getCategoryName() {
                return categoryName;
            }

            public void setCategoryName(String categoryName) {
                this.categoryName = categoryName;
            }

            public List<ProductsBean> getProducts() {
                return products;
            }

            public void setProducts(List<ProductsBean> products) {
                this.products = products;
            }

            public static class PaginationBean implements Serializable {

                @SerializedName("per_page")
                private int perPage;
                private int current;
                @SerializedName("total_page")
                private int totalPage;
                private int prev;
                private int next;

                public int getPerPage() {
                    return perPage;
                }

                public void setPerPage(int perPage) {
                    this.perPage = perPage;
                }

                public int getCurrent() {
                    return current;
                }

                public void setCurrent(int current) {
                    this.current = current;
                }

                public int getTotalPage() {
                    return totalPage;
                }

                public void setTotalPage(int totalPage) {
                    this.totalPage = totalPage;
                }

                public int getPrev() {
                    return prev;
                }

                public void setPrev(int prev) {
                    this.prev = prev;
                }

                public int getNext() {
                    return next;
                }

                public void setNext(int next) {
                    this.next = next;
                }
            }

            public static class ProductsBean implements Serializable {

                private String name;
                @SerializedName("list_price")
                private String listPrice;
                @SerializedName("salese_price")
                private String salesePrice;
                @SerializedName("callout_message")
                private String calloutMessage;
                private ImagesBean images;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getListPrice() {
                    return listPrice;
                }

                public void setListPrice(String listPrice) {
                    this.listPrice = listPrice;
                }

                public String getSalesePrice() {
                    return salesePrice;
                }

                public void setSalesePrice(String salesePrice) {
                    this.salesePrice = salesePrice;
                }

                public String getCalloutMessage() {
                    return calloutMessage;
                }

                public void setCalloutMessage(String calloutMessage) {
                    this.calloutMessage = calloutMessage;
                }

                public ImagesBean getImages() {
                    return images;
                }

                public void setImages(ImagesBean images) {
                    this.images = images;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class ImagesBean implements Serializable {

                    private String medium;
                    private String thumbnail;

                    public String getMedium() {
                        return medium;
                    }

                    public void setMedium(String medium) {
                        this.medium = medium;
                    }

                    public String getThumbnail() {
                        return thumbnail;
                    }

                    public void setThumbnail(String thumbnail) {
                        this.thumbnail = thumbnail;
                    }
                }
            }
        }
    }
}
