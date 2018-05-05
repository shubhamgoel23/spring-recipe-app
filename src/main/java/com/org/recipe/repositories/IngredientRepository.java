package com.org.recipe.repositories;

import com.org.recipe.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {


    Optional<Ingredient> findByRecipeIdAndId(Long recipeId, Long ingredientId);
}
