package com.sayeem.recipe.Listeners;

import com.sayeem.recipe.Models.InstructionsResponse;

import java.util.List;

public interface InstructionsListener {
    void didFetch(List<InstructionsResponse> response, String message);

    void didError(String message);
}
