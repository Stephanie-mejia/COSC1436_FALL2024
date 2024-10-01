public class Author 
{
    private String name;
    private String email;
    private String nationality;

    public Author(String AuthorName ,String AuthorEmail ,String AuthorNationality);
    {
        name = AuthorName;
        email = AuthorEmail;
        nationality= AuthorNationality;
    }
    public String toString()
    {
        return "Author:" + name + ", Email:" + email + ", Nationality:" + nationality ;
    }
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
        return nationality
    }
}