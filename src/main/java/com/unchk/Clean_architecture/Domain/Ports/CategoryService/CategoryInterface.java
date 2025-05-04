package com.unchk.Clean_architecture.Domain.Ports.CategoryService;

import com.unchk.Clean_architecture.Domain.Entity.Category;

import java.util.List;

public interface CategoryInterface {

    public List <Category> listCategories();

}
