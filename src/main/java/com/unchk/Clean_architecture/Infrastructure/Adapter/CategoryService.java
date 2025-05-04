package com.unchk.Clean_architecture.Infrastructure.Adapter;

import com.unchk.Clean_architecture.Domain.Entity.Category;
import com.unchk.Clean_architecture.Domain.Ports.CategoryService.CategoryInterface;
import com.unchk.Clean_architecture.Infrastructure.Repositories.CategoryRepository;

import java.util.List;

public class CategoryService implements CategoryInterface {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> listCategories() {
        return categoryRepository.listCategory();
    }
}
