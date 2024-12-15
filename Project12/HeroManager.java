import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager
{
    public ArrayList<Hero> heroes= new ArrayList<Hero>();
    //add a hero to the list
    public void addHero(Hero hero)
    {
        heroes.add(hero);
        
    }

//remove hero
    public void removeHero(String name)
    {
        heroes.removeIf(hero -> hero.getName().equals(name));
    }


//bubble sort
    public void bubbleSortByPowerLevel()
    {
        for(int i = 0; i< heroes.size() - 1; i++)
        {
            for (int j=0; j < heroes.size() - i - 1; j++)
            {
                
                if(heroes.get(j).getPowerLevel()> heroes.get(j + 1).getPowerLevel())
                {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j+1));
                    heroes.set(j+1, temp);

                }
            }
                     
        }
        
    }
//insertion sort
    public void insertionSortByPowerLevel()
    {
        for (int i = 1; i<heroes.size(); i++)
        {
            Hero key = heroes.get(i);
            int j = i - 1;

            while(j>=0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()){
                heroes.set(j+1, heroes.get(j));
                j--;
            }
            heroes.set(j+1, key);


        }

    }
//2D array 
    public void displayHeroes2DArray()
    {
        String[][] heroesArray = new String[heroes.size()][3];

        for(int i = 0; i < heroes.size(); i++){
            heroesArray[i][0] = heroes.get(i).getName();
            heroesArray[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            heroesArray[i][2] = heroes.get(i).getAffiliation().toString();
        }

        System.out.println(Arrays.deepToString(heroesArray));
    }

    public void displayHeroes(){
        for(int i = 0; i< heroes.size(); i++)
        System.out.println(heroes.get(i));
    }

}