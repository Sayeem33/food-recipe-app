package com.sayeem.recipe.Listeners;

import com.sayeem.recipe.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {
    void didFetch(List<SimilarRecipeResponse> response, String message);

    void didError(String message);
}
