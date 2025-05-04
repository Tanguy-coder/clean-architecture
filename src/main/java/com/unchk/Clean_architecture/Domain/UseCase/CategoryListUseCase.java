package com.unchk.Clean_architecture.Domain.UseCase;

import com.unchk.Clean_architecture.Domain.Entity.Category;
import com.unchk.Clean_architecture.Domain.Ports.CategoryService.CategoryInterface;

import java.util.List;

public class CategoryListUseCase implements CategoryListUseCaseInterface {
    private final CategoryInterface categoryInterface;

    public CategoryListUseCase(CategoryInterface categoryInterface) {
        this.categoryInterface = categoryInterface;
    }

    @Override
    public List<Category> execute() {
        return categoryInterface.listCategories();
    }
}
