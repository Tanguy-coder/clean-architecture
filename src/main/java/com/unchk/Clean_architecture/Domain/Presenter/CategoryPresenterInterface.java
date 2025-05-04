package com.unchk.Clean_architecture.Domain.Presenter;

import com.unchk.Clean_architecture.Domain.Entity.Category;
import com.unchk.Clean_architecture.Domain.Response.CategoryListResponse;

import java.util.List;

public interface CategoryPresenterInterface {
    public List<CategoryListResponse> present(List<Category> categories);
}
