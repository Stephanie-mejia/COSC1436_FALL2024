public class Book
{
    private String title;
    private String price;
    private String Author;

    public Book (String BookTitle, String BookPrice, String AuthorObject);
    {
        title = BookTitle;
        price = BookPrice;
        Author = AuthorObject;
    }
    public String toString()
    {
        return "Book:" + title + ", Price:" + price + "Author:" + author;
    }
    public String getTitle()
    {
        return title;
    }
    public String getPrice()
    {
        return price;
    }


}