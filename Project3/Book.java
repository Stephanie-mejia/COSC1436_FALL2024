public class Book
{
    //attributes
    private String title;
    private String price;
    private Author author;

    public Book (String BookTitle, String BookPrice, Author AuthorObject)
    {
        title = BookTitle;
        price = BookPrice;
        author = AuthorObject;
    }

    public String toString()
    {
        //constructor
        return "Book:" + title + ", Price:" + price;
    }
    // this is a getter for the title and price of book
    public String getTitle()
    {
        return title;
    }
    public String getPrice()
    {
        return price;
    }


}