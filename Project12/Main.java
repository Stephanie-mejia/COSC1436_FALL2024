public class Main
{
    public static void main (String[]args){
        Hero hero1 = new Hero("Thor", 90, Affiliation.AVENGERS);
        Hero hero2 = new Hero("Superman", 90, Affiliation.JUSTICE_LEAGUE);
        Hero hero3 = new Hero("Wolverine", 80, Affiliation.X_MEN);
        Hero hero4 = new Hero("Invisible Woman", 85, Affiliation.FANTASTIC_FOUR);

        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);
        System.out.println(hero4);
    }
}