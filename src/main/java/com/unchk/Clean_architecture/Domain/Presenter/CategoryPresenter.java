package com.unchk.Clean_architecture.Domain.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.Category;
import com.unchk.Clean_architecture.Domain.Response.CategoryListResponse;

import java.util.List;

public class CategoryPresenter implements CategoryPresenterInterface{

    @Override
    public List<CategoryListResponse> present(List<Category> categories) {
        return categories.stream().map(category -> {
            CategoryListResponse categoryListResponse = new CategoryListResponse();
            categoryListResponse.setName(category.getName());
            categoryListResponse.setImage(category.getImage());
            return categoryListResponse;
        }).toList();
    }
}
