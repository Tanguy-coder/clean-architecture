package com.unchk.Clean_architecture.Infrastructure.Repositories;

import com.unchk.Clean_architecture.Domain.Entity.Category;
import com.unchk.Clean_architecture.Domain.Entity.Product;
import com.unchk.Clean_architecture.Domain.Getaway.CategoryRepositoryInterface;

import java.util.List;

public class CategoryRepository implements CategoryRepositoryInterface {
    private CategoryJPaRepository categoryJPaRepository;

    public CategoryRepository(CategoryJPaRepository categoryJPaRepository) {
        this.categoryJPaRepository = categoryJPaRepository;
    }

    @Override
    public List<Category> listCategory() {

        return this.categoryJPaRepository.findAll().stream().map(model ->{
            Category category = new Category();
            category.setName("Test");
            category.setImage("https://placehold.co/600x400");
            category.setId(1L);
//            category.setCreatedAt(model.getCreatedAt());
//            category.setUpdatedAt(model.getUpdatedAt());
            return category;
        }).toList();

    }
}
