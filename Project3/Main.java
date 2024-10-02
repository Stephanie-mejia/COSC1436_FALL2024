public class Main 
{
    public static void main (String [] args)
    {
        //author objject 
        Author myAuthor = new Author("J.K. Rowling", "jk.rowling@gmail.com", "British");
        //book object using the author object
        Book myBook = new Book("Harry Potter and the Philosopher's Stone", "$19.99", myAuthor);

        
        System.out.print(myBook);
        System.out.print(myAuthor);
    }
}