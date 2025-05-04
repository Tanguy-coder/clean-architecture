package com.unchk.Clean_architecture.Domain.UseCase;

import com.unchk.Clean_architecture.Domain.Entity.Category;

import java.util.List;

public interface CategoryListUseCaseInterface {

    public List<Category> execute();

}
