package com.example.usercontrol_store;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    private Context mContext;
    private int mResource;

    public ProductAdapter(Context context, int resource, List<Product> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(mContext).inflate(mResource, parent, false);
        }
        Product currentProduct = getItem(position);
        ImageView imageView = itemView.findViewById(R.id.imageViewProduct);
        imageView.setImageResource(currentProduct.getImageResource());
        TextView textViewName = itemView.findViewById(R.id.textViewName);
        textViewName.setText(currentProduct.getName());
        TextView textViewPrice = itemView.findViewById(R.id.textViewPrice);
        textViewPrice.setText(String.format("Цена: %.0f грн", currentProduct.getPrice()));
        return itemView;
    }
}
