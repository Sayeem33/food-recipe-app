package com.sayeem.recipe.Listeners;

import com.sayeem.recipe.Models.RandomRecipeApiResponse;

public interface RandomRecipesResponseListener {
    void didFetch(RandomRecipeApiResponse response, String message);

    void didError(String message);
}
