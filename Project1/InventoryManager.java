import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class InventoryManager
{
    private ArrayList< String> availableInventory = new ArrayList<>();
    private String[] soldOutInventory = new String [100];
    private int soldOutCount = 0;
    public static Scanner kb = new Scanner(System.in);

    public void saveData(String availableFile, String soldOutFile)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(availableFile)))
        {
            for(String inventory: availableInventory)
            {
                writer.write(inventory);
                writer.newLine();
            }
        }
    
        catch(IOException e)
        {
            System.out.println("error saving available inventory:"+ e);
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(soldOutFile)))
        {
            for(int i=0; i<soldOutCount; i++)
            {
                writer.write(soldOutInventory[i]);
                writer.newLine();
            }
        } catch (IOException e)
        {
            System.out.println("Errror saving sold out inventory: "+ e);
        }
    }
    public void loadData(String availableFile, String soldOutFile)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(availableFile)))
        {
            String line;
            while((line=reader.readLine()) != null)
            {
                availableInventory.add(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("error loading available inventory:" + e);
        }
        try(BufferedReader reader =new BufferedReader(new FileReader(soldOutFile)))
        {
            String line;
            while ((line= reader.readLine()) !=null)
            {
                soldOutInventory[soldOutCount++]= line;
            }
        } 
        catch (IOException e)
        {
            System.out.println("error loading solg out Inventory" + e);
        }
    }

    public void addInventory()
    {
        System.out.println("What is the name of the inventory you want to add:");
        String inventory = kb.nextLine();
        availableInventory.add(inventory);
// Wrong After this line 
    }
    public void sellInventory() throws IndexOutOfBoundsException
    {

        if(availableInventory.isEmpty())
        {
            System.out.println("No inventory available to sell.");
            return;
        }
        viewInventory();
        int inventoryIndex = InputValidator.getValidInteger(
            "Enter the index of the inventory to sell: ", 0, availableInventory.size() - 1
        );
        if (inventoryIndex < 0 || inventoryIndex >= availableInventory.size()){
            throw new IndexOutOfBoundsException("Invalid inventory Index.");
        }
        if (soldOutCount >= soldOutInventory.length)
        {
            System.out.println("Sold-out array is full.");
            return;
        }

        soldOutInventory[soldOutCount++] = availableInventory.remove(inventoryIndex);
        System.out.println("Inventory sold successfully");
    }

    public void viewInventory()
    {
        System.out.println("Available inventory: " + availableInventory);
        System.out.print("Sold out Inventory:");
        for (int i = 0; i < soldOutCount; i++)
        {
            System.out.print(soldOutInventory[i]+ " ");
        }
        System.out.println();


    }


}
