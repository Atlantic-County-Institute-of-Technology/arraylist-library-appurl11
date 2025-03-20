import java.util.ArrayList;
import java.util.Collections;

public class Library {
    boolean playing = false;
    int current = 0;
    ArrayList<String> library = new ArrayList<String>();

    // sets up the inital items in library
    public void initialLibrary() {
        library.add("Jordan Breanna Arrington");
        library.add("Meow");
        library.add("LALALA");
        library.add("Genshin Impact");
        library.add("Awooga");
        library.add("Woof");
    }

    // allows the user to add something to library
    public void add(String addition) {
        library.add(addition);
        }

    // allows the user to remove something from the library
    public void remove(String subtraction) {
            if(library.contains(subtraction)){
                library.remove(subtraction);
            }
            else {
                System.out.println("Error: Wasn't included in the list, please try again.");
            }
        }

    // plays the first item in the library, if something is already playing, it won't work, it will also not work if nothing is in the queue
    public void play(){
        if(playing) {
            System.out.println("A song is already playing, try 'Skip' or 'Previous'");
        }
        else if(library.isEmpty()) {
            System.out.println("Error: Nothing in the queue");
        }
        else {
            System.out.println("Now playing " + library.get(0));
            playing = true;
        }
    }

    // displays every item in library individually
    public void display() {
        for(int i = 0; i < library.size(); i++) {
            System.out.println(i+1 + " : " + library.get(i));
        }
    }

    // checks if there's an item to skip to, then skips to it.
    public void skip(){
        if(!playing) {
            System.out.println("No song in queue to skip too, try another command");
        }
        else if(!(library.get(current+1) == null)) {
            System.out.println("Now playing: " + library.get(current+1));
            library.remove(current);
            current++;
        }
    }

    // sorts the library alphabetically
    public void sort(){
        Collections.sort(library);
    }

    // finds the list item of an item in the library
    public int find(String find) {
        if(library.contains(find)){
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).contains(find))
                    return i+1;
            }
        }
        return -1;
    }

    // shuffles the library
    public void shuffle(){
        Collections.shuffle(library);
    }
}


