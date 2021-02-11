package tp2;

import java.util.*;

public class SortedListOfStrings extends ArrayList<String> {

    private static final long serialVersionUID = -5330522483826193653L;

    
    public SortedListOfStrings() {
        // 
    }

    @Override
    public boolean add(String s){
        int i = 0;
        while(i < this.size() && s.compareTo(this.get(i)) > 0){
            i++;
        }
        this.add(i, s);
        return true;
    }

}
