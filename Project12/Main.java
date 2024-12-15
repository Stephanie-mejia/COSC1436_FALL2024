public class Main
{
    public static void main (String[]args){
        //add heroes
        Hero hero1 = new Hero("Thor", 90, Affiliation.AVENGERS);
        Hero hero2 = new Hero("Superman", 90, Affiliation.JUSTICE_LEAGUE);
        Hero hero3 = new Hero("Wolverine", 80, Affiliation.X_MEN);
        Hero hero4 = new Hero("Invisible Woman", 85, Affiliation.FANTASTIC_FOUR);


        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);
        System.out.println(hero4);
        System.out.println();


        HeroManager manager = new HeroManager();
        manager.addHero(new Hero("Thor", 90, Affiliation.AVENGERS));
        manager.addHero(new Hero("Superman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 80, Affiliation.X_MEN));
        manager.addHero(new Hero("Invisible Woman", 85, Affiliation.FANTASTIC_FOUR));




//original list
        System.out.println("original Lists:");
        manager.displayHeroes();
//bubble sort
        System.out.println("\nBubble Sort by Power Level:");
        manager.bubbleSortByPowerLevel();
        manager.displayHeroes();
//insertion sort
        System.out.println("\nInsertion Sort by Power Level:");
        manager.insertionSortByPowerLevel();
        manager.displayHeroes();
//two dimensional array
        System.out.println("\nTwo Dimensional Array Display:");
        manager.displayHeroes2DArray();

//remove hero
        manager.removeHero("Thor");
        System.out.println("\nList After Removing Thor:");
        manager.displayHeroes();
//add hero
        manager.addHero(new Hero("Black Widow",90, Affiliation.AVENGERS));
        System.out.println("\nList After Adding Black Widow");
        manager.displayHeroes();


        


    }
}