//2.5.9

import javautil.Scanner;

public class MediaLibRunnerFinal {
  public static void main(String[] args) {
    MediaLib myLib1 = new MediaLib();
    myLib1.addBook(new Book("1984", "Orwell"));
    System.out.println("Library1:\n" + myLib1);

    //new date waiting
    System.out.println("Wait one to two seconds so Library 2 will have a different time.");
    System.out.println("Press <ENTER> to continue...");
    Scanner s = new Scanner(System.in);
    String temp = s.nextLine();

    MediaLib myLib2 = new MediaLib();
    myLib.addsong(new Song("Shake It Off", "Taylor Swift"));
    System.out.println("Library2:\n" + myLib2);
  }
}
