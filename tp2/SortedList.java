package tp2;

import java.util.*;

public class SortedList<E extends Comparable<E>> extends ArrayList<E>{
    /**
     *
     */
    private static final long serialVersionUID = 5056736769232615581L;

    public SortedList() {
        //
    }

    @Override
    public boolean add(E s){
        int i = 0;
        while(i < this.size() && s.compareTo(this.get(i)) > 0){
            i++;
        }
        this.add(i, s);
        return true;
    }
}
