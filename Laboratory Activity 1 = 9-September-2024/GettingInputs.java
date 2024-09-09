import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt(); 
        scanner.nextLine(); 

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine(); 
        
        
        System.out.print("Enter the album name: ");
        String album = scanner.nextLine(); 
        
        System.out.print("Enter the song title: ");
        String title = scanner.nextLine();  

        System.out.print("Enter the artist's name: ");
        String artist = scanner.nextLine();

        scanner.close();

        System.out.println("--------------------------");
        System.out.println("Song Details:");
        System.out.println("--------------------------");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}
