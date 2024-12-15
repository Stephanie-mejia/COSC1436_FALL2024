public class Hero{
    public String name;
    private int powerLevel;
    private Affiliation affiliation;

    public Hero(String name, int powerLevel, Affiliation affiliation)
    {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;

    }
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

    public String toString(){
        return "Name:" + name + "\n" + "Power Level:" + powerLevel + "\n" + "Affiliation:" + affiliation ;
    }

    
}
