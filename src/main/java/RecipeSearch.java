

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeBook recipeList = new RecipeBook();

        System.out.print("File to read: ");

        String fileName = scanner.nextLine();

        try(Scanner fileScan = new Scanner(Paths.get(fileName))){

            ArrayList<String> lines = new ArrayList<>();

            while (fileScan.hasNextLine()){
               String line = fileScan.nextLine();
               if(line.trim().isEmpty() || !fileScan.hasNextLine()){
                   String name = lines.get(0);
                   int time = Integer.valueOf(lines.get(1));
                   ArrayList<String> inhaltList = new ArrayList<>();
                   for (int i = 2; i< lines.size(); i++){
                       inhaltList.add(lines.get(i).toLowerCase());
                   }
                   recipeList.addRecipe(new Recipe(name, time, inhaltList));

                   lines.removeAll(lines);
               }else {
                   lines.add(line);
               }
           }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        UserInterface user = new UserInterface(scanner, recipeList);
        user.start();

    }

}
