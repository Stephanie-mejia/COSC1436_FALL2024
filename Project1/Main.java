import java.util.Scanner;

public class Main{
    private static InventoryManager manager;

    public static void main( String[] args){
       
        manager = new InventoryManager();
        manager.loadData("availableInventory.txt", "soldOutInventory.txt");

        makeChoice();
    }
    public static void makeChoice()
    {
        Scanner kb = new Scanner(System.in);
        int choice;
        do
        {

        mainMenu();

        InventoryManager manager = new InventoryManager();
        choice = InputValidator.getValidInteger("Enter your choice (1-4): ",1,4);
        System.out.println("You chose Option " + choice);
        menuChoice(choice);

        System.out.println("\u001B[32m" + "press enter to continue" + "\u001B[0m");
        kb.nextLine();
        

        } 
        while (choice != 4);
    }

    public static void menuChoice (int choice){
        switch (choice){
            case 1:
                manager.addInventory();
                break;
            case 2:
                manager.sellInventory();
                break;
            case 3:
                manager.viewInventory();
                break;
            case 4:
                manager.saveData("availableInventory.txt","availableInventory.txt");
                System.out.println("Data Saved. Goodbye!");
                return;

        }
    }


 public static void mainMenu(){

        System.out.println("Choose an option:");
        System.out.println("1. Add Inventory");
        System.out.println("2. Sell Inventory");
        System.out.println("3. View Inventory");
        System.out.println("4. Exit");
 

    }

    }

   