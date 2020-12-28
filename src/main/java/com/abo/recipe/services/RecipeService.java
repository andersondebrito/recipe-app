package com.abo.recipe.services;

import com.abo.recipe.commands.RecipeCommand;
import com.abo.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
