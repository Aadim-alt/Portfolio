import java.util.Scanner;
public class MoviesManager
{
    static Scanner scanner = new Scanner(System.in);
    static String[] movies;
    static int num;
    public static void main(String[] args)
    {
        boolean isTrue = true;
        while(isTrue)
        {
            System.out.println("---------------");
            System.out.println("Movies Manager");
            System.out.println("---------------");
            System.out.println("1 -> Add Movies");
            System.out.println("2 -> Search Movies");
            System.out.println("3 -> Show Movies");
            System.out.println("4 -> Exit");
            System.out.println("---------------");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();
            System.out.println("---------------");
            
            switch(choice)
                {
                    case 1 -> addMovies(choice);
                    case 2 -> searchMovies();
                    case 3 -> showMovies();
                    case 4 -> isTrue = false;
                }
            System.out.println("---------------");
        }
        
        System.out.println("Thank You for using our Software");
        
    }
    
    static void addMovies(int choice)
    {
        System.out.println("How Many Movies Do You want To enter: ");
        num = scanner.nextInt();
        scanner.nextLine();
        movies = new String[num];
        System.out.println("Enter the movies Name: ");
        for(int i =0; i<num; i++)
        {
            System.out.print("- ");
            movies[i] = scanner.nextLine().toUpperCase();
        }
    }
    
    static void searchMovies()
    {
        String movie;
        scanner.nextLine();
        System.out.print("Enter name of the Movie to Search for: ");
        movie = scanner.nextLine().toUpperCase();
        boolean found = true;
        for(int i =0; i<num; i++)
        {
          
            if(movie.equals(movies[i]))
            {
                int a = i+1;
                System.out.println("Your Movie is on The list.");
                System.out.println("Its in number "+a);
                found = false;
                break;
            }
            
        }
        if(found)
        {
            System.out.println("Your movie is not on the list.");
        }
        
    }
    
    static void showMovies()
    {
        System.out.println("Your Movies Are- ");
        for(String movie : movies)
        {
            System.out.println("- "+movie);
        }
    }
}