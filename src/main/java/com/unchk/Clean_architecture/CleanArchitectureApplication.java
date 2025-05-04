package com.unchk.Clean_architecture;

import com.unchk.Clean_architecture.Domain.Ports.CategoryService.CategoryInterface;
import com.unchk.Clean_architecture.Domain.Response.CategoryListResponse;
import com.unchk.Clean_architecture.Domain.UseCase.CategoryListUseCase;
import com.unchk.Clean_architecture.Infrastructure.Adapter.CategoryService;
import com.unchk.Clean_architecture.Infrastructure.Repositories.CategoryJPaRepository;
import com.unchk.Clean_architecture.Infrastructure.Repositories.CategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CleanArchitectureApplication {

	public static void main(String[] args) {

		SpringApplication.run(CleanArchitectureApplication.class, args);
	}

	@Bean
	public CategoryListUseCase categoryListUseCase(CategoryInterface categoryInterface){
		return new CategoryListUseCase(categoryInterface);
	}

	@Bean
	public CategoryService categoryService(CategoryRepository categoryRepository){
		return new CategoryService(categoryRepository);
	}

	@Bean
	public CategoryRepository categoryRepository(CategoryJPaRepository categoryJPaRepository){
		return new CategoryRepository(categoryJPaRepository);
	}

}
