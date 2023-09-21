import java.util.ArrayList;


public class RecipeBook {
    private ArrayList<Recipe> recipes;

    public RecipeBook() {

        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void findName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getName().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(e);
                }
            }
        }
    }

    public void findTime(String cookTime) {
        if (this.recipes.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getCookTime() <= Integer.valueOf(cookTime)) {
                    System.out.println(e);
                }
            }
        }
    }

    public void findInhalt(String inhalt) {
        if (this.recipes.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Recipe e : this.recipes) {
                if (e.getInhalt().contains(inhalt.toLowerCase())) {
                    System.out.println(e);
                }
            }

        }
    }

    public void printRecipeBook() {
        for (Recipe e : this.recipes) {
            System.out.println(e);
        }
    }
}
