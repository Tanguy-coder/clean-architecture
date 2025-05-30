package com.unchk.Clean_architecture.Infrastructure.Controller.Category;

import com.unchk.Clean_architecture.Domain.Entity.Category;
import com.unchk.Clean_architecture.Domain.Presenter.CategoryPresenterInterface;
import com.unchk.Clean_architecture.Domain.Response.CategoryListResponse;
import com.unchk.Clean_architecture.Domain.UseCase.CategoryListUseCaseInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private CategoryListUseCaseInterface categoryListUseCaseInterface;
    private CategoryPresenterInterface categoryPresenterInterface;



    public CategoryController(CategoryListUseCaseInterface categoryListUseCaseInterface
//                              CategoryPresenterInterface categoryPresenterInterface
    ) {
        this.categoryListUseCaseInterface = categoryListUseCaseInterface;
//        this.categoryPresenterInterface = categoryPresenterInterface;
    }
    @GetMapping("/all")
    public List <Category> listeCategories(){
        List<Category> categories = this.categoryListUseCaseInterface.execute();
//        return this.categoryPresenterInterface.present(categories);
        return categories;


//        return this.categoryPresenterInterface.present(this.categoryListUseCaseInterface.execute());


    }
}
