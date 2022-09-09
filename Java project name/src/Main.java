import java.util.*;
public class Main {
 public static void main(String[] args) {
  LinkedList <String> Playlist = new LinkedList <String> ();
  
          Playlist.add("Imitate");
          Playlist.add("Uder The Influence");
          Playlist.add("G.O.A.T");
          Playlist.add("Die For You");
          Playlist.add("September 16");
          System.out.println("songs: " + Playlist);

          Playlist.addFirst("3:16");

          Playlist.addLast("Missin You Crazy");

          System.out.println(Playlist.get(0));

          Playlist.set(6, "Loyal");

          Playlist.remove(1);

          System.out.println("Updated Playlist: " + Playlist);
        
             }
}