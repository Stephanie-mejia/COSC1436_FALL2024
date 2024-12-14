public class SuperheroRoster
{
    public static void main(String [] args)
    {
        //Superhero class and object array
        Superhero [] Superheros= {
            new Superhero("Iron Man","flying and high tech armor",90),
            new Superhero("black Widow","Stealth and combat",80),
            new Superhero("Captain America", "Shield and strenght", 90)
        };
        System.out.println("\nDisplaying Superheros using Superhero class:");

        for (Superhero Hero: Superheros)
        {
            System.out.println(Hero);
        }
        



        // declare and initialize arrays for superhero names, abilities, and power levels
        String [] heroNames = {"Hulk", "Thor", "Spider-Man"};
        String [] abilities = {"Strong and Big","Hammer and lightning","Webs"};
        int [] powerLevels = {70, 95, 80 };
        
        //print each hero's details using a loop
        for (int i = 0; i< heroNames.length; i++)
        {
            System.out.println("Name:" + heroNames[i] );
            System.out.println("Abilities:"+ abilities [i]);
            System.out.println("Power Levels:" + powerLevels[i]);
            System.out.println();
        }
        
        searchHero(heroNames, abilities, powerLevels,"Thor");

        //calculate average power level by calculateAveragePower method
        int sum = 0;
        for(int i =0; i< powerLevels.length; i++)
        {
            sum+= powerLevels[i];
        }
        double average = sum / (double)powerLevels.length ;
        System.out.println("Average:"+ average);
        
    }
        
        //call the searchHero method to find a specific hero by name
        public static void searchHero(String[] heroNames, String[] abilities, int [] powerLevels, String target)
        {
        for (int i= 0; i< heroNames.length; i++)
        {
            if (heroNames[i].equalsIgnoreCase(target))
            {
                System.out.println("Hero found:");
                System.out.println("Name:"+ heroNames[i]);
                System.out.println("Abilities:"+ abilities[i]);
                System.out.println("Power Levels:"+ powerLevels[i]);
                return;
            }
        }
        System.out.println("Hero not found.");
        

    }
}


