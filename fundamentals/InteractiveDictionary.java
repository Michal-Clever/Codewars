package fundamentals;

import java.util.HashMap;
import java.util.Map;

public class InteractiveDictionary extends HashMap<String,String> {

  //  public Dictionary(){ super(); }

    public void newEntry(String key, String value){ this.put(key, value); }

    public String look(String key){ return this.getOrDefault(key, "Cant find entry for "+key); }

}


//        In this kata, your job is to create a class Dictionary which you can add words to and their entries. Example:
//
//        >>> Dictionary d = new Dictionary();
//
//        >>> d.newEntry("Apple", "A fruit that grows on trees");
//
//        >>> System.out.println(d.look("Apple"));
//        A fruit that grows on trees
//
//        >>> System.out.println(d.look("Banana"));
//        Cant find entry for Banana
//        Good luck and happy coding!