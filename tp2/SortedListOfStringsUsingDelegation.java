package tp2;

import java.util.*;

public class SortedListOfStringsUsingDelegation<String> {
    private ArrayList<String> aListe;

    public SortedListOfStringsUsingDelegation(){
        aListe = new ArrayList<>();
    }

    public ArrayList<String> getListe(){
        return this.aListe;
    }
    public void add(String s){
        int i =0;
        while (i < aListe.size() && ((java.lang.String) s).compareTo((java.lang.String) aListe.get(i))>0) {
            i++;
        }
        aListe.add(i, s);
    }

    public String get(int i){
        return aListe.get(i);
    }

    public int size(){
        return aListe.size();
    }

    public boolean isEmpty(){
        return aListe.isEmpty();
    }
}
