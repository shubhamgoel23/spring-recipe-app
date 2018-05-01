package com.org.recipe.repositories;

import com.org.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

    Iterable<Recipe> findAllByOrderByIdAsc();
}
