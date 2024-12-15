public class Hero{
    public String name;
    private int powerLevel;
    private Affiliation affiliation;
    
//constructor to initialize each hero’s attributes
    public Hero(String name, int powerLevel, Affiliation affiliation)
    {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;

    }

    //Getter methods for each attribute
    public String getName()
    {
        return name;

    }

    public int getPowerLevel()
    {
        return powerLevel;

    }

    public Affiliation getAffiliation()
    {
        return affiliation;
    }
//toString method that returns a string representation of the hero, including their name, power level, and affiliation
    public String toString(){
        return "Name:" + name + "\nPower Level:" + powerLevel + "\nAffiliation:" + affiliation ;

    }

    
}
