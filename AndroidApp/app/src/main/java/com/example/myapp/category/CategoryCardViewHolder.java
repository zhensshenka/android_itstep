package com.example.myapp.category;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.R;

public class CategoryCardViewHolder extends RecyclerView.ViewHolder {
    private TextView categoryName;
    private TextView categoryDescription;
    private ImageView ivCategoryImage;

    public Button btnDelete;

    public CategoryCardViewHolder(@NonNull View itemView) {
        super(itemView);
        categoryName = itemView.findViewById(R.id.categoryName);
        categoryDescription = itemView.findViewById(R.id.categoryDescription);
        ivCategoryImage = itemView.findViewById(R.id.ivCategoryImage);
        btnDelete = itemView.findViewById(R.id.btnDelete);
    }

    public TextView getCategoryName() {
        return categoryName;
    }

    public TextView getCategoryDescription() {
        return categoryDescription;
    }

    public ImageView getIvCategoryImage() {
        return ivCategoryImage;
    }

    public Button getBtnDelete() {
        return btnDelete;
    }
}