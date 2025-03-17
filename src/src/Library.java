import java.util.ArrayList;
import java.util.*;
public class Library {
    boolean playing = false;
    int current = 0;
    ArrayList<String> library = new ArrayList<String>();
    public void add(String addition) {
        library.add(addition);
        }
    public void remove(String subtraction) {
        for(int i = 0; i < library.size(); i++) {
            if(library.get(i).contains(subtraction))
                library.remove(subtraction);
            else if(i == library.size()-1)
                System.out.println("Error: Wasn't included in the list, please try again.");
            }
        }
    public void play() {
        if (!library.equals(null)) {
            System.out.println("Now playing:" + library.get(0));
        }
        else if(playing) {
            System.out.println("A song is already playing, try 'Skip' or 'Previous'");
        }
    }
    public void skip() {
        if(!playing) {
            System.out.println("No song in queue to skip too, try another command");
        }
        else if(library.get(current+1) == null) {
            System.out.println("Now playing: " + library.get(current-1));
        }
    }
    public void previous() {
        if(!playing) {
            System.out.println("No previous song detected, try another command");
        }
        else if(library.get(current-1) == null) {
            System.out.println("Now playing: " + library.get(current-1));
        }
    }
    public void shuffle() {
        Collections.shuffle(library);
    }
}


