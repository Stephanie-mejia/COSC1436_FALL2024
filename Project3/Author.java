public class Author 
{
    //attributes 
    private String name;
    private String email;
    private String nationality;

    public Author(String AuthorName, String AuthorEmail, String AuthorNationality)
    {
        name = AuthorName;
        email = AuthorEmail;
        nationality= AuthorNationality;
    }
    public String toString()
    {
        //constructor
        return "Author:" + name + ", Email:" + email + ", Nationality:" + nationality ;
    }
    //*this is a getter for the author's name,email and nationality
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getNationality()
    {
        return nationality;
    }
}