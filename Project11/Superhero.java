//Superhero class with name , abilities, power levels attributes 
public class Superhero
{
    String heroNames;
    String abilities;
    int powerLevels;

    public Superhero(String heroNames, String abilities, int powerLevels){
        this.heroNames= heroNames;
        this.abilities= abilities;
        this.powerLevels= powerLevels;
    }
    //constructor to initialize attributes and displayHero method to print heros details
    public String toString()
    {
        return      "Name:" + heroNames +
        "\n" + "Abilities:" + abilities +
        "\n" + "Power Levels:" + powerLevels + "\n";

    }

}