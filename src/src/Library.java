import java.util.ArrayList;
public class Library {
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


}


