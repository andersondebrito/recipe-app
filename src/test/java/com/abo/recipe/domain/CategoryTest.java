package com.abo.recipe.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CategoryTest {

    Category category;

    @BeforeEach
    public  void setUp() {
        category = new Category();
    }

    @Test
    void setId() {
        Long idValue = 4l;

        category.setId(idValue);

        Assertions.assertEquals(idValue, category.getId());
    }

    @Test
    void setDescription() {
    }

    @Test
    void setRecipes() {
    }
}