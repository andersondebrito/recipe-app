package com.abo.recipe.repositories;

import com.abo.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Long> {
}
