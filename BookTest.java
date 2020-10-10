import java.util.Scanner;
class Book
{
    String Title,Author,Genre;
    int Age;
    Book(int Age, String Title, String Author, String Genre)
    {
        this.Age=Age;
        this.Title=Title;
        this.Author=Author;
        this.Genre=Genre;
    }
    public int GetAge()
    {
        return Age;
    }
    public void SetAge(int Age) { this.Age = Age; }
    public String GetTitle()
    {
        return Title;
    }
    public void SetTitle(String Title) { this.Title = Title; }
    public String GetAuthor()
    {
        return Author;
    }
    public void SetAuthor(String Author) { this.Author = Author; }
    public String GetGenre()
    {
        return Genre;
    }
    public void SetGenre(String Genre) { this.Genre = Genre; }
    public void ToString()
    {
        System.out.format("%d \n",Age);
        System.out.println(Title);
        System.out.println(Author);
        System.out.println(Genre);
    }
}
public class BookTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Age;
        String Title,Author,Genre;
        System.out.println("Введите название книги");
        Title = sc.next();
        System.out.println("Введите автора книги");
        Author = sc.next();
        System.out.println("Введите жанр книги");
        Genre = sc.next();
        System.out.println("Введите дату написания книги книги");
        Age = sc.nextInt();
        Book test = new Book(Age,Title,Author,Genre);
        test.ToString();
    }
}
