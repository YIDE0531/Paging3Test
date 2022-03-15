package com.example.android.codelabs.paging.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android.codelabs.paging.R
import com.example.android.codelabs.paging.data.SfccCategoriesResponseEntity

class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val description: ImageView = view.findViewById(R.id.productDetailBrandItemProductAdapter_productLeftImageView)
    private val description2: TextView = view.findViewById(R.id.productDetailBrandItemProductAdapter_productLeftTextView)
    private val priceView: TextView = view.findViewById(R.id.productDetailBrandItemProductAdapter_priceLeftTextView)
    private val originalPriceView: TextView = view.findViewById(R.id.productDetailBrandItemProductAdapter_originalPriceLeftTextView)

    fun bind(rowsBean: SfccCategoriesResponseEntity.DataBean.RowsBean.ProductsBean) {
        Glide.with(description.context)
            .load(rowsBean.images.medium)
            .into(description)

        description2.text = rowsBean.name
        priceView.text = rowsBean.salesePrice
        originalPriceView.text = rowsBean.listPrice
    }

    companion object {
        fun create(parent: ViewGroup): ProductViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_product_list_item_square, parent, false)
            return ProductViewHolder(view)
        }
    }
}
