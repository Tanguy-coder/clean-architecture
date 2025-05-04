package com.unchk.Clean_architecture.Domain.Getaway;

import com.unchk.Clean_architecture.Domain.Entity.Category;

import java.util.List;

public interface CategoryRepositoryInterface {
    public List<Category> listCategory();
}
