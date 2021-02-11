package tp2;

public class SortedListOfStringsTest {
    public static void main(String args[]){
        SortedListOfStrings vListe = new SortedListOfStrings();
        vListe.add("pexte");
        vListe.add("pexte");
        vListe.add("vexte");
        vListe.add("wexte");
        vListe.add("texte");
        vListe.add("wxte");
        System.out.println(vListe);

        SortedListOfStringsUsingDelegation<String> vListe2 = new SortedListOfStringsUsingDelegation<>();
        vListe2.add("aaa");
        vListe2.add("vanc");
        vListe2.add("polje");
        vListe2.add("pmkz");
        System.out.println(vListe2.getListe());



    }
}
