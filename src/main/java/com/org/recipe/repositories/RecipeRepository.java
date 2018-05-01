package com.org.recipe.repositories;

import com.org.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

    Optional<Recipe> findByIdOrderByIngredientsIdAsc(Long aLong);

    Iterable<Recipe> findAllByOrderByIdAsc();
}
