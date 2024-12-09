package com.sayeem.recipe.Listeners;

import com.sayeem.recipe.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response, String message);

    void didError(String message);
}
