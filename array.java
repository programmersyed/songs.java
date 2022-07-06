import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Sneaker Pimps - Six Underground");
    desertIslandPlaylist.remove("Sneaker Pimps - Six Underground");
    desertIslandPlaylist.add("Jake");
    desertIslandPlaylist.add("Snake");
    int index = desertIslandPlaylist.indexOf("Jake");
    int index2= desertIslandPlaylist.indexOf("Snake");
    String temp = "ANTE";
    desertIslandPlaylist.set(index, "A Tribe Called Quest - Electric Relaxation");
    desertIslandPlaylist.set(index2, temp);
    System.out.println(desertIslandPlaylist);  }
  
}