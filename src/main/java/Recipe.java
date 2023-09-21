import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> inhalt;

    public Recipe(String name, int cookTime, ArrayList<String> inhalt) {
        this.name = name;
        this.cookTime = cookTime;
        this.inhalt = inhalt;
    }

    public String getName() {
        return name;
    }
    public int getCookTime(){
        return cookTime;
    }

    public ArrayList<String> getInhalt() {
        return inhalt;
    }

    @Override
    public String toString() {
       return this.name + ", cooking time:" + this.cookTime;
    }
}
