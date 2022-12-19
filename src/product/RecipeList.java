package product;

import java.util.HashMap;

public class RecipeList {
    private final HashMap<Recipe, Double> recipes = new HashMap<>();

    public RecipeList() {
    }

    public void addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe)) {
            throw new IllegalArgumentException("В списке уже есть " + recipe.getName());
        }
                recipes.put(recipe, recipe.getCount());
        System.out.println("Вы добавили " + recipe.getName());

    }

    public void remove(Recipe recipe) {
        recipes.remove(recipe);
        System.out.println("Убрали из списка " + recipe.getName());
    }

    @Override
    public String toString() {
        return   "В списке рецептов: " + recipes;
    }

}
