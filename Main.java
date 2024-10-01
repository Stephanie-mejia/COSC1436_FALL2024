public class Main 
{
    public static void main (String [] args)
    {
        Book myBook = new Book("Harry Potter and the Philosopher's Stone", "$19.99");

        Author myAuthor = new Author("J.K. Rowling", "jk.rowling@gmail.com", "British");
        System.out.println(myBook+myAuthor);
    }
}