package com.example.lenovo.newrecyclerview;

/**
 * Created by lenovo on 20-Dec-17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class PromotionAdapter extends RecyclerView.Adapter<PromotionAdapter.PromotionViewHolder> {



    private Context context;


    private List<Promotion> promotionList;


    public PromotionAdapter(Context context, List<Promotion> promotionList) {
        this.context = context;
        this.promotionList = promotionList;
    }

    @Override
    public PromotionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new PromotionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PromotionViewHolder holder, int position) {

        Promotion promotion = promotionList.get(position);

        holder.textViewTitle.setText(promotion.getTitle());
        holder.textViewShortDesc.setText(promotion.getShortdesc());
        holder.textViewCategory.setText(promotion.getCategory());
        holder.textViewSubcategory.setText(promotion.getSubcategory());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(promotion.getImage()));

    }


    @Override
    public int getItemCount() {
        return promotionList.size();
    }


    class PromotionViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle;
        TextView textViewShortDesc;
        TextView textViewCategory;
        TextView textViewSubcategory;
        ImageView imageView;

        public PromotionViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewCategory = itemView.findViewById(R.id.textViewCategory);
            textViewSubcategory = itemView.findViewById(R.id.textViewSubcategory);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
