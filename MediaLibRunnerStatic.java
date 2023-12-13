public class MediaLibRunnerStatic{
  public static void main(String[] args){
    /*System.out.println(MediaLib.getOwner()+ "'s Library");
    System.out.println(MediaLib.getNumEntries()); */

    System.out.println("New Book Library Created");
    MediaLib bookLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    bookLib.addBook(myBook);
    System.out.println("Library:\n" + bookLib");
    //System.out.println(bookLib.getNumEntries());
    
    System.out.println("New Movie Library Created");
    MediaLib movieLib = new MediaLib();
    Movie myMovie = new Movie("The Polar Express", 120);
    bookLib.addMovie(myMovie);
    System.out.println("Libraray:\n" + movieLib");
    //System.out.println(movieLib.getNumEntries());

    System.out.println("New Song Library Created");
    MediaLib songLib = new MediaLib();
    Song mySong = new Song("Passionfruit", 4);
    songLib.addSong(mySong);
    System.out.println("Libraray:\n" + songLib"");
    //System.out.println(songLib.getNumEntries());
  }
}
