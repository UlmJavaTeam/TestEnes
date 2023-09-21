import java.util.Scanner;

public class UserInterface {
    private RecipeBook recipeList;
    private Scanner scanner;

    public UserInterface (Scanner scanner, RecipeBook recipes){
        this.scanner = scanner;
        this.recipeList = recipes;
    }
    public void start(){
        System.out.println("Commands:" + "\n"
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");
        boolean loop = true;
        while(loop){
            System.out.println("Enter commands: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    loop = false;
                    break;
                case "list":
                    System.out.println("Recipes: ");
                    recipeList.printRecipeBook();
                    break;
                case "find name":
                    System.out.println("Search word: ");
                    String word = scanner.nextLine();
                    recipeList.findName(word);
                    break;
                case "find cooking time":
                    System.out.println("Search word");
                    word = scanner.nextLine();
                    recipeList.findTime(word);
                    break;
                case "find ingredient":
                    System.out.println("Search word: ");
                     word = scanner.nextLine();
                    recipeList.findInhalt(word);
                    break;
                default:
                    System.out.println("Not found, please try again!!!");
            }

        }

    }
}
